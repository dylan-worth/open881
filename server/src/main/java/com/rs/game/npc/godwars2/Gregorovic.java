package com.rs.game.npc.godwars2;

import java.util.TimerTask;

import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.activities.GregorovicInstance;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

@SuppressWarnings("serial")
public class Gregorovic extends NPC {
	
	private int phase;
	private GregorovicInstance instance;
	private boolean firstSpawns = false;
	private boolean secondSpawns = false;

	public Gregorovic(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned,
			GregorovicInstance instance) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		this.instance = instance;
		setRun(true);
		setIntelligentRouteFinder(true);
		setForceTargetDistance(50);
		setForceMultiArea(true);
		setRangedBonuses(1000);
		firstSpawns = false;
		secondSpawns = false;
	}

	@Override
	public void processNPC() {
		if (!firstSpawns && getHitpoints() <= 14000 && !isDead()) {
			firstSpawns = true;
			for (int i = 0; i < 2; i++) {
				instance.getShadows()[i] = new Shadow(22444,
						new WorldTile(instance.getWorldTile(Utils.random(33, 54), Utils.random(33, 54))), -1, true,
						false);
				instance.getShadows()[i].setNextAnimation(new Animation(28232));
			}
			GameExecutorManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					for (Shadow s : instance.getShadows()) {
						if (s != null && !s.isDead()) {
							Shadow target = null;
							for (int i = 0; i < 50; i++) {
								target = instance.getShadows()[Utils.random(instance.getShadows().length)];
								if (target != null && !target.isDead() && !target.hasFinished())
									break;
							}
							if (target != null) {
								WorldTile to = new WorldTile(target);
								WorldTile greg = new WorldTile(getX(), getY(), getPlane());
								target.setNextWorldTile(greg);
								setNextWorldTile(to);
								setNextGraphics(new Graphics(6137));
								target.setNextGraphics(new Graphics(6137));
							}
						}
						break;
					}
				}
			}, 3000, 3000);
		} else if (!secondSpawns && getHitpoints() <= 6000) {
			secondSpawns = true;
			for (int i = 2; i < 5; i++) {
				instance.getShadows()[i] = new Shadow(22444,
						new WorldTile(instance.getWorldTile(Utils.random(33, 54), Utils.random(33, 54))), -1, true,
						false);
				instance.getShadows()[i].setNextAnimation(new Animation(28232));
			}
		}
		super.processNPC();
	}

	@Override
	public void sendDeath(final Entity source) {
		for (Shadow s : instance.getShadows()) {
			if (s != null && !s.hasFinished() && !s.isDead())
				s.sendDeath(source);
		}
		for (Spirit s : instance.getSpirits()) {
			if (s != null && !s.hasFinished() && !s.isDead())
				s.sendDeath(source);
		}
		instance.getSpirits().clear();
		super.sendDeath(source);
	}

	@Override
	public void spawn() {
		super.spawn();
		setNextAnimation(new Animation(28223));
	}

	public int getPhase() {
		return phase;
	}

	public void nextPhase() {
		phase++;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public GregorovicInstance getInstance() {
		return instance;
	}

}