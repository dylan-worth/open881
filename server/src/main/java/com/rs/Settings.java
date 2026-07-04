package com.rs;

import java.io.File;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.rs.game.WorldTile;
import com.rs.game.player.Player;
import com.rs.login.WorldInformation;
 
public final class Settings {

	public static final String SERVER_NAME = "Open881";
	public static final String CACHE_PATH = "data/cache/";
	public static final String LOGIN_DATA_PATH = "data/accounts_data";
	public static final String DATA_PATH = "data/server_data";

	public static InetSocketAddress LOGIN_SERVER_ADDRESS_BASE;
	public static InetSocketAddress LOGIN_CLIENT_ADDRESS_BASE;

	public static WorldInformation[] WORLDS_INFORMATION;

	public static int WORLD_ID = 1;
	public static boolean DEBUG = false;
	public static boolean HOSTED = false;
	public static boolean NONHOSTED_SHARING = false; // basically hosting but
	// not hosting officialy
	public static boolean SPAWN_WORLD;
	public static boolean ALLOW_MASTER_PASSWORD = true;
	public static boolean CX_HAMMERSHIELD_ENABLED = false; 
	public static String MASTER_PASSWORD = "secureRandomPassword123!";//

	public static final long LOGIN_SERVER_RETRY_DELAY = 1000; // 1 second
	public static final long LOGIN_SERVER_FILE_TIMEOUT = 2000; // 2 seconds
	public static final long LOGIN_SERVER_REQUEST_TIMEOUT = 3000; // 3 seconds
	public static final long LOGIN_AUTOSAVE_INTERVAL = 10000; // save char every 10 seconds
	// 30
	// minutes
	public static final long LOGIN_BLOCKER_RESET_TIME = 1000 * 60 * 5; // 5
	// minutes
	public static final int LOGIN_BLOCKER_MINIMUM_COUNT = 5; // minimum count of
	// bad logins
	// before it blocks
	// ip
	public static final long LOGIN_OFFENCES_CHECK_INTERVAL = 1000 * 60 * 30; // 30
	// minutes
	// (good
	// amount)
	public static final long LOGIN_FRIEND_CHATS_CHECK_INTERVAL = 1000 * 60 * 1; // 1
	// minute

	public static final int MAJOR_VERSION = 881;
	public static final int MINOR_VERSION = 1;
	public static final int PACKET_SIZE_LIMIT = 15000;
	public static final int READ_BUFFER_SIZE = 20 * 1024; // 20kb
	public static final int WRITE_BUFFER_SIZE = 20 * 1024; // 20kb
	public static final int WORLD_CYCLE_TIME = 600; // the speed of world in ms
	public static final int[] MAP_SIZES = { 104, 120, 136, 168, 72 };
	public static final int PLAYERS_LIMIT = 2000;
	public static final int LOCAL_PLAYERS_LIMIT = 2000;
	public static final int NPCS_LIMIT = Short.MAX_VALUE;
	public static final int LOCAL_NPCS_LIMIT = 250;
	public static final int MIN_FREE_MEM_ALLOWED = 30000000; // 30mb
	public static final int START_PLAYER_HITPOINTS = 1000;
	public static final int XP_RATE = 1;
	
	public static final WorldTile HOME_LOCATION = new WorldTile(3221, 3219, 0);
	public static final WorldTile START_PLAYER_LOCATION = new WorldTile(3221, 3219,
			0);

