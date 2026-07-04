package com.rs.game.player;

import java.util.concurrent.ConcurrentHashMap;

import com.rs.Settings;
import com.rs.game.item.ItemIdentifiers;
import com.rs.game.player.CosmeticsManager.CosmeticType;
import com.rs.game.player.content.News;
import com.rs.game.player.content.PlayerLook;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class InterfaceManager {

	public static final int FIXED_WINDOW_ID = 1477;
	public static final int RESIZABLE_WINDOW_ID = 1477;
	public static final int BANK_COMPONENT_ID = 514;// 876
	public static final int CENTRAL_INTERFACE_COMPONENT_ID = 549;// 548
	public static final int INVENTORY_INTERFACE_COMPONENT_ID = 554;// 553
	public static final int EDIT_MODE_COMPONENT_ID = 563;// 876
	public static final int DIALOGUE_COMPONENT_ID = 561;// 876
	public static final int INPUT_TEXT_COMPONENT_ID = 560;// 876
	public static final int FADING_COMPONENT_ID = 33;// 876
	public static final int TREASURE_HUNTER_COMPONENT_ID = -1;
	public static final int SCREEN_BACKGROUND_COMPONENT_ID = 8;
	public static final int SCREEN_BACKGROUND_INTER_COMPONENT_ID = 415;
	public static final int GAME_SCREEN_COMPONENT_ID = 20;// 876
	public static final int WORLD_MAP_COMPONENT_ID = 26;// 876
	public static final int LEVEL_UP_COMPONENT_ID = 605;// 876
	public static final int CONFIRM_DIALOGUE_COMPONENT_ID = 910;// 876
	public static final int MINIGAME_HUD_COMPONENT_ID = 472; // overlay// 876
	public static final int PLAYER_EXAMINE_COMPONENT_ID = 521;// 520
	public static final int SKILL_PROGRESS_COMPONENT_ID = 464;// TODO not used
	public static final int LOOT_INTERFACE_COMPONENT_ID = 526;// 525
	public static final int TASK_COMPLETE_COMPONENT_ID = 460;

	public static final int TIMER_COMPONENT_ID = 462;// 876
	// minigame tab 240-245 (243/244 center of tab)
	public static final int MINIGAME_TAB_COMPONENT_ID = 243; // tab// 876

	public static final int EXPAND_BUTTONS_COMPONENT_ID = 599;// 876

	/*
	 * 0 - skill inter 1 - active task 2 - inventory 3 - equipment 4 - prayer
	 * book 5 - abilities 9 - emotes 14 - friend list 15 - friend chat info 16 -
	 * clan 18 - chat 19 - friend chat
	 */
	public static final int SKILLS_TAB = 0, ACTIVE_TASK_TAB = 1, INVENTORY_TAB = 2, EQUIPMENT_TAB = 3,
			PRAYER_BOOK_TAB = 4, MAGIC_ABILITIES_TAB = 5, MELEE_ABILITIES_TAB = 6, RANGE_ABILITIES_TAB = 7,
			DEFENCE_ABILITIES_TAB = 8, EMOTES_TAB = 9, NOTES_TAB = 11, SUMMONING_TAB = 12, MINIGAME_TAB = 17,
			ALL_CHAT_TAB = 18;

	private static final int[] MENU_SLOT_COMPONENTS = { 3, 5, 7, 9, 11 };

	private static final int[] MENU_SUBMENU_VARS = { 18995, 18996, 18997, 18998, 18999, 19000, 19002, 19003, 19004,
			19001 };

	public static final int[] GAMEPLAY_CATEGORIES = { 1663, 1623, 1662, 1664, 970, 583, 1674, 1690, 1702 };
	public static final int[] GAMEPLAY_COMPONENTS = { 10, 19, 28, 37, 46, 58, 66, 75, 83 };

	Player player;

	private final ConcurrentHashMap<Integer, Integer> openedinterfaces = new ConcurrentHashMap<Integer, Integer>();

	private boolean resizableScreen;
	private int rootInterface;
	private int currentMenu;

	public InterfaceManager(Player player) {
		this.player = player;
		currentMenu = -1;
	}

	public void sendWorldMapInterface(int id) {
		setWindowInterface(WORLD_MAP_COMPONENT_ID, id);
		closeMenu();
	}

	public void sendGameMapInterface(int id) {
		setWindowInterface(GAME_SCREEN_COMPONENT_ID, id);
	}

	public boolean containsGameMapInterface() {
		return containsWindowInterfaceAtParent(GAME_SCREEN_COMPONENT_ID);
	}

	public void sendExpandOptionsInterface(int id) {
		setWindowInterface(EXPAND_BUTTONS_COMPONENT_ID, id);
		closeMenu();
	}

	public void sendExpandOptionsInterface(int id, int interfaceId, int componentId, int width, int height) {
		setWindowInterface(EXPAND_BUTTONS_COMPONENT_ID, id);
		// width height parentuid borderx, bordery(always -1, 2) x y(always -24,
		// -6).
		player.getPackets().sendExecuteScript(8787, width, height,
				InterfaceManager.getComponentUId(interfaceId, componentId), -1, 2, -24, -6);
		closeMenu();
	}

	public void sendTimerInterface() {
		setWindowInterface(TIMER_COMPONENT_ID, 1508);
	}

	public void removeTimerInterface() {
		removeWindowInterface(TIMER_COMPONENT_ID);
	}

	public void sendGameMapInterface() {
		sendGameMapInterface(1482);
	}

	public boolean containsWorldMapInterface() {
		return containsWindowInterfaceAtParent(WORLD_MAP_COMPONENT_ID);
	}

	public void removeWorldMapInterface() {
		removeWindowInterface(WORLD_MAP_COMPONENT_ID);
		sendGameMapInterface();
		refreshInterface(true);
	}

	public void setWindowInterface(int componentId, int interfaceId) {
		setWindowInterface(true, componentId, interfaceId);
	}

	public void setWindowInterface(boolean walkable, int componentId, int interfaceId) {
		setInterface(walkable, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, componentId, interfaceId);
	}

	public void removeWindowInterface(int componentId) {
		removeInterfaceByParent(FIXED_WINDOW_ID, componentId);
	}

	public void sendDialogueInterface(int interfaceId) {
		setInterface(false, 1477, DIALOGUE_COMPONENT_ID, interfaceId);
		refreshInterface(false);
	}

	public void removeDialogueInterface() {
		removeWindowInterface(DIALOGUE_COMPONENT_ID);
		refreshInterface(true);
	}

	public boolean containsDialogueInterface() {
		return containsInterfaceAtParent(FIXED_WINDOW_ID, DIALOGUE_COMPONENT_ID);
	}

	public void sendMinigameInterface(int interfaceId) {
		setWindowInterface(MINIGAME_HUD_COMPONENT_ID, interfaceId);
	}

	public void removeMinigameInterface() {
		removeWindowInterface(MINIGAME_HUD_COMPONENT_ID);
	}

	public void sendAreaLootInterface(int interfaceId) {
		setWindowInterface(LOOT_INTERFACE_COMPONENT_ID, interfaceId);
	}

	public void removeAreaLootInterface() {
		removeWindowInterface(LOOT_INTERFACE_COMPONENT_ID);
	}

	public void sendTreasureHunter() {
		setWindowInterface(886, 1252);
		closeMenu();
	}
	
	public void sendInputTextInterface() {
		sendInputTextInterface(1469);
	}

	public void sendInputTextInterface(int interfaceId) {
		setWindowInterface(INPUT_TEXT_COMPONENT_ID, 1418);
		setInterface(true, 1418, 1, interfaceId);
		refreshInterface(false);
		closeMenu();
	}

	public boolean containsInputTextInterface() {
		return containsWindowInterfaceAtParent(INPUT_TEXT_COMPONENT_ID);
	}

	public void removeInputTextInterface() {
		removeWindowInterface(INPUT_TEXT_COMPONENT_ID);
		refreshInterface(true);
	}

	public void closeTreasureHunter() {
		removeWindowInterface(886);
		player.getPackets().sendGameMessage(
				"You can access the Treasure Hunter from the side panel, and you can show the button again by logging out and back in.",
				true);
	}
	
	public void closeSpin() {
		removeWindowInterface(1253);
	}

	public void sendCentralInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, CENTRAL_INTERFACE_COMPONENT_ID,
				interfaceId);
		refreshInterface(false);
		closeMenu();
	}

	public boolean containsScreenInterface() {
		return containsWindowInterfaceAtParent(CENTRAL_INTERFACE_COMPONENT_ID);
	}

	public void removeCentralInterface() {
		removeWindowInterface(CENTRAL_INTERFACE_COMPONENT_ID);
		refreshInterface(true);
	}

	public void refreshInterface(boolean closing) {
		if (!player.getCutscenesManager().hasCutscene())
			player.getPackets().sendExecuteScript(closing ? 8779 : 8697);
	}

	public boolean containsBankInterface() {
		return containsWindowInterfaceAtParent(BANK_COMPONENT_ID);
	}

	public boolean containsTreasureHunterInterface() {
		if (player.getInterfaceManager().containsInterface(1253))
			return true;
		return false;
	}

	public void removeBankInterface() {
		removeWindowInterface(BANK_COMPONENT_ID);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, false);
		sendLockGameTab(InterfaceManager.EQUIPMENT_TAB, false);
	}

	public void sendBankInterface(int interfaceId) {
		setInterface(false, resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, BANK_COMPONENT_ID, interfaceId);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, true);
		sendLockGameTab(InterfaceManager.BANK_COMPONENT_ID, true);
		refreshInterface(false);
		closeMenu();
	}

	public void sendInventoryInterface(int interfaceId) {
		setInterface(false, FIXED_WINDOW_ID, INVENTORY_INTERFACE_COMPONENT_ID, interfaceId);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, true);
		refreshInterface(false);
		closeMenu();
	}

	public void removeInventoryInterface() {
		removeWindowInterface(INVENTORY_INTERFACE_COMPONENT_ID);
		sendLockGameTab(InterfaceManager.INVENTORY_TAB, false);
		refreshInterface(true);
	}

	public void setFamiliarInterface(int interfaceId) {
		setWindowInterface(177, interfaceId);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, false);
		setWindowInterface(177, interfaceId);
	}

	public void removeFamiliarInterface() {
		removeWindowInterface(177);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, true);
		removeWindowInterface(177);
	}

	public final void sendInterfaces() {
		if (player.isLobby()) {
			if (player.getLoginCount() == 0) {
				PlayerLook.openCharacterCustomizing(player, true);
				player.getCombatDefinitions().setMeleeCombatExperience(7);
				player.getCombatDefinitions().setRangedCombatExperience(3);
				player.getCombatDefinitions().setMagicCombatExperience(3);
			} else
				sendLobbyInterfaces();
		} else {
			sendNISScreenInterfaces();
			lockDefaultTabs();
			unlockCustomizationSwitchButton();
			unlockMenu();
			unlockOptionMenu();
			unlockLogout();
			unlockScreen();
			unlockFamiliarOptions();
			openGameTab(2);
			player.refreshInterfaceVars();
			player.getCombatDefinitions().sendAbilityVars();
			player.getActionbar().unlockActionBar(false);
			player.getCombatDefinitions().unlockSheatheButton();
			player.getEmotesManager().unlockEmotesBook();
			player.getPrayer().unlockPrayerBookButtons(false);
			player.getMusicsManager().unlockMusicPlayer(false);
			player.getNotes().unlockNotes(false);
			player.getSkills().unlockSkills(false);
			player.getInventory().unlockInventory(false);
			player.getEquipment().unlockEquipment(false);
			player.getFriendsIgnores().unlockFriendsIgnore(false);
			player.getPrayer().unlockPrayerBookButtons(false);
			player.getActionbar().refreshOtherBars();
			player.getActionbar().refreshMultiBars();
			ClansManager.unlockClanBanList(player, false);
			// send familiar details if has familiar
			if (player.getFamiliar() != null && player.isRunning())
				player.getFamiliar().sendFollowerDetails();
			player.getControlerManager().sendInterfaces();
		}

	}

	/*
	 * those are locked by default. ^^. until inter added
	 */
	private void lockDefaultTabs() {
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.SUMMONING_TAB, true);
		player.getInterfaceManager().sendLockGameTab(InterfaceManager.MINIGAME_TAB, true);
	}

	public void unlockOptionMenu() {
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 510, 1, 1, 2); // unlocks
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 528, 1, 1, 2); // unlocks
		player.getPackets().sendIComponentSettings(1477, 507, 0, 24, 2);
		player.getPackets().sendIComponentSettings(1477, 898, 0, 50, 2);
	}

	public void sendLobbyInterfaces() {
		setRootInterface(906, false);
		setInterface(true, 906, 106, 907);
		setInterface(true, 906, 107, 910);
		setInterface(true, 906, 108, 909);
		setInterface(true, 906, 110, 912);
		setInterface(true, 906, 109, 589);
		setInterface(true, 906, 111, 911);
		setInterface(true, 906, 279, 914);
		setInterface(true, 906, 297, 915);
		setInterface(true, 906, 306, 913);
		for (News news : News.values())
			player.getPackets().sendExecuteScript(10931, News.values().length - news.ordinal() - 1, 10630,
					news.getCategory(), -1, news.getTitle(), news.getMessage(), "", news.getDate(),
					news.isPinned() ? 1 : 0);
		player.getPackets().sendExecuteScript(10936, new Object[] {});
	}

	public void unlockScreen() {
		player.getPackets().sendIComponentSettings(1477, 17, -1, 65535, 2097152);
	}

	public void unlockFamiliarOptions() {
		player.getPackets().sendIComponentSettings(1506, 16, -1, 65535, 0);
		player.getPackets().sendIComponentSettings(1430, 30, -1, 65535, 0);
	}

	public void unlockMenu() {
		player.getPackets().sendIComponentSettings(1477, 535, 0, 24, 2);
		player.getPackets().sendIComponentSettings(1477, 538, 1, 1, 2);
		player.getPackets().sendIComponentSettings(1477, 537, 1, 1, 2);
	}

	public void unlockLogout() {
		player.getPackets().sendUnlockIComponentOptionSlots(1477, 76, 0, 1, 0);
	}

	public void unlockCustomizationSwitchButton() {
		player.getPackets().sendIComponentSettings(1477, 44, 1, 1, 2);
	}

	public void setDefaultRootInterface() {
		setRootInterface(FIXED_WINDOW_ID, false);
	}

	public void sendMagicAbilities() {
		if (player.isInLegacyCombatMode()) {
			sendMagicAbilities(1461);
			player.getCombatDefinitions().unlockMagicAbilities(false);
		} else if (player.isInLegacyInterfaceMode()) {
			sendMagicAbilities(1617);
			setInterface(true, 1617, 6, 1461);
			setInterface(true, 1617, 4, 1460);
			setInterface(true, 1617, 5, 1452);
			setInterface(true, 1617, 7, 1449);
			player.getCombatDefinitions().unlockMagicAbilities(false);
			player.getCombatDefinitions().unlockRangeAbilities(false);
			player.getCombatDefinitions().unlockDefenceAbilities(false);
			player.getCombatDefinitions().unlockMeleeAbilities(false);
			player.getPackets().sendIComponentSettings(1617, 0, 0, 26, 2);
			setWindowInterface(199, 1503);
		} else {
			sendMagicAbilities(1461);
			player.getCombatDefinitions().unlockMagicAbilities(false);
		}
	}

	public void sendMagicAbilities(int interfaceId) {
		setWindowInterface(221, interfaceId);
	}

	public void sendMeleeAbilities() {
		boolean legacyCombat = player.getCombatDefinitions().getCombatMode() == CombatDefinitions.LEGACY_COMBAT_MODE;
		setWindowInterface(199,
				legacyCombat || player.isInLegacyInterfaceMode() || player.isInLegacyCombatMode() ? 1503 : 1460);
		if (!legacyCombat)
			player.getCombatDefinitions().unlockMeleeAbilities(false);
	}

	public void sendRangedAbilities() {
		setWindowInterface(210, 1452);
		player.getCombatDefinitions().unlockRangeAbilities(false);
	}

	public void sendDefenceAbilities() {
		if (!player.isInLegacyCombatMode() && !player.isInLegacyInterfaceMode()) {
			setWindowInterface(232, 1449);
			player.getCombatDefinitions().unlockDefenceAbilities(false);
		} else {
			setInterface(true, 1617, 7, 1449);
			player.getCombatDefinitions().unlockDefenceAbilities(false);
		}
	}

	public void sendLegacyMinimapInterfaces() {
		setInterface(true, 1465, 10, 1504);
		setInterface(true, 1465, 12, 1506);
		setInterface(true, 1465, 11, 1505);
	}

	public void sendNISScreenInterfaces() {
		setDefaultRootInterface();
		sendGameMapInterface();
		sendMagicAbilities();
		sendMeleeAbilities();
		sendRangedAbilities();
		sendDefenceAbilities();
		sendUTCClock();
		sendTreasureHunter();
		setWindowInterface(253, 1466);
		setWindowInterface(264, 1220);
		setWindowInterface(91, 1473);
		setWindowInterface(166, 1464);
		setWindowInterface(188, 1458);
		setWindowInterface(264, 506);
		setWindowInterface(286, 550);
		setWindowInterface(330, 1427);
		setWindowInterface(297, 1110);
		setWindowInterface(80, 590);
		setWindowInterface(275, 1416);
		setWindowInterface(319, 1417);
		setWindowInterface(341, 231);
		setWindowInterface(308, 1519);
		setWindowInterface(362, 1588);
		setWindowInterface(373, 1678);
		setWindowInterface(395, 190);
		setWindowInterface(406, 1854);
		setWindowInterface(43, 1431);
		setWindowInterface(512, 568);
		setWindowInterface(73, 1465);
		setInterface(true, 1465, 10, 1504);
		setInterface(true, 1465, 12, 1506);
		setInterface(true, 1465, 11, 1505);
		setWindowInterface(49, 1430);
		setInterface(true, 1430, 51, 1616);
		setWindowInterface(619, 1433);
		setWindowInterface(451, 1483);
		setWindowInterface(468, 745);
		setWindowInterface(447, 1485);
		setWindowInterface(494, 1213);
		setWindowInterface(536, 1448);
		setWindowInterface(435, 557);
		setWindowInterface(443, 1848);
		//setWindowInterface(614, 1484); Membership "subscribe button" has no place in open source.
		setWindowInterface(102, 137);
		setWindowInterface(112, 1467);
		setWindowInterface(121, 1472);
		setWindowInterface(139, 1470);
		setWindowInterface(130, 1471);
		setWindowInterface(148, 464);
		setWindowInterface(352, 228);
		setWindowInterface(157, 1529);
		setWindowInterface(482, 182);
		setWindowInterface(608, 1488);
		setWindowInterface(31, 1680);
		setWindowInterface(932, 1847);
		setWindowInterface(502, 1639);
	}

	private void sendUTCClock() {
		setWindowInterface(490, 635);
		player.getPackets().sendExecuteScript(7486, (int) (Utils.currentTimeMillis() / 60000), (635 << 16) + 1);
	}

	public void sendConfirmDialogue() {
		setWindowInterface(false, CONFIRM_DIALOGUE_COMPONENT_ID, 26);
	}

	public void closeConfirmDialogue() {
		removeWindowInterface(CONFIRM_DIALOGUE_COMPONENT_ID);
	}

	public void sendLockGameTab(int tab, boolean lock) {
		player.getPackets().sendExecuteScriptReverse(8862, lock ? 0 : 1, tab);
	}

	public void sendMinigameTab(int interfaceId) {
		setWindowInterface(MINIGAME_TAB_COMPONENT_ID, interfaceId);
		sendLockGameTab(MINIGAME_TAB, false);
	}

	/*
	 * used for instance for clan citadel
	 */
	public void closeMinigameTab() {
		removeWindowInterface(MINIGAME_TAB_COMPONENT_ID);
		sendLockGameTab(MINIGAME_TAB, true);
	}

	public void sendSettings() {
		sendSettings(261);
	}

	/*
	 * outdated from rs2 inters pretty much
	 */
	public void sendSettings(int interfaceId) {
		setWindowInterface(resizableScreen ? 123 : 183, interfaceId);
	}

	public void sendMagicBook() {

	}

	public void setInterface(boolean clickThrought, int parentInterfaceId, int parentInterfaceComponentId,
			int interfaceId) {
		if (Settings.DEBUG) {
			if (parentInterfaceId != rootInterface && !containsInterface(parentInterfaceId))
				System.out.println("The parent interface isnt setted so where are u trying to set it? "
						+ parentInterfaceId + ", " + parentInterfaceComponentId + ", " + interfaceId);
			/*
			 * if(containsInterface(interfaceId)) System.out.println(
			 * "Already have "+interfaceId+" in another component.");
			 */
		}
		// even so lets set it for now
		int parentUID = getComponentUId(parentInterfaceId, parentInterfaceComponentId);
		int oldParentUID = getInterfaceParentId(interfaceId);

		Integer oldInterface = openedinterfaces.get(parentUID);
		if (oldInterface != null)
			clearChilds(oldInterface);

		openedinterfaces.put(parentUID, interfaceId); // replaces inter if
		// theres one in that
		// component already
		if (oldParentUID != -1 && oldParentUID != parentUID) {
			openedinterfaces.remove(oldParentUID, interfaceId);
			player.getPackets().moveInterface(oldParentUID, parentUID);
		} else
			player.getPackets().sendInterface(clickThrought, parentUID, interfaceId);
	}

	public void removeInterfaceByParent(int parentInterfaceId, int parentInterfaceComponentId) {
		removeInterfaceByParent(getComponentUId(parentInterfaceId, parentInterfaceComponentId));
	}

	public void removeInterfaceByParent(int parentUID) {
		Integer removedInterface = openedinterfaces.remove(parentUID);
		if (removedInterface != null) {
			clearChilds(removedInterface);
			player.getPackets().closeInterface(parentUID);
		}
	}

	private void clearChilds(int parentInterfaceId) {
		for (int key : openedinterfaces.keySet()) {
			if (key >> 16 == parentInterfaceId)
				openedinterfaces.remove(key);
		}
	}

	public void removeInterface(int interfaceId) {
		int parentUID = getInterfaceParentId(interfaceId);
		if (parentUID == -1)
			return;
		removeInterfaceByParent(parentUID);
	}

	public void setRootInterface(int rootInterface, boolean gc) {
		this.rootInterface = rootInterface;
		player.getPackets().sendRootInterface(rootInterface, gc ? 3 : 0);
	}

	public static int getComponentUId(int interfaceId, int componentId) {
		return interfaceId << 16 | componentId;
	}

	public int getInterfaceParentId(int interfaceId) {
		if (interfaceId == rootInterface)
			return -1;
		for (int key : openedinterfaces.keySet()) {
			int value = openedinterfaces.get(key);
			if (value == interfaceId)
				return key;
		}
		return -1;
	}

	public boolean containsInterfaceAtParent(int parentInterfaceId, int parentInterfaceComponentId) {
		return openedinterfaces.containsKey(getComponentUId(parentInterfaceId, parentInterfaceComponentId));
	}

	public boolean containsInterface(int interfaceId) {
		if (interfaceId == rootInterface)
			return true;
		for (int value : openedinterfaces.values())
			if (value == interfaceId)
				return true;
		return false;
	}

	public void removeAll() {
		openedinterfaces.clear();
	}

	public boolean containsWindowInterfaceAtParent(int componentId) {
		return containsInterfaceAtParent(resizableScreen ? RESIZABLE_WINDOW_ID : FIXED_WINDOW_ID, componentId);
	}

	public boolean containsInventoryInter() {
		return containsWindowInterfaceAtParent(INVENTORY_INTERFACE_COMPONENT_ID);
	}

	public void sendFadingInterface(int backgroundInterface) {
		setWindowInterface(FADING_COMPONENT_ID, backgroundInterface);
	}

	public void removeFadingInterface() {
		removeWindowInterface(FADING_COMPONENT_ID);
	}

	public void setScreenInterface(int backgroundInterface, int interfaceId) {
		setScreenInterface(true, backgroundInterface, interfaceId);
	}

	public void setScreenInterface(boolean walkable, int backgroundInterface, int interfaceId) {
		removeCentralInterface();
		setWindowInterface(walkable, SCREEN_BACKGROUND_COMPONENT_ID, backgroundInterface);
		setWindowInterface(walkable, SCREEN_BACKGROUND_INTER_COMPONENT_ID, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeScreenInterfaceBG();
			}
		});
	}

	public void sendBlackScreen(int interfaceId) {
		setWindowInterface(SCREEN_BACKGROUND_COMPONENT_ID, interfaceId);
	}

	public void setFairyRingInterface(boolean walkable, int interfaceId) {
		removeCentralInterface();
		setWindowInterface(walkable, SCREEN_BACKGROUND_INTER_COMPONENT_ID, interfaceId);

		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeScreenInterfaceBG();
			}
		});
	}

	public void removeScreenInterfaceBG() {
		removeWindowInterface(SCREEN_BACKGROUND_COMPONENT_ID);
		removeWindowInterface(SCREEN_BACKGROUND_INTER_COMPONENT_ID);
	}

	public boolean hasRezizableScreen() {
		return resizableScreen;
	}

	public void setWindowsPane(int windowsPane) {
		this.rootInterface = windowsPane;
	}

	public int getWindowsPane() {
		return rootInterface;
	}

	public void openEditMode() {
		player.stopAll();
		setWindowInterface(InterfaceManager.EDIT_MODE_COMPONENT_ID, 1475); // Edit
		// menu
		setEditMode(true);
		player.setCloseInterfacesEvent(new Runnable() {
			@Override
			public void run() {
				removeWindowInterface(InterfaceManager.EDIT_MODE_COMPONENT_ID);
				setEditMode(false);
			}
		});
	}

	private void setEditMode(boolean editMode) {
		player.getPackets().sendCSVarInteger(3477, editMode ? 1 : 0);
	}

	public void gazeOrbOfOculus() {
		player.stopAll();
		setRootInterface(475, false);
		setInterface(true, 475, 57, 751);
		setInterface(true, 475, 55, 752);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				setDefaultRootInterface();
				player.getPackets().sendResetCamera();
			}

		});
	}
	/*
	 * returns lastGameTab
	 */
	public void openGameTab(int tabId) {
		player.getPackets().sendExecuteScript(8310, tabId);
	}

	public void switchMenu(int subMenu) {
		switchMenu(subMenu, 0);
	}

	public void switchMenu(int subMenu, int category) {
		if (!isMenuOpen())
			return;
		openMenu(currentMenu, subMenu, category, true);
	}

	public void openExtras() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		player.getPackets().sendIComponentText(1607, 3, "Membership");
		player.getPackets().sendIComponentText(1607, 8, "You are currently not a member.");
		player.getPackets().sendIComponentText(1607, 12, "You are currently not a member.");
		player.getPackets().sendIComponentText(1607, 48, "Bonds");
		player.getPackets().sendIComponentText(1607, 84, Utils.format(player.getLoyaltyPoints().getAllPoints()));
		player.getPackets().sendIComponentText(1607, 55,
				Utils.format(player.getInventory().getAmountOf(ItemIdentifiers.BOND)));
		player.getPackets().sendIComponentText(1607, 58,
				Utils.format(player.getInventory().getAmountOf(ItemIdentifiers.BOND_UNTRADEABLE)));
		player.getPackets().sendIComponentText(1607, 81, "RUNECOIN");
		player.getPackets().sendIComponentText(1607, 30, Utils.format(player.getTreasureHunter().getAllKeys()));
		player.getPackets().sendIComponentText(1607, 33, Utils.format(player.getTreasureHunter().getHearts()));
		openMenu(7, player.getSubMenus()[7] + 1);
	}

	
	public void openRibbonSetup() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		sendCentralInterface(567);
	}

	public void openRS3Helper() {
		if (player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		sendCentralInterface(1496);
	}

	public void openMenu(int menu, int subMenu) {
		openMenu(menu, subMenu, 0, false);
	}

	public void openMenu(int menu, int subMenu, int category) {
		openMenu(menu, subMenu, category, false);
	}

	public void openMenu(int menu, int subMenu, int category, boolean switchMenu) {
		if (player.isLocked()) {
			return;
		}
		if ((menu == 1 || menu == 7 || menu == 9) && player.isUnderCombat()) {
			player.getPackets().sendGameMessage("You can't do that while in combat.");
			return;
		}
		setMenu(menu);
		player.getSubMenus()[menu] = subMenu - 1;
		if (!switchMenu) {
			player.getVarsManager().forceSendVarBit(18994, menu);
			player.getVarsManager().forceSendVarBit(MENU_SUBMENU_VARS[menu], subMenu);
		}

		if (Settings.DEBUG)
			Logger.log(InterfaceManager.class, "Menu: " + menu + ", " + subMenu + ", " + category);

		if (menu == 0) { // hero
			if (subMenu == 1) { // Summary
				setMenuInterface(0, 320);
				setMenuInterface(1, 1446);
				player.getPackets().sendIComponentText(1446, 81, player.getDisplayName());
				player.getSkills().unlockSkills(true);
			} else if (subMenu == 2) { // Skills
				setMenuInterface(0, 1218);
				setInterface(true, 1218, 61, 1217);
				// sendCSVarInteger(1753, 8);?
			} else if (subMenu == 3) { // Loadout
				setMenuInterface(0, 1474);
				setMenuInterface(1, 1463);
				setMenuInterface(2, 1462);
				player.getPackets().sendIComponentSettings(1474, 10, 0, 27, 4);
				player.getPackets().sendIComponentText(1463, 21, player.getDisplayName());
				player.getInventory().unlockInventory(true);
				player.getEquipment().unlockEquipment(true);
				player.getEquipment().refreshEquipmentInterfaceBonuses();
			} else if (subMenu == 4) {// Presets
				setMenuInterface(0, 579);
				setMenuInterface(1, 627);
				setMenuInterface(2, 577);
				player.getInventory().unlockInventory(true);
				player.getEquipment().unlockEquipment(true);
				player.getEquipment().refreshEquipmentInterfaceBonuses();
			} else if (subMenu == 5) { // Achievements
				setMenuInterface(0, 917);
				setMenuInterface(1, 1056);
				// ndCSVarInteger(1423, 63);
				// sendCSVarInteger(1424, 57);
				/*
				 * sendCSVarInteger(2017, 12); sendCSVarInteger(2018, 0);
				 * sendCSVarInteger(1963, -1); sendCSVarInteger(1964, -1);
				 * sendCSVarInteger(1966, -1); sendCSVarInteger(1965, -1);
				 * Runscripts: [8862, 2, 1] Runscripts: [8862, 3, 1]
				 */

			} else if (subMenu == 6) {
				setMenuInterface(0, 1628);
			}
		} else if (menu == 1) { // Customizations
			if (subMenu == 1) { // wardrobe
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.WARDROBE);
			} else if (subMenu == 2) {
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.WARDROBE);
			} else if (subMenu == 3) {
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.ANIMATION);
			} else if (subMenu == 4) {
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.APPEARENCE);
			} else if (subMenu == 5) {
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.TITLE);
			} else if (subMenu == 6) {
				setMenuInterface(0, 1311);
				player.getCosmeticsManager().open(CosmeticType.PET);
			}
		} else if (menu == 2) {// powers
			if (subMenu == 1) { // melee
				setMenuInterface(0, 1450);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1435);
				player.getCombatDefinitions().unlockMeleeAbilities(true);
			} else if (subMenu == 2) { // ranged
				setMenuInterface(0, 1456);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1445);
				player.getCombatDefinitions().unlockRangeAbilities(true);
			} else if (subMenu == 3) { // magic
				setMenuInterface(0, 1459);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1437);
				player.getCombatDefinitions().unlockMagicAbilities(true);
			} else if (subMenu == 4) { // defensive
				setMenuInterface(0, 1453);
				setMenuInterface(0, 1453);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1434);
				player.getCombatDefinitions().unlockDefenceAbilities(true);
			} else if (subMenu == 5) { // prayers
				setMenuInterface(0, 1457);
				setMenuInterface(1, 1454);
				setMenuInterface(2, 1439);
				player.getPrayer().unlockPrayerBookButtons(true);
			} else if (subMenu == 6) { // combat settings
				setMenuInterface(0, 327);
			}
			setMenuInterface(subMenu == 6 ? 1 : 3, 1436);
			player.getActionbar().unlockActionBar(true);
		} else if (menu == 3) {// Adventures
			if (subMenu == 1) {// featured
				setMenuInterface(0, 1345);
				player.getPackets().sendIComponentSettings(1477, 534, 0, 24, 2);
				player.getPackets().sendIComponentSettings(1477, 537, 1, 1, 2);
				player.getPackets().sendIComponentSettings(1477, 536, 1, 1, 2);
				player.getPackets().sendCSVarInteger(2911, 3);
			} else if (subMenu == 2) {// quests
				setMenuInterface(0, 1782);
				setMenuInterface(1, 1783);
				setMenuInterface(2, 1500);
			} else if (subMenu == 3) {// challenges
				setMenuInterface(0, 1343);
				setMenuInterface(1, 1056);
			} else if (subMenu == 4) {// minigames
				setMenuInterface(0, 1344);
			} else if (subMenu == 5) {// beast
				setMenuInterface(0, 753);
				player.getPackets().sendIComponentSettings(753, 89, 0, 2, 2);
				player.getPackets().sendIComponentSettings(753, 65, 0, 54, 2);
				player.getTimersManager().setBeastMenu(0);
				player.sendData();
			} else if (subMenu == 6) {// path
				setMenuInterface(0, 639);
				setMenuInterface(1, 400);
			}
		} else if (menu == 4) {// community
			if (subMenu == 1) {// vote now
				setMenuInterface(0, 1029);
			} else if (subMenu == 2) {// hiscores
				setMenuInterface(0, 1419);
			} else if (subMenu == 3) {// social
				setMenuInterface(0, 1440);
				setMenuInterface(1, 1109);
				setMenuInterface(2, 1438);
				setMenuInterface(3, 1441);
				setMenuInterface(4, 34);
				player.getFriendsIgnores().unlockFriendsIgnore(true);
				player.getPackets().sendIComponentSettings(1438, 7, 0, 19, 2); // chat
				// color
				ClansManager.unlockClanBanList(player, true);
			} else if (subMenu == 4) {// grouping
				setMenuInterface(0, 1524);
				setMenuInterface(1, 1528);
			} else if (subMenu == 5) {// twitch
				setMenuInterface(0, 232);
			} else if (subMenu == 6) {// seasonal
				setMenuInterface(0, 1784);
				 setMenuInterface(1, 1809);
			 setInterface(true, 1809, 1, 1700);
				 setInterface(true, 1809, 2, 1808);
				 setInterface(true, 1809, 3, 1810);
				 setInterface(true, 1809, 4, 1807);
			}
		} else if (menu == 5) {
			if (subMenu == 1) {
				setMenuInterface(0, 105);
				setMenuInterface(1, 107);
				setMenuInterface(2, 651);
				setMenuInterface(3, 1666);
				player.getPackets().sendUnlockIComponentOptionSlots(107, 7, 0, 27, 0, 1, 2, 3, 4, 5);
				player.getPackets().sendIComponentSettings(105, 63, -1, 65535, 8650758);
				player.getPackets().sendIComponentSettings(105, 65, -1, 65535, 8650758);
				player.getPackets().sendIComponentSettings(105, 99, -1, 65535, 263170);
			} else if (subMenu == 2) {
				setMenuInterface(0, 1638);
				player.getGeManager().sendOfferHistory();
			} else if (subMenu == 3) {
				setMenuInterface(0, 1719);
				setMenuInterface(1, 1721);
				setMenuInterface(2, 1720);
				player.getPackets().sendIComponentSettings(1719, 6, 0, 119, 14);
				player.getPackets().sendIComponentSettings(1721, 7, 0, 28, 14);
			}
		} else if (menu == 7) {// extras
			if (subMenu == 1)
				setMenuInterface(0, 1607);
		} else if (menu == 8) {// runemetrics
			if (subMenu == 1) {
				player.getPackets().sendCSVarInteger(2911, -1);
				player.getPackets().sendIComponentSettings(1477, 534, 0, 24, 2);
				player.getPackets().sendIComponentSettings(1477, 537, 1, 1, 2);
				player.getPackets().sendIComponentSettings(1477, 536, 1, 1, 2);
				player.getPackets().sendCSVarInteger(2911, 8);
				setMenuInterface(0, 1740);// 3
			} else if (subMenu == 2) {
				setMenuInterface(0, 1681);// 3
				setMenuInterface(1, 1739);// 5
				setMenuInterface(2, 1682);// 7
				setMenuInterface(3, 1738);// 9
				player.getPackets().sendIComponentSettings(1681, 30, 0, 78, 706);
				player.getPackets().sendIComponentSettings(1681, 24, 0, 78, 706);
				player.getPackets().sendIComponentSettings(1681, 18, 0, 78, 706);
				player.getPackets().sendIComponentSettings(1681, 12, 0, 26, 28);
				player.getPackets().sendIComponentSettings(1681, 28, 0, 10, 6);
				player.getPackets().sendIComponentSettings(1681, 22, 0, 10, 6);
				player.getPackets().sendIComponentSettings(1681, 16, 0, 10, 6);
				player.getPackets().sendIComponentSettings(1681, 31, 0, 100, 2359302);
				player.getPackets().sendIComponentSettings(1681, 25, 0, 100, 2359302);
				player.getPackets().sendIComponentSettings(1681, 19, 0, 100, 2359302);
				player.getPackets().sendIComponentSettings(1681, 29, -1, 65535, 2046);
				player.getPackets().sendIComponentSettings(1681, 23, -1, 65535, 2046);
				player.getPackets().sendIComponentSettings(1681, 17, -1, 65535, 2046);
				player.getPackets().sendIComponentSettings(1681, 32, 0, 0, 6);
				player.getPackets().sendIComponentSettings(1681, 26, 0, 0, 6);
				player.getPackets().sendIComponentSettings(1681, 20, 0, 0, 6);
				player.getPackets().sendIComponentSettings(1682, 4, 0, 5, 2);
				player.getPackets().sendIComponentSettings(1682, 6, 0, 2, 2);
			} else if (subMenu == 3) {
				setMenuInterface(0, 1733);// 3
				setMenuInterface(1, 1737);// 5
				setMenuInterface(2, 1736);// 7
				player.getPackets().sendIComponentSettings(1737, 4, 0, 5, 2);
				player.getPackets().sendCSVarInteger(2911, 8);
			} else if (subMenu == 4) {
				setMenuInterface(0, 1679);// 3
				setMenuInterface(1, 1735);// 5
				setMenuInterface(2, 1734);// 7
				player.getPackets().sendCSVarInteger(2911, 8);
				player.getPackets().sendIComponentSettings(1735, 4, 0, 0, 2);
				player.getPackets().sendIComponentSettings(1735, 6, 0, 0, 2);
				player.getPackets().sendCSVarInteger(2911, 8);
			}
		} else if (menu == 9) {// settings
			System.out.println("hi");
			if (subMenu == 1) {// gameplay
				setMenuInterface(0, 1443);
				setInterface(true, 1443, 69, GAMEPLAY_CATEGORIES[category]);
				for (int i = 0; i < InterfaceManager.GAMEPLAY_COMPONENTS.length; i++)
					player.getPackets().sendHideIComponent(1443, InterfaceManager.GAMEPLAY_COMPONENTS[i], true);
				player.getPackets().sendHideIComponent(1443, 10, false);
				if (category == 5) {
					player.getPackets().sendIComponentSettings(583, 3, 0, 37, 2);
					// player.getPackets().sendHideIComponent(1443,
					// GAMEPLAY_COMPONENTS[player.getGameSettingsCategory()],
					// true);
					// player.getPackets().sendHideIComponent(1443,
					// GAMEPLAY_COMPONENTS[category], false);
					player.setGameSettingsCategory(category);
				}
			} else if (subMenu == 2) {// interface
				setMenuInterface(0, 1442);
				player.getPackets().sendIComponentSettings(1442, 130, 0, 2, 2); // unlocks
			} else if (subMenu == 3) {// controls
				setMenuInterface(0, 1444);
			} else if (subMenu == 4) {// graphic settings
				setMenuInterface(0, 1426);
				setInterface(true, 1426, 0, 742);
			} else if (subMenu == 5) { // audio
										// settings
				setMenuInterface(0, 187);
				setMenuInterface(1, 429);
				player.getMusicsManager().refreshMusicInterface(true);
				player.getMusicsManager().unlockMusicPlayer(true);
			} else if (subMenu == 6) {
				setMenuInterface(0, 327);
				player.getActionbar().unlockActionBar(true);
			}
		}
	}

	private void setMenuInterface(int slot, int id) {
		setInterface(true, 1448, MENU_SLOT_COMPONENTS[slot], id);
		player.getPackets().sendHideIComponent(1448, MENU_SLOT_COMPONENTS[slot], false);
	}

	public boolean isMenuOpen() {
		return currentMenu != -1;
	}

	public void closeMenu() {
		setMenu(-1);
	}

	private void setMenu(int menu) {
		currentMenu = menu;
		if (player.getVarsManager().getBitValue(CosmeticsManager.COSMETIC_TYPE_MENU_VARBIT) != 0)
			player.getCosmeticsManager().close();
		player.getPackets().sendCSVarInteger(2911, menu);
		if (menu == -1)
			return;
		for (int slot : MENU_SLOT_COMPONENTS)
			if (containsInterfaceAtParent(1448, slot))
				removeInterfaceByParent(1448, slot);
		player.getPackets().sendHideIComponent(1448, 1, menu != -1);

	}

	public static int getNextStatus(int status) {
		return status == 2 ? 0 : (status + 1);
	}

	public void sendCustom(Player player) {
		player.getPackets().sendUnlockIComponentOptionSlots(190, 15, 0, 201, 0, 1, 2, 3);
		player.getPackets().sendConfig(31, 10);
		player.getPackets().sendConfig(160, 1);
		// player.getPackets().sendIComponentText(190, 27, "Quest Points: " +
		// player.getQuestManager().getQuestPoints() + "/10");
	}

	public void unlockOtherLootBeamButtons() {
		for (int x = 133; x < 139; x++)
			player.getPackets().sendHideIComponent(1623, x, false);
	}
	
}