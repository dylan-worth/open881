package com.rs.game.npc.godwars2;

import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.WorldTile;
import com.rs.game.activities.GregorovicInstance;
import com.rs.game.npc.NPC;

@SuppressWarnings("serial")
public class Spirit extends NPC {

	private int phase;
	private GregorovicInstance instance;
	private boolean applyBuff = false;

	public Spirit(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned,
			GregorovicInstance instance) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		this.instance = instance;
		setIntelligentRouteFinder(true);
		setForceMultiArea(true);
		applyBuff = false;
	}

	@Override
	public void processNPC() {
		if (withinDistance(getInstance().getGregorovic(), 1) && !isUnderCombat() && !applyBuff) {
			System.out.println(getInstance().getGregorovic().getBonus(4));
			resetWalkSteps();
			applyBuff = true;
			switch (getId()) {
			case 22450:
				setNextForceTalk(new ForceTalk("Hehehahahe."));
				if (!getInstance().getManiaBuff())
					getInstance().setManiaBuff(true);
				break;
			case 22451:
				setNextForceTalk(new ForceTalk("Accept the unreal."));
				getInstance().getGregorovic().getCombat().getTarget().getPoison().setPoisonDamage(
						(int) (getInstance().getGregorovic().getCombat().getTarget().getPoison().getPoisonDamage()
								* 2.50));
				break;
			case 22452:
				setNextForceTalk(new ForceTalk("Hatred is power."));
				getInstance().getGregorovic()
						.setRangedBonuses((int) (getInstance().getGregorovic().getBonus(4) * 1.50));
				break;
			}
			sendDeath(null);
			setNextAnimation(new Animation(24727));
		}
		super.processNPC();
	}

	@Override
	public void setRespawnTask() {
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
