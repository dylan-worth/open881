package com.rs.game.npc.godwars2;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.activities.HelwyrInstance;
import com.rs.game.npc.NPC;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 8, 2017
 */

public class Helwyr extends NPC {

	private static final long serialVersionUID = 7050003141268362974L;
	private int phase;
	private HelwyrInstance instance;

	public Helwyr(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned,
			HelwyrInstance instance) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setRun(true);
		setIntelligentRouteFinder(true);
		setForceMultiArea(true);
		setForceTargetDistance(50);
		this.instance = instance;
		for (int[] tiles : instance.getMushroomTiles())
			instance.getAvailableTiles().add(instance.getWorldTile(tiles[0], tiles[1]));
		setPhase(0);
	}

	@Override
	public void processNPC() {
		super.processNPC();
		if (instance.getTiles().size() == 0)
			return;
		HelwyrInstance instance = ((this).getInstance());
		instance.getPlayers().forEach(p -> {
			for (int i = 0; i < instance.getTiles().size(); i++) {
				if (instance.getTiles().get(i) != null && p.withinDistance(instance.getTiles().get(i), 2))
					p.applyHit(new Hit(this, Utils.random(10, 25), HitLook.REGULAR_DAMAGE));
			}
		});
	}

	@Override
	public void sendDeath(final Entity source) {
		instance.getWolves().forEach(n -> {
			n.sendDeath(source);
			n.setNextAnimation(new Animation(23579));
		});
		setNextAnimation(new Animation(28204));
		instance.getPlayers().forEach(player -> {
			for (int x = 0; x < instance.getTiles().size(); x++) {
				World.sendGraphics(player, new Graphics(-1), instance.getTiles().get(x));
				World.spawnObject(new WorldObject(101899, 11, 1, instance.getTiles().get(x)));
			}
		});
		super.sendDeath(source);
	}

	@Override
	public void spawn() {
		super.spawn();
		setNextAnimation(new Animation(28200));
		setNextGraphics(new Graphics(6120));
		setNextGraphics(new Graphics(6085));
		setPhase(0);
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

	public HelwyrInstance getInstance() {
		return instance;
	}

}
