package com.rs.game.npc.combat.impl.godwars2.combat;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.activities.HelwyrInstance;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.godwars2.CywirAlpha;
import com.rs.game.npc.godwars2.Helwyr;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 8, 2017
 */

public class HelwyrCombat extends CombatScript {

	public WorldTile bleedTile;
	private int direction;
	private WorldTile frenzy;
	@SuppressWarnings("unused")
	private HelwyrInstance instance;

	@Override
	public Object[] getKeys() {
		return new Object[] { 22438 };
	}

	public void bite(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		helwyr.setNextAnimation(new Animation(28205));
		delayHit(npc, 0, target,
				getMeleeHit(npc, getMaxHit(npc, Utils.random(400, 850), NPCCombatDefinitions.MELEE, target)));
	}

	public void nature(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		helwyr.setNextForceTalk(new ForceTalk("Nature, lend me your aid!"));
		helwyr.setNextAnimation(new Animation(28207));
		for (int i = 0; i < 3; i++) {
			if (helwyr.getInstance().getAvailableTiles().size() == 0)
				break;
			WorldTile tile = helwyr.getInstance().getAvailableTiles()
					.get(Utils.random(helwyr.getInstance().getAvailableTiles().size()));// Helwyr.MUSHROOM_TILES[Utils.random(Helwyr.MUSHROOM_TILES.length)];
			helwyr.getInstance().addMushroom(tile);
			GameExecutorManager.slowExecutor.schedule(() -> {
				World.sendProjectile(helwyr, tile, 6122, 70, 10, 50, 2, 10, 0);
			}, 1000, TimeUnit.MILLISECONDS);
			GameExecutorManager.slowExecutor.schedule(() -> {
				World.sendGraphics(target, new Graphics(6124), tile);
				World.spawnObjectTemporary(new WorldObject(101900, 10, 3, tile), 59400);
			}, 1200, TimeUnit.MILLISECONDS);
			GameExecutorManager.slowExecutor.schedule(() -> {
				World.sendGraphics(target, new Graphics(6125), tile);
				helwyr.getInstance().removeMushroom(tile);
			}, 59400, TimeUnit.MILLISECONDS);
		}
	}

	public void bleed(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		helwyr.setNextForceTalk(new ForceTalk("YOU. WILL. BLEED!"));
		helwyr.setNextAnimation(new Animation(28214));
		/*
		 * helwyr.setCantInteract(true); helwyr.setCantFollowUnderCombat(true);
		 * helwyr.setCantSetTargetAutoRelatio(true); helwyr.setTarget(null);
		 */
		direction = target.getDirection();
		helwyr.setDirection(direction);
		helwyr.setNextGraphics(new Graphics(6126));
		System.out.println("X: " + helwyr.getX() + ", Y: " + helwyr.getY());
		bleedTile = new WorldTile(target.getX(), target.getY(), 1);
		GameExecutorManager.slowExecutor.schedule(() -> {
			if (target.getX() == bleedTile.getX() && target.getY() == bleedTile.getY()) {
				target.applyHit(new Hit(target, Utils.random(1000, 2000), HitLook.MELEE_DAMAGE));
				((Player) target).getPackets()
						.sendGameMessage("Helwyr's continued attacks cause you to lose even more blood!");
			}
			helwyr.setCantSetTargetAutoRelatio(false);
		}, 2100, TimeUnit.MILLISECONDS);
		helwyr.setDirection(direction);
	}

	public void frenzy(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		helwyr.setNextForceTalk(new ForceTalk("You cannot escape me. Aaaargh!"));
		helwyr.setNextAnimation(new Animation(28215));
		frenzy = new WorldTile(helwyr.getX(), helwyr.getY(), 1);
		GameExecutorManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
			int ticks;

			@Override
			public void run() {
				if (ticks == 8) {
					cancel();
					return;
				}
				if (target.withinDistance(frenzy, 3))
					delayHit(npc, 0, target,
							getMeleeHit(npc, getMaxHit(npc, Utils.random(700, 1250), NPCCombatDefinitions.MELEE, target)));
				ticks++;
			}
		}, 0, 1200);
	}

	public void howl(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		HelwyrInstance instance = ((Helwyr) npc).getInstance();
		helwyr.setNextAnimation(new Animation(28213));
		helwyr.setNextGraphics(new Graphics(6127));
		WorldTile random1 = instance.getWorldTile(Utils.random(26, 46), Utils.random(26, 46));
		WorldTile random2 = instance.getWorldTile(Utils.random(26, 46), Utils.random(26, 46));
		WorldTile spawnTile1 = new WorldTile(helwyr.getX() + Utils.random(5, 10), helwyr.getY() + Utils.random(5, 10),
				1);
		WorldTile spawnTile2 = new WorldTile(helwyr.getX() + Utils.random(5, 10), helwyr.getY() + Utils.random(5, 10),
				1);
		GameExecutorManager.slowExecutor.schedule(() -> {
			if (World.isTileFree(spawnTile1, helwyr.getSize())) {
				CywirAlpha wolf1 = new CywirAlpha(22439, spawnTile1, -1, true, false);
				wolf1.setNextAnimation(new Animation(23582));
				helwyr.getInstance().getWolves().add(wolf1);
			} else {
				CywirAlpha wolf1 = new CywirAlpha(22439, random1, -1, true, false);
				wolf1.setNextAnimation(new Animation(23582));
				helwyr.getInstance().getWolves().add(wolf1);
			}
			if (World.isTileFree(spawnTile2, helwyr.getSize())) {
				CywirAlpha wolf2 = new CywirAlpha(22439, spawnTile2, -1, true, false);
				wolf2.setNextAnimation(new Animation(23582));
				helwyr.getInstance().getWolves().add(wolf2);
			} else {
				CywirAlpha wolf2 = new CywirAlpha(22439, random2, -1, true, false);
				wolf2.setNextAnimation(new Animation(23582));
				helwyr.getInstance().getWolves().add(wolf2);
			}
		}, 600, TimeUnit.MILLISECONDS);

	}

	@Override
	public int attack(NPC npc, Entity target) {
		Helwyr helwyr = (Helwyr) npc;
		switch (helwyr.getPhase()) {
		case 1:
			nature(npc, target);
			break;
		case 2:
		case 3:
		case 4:
			bite(npc, target);
			break;
		case 5:
			bleed(npc, target);
			break;
		case 6:
		case 7:
		case 8:
			bite(npc, target);
			break;
		case 9:
			frenzy(npc, target);
			break;
		case 10:
		case 11:
		case 12:
			bite(npc, target);
			break;
		case 13:
			howl(npc, target);
			break;
		case 14:
		case 15:
		case 16:
			bite(npc, target);
			break;
		}
		helwyr.nextPhase();
		if (helwyr.getPhase() < 0 || helwyr.getPhase() > 16)
			helwyr.setPhase(1);
		return npc.getAttackSpeed();
	}

}