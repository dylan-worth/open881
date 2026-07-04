package com.rs.game.activities;

import com.rs.game.Animation;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.godwars2.Avaryss;
import com.rs.game.player.Player;

/**
 * @author Tom
 * @date April 14, 2017
 */

public class TwinFuriesInstance extends Instance {

	private NPC avaryss;
	private NPC nymora;
	private int phase = 0;
	private static final int[][] FIRE_TILES = new int[][] { { 38, 23 }, { 33, 23 }, { 28, 23 }, { 23, 23 }, { 23, 28 },
			{ 23, 33 }, { 23, 38 }, { 28, 38 }, { 33, 38 }, { 38, 38 }, { 38, 33 }, { 38, 28 }, { 38, 23 } };

	private static final int[][] COLLAPSE_TILES = new int[][] { { 23, 23 }, { 28, 23 }, { 33, 23 }, { 38, 23 },
			{ 23, 28 }, { 28, 28 }, { 33, 28 }, { 38, 28 }, { 23, 33 }, { 28, 33 }, { 33, 33 }, { 38, 33 }, { 23, 38 },
			{ 28, 38 }, { 33, 38 }, { 38, 38 } };

	public TwinFuriesInstance(Player owner, int instanceDuration, int respawnSpeed, int playersLimit, int password,
			int bossId, boolean hardMode) {
		super(owner, instanceDuration, respawnSpeed, playersLimit, password, bossId, hardMode);
	}

	@Override
	public WorldTile getWorldTile(int x, int y) {
		return new WorldTile((boundChunks[0] * 8) + x, (boundChunks[1] * 8) + y, 1);
	}

	public int getX(int mapX) {
		return boundChunks[0] * 8 + mapX;
	}

	public int getY(int mapY) {
		return boundChunks[1] * 8 + mapY;
	}

	@Override
	public WorldTile getWaitingRoomCoords() {
		return getWorldTile(38, 23);
	}

	public int[][] getFireTiles() {
		return FIRE_TILES;
	}

	public int[][] getCollapseTiles() {
		return COLLAPSE_TILES;
	}

	//public NPC getNymora() {
	//	return nymora;
	//}

	//public NPC getAvaryss() {
	//	return avaryss;
	//}
	
	public int getPhase(){
		return phase;
	}
	
	public void nextPhase(){
		phase++;
	}
	
	public void setPhase(int phase){
		this.phase = phase;
	}

	@Override
	public WorldTile getOutsideCoordinates() {
		return null;
	}

	@Override
	public NPC getBossNPC() {
		return null;/*new Nymora(22456, new WorldTile(getWorldTile(32, 36)), -1, true, false, this);*/
	}
	
	@Override
	public NPC getBoss2NPC() {
		return new Avaryss(22455, new WorldTile(getWorldTile(27, 36)), -1, true, false, this);
	}
	
	@Override
	public void performOnSpawn() {
	//	boss.setNextAnimation(new Animation(28242));
	//	phase = 0;
	}

	@Override
	public void performOnSpawn2() {
		boss2.setNextAnimation(new Animation(28248));	
	}
}
