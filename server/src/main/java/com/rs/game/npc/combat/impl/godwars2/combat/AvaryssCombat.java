package com.rs.game.npc.combat.impl.godwars2.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.SecondaryBar;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.activities.TwinFuriesInstance;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.godwars2.Avaryss;
import com.rs.game.npc.godwars2.Nymora;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 14, 2017
 */
public class AvaryssCombat extends CombatScript {

	private WorldTile targetTile;

	@Override
	public Object[] getKeys() {
		return new Object[] { 22455 };
	}

	public void autoAttack(NPC npc, Entity target) {
		npc.setNextAnimation(new Animation(28239));
		delayHit(npc, 0, target, getMeleeHit(npc, Utils.random(50, 88)));
	}

	public void wallChargeMessage(NPC npc) {
		Avaryss avaryss = (Avaryss) npc;
		switch (Utils.random(3)) {
		case 0:
			avaryss.setNextForceTalk(new ForceTalk("Ha ha ha!"));
			break;
		case 1:
			avaryss.setNextForceTalk(new ForceTalk("Keep them busy, sister!"));
			break;
		case 2:
			avaryss.setNextForceTalk(new ForceTalk("Think you can dodge me?"));
			break;
		}
	}

	public void wallCharge(NPC npc, Entity target) {
		Avaryss avaryss = (Avaryss) npc;
		TwinFuriesInstance instance = avaryss.getInstance();
		WorldTasksManager.schedule(new WorldTask() {
			int ticks;

			public void run() {
				switch (ticks) {
				case 0:
					avaryss.setCantInteract(true);
					avaryss.setTarget(null);
					avaryss.setNextWorldTile(instance.getWorldTile(target.getXInRegion() - 1, 39));
					avaryss.setNextAnimation(new Animation(28502));
					targetTile = instance.getWorldTile(target.getXInRegion() - 1, 20);
					avaryss.setNextFaceWorldTile(targetTile);
					wallChargeMessage(npc);
					break;
				case 1:
					avaryss.setNextAnimation(new Animation(28503));
					break;
				case 2:
					avaryss.setNextForceMovement(new ForceMovement(targetTile, 3, ForceMovement.SOUTH));
					avaryss.setNextAnimation(new Animation(28504));
					avaryss.setNextGraphics(new Graphics(6146));
					break;
				case 4:
					avaryss.setNextAnimation(new Animation(28502));
					avaryss.setNextFaceWorldTile(instance.getWorldTile(39, target.getYInRegion() - 1));
					break;
				case 5:
					avaryss.setNextAnimation(new Animation(28506));
					avaryss.setNextWorldTile(targetTile);
					wallChargeMessage(npc);
					break;
				case 6:
					avaryss.setNextWorldTile(instance.getWorldTile(20, target.getYInRegion() - 1));
					avaryss.setNextAnimation(new Animation(28502));
					targetTile = instance.getWorldTile(39, target.getYInRegion() - 1);
					avaryss.setNextFaceWorldTile(targetTile);
					break;
				case 7:
					avaryss.setNextAnimation(new Animation(28503));
					break;
				case 8:
					avaryss.setNextForceMovement(new ForceMovement(targetTile, 3, ForceMovement.EAST));
					avaryss.setNextAnimation(new Animation(28504));
					avaryss.setNextGraphics(new Graphics(6146));
					break;
				case 10:
					avaryss.setNextAnimation(new Animation(28502));
					avaryss.setNextFaceWorldTile(instance.getWorldTile(target.getXInRegion() - 1, 20));
					break;
				case 11:
					avaryss.setNextAnimation(new Animation(28506));
					avaryss.setNextWorldTile(targetTile);
					wallChargeMessage(npc);
					break;
				case 12:
					avaryss.setNextWorldTile(instance.getWorldTile(target.getXInRegion() - 1, 20));
					avaryss.setNextAnimation(new Animation(28502));
					targetTile = instance.getWorldTile(target.getXInRegion() - 1, 39);
					avaryss.setNextFaceWorldTile(targetTile);
					break;
				case 13:
					avaryss.setNextAnimation(new Animation(28503));
					break;
				case 14:
					avaryss.setNextForceMovement(new ForceMovement(targetTile, 3, ForceMovement.NORTH));
					avaryss.setNextAnimation(new Animation(28504));
					avaryss.setNextGraphics(new Graphics(6146));
					break;
				case 16:
					avaryss.setNextAnimation(new Animation(28502));
					avaryss.setNextFaceWorldTile(instance.getWorldTile(20, target.getYInRegion() - 1));
					break;
				case 17:
					avaryss.setNextAnimation(new Animation(28506));
					avaryss.setNextWorldTile(targetTile);
					wallChargeMessage(npc);
					break;
				case 18:
					avaryss.setNextWorldTile(instance.getWorldTile(39, target.getYInRegion() - 1));
					avaryss.setNextAnimation(new Animation(28502));
					targetTile = instance.getWorldTile(20, target.getYInRegion() - 1);
					avaryss.setNextFaceWorldTile(targetTile);
					break;
				case 19:
					avaryss.setNextAnimation(new Animation(28503));
					break;
				case 20:
					avaryss.setNextForceMovement(new ForceMovement(targetTile, 3, ForceMovement.WEST));
					avaryss.setNextAnimation(new Animation(28504));
					avaryss.setNextGraphics(new Graphics(6146));
					break;
				case 23:
					avaryss.setNextWorldTile(targetTile);
					avaryss.setNextAnimation(new Animation(28505));
					break;
				case 24:
					avaryss.setTarget(target);
					avaryss.setCantInteract(false);
					if (!avaryss.getRun())
						avaryss.setRun(true);
					stop();
					break;
				}
				ticks++;
			}
		}, 1, 0);
	}

