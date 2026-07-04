package com.rs.game.npc.godwars2;

import java.util.ArrayList;
import java.util.List;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.activities.VindictaInstance;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * @author Tom
 * @date April 9, 2017
 */

public class Vindicta extends NPC {

	private static final long serialVersionUID = 3958941320672345882L;
	
	private int phase;
	public VindictaInstance instance;
	public List<WorldTile[]> tileSets = new ArrayList<WorldTile[]>();
	private List<Player> hitPlayers = new ArrayList<Player>();

	public Vindicta(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned,
			VindictaInstance instance) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setRun(true);
		setIntelligentRouteFinder(true);
		setForceTargetDistance(30);
		setForceAgressive(true);
		phase = 0;
		this.instance = instance;
	}

	@Override
	public void sendDeath(final Entity source) {
		super.sendDeath(source);
		for (int s = 0; s < tileSets.size(); s++) {
			if (tileSets.get(s) == null)
				continue;
			for (int i = 0; i < tileSets.get(s).length; i++) {
				if (tileSets.get(s)[i] != null)
					World.sendGraphics(null, new Graphics(-1), tileSets.get(s)[i]);
			}
		}
		tileSets.clear();
	}

	public void addFires(WorldTile[] tiles) {
		for (int i = 0; i < tiles.length; i++) {
			WorldTile dest = tiles[i];
			if (dest == null)
				continue;
			loop : for (int x = 0; x < tileSets.size(); x++) {
				for (int a = 0; a < tileSets.get(x).length; a++) {
					if (tileSets.get(x)[a] != null && tileSets.get(x)[a].getTileHash() == dest.getTileHash()) {
						World.sendGraphics(this, new Graphics(-1), dest);
						break loop;
					}
				}
			}
			World.sendGraphics(this, new Graphics(6112), dest);
		}
		tileSets.add(tiles);
	}

	public void removeFires(WorldTile[] tiles) {
		tileSets.remove(tiles);
	}
	
	@Override
	public void spawn(){
		super.spawn();
		setNextNPCTransformation(22459);
	}

	private void rideOnDragon() {
		NPC gorvek = getInstance().getGorvek();
		gorvek.setNextWorldTile(new WorldTile(getX(), getY(), 1));
		gorvek.setNextAnimation(new Animation(28276));
		setNextAnimation(new Animation(28263));
		setNextNPCTransformation(22460);
		setRun(true);
		setPhase(0);
		gorvek.setNextWorldTile(new WorldTile(getInstance().getWorldTile(63, 62)));
	}

	@Override
	public void processNPC() {
		VindictaInstance instance = ((this).getInstance());
		super.processNPC();
		hitPlayers.clear();
		instance.getPlayers().forEach(p -> {
			for (int i = 0; i < tileSets.size(); i++) {
				if (tileSets.get(i) == null)
					continue;
				for (int x = 0; x < tileSets.get(i).length; x++)
					if (tileSets.get(i)[x] != null && p.withinDistance(tileSets.get(i)[x], 1))
						if (!hitPlayers.contains(p))
							hitPlayers.add(p);
			}
		});
		hitPlayers.forEach(p -> p.applyHit(new Hit(this, Utils.random(10, 25), HitLook.MAGIC_DAMAGE)));
		if (this.getId() == 22459 && getHitpoints() <= 10000)
			rideOnDragon();
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

	public VindictaInstance getInstance() {
		return instance;
	}
}
