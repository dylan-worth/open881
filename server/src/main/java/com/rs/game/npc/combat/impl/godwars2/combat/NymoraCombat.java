package com.rs.game.npc.combat.impl.godwars2.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.activities.TwinFuriesInstance;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.godwars2.Nymora;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 14, 2017
 */
public class NymoraCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 22456 };
	}

	public void autoAttack(NPC npc, Entity target) {
		/**
		 * TODO: Send the attack after the projectile is finished (Currently set
		 * at a delay of 1 tick).
		 */
		npc.setNextAnimation(new Animation(28250));
		// delayHit(npc, 1, target, getRangeHit(npc, Utils.random(50, 88)));
		// World.sendProjectile(nymora, target, 6136, 45, 40, 35, 5, 0, -6);
	}

	public void ceilingCollapse(NPC npc, Entity target) {
		Nymora nymora = (Nymora) npc;
		TwinFuriesInstance instance = nymora.getInstance();
		int[][] tiles = instance.getCollapseTiles();
		int[] randomStack = tiles[Utils.random(tiles.length)];
		nymora.setCantInteract(true);
		nymora.setNextForceTalk(new ForceTalk("We will purge them all!"));
		nymora.setNextWorldTile(instance.getWorldTile(randomStack[0] - 1, randomStack[1] - 1));
		nymora.setNextAnimation(new Animation(28509));
		WorldTasksManager.schedule(new WorldTask() {
			int ticks;

			@Override
			public void run() {
				if (ticks == 0)
					nymora.setNextAnimation(new Animation(28517));
				else if (ticks == 2) {
					nymora.setNextAnimation(new Animation(28518));
					for (int[] collapseTiles : tiles)
						World.sendGraphics(null, new Graphics(6145),
								instance.getWorldTile(collapseTiles[0], collapseTiles[1]));
					nymora.setNextGraphics(new Graphics(-1));
					World.sendGraphics(null, new Graphics(-1), instance.getWorldTile(randomStack[0], randomStack[1]));
				} else if (ticks >= 3 && ticks <= 20) {
					if (ticks == 5 || ticks == 7 || ticks == 9 || ticks == 11 || ticks == 13
							|| ticks == 15/* || ticks == 17 || ticks == 19*/) {
						for (int[] collapseTiles : tiles)
							World.sendGraphics(null, new Graphics(6145),
									instance.getWorldTile(collapseTiles[0], collapseTiles[1]));
					}
					nymora.setNextGraphics(new Graphics(-1));
					World.sendGraphics(null, new Graphics(-1), instance.getWorldTile(randomStack[0], randomStack[1]));
					if (ticks % 3 == 0) {
						loop: for (Player players : instance.getPlayers()) {
							for (int[] collapseTiles : tiles)
								if (players.withinDistance(instance.getWorldTile(collapseTiles[0], collapseTiles[1]), 3)
										&& !players.withinDistance(nymora, 3)) {
									players.applyHit(new Hit(nymora, Utils.random(50, 100), HitLook.REGULAR_DAMAGE));
									continue loop;
								}
						}
					}
				} else if (ticks == 21) {
					nymora.setNextAnimation(new Animation(28519));
					nymora.setCantInteract(false);
					stop();
				}
				ticks++;
			}
		}, 1, 0);
	}

	@Override
	public int attack(NPC npc, Entity target) {
		Nymora nymora = (Nymora) npc;
		switch (nymora.getInstance().getPhase()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			autoAttack(npc, target);
			break;
		case 5:
			ceilingCollapse(npc, target);
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			autoAttack(npc, target);
			break;
		}
		return npc.getAttackSpeed() + 2;
	}

}