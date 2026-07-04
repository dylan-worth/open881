package com.rs.game.npc.combat.impl.godwars2.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.godwars2.Gregorovic;
import com.rs.game.npc.godwars2.Spirit;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class GregorovicCombat extends CombatScript {
	
	private int attacks;

	@Override
	public Object[] getKeys() {
		return new Object[] { 22443 };
	}

	public void shurikenAttack(NPC npc, Entity target) {
		/**
		 * TODO: Send the attack after the projectile is finished (Currently set at a delay of 2 ticks).
		 */
		Gregorovic gregorovic = (Gregorovic) npc;
		gregorovic.setNextAnimation(new Animation(28228));
		World.sendProjectile(npc, npc, target, 6132, 35, 40, 35, 25, 16, 0);
		delayHit(npc, 2, target,
				getRangeHit(npc, Utils.random(50, 82)));
	}

	public void trickKnife(NPC npc, Entity target) {
		/**
		 * This attack requires a bit of fixes on the projectiles part.
		 * It will send 3 projectiles, each one after the one that was sent before.
		 */
		Gregorovic gregorovic = (Gregorovic) npc;
		gregorovic.setNextAnimation(new Animation(28229));
		World.sendProjectile(npc, npc, target, 6135, 35, 40, 35, 25, 16, 0);
	}

	public void summonSpirit(NPC npc, Entity target) {
		Gregorovic gregorovic = (Gregorovic) npc;
		if (gregorovic.getDistance(gregorovic.getInstance().getMasks()[0]) < gregorovic
				.getDistance(gregorovic.getInstance().getMasks()[1])
				&& gregorovic.getDistance(gregorovic.getInstance().getMasks()[0]) < gregorovic
						.getDistance(gregorovic.getInstance().getMasks()[2])) {
			World.sendProjectile(gregorovic.getInstance().getWorldTile(32, 37),
					gregorovic.getInstance().getWorldTile(35, 40), false, false, 0, 2263, 42, 0, 0, 1, 0, 0);
			Spirit mania = new Spirit(22450, gregorovic.getInstance().getWorldTile(35, 40), -1, true, false,
					gregorovic.getInstance());
			gregorovic.getInstance().getSpirits().add(mania);
			mania.setNextAnimation(new Animation(24724));
			mania.faceEntity(gregorovic);
			mania.setForceWalk(gregorovic);
		} else if (gregorovic.getDistance(gregorovic.getInstance().getMasks()[1]) < gregorovic
				.getDistance(gregorovic.getInstance().getMasks()[0])
				&& gregorovic.getDistance(gregorovic.getInstance().getMasks()[1]) < gregorovic
						.getDistance(gregorovic.getInstance().getMasks()[2])) {
			World.sendProjectile(gregorovic.getInstance().getWorldTile(44, 55),
					gregorovic.getInstance().getWorldTile(43, 51), false, false, 0, 2263, 42, 0, 0, 1, 0, 0);
			Spirit delirium = new Spirit(22451, gregorovic.getInstance().getWorldTile(43, 51), -1, true, false,
					gregorovic.getInstance());
			gregorovic.getInstance().getSpirits().add(delirium);
			delirium.setNextAnimation(new Animation(24724));
			delirium.faceEntity(gregorovic);
			delirium.setForceWalk(gregorovic);
		} else if (gregorovic.getDistance(gregorovic.getInstance().getMasks()[2]) < gregorovic
				.getDistance(gregorovic.getInstance().getMasks()[0])
				&& gregorovic.getDistance(gregorovic.getInstance().getMasks()[2]) < gregorovic
						.getDistance(gregorovic.getInstance().getMasks()[1])) {
			World.sendProjectile(gregorovic.getInstance().getWorldTile(55, 37),
					gregorovic.getInstance().getWorldTile(52, 40), false, false, 0, 2263, 42, 0, 0, 1, 0, 0);
			Spirit rage = new Spirit(22452, gregorovic.getInstance().getWorldTile(52, 40), -1, true, false,
					gregorovic.getInstance());
			gregorovic.getInstance().getSpirits().add(rage);
			rage.setNextAnimation(new Animation(24724));
			rage.faceEntity(gregorovic);
			rage.setForceWalk(gregorovic);
		}
		gregorovic.setNextForceTalk(new ForceTalk("RISE, CHILD!"));
	}

	public void glaiveThrow(NPC npc, Entity target) {
		Gregorovic gregorovic = (Gregorovic) npc;
		gregorovic.setNextAnimation(new Animation(28494));
		for (int x = 0; x < 25; x++) {
			if (gregorovic.getInstance().getTiles()
					.contains(gregorovic.getInstance().getWorldTile(Utils.random(33, 54), Utils.random(33, 54))))
				continue;
			gregorovic.getInstance().getTiles()
					.add(gregorovic.getInstance().getWorldTile(Utils.random(33, 54), Utils.random(33, 54)));
		}
		gregorovic.getInstance().getTiles().forEach(tiles -> {
			World.sendGraphics(target, new Graphics(6139), new WorldTile(tiles));
			WorldTasksManager.schedule(new WorldTask() {
				int ticks = 0;
				@Override
				public void run() {
					switch (ticks) {
					case 12:
						if (target.getX() == tiles.getX() && target.getY() == tiles.getY())
							target.applyHit(new Hit(target, Utils.random(100, 170), HitLook.MAGIC_DAMAGE));
						break;
					case 13:
						gregorovic.getInstance().getTiles().clear();
						;
						stop();
						break;
					}
					ticks++;
				}
			}, 1, 0);
		});
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Gregorovic gregorovic = (Gregorovic) npc;
		if (Utils.random(5) == 1) 
			target.getPoison().makePoisoned(Utils.random(10, 40) + (10 * attacks));
		if (!gregorovic.getInstance().getManiaBuff()) {
			switch (gregorovic.getPhase()) {
			case 0:
			case 1:
			case 2:
				shurikenAttack(npc, target);
				break;
			case 3:
				trickKnife(npc, target);
				break;
			case 4:
			case 5:
			case 6:
				shurikenAttack(npc, target);
				break;
			case 7:
				summonSpirit(npc, target);
				break;
			case 8:
			case 9:
			case 10:
				shurikenAttack(npc, target);
				break;
			case 11:
				glaiveThrow(npc, target);
				break;
			}
			gregorovic.nextPhase();
			if (gregorovic.getPhase() < 0 || gregorovic.getPhase() > 12)
				gregorovic.setPhase(0);
			return npc.getAttackSpeed();
		} else if (gregorovic.getInstance().getManiaBuff()) {
			switch (gregorovic.getPhase()) {
			case 0:
			case 1:
				shurikenAttack(npc, target);
				break;
			case 2:
				trickKnife(npc, target);
				break;
			case 3:
			case 4:
				shurikenAttack(npc, target);
				break;
			case 5:
				summonSpirit(npc, target);
				break;
			case 6:
			case 7:
				shurikenAttack(npc, target);
				break;
			case 12:
				glaiveThrow(npc, target);
				break;
			}
			if (gregorovic.getPhase() < 0 || gregorovic.getPhase() > 7)
				gregorovic.setPhase(0);
			return npc.getAttackSpeed();	
		}
		attacks++;
		gregorovic.nextPhase();
		return npc.getAttackSpeed();
	}

}