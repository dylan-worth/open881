package com.rs.game.npc.combat.impl.godwars2.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.npc.NPC;
import com.rs.game.npc.combat.CombatScript;
import com.rs.game.npc.combat.NPCCombatDefinitions;
import com.rs.game.npc.godwars2.CywirAlpha;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date Mar 18, 2017
 */
public class CywirAlphaCombat extends CombatScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 22439 };
	}

	@Override
	public int attack(NPC npc, Entity target) {
		CywirAlpha wolf = (CywirAlpha) npc;
		wolf.setNextAnimation(new Animation(23578));
		delayHit(npc, 0, target,
				getMeleeHit(npc, getMaxHit(npc, Utils.random(200, 792), NPCCombatDefinitions.MELEE, target)));
		return npc.getAttackSpeed();
	}

}