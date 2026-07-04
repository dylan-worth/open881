package com.rs.game.npc.godwars2;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;

/**
 * @author Tom
 * @date April 9, 2017
 */

@SuppressWarnings("serial")
public class Gorvek extends NPC {

	public Gorvek(int id, WorldTile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea, boolean spawned) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setRun(true);
	}

	@Override
	public void sendDeath(final Entity source) {
		super.sendDeath(source);
	}

	@Override
	public void spawn() {
		super.spawn();
		setNextAnimation(new Animation(28264));
	}

}