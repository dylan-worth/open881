package com.rs.game.activities;

import java.util.ArrayList;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.godwars2.Gregorovic;
import com.rs.game.npc.godwars2.Shadow;
import com.rs.game.npc.godwars2.Spirit;
import com.rs.game.player.Player;

/**
 * @author Tom
 * @date April 9, 2017
 */

public class GregorovicInstance extends Instance {

	private ArrayList<WorldTile> tiles = new ArrayList<WorldTile>();
	private Shadow[] shadows = new Shadow[5];
	private final WorldTile[] masks = new WorldTile[] { getWorldTile(32, 37), getWorldTile(43, 55),
			getWorldTile(55, 37) };
	private List<Spirit> spirits = new ArrayList<Spirit>();
	private boolean maniaBuff = false;

	public GregorovicInstance(Player owner, int instanceDuration, int respawnSpeed, int playersLimit, int password,
			int bossId, boolean hardMode) {
		super(owner, instanceDuration, respawnSpeed, playersLimit, password, bossId, hardMode);
	}

	@Override
	public WorldTile getWorldTile(int x, int y) {
		return new WorldTile((boundChunks[0] * 8) + x, (boundChunks[1] * 8) + y, 1);
	}

	@Override
	public WorldTile getWaitingRoomCoords() {
		return getWorldTile(33, 33);
	}

	@Override
	public void performOnSpawn() {
		boss.setNextAnimation(new Animation(28223));
	}

	public Shadow[] getShadows() {
		return shadows;
	}

	public WorldTile[] getMasks() {
		return masks;
	}

	public NPC getGregorovic() {
		return boss;
	}

	public ArrayList<WorldTile> getTiles() {
		return tiles;
	}

	public boolean getManiaBuff() {
		return maniaBuff;
	}

	public void setManiaBuff(boolean maniaBuff) {
		this.maniaBuff = maniaBuff;
	}
	
	public List<Spirit> getSpirits() {
		return spirits;
	}

	@Override
	public WorldTile getOutsideCoordinates() {
		return null;
	}

	@Override
	public NPC getBossNPC() {
		return new Gregorovic(22443, new WorldTile(getWorldTile(43, 44)), -1, true, false, this);
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
