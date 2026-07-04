package com.rs.game.player.actions.skills.crafting;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.SkillsDialogue;

public class Spinning extends Action {

	public enum CreateSpin {

		BALL_OF_WOOL(1, 2.5, new Item[] { new Item(1737) },
				new Item(1759), Skills.CRAFTING), BOWSTRING(
				1, 15, new Item[] { new Item(1779) }, new Item(
						1777), Skills.CRAFTING), CROSSBOW_STRING(
				10, 15, new Item[] { new Item(9436) },
				new Item(9438), Skills.CRAFTING), MAGIC_STRING(
				1, 2.5, new Item[] { new Item(6051) },
				new Item(6038), Skills.CRAFTING), ROPE(
				1, 2.5, new Item[] { new Item(10814) },
				new Item(954), Skills.CRAFTING);

		public static CreateSpin getSpinByProduce(int id) {
			for (CreateSpin spin : CreateSpin.values()) {
				if (spin.getProducedItem().getId() == id)
					return spin;
			}
			return null;
		}

		private int levelRequired;
		private double experience;
		private Item[] itemsRequired;
		private Item producedItem;
		private int skillType;

		private CreateSpin(int levelRequired, double experience,
				Item[] itemsRequired, Item producedItem, int skillType) {
			this.levelRequired = levelRequired;
			this.experience = experience;
			this.itemsRequired = itemsRequired;
			this.producedItem = producedItem;
			this.skillType = skillType;
		}

		public Item[] getItemsRequired() {
			return itemsRequired;
		}

		public int getLevelRequired() {
			return levelRequired;
		}

		public Item getProducedItem() {
			return producedItem;
		}

		public double getExperience() {
			return experience;
		}

		public int getSkillType() {
			return skillType;
		}
	}

    private CreateSpin spin;
    private int ticks;
    private int xpMultiplier = 1;

	public Spinning(CreateSpin spin, int ticks) {
		this.spin = spin;
		this.ticks = ticks;
	}

	@Override
	public boolean start(Player player) {
		if (spin == null || player == null)
			return false;
		return true;
	}

	@Override
	public boolean process(Player player) {
		if (spin == null || player == null) {
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		if (!player.getInventory().containsItemToolBelt(spin.getItemsRequired()[0].getId(),
				spin.getItemsRequired()[0].getAmount())) {
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		if (spin.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItemToolBelt(spin.getItemsRequired()[1].getId(),
					spin.getItemsRequired()[1].getAmount())) {
				player.getInterfaceManager().removeInterface(1251);
				return false;
			}
		}
		if (player.getSkills().getLevel(spin.getSkillType()) < spin.getLevelRequired()) {
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		if (!player.getInventory().containsItemToolBelt(
				spin.getItemsRequired()[0].getId(),
				spin.getItemsRequired()[0].getAmount())) {
			return false;
		}
		if (spin.getItemsRequired().length > 1) {
			if (!player.getInventory().containsItemToolBelt(
					spin.getItemsRequired()[1].getId(),
					spin.getItemsRequired()[1].getAmount())) {
				return false;
			}
		}
		if (player.getSkills().getLevel(spin.getSkillType()) < spin.getLevelRequired()) {
			return false;
		}
		return true;
	}


	@Override
	public int processWithDelay(Player player) {
		ticks--;
		int multiplier = 0;
		double xp = spin.getExperience();
		int maxQuantity = player.getVarsManager().getBitValue(1002);
		int amount = spin.getProducedItem().getAmount() * multiplier;
		for (Item required : spin.getItemsRequired()) {
			player.getInventory().deleteItem(required.getId(),
					required.getAmount());
		}
		if (maxQuantity > 1){
		SkillsDialogue.sendProgressBar(player, spin.getProducedItem().getId(), maxQuantity, (int) xp);
		player.getPackets().sendCSVarInteger(2229, maxQuantity - xpMultiplier);
		xpMultiplier++;
		}
		player.getInventory().addItem(spin.getProducedItem().getId(), amount);
		player.getSkills().addXp(spin.getSkillType(), xp);
		player.setNextAnimation(new Animation(883));

		if (ticks > 0) {
			return 1;
		}
		return -1;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
	}

}
