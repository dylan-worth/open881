package com.rs.game.player.content.agility;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceMovement;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Utils;

public class HefinAgility {

	/**
	 * @author: Pax M
	 */

	private static long time = 0;

	public static void lightCreature(Player player, int option) {
		if (!Agility.hasLevel(player, 77))
			return;
		switch (option) {
		case 1:
			player.getPackets()
					.sendGameMessage(
							"You do not currently have any rewards to claim from the light creature.");
			break;
		case 2:
			player.getDialogueManager()
					.startDialogue(
							"SimpleItemMessage",
							32616,
							"You must discover at least one page of the 'The Voice of the Elders' before you can claim the book.<br>Run the Hefin Agility Course for a chance to find pages.");
			break;
		}
	}

	public static void leapAcrossWalway(Player player, WorldObject object) {
		if (!Agility.hasLevel(player, 77))
			return;
		time = System.currentTimeMillis();
		player.lock(10);
		player.setNextAnimation(new Animation(24587));

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		final WorldTile toTile = new WorldTile(2180, 3419, 1);
		player.setNextForceMovement(new ForceMovement(player, 4, toTile, 3,
				ForceMovement.NORTH));

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextWorldTile(toTile);
				player.getSkills().addXp(Skills.AGILITY, 125.5);
			}
		}, 7);
	}

	public static void traverseCliff(Player player, WorldObject object) {
		if (!Agility.hasLevel(player, 77))
			return;
		player.lock(10);
		player.setNextAnimation(new Animation(25011));

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		final WorldTile toTile = new WorldTile(2171, 3437, 1);

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextAnimation(new Animation(25010));
				player.setNextWorldTile(toTile);
				player.getSkills().addXp(Skills.AGILITY, 125.5);
			}

		}, 6);
	}

	public static void scaleCathedral(Player player, WorldObject object) {
		if (!Agility.hasLevel(player, 77))
			return;
		player.lock(15);
		player.setNextAnimation(new Animation(25014));

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		final WorldTile toTile = new WorldTile(2177, 3448, 2);

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextWorldTile(toTile);
				player.getSkills().addXp(Skills.AGILITY, 125.5);
			}

		}, 15);
	}

	public static void vaultRoof(Player player, WorldObject object) {
		if (!Agility.hasLevel(player, 77))
			return;
		player.lock(15);
		player.setNextAnimation(new Animation(25015));

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		final WorldTile toTile = new WorldTile(2187, 3443, 2);

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextWorldTile(toTile);
				player.getSkills().addXp(Skills.AGILITY, 125.5);
			}

		}, 12);
	}

	public static void slideDownZipLine(Player player, WorldObject object) {
		if (!Agility.hasLevel(player, 77))
			return;
		player.lock(12);
		player.setNextAnimation(new Animation(25016));

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		final WorldTile toTile = new WorldTile(2176, 3400, 1);
		final WorldTile toTile2 = new WorldTile(2187, 3415, 2);
		player.setNextForceMovement(new ForceMovement(player, 4, toTile, 3,
				ForceMovement.NORTH));

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if (Utils.random(2) == 0) {
					player.setNextWorldTile(toTile);
					player.getSkills().addXp(Skills.AGILITY, 800);
					time = 0;
				} else {
					player.setNextWorldTile(toTile2);
					player.getSkills().addXp(Skills.AGILITY, 125.5);
				}
			}

		}, 10);
	}

	public static void mergeWithLightCreature(Player player) {
		if (!Agility.hasLevel(player, 77))
			return;

		player.lock(6);
		player.setNextAnimation(new Animation(17893));
		final WorldTile toTile = new WorldTile(2176, 3400, 1);

		long totalTime = System.currentTimeMillis() - time;
		long sec = totalTime / 1000;

		player.getInterfaceManager().setFairyRingInterface(true, 1550);
		player.getPackets()
				.sendIComponentText(1550, 3, "Time: " + sec + " sec");

		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				player.setNextWorldTile(toTile);
				player.getSkills().addXp(Skills.AGILITY, 850);
				reward(player);
				time = 0;
			}

		}, 4);
	}

	private static void reward(Player player) {
		if (Utils.random(5) == 0) {
			int items[] = { 32618, 32619, 32620, 32621 };
			int item = items[Utils.random(items.length - 1)];

			if (player.getInventory().containsItem(item, 1)
					|| player.getEquipment().containsOneItem(item)
					|| player.getBank().containsItem(item))
				return;

			player.getInventory().addItem(item, 1);
			player.getDialogueManager().startDialogue(
					"SimpleItemMessage",
					item,
					"You have been awarded "
							+ ItemDefinitions.getItemDefinitions(item)
									.getName() + ".");
		}
	}

	private static void sendAnimations(Player player) {
		player.getInterfaceManager().sendInventoryInterface(1552);
	}
}