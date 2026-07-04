package com.rs.game;

import java.io.Serializable;

import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public final class Poison implements Serializable {

	private static final long serialVersionUID = -6324477860776313690L;

	private transient Entity entity;
	private int poisonDamage;
	private int poisonCount;

	public Entity getEntity() {
		return entity;
	}
	
	public int getPoisonDamage() {
		return poisonDamage;
	}
	
	public void setPoisonDamage(int amount) {
		this.poisonDamage = amount;	
	}
	
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public boolean isPoisoned() {
		return poisonDamage >= 1;
	}

	public void makePoisoned(int startDamage) {
		if (poisonDamage > startDamage)
			return;
		if (entity instanceof Player) {
			Player player = ((Player) entity);
			if (player.isPoisonImmune())
				return;
			if (player.getEquipment().getShieldId() == 18340)
				return;
			if (poisonDamage == 0 && !isPoisoned())
				player.getPackets().sendGameMessage("You are poisoned.");
		}
		poisonDamage = startDamage;
		refresh();
	}

	public void processPoison() {
		if (/*!entity.isDead()&& */isPoisoned()) {
			if (poisonCount > 0) {
				poisonCount--;
				return;
			}
			boolean heal = false;
			if (entity instanceof Player) {
				Player player = ((Player) entity);
				// inter opened we dont poison while inter opened like at rs
				if (player.getInterfaceManager().containsScreenInterface())
					return;
				if (player.getAuraManager().hasPoisonPurge())
					heal = true;
			}
			//entity.applyHit(new Hit(entity, poisonDamage, heal ? HitLook.HEALED_DAMAGE : HitLook.POISON_DAMAGE));
			poisonDamage -= 2;
			if (isPoisoned()) {
				poisonCount = 30;
				return;
			}
			reset();
		}
	}

	public void refresh() {
		if (entity instanceof Player) {
			Player player = ((Player) entity);
			player.getPackets().sendConfig(102, isPoisoned() ? 1 : 0);
		}
	}

	public void reset() {
		poisonDamage = 0;
		poisonCount = 0;
		refresh();
	}

	public void cureGroup(final Player player, final Player p2) {
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				p2.setNextGraphics(new Graphics(745, 0, 100));
				p2.getPoison().reset();
				p2.getPackets().sendGameMessage("Your afflictions have been cured by " + player.getDisplayName() + ".");

			}
		}, 1);
	}
}
