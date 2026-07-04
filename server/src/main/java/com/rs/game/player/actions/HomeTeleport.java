package com.rs.game.player.actions;

import com.rs.game.Animation;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.game.player.content.Magic;
import com.rs.game.player.controllers.DungeonController;
import com.rs.utils.Utils;

public class HomeTeleport extends Action {

	private final int HOME_ANIMATION = 16385, HOME_GRAPHIC = 3017;

	private int currentTime;
	private WorldTile tile;

	public HomeTeleport(WorldTile tile) {
		this.tile = tile;
	}

	@Override
	public boolean start(final Player player) {
		return process(player);
	}

	public static void useLodestone(Player player, int componentId) {
		int location;
		switch (componentId) {
		case 19:
			location = 44060059;
			break; // Seers' Village
		case 25:
			location = 38768024;
			break; // Eagles' Peak
		case 10:
			location = 54021233;
			break; // Al Kharid
		case 31:
			location = 577407637;
			break; // Ashdale
		case 8:
			location = 52661131;
			break; // Bandit Camp
		case 14:
			location = 50875619;
			break; // Draynor Village
		case 16:
			location = 48614732;
			break; // Falador
		case 18:
			location = 49335440;
			break; // Port Sarim
		case 15:
			location = 50253234;
			break; // Edgeville
		case 12:
			location = 47500761;
			break; // Burthorpe
		case 30:
			player.getDialogueManager().startDialogue("WildernessLodestone");
			return; // Wilderness Volcano
		case 21:
			location = 52661553;
			break; // Varrock
		case 23:
			location = 41438231;
			break; // Yanille
		case 13:
			location = 46386556;
			break; // Catherby
		case 27:
			location = 45239372;
			break; // Karamja
		case 26:
			location = 44437086;
			break; // Fremennik Province
		case 11:
			location = 43158805;
			break; // Ardougne
		case 29:
			location = 36932686;
			break; // Tirannwn
		case 28:
			location = 41487160;
			break; // Oo'glog
		case 20:
			location = 47156595;
			break; // Taverley
		case 17:
			location = 52972694;
			break; // Lumbridge
		case 24:
			location = 57626044;
			break; // Canifis
		case 9:
			location = 34164555;
			break; // Lunar Isle
		case 32:
			location = 304614689;
			break; // Prifinnas
		case 22:
			location = 52693661;
			break; // Menaphos

		default:
			location = -1;
			break;
		}
		if (location != -1) {
			if (player.getDungManager().isInside()) {
				player.getPackets().sendGameMessage(
						"You cannot teleport to home while in a dungeon.");
				return;
			}
			WorldTile tile = location == 46386556 ? new WorldTile(2811, 3450, 0)
					: new WorldTile(location);
			if (player.getRights() >= 2)
				player.setNextWorldTile(tile);
			else
				player.getActionManager().setAction(new HomeTeleport(tile));
			player.setPreviousLodestone(componentId);
		}
	}

	@Override
	public int processWithDelay(Player player) {
		if (currentTime++ == 0) {
			player.setNextAnimation(new Animation(HOME_ANIMATION));
			player.setNextGraphics(new Graphics(HOME_GRAPHIC));
		} else if (currentTime == 18) {
			player.setNextWorldTile(tile);
			player.getControlerManager().magicTeleported(Magic.MAGIC_TELEPORT);
			if (player.getControlerManager().getControler() == null)
				Magic.teleControlersCheck(player, tile);
			player.setNextFaceWorldTile(new WorldTile(tile.getX(), tile.getY(), tile.getPlane()));
			player.setDirection(6);
			if (player.getControlerManager().getControler() instanceof DungeonController)
				return -1;
			player.lock(11);
		} else if (currentTime == 19) {
			player.setNextGraphics(new Graphics(HOME_GRAPHIC + 1));
			player.setNextAnimation(new Animation(HOME_ANIMATION + 1));
		} else if (currentTime == 23) {
			player.setNextGraphics(new Graphics(3018));
			player.setNextAnimation(new Animation(16386));
		} else if (currentTime == 24)
			player.setNextAnimation(new Animation(16393));
		else if (currentTime == 27) {
			player.setNextAnimation(new Animation(-1));
			player.setNextWorldTile(tile.transform(0, -1, 0));
		} else if (currentTime == 28) {
			return -1;
		}
		return 0;
	}

	@Override
	public boolean process(Player player) {
		int delay = 10000;
		if (player.getControlerManager().getControler() instanceof DungeonController)
			delay = 0;
		if (player.getAttackedByDelay() + delay > Utils.currentTimeMillis()) {
			player.getPackets().sendGameMessage("You can't home teleport shortly after the end of combat.");
			return false;
		}
		return player.getControlerManager().processMagicTeleport(tile);
	}

	@Override
	public void stop(Player player) {
		player.setNextAnimation(new Animation(-1));
		player.setNextGraphics(new Graphics(-1));
		player.unlock();
	}
}
