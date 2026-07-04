package com.rs.game.activities;

import java.util.ArrayList;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.godwars2.CywirAlpha;
import com.rs.game.npc.godwars2.Helwyr;
import com.rs.game.player.Player;

/**
 * @author Tom
 * @date April 8, 2017
 */

public class HelwyrInstance extends Instance {

	public List<CywirAlpha> wolves = new ArrayList<CywirAlpha>();
	public List<Player> player = new ArrayList<Player>();
	public static final int[][] MUSHROOM_TILES = new int[][] { { 26, 46 }, { 26, 41 }, { 26, 36 }, { 26, 31 },
			{ 26, 26 }, { 31, 46 }, { 31, 41 }, { 31, 36 }, { 31, 31 }, { 30, 26 }, { 36, 45 }, { 36, 41 }, { 36, 36 },
			{ 36, 31 }, { 35, 26 }, { 40, 46 }, { 41, 41 }, { 41, 36 }, { 41, 31 }, { 40, 26 }, { 45, 45 }, { 46, 40 },
			{ 45, 35 }, { 46, 31 }, { 45, 26 } };

	public List<WorldTile> tiles = new ArrayList<WorldTile>();
	public List<WorldTile> availableTiles = new ArrayList<WorldTile>();

	public HelwyrInstance(Player owner, int instanceDuration, int respawnSpeed, int playersLimit, int password,
			int bossId, boolean hardMode) {
		super(owner, instanceDuration, respawnSpeed, playersLimit, password, bossId, hardMode);
	}

	@Override
	public WorldTile getWorldTile(int x, int y) {
		return new WorldTile((boundChunks[0] * 8) + x, (boundChunks[1] * 8) + y, 1);
	}

	@Override
	public WorldTile getWaitingRoomCoords() {
		return getWorldTile(24, 47);
	}
	
	@Override
	public void performOnSpawn() {
		boss.faceObject(new WorldObject(101898, 6487, 8047, 1, 11, 2));
		boss.setNextAnimation(new Animation(28200));
		boss.setNextGraphics(new Graphics(6120));
		boss.setNextGraphics(new Graphics(6085));
	}

	public List<CywirAlpha> getWolves() {
		return wolves;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public List<WorldTile> getTiles() {
		return tiles;
	}

	public List<WorldTile> getAvailableTiles() {
		return availableTiles;
	}

	public int[][] getMushroomTiles() {
		return MUSHROOM_TILES;
	}

	public void addMushroom(WorldTile tile) {
		availableTiles.remove(tile);
		tiles.add(tile);
	}

	public void removeMushroom(WorldTile tile) {
		availableTiles.add(tile);
		tiles.remove(tile);
	}

	@Override
	public WorldTile getOutsideCoordinates() {
		return null;
	}

	@Override
	public NPC getBossNPC() {
		return new Helwyr(22438, new WorldTile(getWorldTile(36, 34)), -1, true, false, this);
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