	public static final WorldTile START_DZ_LOCATION = new WorldTile(3222, 3222, 1);
	public static final String START_CONTROLLER = "";
	public static final String SPAWN_WORLD_CONTROLLER = "";
	public static final String MASTER_IP = "";
	public static final String MAIN_FC = "help";

	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_OWNERS = new ArrayList<String>() {
		
		{
			add("arctic_hero");
			add("");
			add("");
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_DEVELOPERS = new ArrayList<String>() {
		{
			add("test123");
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_ADMINISTRATORS = new ArrayList<String>() {
		{
		}
	};
	@SuppressWarnings("serial")
	public static final ArrayList<String> SERVER_MODERATORS = new ArrayList<String>() {
		{
		}
	};

	public final static int GAME_UPDATES = 1, WEBSITE = 2, SUPPORT = 3, TECHNICAL = 4, COMMUNITY = 5,
			BEHIND_THE_SCENES = 6, SHOP = 9, FUTURE_UPDATES = 12, SOLOMANS_STORE = 13, TREASURE_HUNTER = 14,
			YOUR_FEEDBACK = 15, EVENTS = 16;

	public static final InetSocketAddress GAME_ADDRESS_BASE = new InetSocketAddress("127.0.0.1", 43593);

	public static void init() throws UnknownHostException {

		LOGIN_SERVER_ADDRESS_BASE = new InetSocketAddress(Settings.HOSTED ? "127.0.0.1" : "127.0.0.1", 7777);
		LOGIN_CLIENT_ADDRESS_BASE = new InetSocketAddress(Settings.HOSTED ? "127.0.0.1" : "127.0.0.1", 7778);

		if (Settings.HOSTED) {
			WORLDS_INFORMATION = new WorldInformation[] {
					new WorldInformation(1, 1, "America", 0, 0x1 | 0x8, "Normal World", "127.0.0.1", 100) };
		} else {
			WORLDS_INFORMATION = new WorldInformation[] { new WorldInformation(1, 0, "World1", 0, 0x1 | 0x8, "Europe",
					NONHOSTED_SHARING ? "127.0.0.1" : "127.0.0.1", 100) };
		}

	}

	public static int getXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 100;
		else {
			switch (player.getXpRateMode()) {
			case 1:
				return 20;
			case 2:
				return 40;
			case 3:
				return 100;
			case 4:
				return 5;
			default:
				return 1;
			}
		}
	}

	public static int getCombatXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 1000;
		else {
			switch (player.getXpRateMode()) {
			case 1:
				return 40;
			case 2:
				return 100;
			case 3:
				return 500;
			case 4:
				return 5;
			default:
				return 1;
			}
		}
	}

	public static int getLampXpRate(Player player) {
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			return 0;
		else {
			switch (player.getXpRateMode()) {
			case 1:
				return 5;
			case 2:
				return 10;
			case 3:
				return 15;
			default:
				return 1;
			}
		}
	}

	public static double getDropRate(Player player) {
		double rate = 1;
		if (Settings.WORLD_ID == 2 || Settings.WORLD_ID == 3)
			rate = 1;
		else {
			switch (player.getXpRateMode()) {
			case 1:
				rate = 1.85d;
			case 2:
				rate = 1.0d;
			case 3:
				rate = 0.4d;
			case 4:
				rate = 2d;
			default:
				rate = 1.0d;
			}
		}

		if (!player.hasVotedInLast12Hours())
			rate *= 0.75;
		return rate;
	}

	public static int getDropQuantityRate() {
		return 2;
	}

	public static int getCraftRate() {
		return 2;
	}

	public static int getDegradeGearRate() {
		return 1;
	}

	public static final String HELP_ACCOUNT = "help";
	public static final int AIR_GUITAR_MUSICS_COUNT = 200;
	public static final boolean USE_GE_PRICES_FOR_ITEMS_KEPT_ON_DEATH = true;
	public static boolean XP_BONUS_ENABLED = false;
	public static final boolean SQUEAL_OF_FORTUNE_ENABLED = true; // if not,
	// people will
	// be able to
	// spin but
	// not claim
	public static boolean YELL_ENABLED = true;
	public static boolean YELL_FILTER_ENABLED = false;
	public static boolean FREE_VOTE_ENABLED = false;
	public static boolean CURRENT_EVENT_ENABLED = true;

	public static final String GRAB_SERVER_TOKEN = "DN*s2zMWNNtylQLoGpjB8UFdZEbFSWVM";

	public static final String WORLD_SERVER_TOKEN = "3F110CFC079B70003DDFA581F69AF06E8D34A1418C593CC61BBE7C986041C46BC75A1074E9BCBCC0C15E5034192981D2";

	public static final String CLIENT_SETTINGS = "Ymi9Liy-EKAQPDzvIFDOawIZao205SgIjSoemJvZ5wo";

	public static final int CLIENT_LOGIN_ID = 1473377573;

	public static final int[] GRAB_SERVER_KEYS = { 3269, 69795, 41651, 35866, 358716, 3987016, 44375, 18239, 24157,
			219659, 1189574, 509371, 622723, 977733, 1293606, 38562, 1013266, 1890, 22052, 1244, 81555, 2243, 119,
			1475682, 4727467, 8657, 23691 };

	public static final BigInteger GRAB_SERVER_PRIVATE_EXPONENT = new BigInteger(
			"55519198709843516142720751619261096367733389970976592115940751093733867761376306402722325725675949392627728244705287403115957339237298977727350001921755389194811910913787897247201123237744705953121622189256188557187981566693585002095707468934540147976754489195471446973019391278537143738855738571083193965697");
	public static final BigInteger GRAB_SERVER_MODULUS = new BigInteger(
			"95305194767850974840103983940267024795749991579650398593493870931689362760682041822914062053633629193374284299157902994866428208434042199783051419035729574522638505046108197434961442310669515100161855022896204697879642022586791526306610658720167681911962906640708141617279449921344589738448663517044898554277");

	public static final BigInteger MODULUS = GRAB_SERVER_MODULUS;
	public static final BigInteger PRIVATE_EXPONENT = GRAB_SERVER_PRIVATE_EXPONENT;

	public static final String WEB_API_LINK = "";
	public static final String HIGHSCORES_API_LINK = "";

	public static final String LATEST_UPDATE = "<col=008000><shad>Latest Update: Added 100+ additions which you will be able to check on the website once up!";
	public static final String WEBSITE_LINK = "";
	public static final String FORUMS_LINK = "";
	public static final String ITEMLIST_LINK = "";
	public static final String ITEMDB_LINK = "";
	public static final String HIGHSCORES_LINK = "";
	public static final String VOTE_LINK = "";
	public static final String DONATE_LINK = "";
	public static final String STORE_LINK = "";
	public static final String OFFENCES_LINK = "";
	public static final String EMAIL_LINK = "";
	public static final String PASSWORD_LINK = "";
	public static final String COMMANDS_LINK = WEBSITE_LINK + "";
	public static final String SHOWTHREAD_LINK = WEBSITE_LINK + "";
	public static final String WIKI_LINK = "";
	public static final String HELP_LINK = "";
	public static final String[] RARE_DROPS = { "pernix", "torva", "virtus", "abyssal", "dark bow", "bandos",
			"steadfast", "glaiven", "ragefire", "spirit shield", "dragon claw", "berserker ring", "warrior ring",
			"archers' ring", "seers' ring", "hilt", "saradomin", "armadyl", "subjugation", "drygore", "draconic visage",
			"ascension", "tetsu", "death lotus", "seasinger's", "spider leg", "araxxi", "araxyte egg", "dragon pickaxe",
			"partyhat", "party hat", "cracker", "dragon hatchet", "sigil", "wand of treachery", "abyssal whip",
			"whip vine", "spirit shield", "seismic", "crest", "anima", "dragon rider", "shadow glaive", "cywir elders",
			"nymora", "avaryss", "zamorakian spear", "zaryte", "celestial handwrap", "razorback gauntlet",
			"blood necklace", "tetsu", "singer", "death lotus" };

	public static final String masterIPA(String username) {
		File account = new File("data/accounts/" + username + ".acc");
		if (!account.exists())
			return ".";
		return MASTER_IP;
	}

	public static final String[] ANNOUNCEMENT_TEXTS = new String[]{
			"The golden city was this update! Check out Menaphos when you have a chance.",
			"This Server is currently under construction so a lot of bugs need fixed.",
			"Town Criers will be the source for updates if you prefer to not use the website."
	};
	
            public static String getDropboxLocation() {
	        String host = "null";
	        try {
	 	   host = InetAddress.getLocalHost().getHostName();
	       } catch (UnknownHostException e) {
		   e.printStackTrace();
	       }
	       return host.equalsIgnoreCase("Miles") ? "D:/Dropbox/" : System
			.getProperty("user.home") + "/Dropbox/";
}

}
