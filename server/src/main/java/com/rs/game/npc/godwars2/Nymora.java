package com.rs.game.npc.godwars2;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.Hit;
import com.rs.game.WorldTile;
import com.rs.game.activities.TwinFuriesInstance;
import com.rs.game.npc.NPC;

/**
 * @author Tom
 * @date April 14, 2017
 */

@SuppressWarnings("serial")
public class Nymora extends NPC {

	private int phase;
	private TwinFuriesInstance instance;

	public Nymora(int id, WorldTile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned, TwinFuriesInstance instance) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea, spawned);
		setForceTargetDistance(50);
		setRun(true);
		setIntelligentRouteFinder(true);
		setForceAgressive(true);
		setForceMultiArea(true);
		this.instance = instance;
		instance.setPhase(0);
	}

	@Override
	public void processNPC() {
		super.processNPC();
	}
	
	@Override
	public void spawn() {
		super.spawn();
		setNextAnimation(new Animation(28242));
	}
	
	@Override
	public void handleIngoingHit(Hit hit){
		Avaryss avaryss = (Avaryss) instance.getBoss2NPC();
		avaryss.setHitpoints(avaryss.getHitpoints() - hit.getDamage());
		super.handleIngoingHit(hit);
	}

	@Override
	public void sendDeath(final Entity source) {
		Avaryss avaryss = (Avaryss) instance.getBoss2NPC();
		if (getHitpoints() == 0 || avaryss.getHitpoints() == 0) {
			super.sendDeath(source);
			avaryss.sendDeath(source);
		}
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
	
	public TwinFuriesInstance getInstance(){
		return instance;
	}

}
