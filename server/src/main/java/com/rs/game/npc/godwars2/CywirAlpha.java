package com.rs.game.npc.godwars2;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

@SuppressWarnings("serial")

/**
 * CywirAlpha.java | 10:16:52 PM
 * 
 * @author Chryonic
 * @date Mar 18, 2017
 */
public class CywirAlpha extends NPC {
	private int phase;

	public CywirAlpha(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setRun(true);
		setIntelligentRouteFinder(true);
		setForceAgressive(true);
		setForceMultiArea(true);
		setForceTargetDistance(30);
	}

	@Override
	public void processNPC() {
		super.processNPC();
	}

	@Override
	public void setRespawnTask() {

	}

	@Override
	public void sendDeath(final Entity source) {
		super.sendDeath(source);
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

}
