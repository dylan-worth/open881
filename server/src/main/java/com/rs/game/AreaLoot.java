package com.rs.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

public class AreaLoot implements Serializable {

	private static final long serialVersionUID = -6670168874688100657L;

	private ItemsContainer<Item> items;
	private List<FloorItem> lootItems = new ArrayList<FloorItem>();

	private transient Player player;

	public AreaLoot() {
		items = new ItemsContainer<Item>(28, false);
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void init() {
		refresh();
	}

	public void unlockInterface() {
		player.getPackets().sendIComponentSettings(1622, 10, 0, 27, 6291458);
	}

	public void openAreaLoot() {
		reset();
		lootItems.clear();
		player.getInterfaceManager().sendAreaLootInterface(1622);
		unlockInterface();
	}

	public void refresh(int... slots) {
		player.getPackets().sendUpdateItems(773, items, slots);
	}

	public void refresh() {
		player.getPackets().sendItems(773, items);
	}

	public void refreshItems(Item[] itemsBefore) {
		int[] changedSlots = new int[itemsBefore.length];
		int count = 0;
		for (int index = 0; index < itemsBefore.length; index++) {
			if (itemsBefore[index] != items.getItems()[index])
				changedSlots[count++] = index;
		}
		int[] finalChangedSlots = new int[count];
		System.arraycopy(changedSlots, 0, finalChangedSlots, 0, count);
		refresh(finalChangedSlots);
	}

	public void deleteAll(Item item) {
		Item[] itemsBefore = items.getItemsCopy();
		if (!player.getInventory().hasFreeSlots()){
			player.getPackets().sendGameMessage("Not enough space in your inventory.");
			return;
		}
		for (int x = 0; x < lootItems.size(); x++) {
			if (item == null)
				continue;
			World.removeGroundItem(lootItems.get(x));
			items.remove(x, item);
		}
		player.getInventory().addItem(item);
		refreshItems(itemsBefore);
		if (getFreeSlots() == 28)
			player.getInterfaceManager().removeAreaLootInterface();
		int price = 0;
		int alch = 0;
		for (Item lootItems : items.getItems()) {
			if (lootItems == null)
				continue;
			price += lootItems.getDefinitions().getValue();
			alch += lootItems.getDefinitions().getValue() * 0.6D;
		}
		player.getPackets().sendIComponentText(1622, 3,
				"Value: " + Utils.format(price) + "    High alch: " + Utils.format(alch));

	}

	public void deleteItem(int slot, Item item) {
		Item[] itemsBefore = items.getItemsCopy();
		if (!player.getInventory().hasFreeSlots()){
			player.getPackets().sendGameMessage("Not enough space in your inventory.");
			return;
		}
		items.remove(slot, new Item(item.getId(), 1));
		player.getInventory().addItem(new Item(item.getId(), 1));
		World.removeGroundItem(lootItems.get(slot));
		refreshItems(itemsBefore);
		if (getFreeSlots() == 28)
			player.getInterfaceManager().removeAreaLootInterface();
		int price = 0;
		int alch = 0;
		for (Item lootItems : items.getItems()) {
			if (lootItems == null)
				continue;
			price += lootItems.getDefinitions().getValue();
			alch += lootItems.getDefinitions().getValue() * 0.6D;
		}
		player.getPackets().sendIComponentText(1622, 3,
				"Value: " + Utils.format(price) + "    High alch: " + Utils.format(alch));

	}

	public void lootItems() {
		for (Item item : items.getItems()) {
			if (item == null)
				continue;
			deleteAll(item);
		}
		refresh();
	}

	public void deleteItem(Item item) {
		Item[] itemsBefore = items.getItemsCopy();
		if (!player.getInventory().hasFreeSlots()) {
			player.getPackets().sendGameMessage("Not enough space in your inventory.");
			return;
		}
		items.remove(item);
		refreshItems(itemsBefore);
		int price = 0;
		int alch = 0;
		for (Item lootItems : items.getItems()) {
			if (lootItems == null)
				continue;
			price += lootItems.getDefinitions().getValue();
			alch += lootItems.getDefinitions().getValue() * 0.6D;
		}
		player.getPackets().sendIComponentText(1622, 3,
				"Value: " + Utils.format(price) + "    High alch: " + Utils.format(alch));

	}

	public boolean addItem(int itemId, int amount) {
		if (itemId < 0 || amount < 0 || !Utils.itemExists(itemId))
			return false;

		Item[] itemsBefore = items.getItemsCopy();
		if (!items.add(new Item(itemId, amount))) {
			items.add(new Item(itemId, items.getFreeSlots()));
			player.getPackets().sendGameMessage("Not enough space.");
			refreshItems(itemsBefore);
			return false;
		}
		refreshItems(itemsBefore);
		int price = 0;
		int alch = 0;
		for (Item lootItems : items.getItems()) {
			if (lootItems == null)
				continue;
			price += lootItems.getDefinitions().getValue();
			alch += lootItems.getDefinitions().getValue() * 0.6D;
		}
		player.getPackets().sendIComponentText(1622, 3,
				"Value: " + Utils.format(price) + "    High alch: " + Utils.format(alch));

		return true;
	}

	public void reset() {
		items.clear();
		init();
	}

	public ItemsContainer<Item> getItems() {
		return items;
	}

	public Item getItem(int slot) {
		return items.get(slot);
	}

	public int getItemsContainerSize() {
		return items.getSize();
	}

	public int getFreeSlots() {
		return items.getFreeSlots();
	}

	public int getFreeSlots(Item[] item) {
		return items.getFreeSlots(item);
	}

	public int getAmountOf(int itemId) {
		return items.getNumberOf(itemId);
	}

	public List<FloorItem> getLootItems() {
		return lootItems;
	}
}
