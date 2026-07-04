package com.rs.game.activities;

import java.util.concurrent.TimeUnit;

import com.rs.executor.GameExecutorManager;
import com.rs.game.Animation;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.godwars2.Gorvek;
import com.rs.game.npc.godwars2.Vindicta;
import com.rs.game.player.Player;

/**
 * @author Tom
 * @date April 9, 2017
 */

public class VindictaInstance extends Instance {

	private NPC vindicta;
	private NPC gorvek;
	private boolean finished;

	public VindictaInstance(Player owner, int instanceDuration, int respawnSpeed, int playersLimit, int password,
			int bossId, boolean hardMode) {
		super(owner, instanceDuration, respawnSpeed, playersLimit, password, bossId, hardMode);
	}

	@Override
	public WorldTile getWorldTile(int x, int y) {
		return new WorldTile((boundChunks[0] * 8) + x, (boundChunks[1] * 8) + y, 1);
	}

	@Override
	public WorldTile getWaitingRoomCoords() {
		return getWorldTile(41, 41);
	}

	public NPC getGorvek() {
		return gorvek;
	}

	@Override
	public WorldTile getOutsideCoordinates() {
		return new WorldTile(3113, 6897, 1);
	}

	@Override
	public NPC getBossNPC() {
		return new Vindicta(22459, new WorldTile(getWorldTile(27, 27)), -1, true, false, this);
	}
	
	@Override
	public void performOnSpawn() {
		gorvek = new Gorvek(22463, new WorldTile(getWorldTile(27, 26)), -1, true, false);
		boss.faceObject(new WorldObject(101898, 6487, 8047, 1, 11, 2));
		boss.setNextAnimation(new Animation(28257));
		gorvek.setNextAnimation(new Animation(28264));
		GameExecutorManager.slowExecutor.schedule(() -> {
			gorvek.setNextWorldTile(new WorldTile(getWorldTile(63, 62)));
			gorvek.setCantFollowUnderCombat(true);
			gorvek.isCantSetTargetAutoRelatio();
		}, 1200, TimeUnit.MILLISECONDS);
	}

	@Override
	public NPC getBoss2NPC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void performOnSpawn2() {
		// TODO Auto-generated method stub
		
	}

}