	public void channelledBomb(NPC npc, Entity target) {
		Avaryss avaryss = (Avaryss) npc;
		TwinFuriesInstance instance = avaryss.getInstance();
		Nymora nymora = (Nymora) instance.getBossNPC();
		final WorldTile explosionTile = instance.getWorldTile(30, 31);
		avaryss.setNextWorldTile(instance.getWorldTile(30, 28));
		nymora.setNextWorldTile(instance.getWorldTile(27, 31));
		avaryss.setNextFaceWorldTile(instance.getWorldTile(27, 28));
		nymora.setNextFaceWorldTile(instance.getWorldTile(42, 29));
		avaryss.setTarget(null);
		nymora.setTarget(null);
		avaryss.setNextAnimation(new Animation(28509));
		nymora.setNextAnimation(new Animation(28509));
		avaryss.setLocked(true);
		nymora.setLocked(true);
		WorldTasksManager.schedule(new WorldTask() {
			int ticks;

			public void run() {
				if (ticks == 0) {
					avaryss.setNextForceTalk(new ForceTalk("Burn, burn, BURN!"));
					nymora.setNextForceTalk(new ForceTalk("Come to me, my sister!"));
					avaryss.setNextFaceWorldTile(instance.getWorldTile(27, 28));
					nymora.setNextFaceWorldTile(instance.getWorldTile(42, 29));
					avaryss.setNextAnimation(new Animation(28508));
					nymora.setNextAnimation(new Animation(28507));
					avaryss.setNextGraphics(new Graphics(6141, 1, 1, 8));
					nymora.setNextGraphics(new Graphics(6142, 1, 1, 8));
					avaryss.setNextSecondaryBar(new SecondaryBar(0, 850, 1, false));
					nymora.setNextSecondaryBar(new SecondaryBar(0, 850, 1, false));
					for (int[] tiles : instance.getFireTiles())
						World.sendGraphics(null, new Graphics(6144),
								new WorldTile(instance.getWorldTile(tiles[0], tiles[1])));
				} else if (ticks >= 1 && ticks <= 27) {
					if (ticks == 27) {
						for (int[] tiles : instance.getFireTiles())
							World.sendGraphics(null, new Graphics(-1),
									new WorldTile(instance.getWorldTile(tiles[0], tiles[1])));
					}
					avaryss.setNextFaceWorldTile(instance.getWorldTile(27, 28));
					nymora.setNextFaceWorldTile(instance.getWorldTile(42, 29));
					if (ticks % 1 == 0) {
						loop: for (Player players : instance.getPlayers()) {
							players.applyHit(new Hit(nymora, Utils.random(10, 35), HitLook.REGULAR_DAMAGE));
							for (int[] fireTiles : instance.getFireTiles())
								if (players.withinDistance(instance.getWorldTile(fireTiles[0], fireTiles[1]), 2)
										&& !players.withinDistance(nymora, 2)) {
									players.applyHit(new Hit(nymora, Utils.random(100, 250), HitLook.REGULAR_DAMAGE));
									continue loop;
								}
						}
					}
				} else if (ticks == 29) {
					if (!avaryss.isDead() && !nymora.isDead()) {
						avaryss.setNextGraphics(new Graphics(-1));
						nymora.setNextGraphics(new Graphics(-1));
						avaryss.setNextAnimation(new Animation(28513));
						nymora.setNextAnimation(new Animation(28514));
						avaryss.setLocked(false);
						nymora.setLocked(false);
						World.sendGraphics(null, new Graphics(6143), explosionTile);
						for (Player players : instance.getPlayers()) {
							if (players.withinDistance(explosionTile, 5)) {
								players.applyHit(new Hit(avaryss, Utils.random(300, 450), HitLook.REGULAR_DAMAGE));
							}
						}
						stop();
					}
				}
				ticks++;
			}
		}, 1, 0);
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Avaryss avaryss = (Avaryss) npc;
		// wallCharge(npc, target);
		switch (avaryss.getInstance().getPhase()) {
		case 0:
		case 1:
			autoAttack(npc, target);
			break;
		case 2:
			wallCharge(npc, target);
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			autoAttack(npc, target);
			break;
		case 13:
			channelledBomb(npc, target);
			break;
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			autoAttack(npc, target);
			break;
		}
		avaryss.getInstance().nextPhase();
		if (avaryss.getInstance().getPhase() < 0 || avaryss.getInstance().getPhase() > 18)
			avaryss.getInstance().setPhase(0);
		System.out.println("Phase: " + avaryss.getInstance().getPhase());

		return npc.getAttackSpeed() + 2;
	}

}