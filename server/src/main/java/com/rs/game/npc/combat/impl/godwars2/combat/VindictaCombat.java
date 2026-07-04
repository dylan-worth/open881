package com.rs.game.npc.combat.impl.godwars2.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.godwars2.Vindicta;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 9, 2017
 */

public class VindictaCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 22459, 22460 };
	}

	private void land(NPC npc, Entity target) {
		if (npc.getId() == 22460) {
			Vindicta vindicta = (Vindicta) npc;
			int random = Utils.random(3);
			if (random == 0)
				vindicta.setNextWorldTile(new WorldTile(vindicta.getInstance().getWorldTile(19, 33)));// north-west
			else if (random == 1)
				vindicta.setNextWorldTile(new WorldTile(vindicta.getInstance().getWorldTile(21, 11)));// south-west
			else if (random == 2)
				vindicta.setNextWorldTile(new WorldTile(vindicta.getInstance().getWorldTile(32, 13)));// south-east
			npc.setNextAnimation(new Animation(28276));
			npc.setNextGraphics(new Graphics(6118));
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					dragonFireOnDragon(npc, target);
				}
			});
		}
	}

	private void dragonFire(NPC npc, Entity target) {
		Vindicta vindicta = (Vindicta) npc;
		npc.setNextAnimation(new Animation(28259));
		World.sendGraphics(target, new Graphics(6114), target);
		WorldTasksManager.schedule(new WorldTask() {
			int dir = target.getDirection() / 2048;
			@Override
			public void run() {
				int freeTile = Utils.random(7, 14);
				int x = 0;
				WorldTile[] tiles = new WorldTile[40];
				for (int i = -20; i < 20; i++) {
					WorldTile dest = new WorldTile(target.getX() + (Utils.DIRS[dir][0] * i), target.getY() + (Utils.DIRS[dir][1] * i), target.getPlane());
					if (World.canMoveNPC(dest.getPlane(), dest.getX(), dest.getY(), 1) && x != freeTile && x + 1 != freeTile) 
						tiles[x] = dest;
					x++;
				}
				vindicta.addFires(tiles);
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						vindicta.removeFires(tiles);
					}
				}, 100, 1);
			}
		}, 1);
	}

	private void dragonFireOnDragon(NPC npc, Entity target) {
		Vindicta vindicta = (Vindicta) npc;
		npc.setNextAnimation(new Animation(28277));
		WorldTasksManager.schedule(new WorldTask() {
			int dir = target.getDirection() / 2048;
			@Override
			public void run() {
				int freeTile = Utils.random(7, 14);
				int x = 0;
				WorldTile[] tiles = new WorldTile[40];
					for (int i = -20; i < 20; i++) {
						WorldTile dest = new WorldTile(target.getX() + (Utils.DIRS[dir][0] * i), target.getY() + (Utils.DIRS[dir][1] * i), target.getPlane());
						if (World.canMoveNPC(dest.getPlane(), dest.getX(), dest.getY(), 1) && x != freeTile && x + 1 != freeTile)
							tiles[x] = dest;
						x++;
					}
					vindicta.addFires(tiles);
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							vindicta.removeFires(tiles);
						}
					}, 100, 1);
			}
		}, 1);
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Vindicta vindicta = (Vindicta) npc;
		if (npc.getId() == 22459) {
			switch (vindicta.getPhase()) {
			case 1:
			case 2:
			case 4:
			case 5:
				npc.setNextAnimation(new Animation(28253));
				delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, Utils.random(400, 800), NPCCombatDefinitions.MELEE, target)));
				break;
			case 3:
				npc.setNextAnimation(new Animation(28256));
				npc.setNextGraphics(new Graphics(6111));
				for (Entity t : npc.getPossibleTargets())
					delayHit(npc, 0, t, getMeleeHit(npc, getMaxHit(npc, Utils.random(800, 1200), NPCCombatDefinitions.MELEE, t)));
				break;
			case 6:
				dragonFire(npc, target);
				break;
			}
			vindicta.nextPhase();
			if (vindicta.getPhase() < 0 || vindicta.getPhase() > 6)
				vindicta.setPhase(0);
			return npc.getAttackSpeed();
		} else if (npc.getId() == 22460) {
			switch (vindicta.getPhase()) {
			case 1:
			case 3:
				npc.setNextAnimation(new Animation(28273));
				delayHit(npc, 0, target, getMeleeHit(npc, getMaxHit(npc, Utils.random(400, 800), NPCCombatDefinitions.MELEE, target)));
				break;
			case 2:
				npc.setNextAnimation(new Animation(28271));
				World.sendProjectile(npc, target, 6116, 30, 25, 50, 0, 0, 0);
				delayHit(npc, 1, target,
						getRangeHit(npc, getMaxHit(npc, Utils.random(2000, 4000), NPCCombatDefinitions.RANGE, target)));
				break;
			case 4:
				npc.setNextAnimation(new Animation(28275));
				npc.setNextGraphics(new Graphics(6118));
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						land(npc, target);
					}
				}, 2);
				break;
			}
			vindicta.nextPhase();
			if (vindicta.getPhase() < 0 || vindicta.getPhase() > 4)
				vindicta.setPhase(1);
			return npc.getAttackSpeed() - 1;
		}
		return npc.getAttackSpeed();
	}

}
