package com.rs.game.npc.godwars2;

import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

@SuppressWarnings("serial")
public class Shadow extends NPC {

	private int phase;

	public Shadow(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setIntelligentRouteFinder(true);
		setForceTargetDistance(30);
		setForceMultiArea(true);
	}

	@Override
	public void sendDeath(final Entity source) {
		super.sendDeath(source);
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

}