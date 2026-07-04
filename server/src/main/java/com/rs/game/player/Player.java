package com.rs.game.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;

import com.rs.GameLauncher;
import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.executor.GameExecutorManager;
import com.rs.executor.PlayerHandlerThread;
import com.rs.executor.WorldThread;
import com.rs.game.Animation;
import com.rs.game.AreaLoot;
import com.rs.game.Capes.CapesData;
import com.rs.game.EffectsManager.Effect;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.Projectile;
import com.rs.game.Region;
import com.rs.game.TemporaryAtributtes.Key;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.map.bossInstance.InstanceSettings;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.DuelRules;
import com.rs.game.minigames.stealingcreation.StealingCreationController;
import com.rs.game.minigames.stealingcreation.StealingCreationLobbyController;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.MirrorBackSpider;
import com.rs.game.npc.others.Pet;
import com.rs.game.player.actions.PlayerCombat;
import com.rs.game.player.content.Combat;
import com.rs.game.player.content.FriendsChat;
import com.rs.game.player.content.Highscores;
import com.rs.game.player.content.ItemRemover;
import com.rs.game.player.content.Magic;
import com.rs.game.player.content.Notes;
import com.rs.game.player.content.PrayerBooks;
import com.rs.game.player.content.SkillCapeCustomizer;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.construction.House;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.loyaltyProgramme.LoyaltyPoints;
import com.rs.game.player.content.pet.PetManager;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.DTControler;
import com.rs.game.player.controllers.FightCaves;
import com.rs.game.player.controllers.FightKiln;
import com.rs.game.player.controllers.GodWars;
import com.rs.game.player.controllers.NomadsRequiem;
import com.rs.game.player.controllers.QueenBlackDragonController;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.controllers.ZGDControler;
import com.rs.game.player.controllers.bossInstance.BossInstanceController;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controllers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controllers.events.DeathEvent;
import com.rs.game.player.controllers.pestcontrol.PestControlGame;
import com.rs.game.player.controllers.pestcontrol.PestControlLobby;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.login.Login;
import com.rs.login.account.Account;
import com.rs.net.LoginClientChannelManager;
import com.rs.net.Session;
import com.rs.net.decoders.WorldPacketsDecoder;
import com.rs.net.decoders.handlers.ButtonHandler;
import com.rs.net.encoders.LoginChannelsPacketEncoder;
import com.rs.net.encoders.WorldPacketsEncoder;
import com.rs.utils.ILayoutDefaults;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.Utils;

public class Player extends Entity {

	public static final int TELE_MOVE_TYPE = 127, WALK_MOVE_TYPE = 1, RUN_MOVE_TYPE = 2;

	private static final long serialVersionUID = 2011932556974180375L;
	public int ticks, minutes, hours, days, totalMinutes;

	// transient stuff
	private transient String username;
	private transient Session session;
	private transient long clientLoadedMapRegion;
	private transient int displayMode;
	private transient int screenWidth;
	private transient int screenHeight;
	private transient InterfaceManager interfaceManager;
	private transient DialogueManager dialogueManager;
	private transient HintIconsManager hintIconsManager;
	private transient ActionManager actionManager;
	private transient CutscenesManager cutscenesManager;
	private transient PriceCheckManager priceCheckManager;
	private transient RouteEvent routeEvent;
	private transient FriendsIgnores friendsIgnores;
	private transient FriendsChat currentFriendsChat;
	private transient ClansManager clanManager, guestClanManager;
	private transient boolean lootShare;
	private transient Trade trade;
	private transient DuelRules duelRules;
	private transient IsaacKeyPair isaacKeyPair;
	private transient Pet pet;
	private transient VarsManager varsManager;
	private int gameSettingsCategory;
	public transient com.rs.game.activities.Instance currentInstance;

	// used for packets logic
	private transient ConcurrentLinkedQueue<LogicPacket> logicPackets;

	// used for update
	private transient LocalPlayerUpdate localPlayerUpdate;
	private transient LocalNPCUpdate localNPCUpdate;

	// player stages
	private transient boolean started;
	private transient boolean running;
	private transient boolean runAfterLoad;
	private transient boolean lobby;
	public byte killstreak;
	private transient int resting;
	private transient boolean canPvp;
	private transient boolean cantTrade;
	private transient boolean cantWalk;
	private transient long lockDelay; // used for doors and stuff like that
	private transient long foodDelay;
	private transient long potDelay;
	private transient Runnable closeInterfacesEvent;
	private transient long lastPublicMessage;
	private transient List<Integer> switchItemCache;
	private transient boolean disableEquip;
	private transient MachineInformation machineInformation;
	private transient boolean castedVeng;
	private transient boolean invulnerable;
	private transient double hpBoostMultiplier;
	private transient boolean largeSceneView;
	private transient int cannonBalls;
	private transient String lastPlayerKill;
	private transient String lastPlayerMAC;
	private transient boolean refreshClanIcon;

	// stuff received from login server
	private transient String displayName;
	private transient String email;

	private transient int rights;
	private transient int messageIcon;
	private transient boolean donator;
	private transient boolean extremeDonator;
	private transient boolean isSupporter;
	private transient boolean isGraphicDesigner;
	private transient boolean muted;
	private transient long lastVote;

	private boolean ironMan;
	private boolean hcIronMan;
	private boolean divineCoin = false;

	// saving stuff
	private LoyaltyPoints loyaltyPoints;
	private DonationManager donationManager;
	private AreaLoot arealoot;
	private Appearence appearence;
	private Inventory inventory;
	private MoneyPouch moneyPouch;
	private Equipment equipment;
	private Skills skills;
	private CombatDefinitions combatDefinitions;
	private Prayer prayer;
	private Bank bank;
	private ControlerManager controlerManager;
	private MusicsManager musicsManager;
	private EmotesManager emotesManager;
	private Notes notes;
	private TreasureHunter treasureHunter;
	private TreasureTrailsManager treasureTrailsManager;
	private Toolbelt toolbelt;
	private DominionTower dominionTower;
	private Familiar familiar;
	private FarmingManager farmingManager;
	private AuraManager auraManager;
	private QuestManager questManager;
	private PetManager petManager;
	private GrandExchangeManager geManager;
	private SlayerManager slayerManager;
	private CoalTrucksManager coalTrucksManager;
	private DungManager dungManager;
	private House house;
	private ActionBar actionbar;
	private DoomsayerManager doomsayerManager;
	private TimersManager timersManager;
	private PlayerExamineManager playerExamineManager;
	private CosmeticsManager cosmeticsManager;
	private byte runEnergy;
	private int[] subMenus; // used by interface menu

	// rs settings old
	private boolean allowChatEffects;
	private boolean acceptAid;
	private boolean rightClickReporting;
	private boolean mouseButtons;
	private boolean profanityFilter;
	private int silverhawkFeathers;
	public int araxxiEnrage = 0;
	public long araxxiEnrageTimer = 0;
	public boolean AraxxorLastState;
	public boolean AraxxorThirdStage;
	public boolean AraxxorPause;
	public int AraxDeathX;
	public int AraxDeathY;
	public int AraxDeathZ;
	public int EGGX;
	public int EGGY;
	public int FINALAGGX;
	public int FINALAGGY;
	public int AcidLevel;
	public boolean AraxxorEggBurst;
	public int AraxxorAttackCount;
	public boolean AraxxorCompleteAttack;
	public int cacoonTime;
	public int araxxorCacoonTime;
	public int eggSpidersX;
	public int eggSpidersY;
	public boolean hasSpawnedEggs;
	@SuppressWarnings("unused")
	private boolean killedAraxxor;
	public int AraxxorNormAttackDelay;
	public int ArraxorAttackDelay;
	public boolean araxxorEggAttack;
	public WorldTile AraxxorBase;
	public boolean araxxorHeal;

	// rs settings
	private boolean lockInterfaceCustomization;
	private boolean hideTitleBarsWhenLocked;
	private boolean slimHeaders;
	private boolean clickThroughtChatboxes;
	private boolean timeStamps;
	private boolean targetReticules;
	private boolean alwaysShowTargetInformation;
	private boolean legacyCombatMode;
	private boolean legacyInterfaceMode;
	private boolean legacyInterfaceSkin;
	private boolean splitPrivateChat;
	private boolean makeXProgressWindow;
	private boolean hideFamiliarOptions;
	private boolean guidanceSystemHints;
	private boolean toogleQuickChat;
	private boolean lockZoom;
	private boolean rs3Camera;
	private boolean taskCompletePopup;
	private boolean taskInformationWindow;
	private boolean publicChatEffects;
	private boolean tooglePlayerNotification;
	private boolean toogleAbilityCooldownTimer;
	private boolean skillTargetBasedXPPopup;
	private boolean toggleBuffTimers;
	private boolean virtualLeveling;
	private boolean goldTrim;
	private boolean bobBank;
	private boolean slayerCounter;
	private boolean chatBadge = true;
	private boolean lootInterface;
	private boolean areaLoot;
	private boolean retroCapes;
	private boolean targetInterface = false;
	private boolean onDifferentExamineTab = false;
	private int utcClock;
	private int backPackColumn;
	private int optionType;
	private int lootBeamValue = 1000;
	private int lootBeamOption = 0;
	private int capIcon;
	private int capIcon2;
	
	private transient Item[] cosmeticPreview;
	private Player examinedPlayer;

	private HashMap<Integer, Integer> vars;
	private HashMap<Integer, Integer> varBits;

	// rs3 chat settings
	private boolean alwaysOnChatMode;

	private int privateChatSetup;
	private int friendChatSetup;
	private int clanChatSetup;
	private int guestChatSetup;
	private int publicChatSetup;
	private int groupChatSetup;
	private int groupTeamChatSetup;
	private int skullDelay;
	private int skullId;

	private int loginCount;
	private boolean forceNextMapLoadRefresh;
	private boolean killedQueenBlackDragon;
	private int runeSpanPoints;
	private int pestPoints;
	private int stealingCreationPoints;
	private int favorPoints;
	private double[] warriorPoints;
	private boolean[] prayerBook;
	private int previousLodestone;
	private boolean instantSwitchToLegacy;

	// shop
	private boolean verboseShopDisplayMode;

	private long lastStarSprite;
	private long lastBork;

	private int[] pouches;

	// game bar status
	private int gameStatus;
	private int publicStatus;
	private int personalStatus;
	private int clanStatus;
	private int tradeStatus;
	private int assistStatus;
	private int friendsChatStatus;

	// honor
	private int killCount, deathCount;
	private long lastArtefactTime;

	private ChargesManager charges;
	// barrows
	private boolean[] killedBarrowBrothers;
	private int hiddenBrother;
	private int barrowsKillCount;
	// strongholdofsecurity rewards
	private boolean[] shosRewards;
	private boolean killedLostCityTree;

	// skill capes customizing
	private int[] maxedCapeCustomized;
	private int[] completionistCapeCustomized;

	// completionistcape reqs
	private boolean completedFightCaves;
	private boolean completedFightKiln;
	private boolean wonFightPits;
	private boolean completedStealingCreation;
	private boolean capturedCastleWarsFlag;
	private int receivedCompletionistCape;
	private boolean killedWildyWyrm;
	private boolean foundShootingStar;

	// trimmed compcape
	private int finishedCastleWars;
	private int finishedStealingCreations;

	// crucible
	private boolean talkedWithMarv;
	private int crucibleHighScore;

	private int ecoClearStage;

	// gravestone
	private int graveStone;

	private String lastFriendsChat;
	private int lastFriendsChatRank = -1;
	private String clanName;// , guestClanChat;
	private boolean connectedClanChannel;

	private int summoningLeftClickOption;
	private transient boolean pouchFilter;
	private List<String> ownedObjectsManagerKeys;
	
	public HashMap<String, Integer> slayerCreatures;
	public final Object[][] KILLCOUNTDATA = { { "Terror dog", 22921 }, { "Bloodveld", 22922 }, { "Aberrant spectre", 22924 },
			{ "Dust devil", 22925 }, {"Wolf", 6047}, { "Automaton Generator", 22926 }, { "Automaton Tracer", 22926 },
			{ "Automaton Guardian", 22926 }, { "Skeletal Wyvern", 22927 }, { "Jungle strykewyrm", 22928 },
			{ "Aquanite", 22929 }, { "Nechryael", 22930 }, { "Mutated jadinkos", 22931 },
			{ "Ascension creatures", 22932 }, { "Polypore creatures", 22933 }, { "Spiritual mage", 22934 },
			{ "Abyssal demon", 22935 }, { "Dark beast", 22936 }, { "Airut", 22937 }, { "Ice strykewyrm", 22938 },
			{ "Kal'gerion demon", 22939 }, { "Glacor", 22940 }, { "Tormented demon", 22941 }, { "Gargoyle", 22942 },
			{ "Muspah", 22943 }, { "Nihil", 22944 }, { "Desert strykewyrm", 22945 }, { "Edimmu", 25877 },
			{ "Lava strykewyrm", 27007 }, { "Adamant dragon", 28374 }, { "Runite dragon", 28375 },
			{ "Crystal Shapeshifter", 29381 }, { "Living Wyvern", 29818 }, { "Ripper Demon", 29819 },
			{ "Camel Warrior", 29820 }, { "Acheron Mammoth", 29821 }, { "Celestial dragon", 30017 },
			{ "Giant mole", 22946 }, { "King Black Dragon", 22948 }, { "Chaos Elemental", 22950 },
			{ "Kalphite Queen", 22951 }, { "TzTok-Jad", 22952 }, { "Corporeal Beast", 22953 },
			{ "Dagannoth Kings", 22954 }, { "Queen Black Dragon", 22955 }, { "Commander Zilyana", 22956 },
			{ "General Graardor", 22958 }, { "Kree'arra", 22960 }, { "K'ril Tsutsaroth", 22962 }, { "Har-Aken", 22964 },
			{ "Kalphite King", 22965 }, { "Legios", 22966 }, { "Nex", 22967 }, { "Araxxi", 22969 }, { "Vorago", 22970 },
			{ "Beastmaster Durzag", 28643 }, { "Yakamaru", 28644 }, { "Gorvek and Vindicta", 30840 },
			{ "Nymora, the Vengeful", 30841 }, { "Avaryss, the Unceasing", 30841 }, { "Helwyr", 30842 },
			{ "Gregorovic", 30843 }, };

	/**
	 * Objects
	 */
	// kalphite
	private boolean khalphiteLairEntranceSetted;
	private boolean khalphiteLairSetted;
	// red sandstone
	private int redStoneCount;
	private long redStoneDelay;

	private boolean xpLocked;
	private boolean yellOff;

	public long delay, majorDelay, runEnergyDelay;

	private String yellColor = "ff0000";
	private boolean oldItemsLook; // selects whenever to play with old or new
	// items visual

	// old voting variables
	@SuppressWarnings("unused")
	private long voted;
	private int votes;
	@SuppressWarnings("unused")
	private int votePoints;
	private boolean enteredDonatorZone;

	private String lastGameIp;
	private String lastGameMAC;
	private transient boolean masterLogin;
	private long lastGameLogin;

	private int xpRateMode;

	private long onlineTime;

	private String lastBossInstanceKey;
	private InstanceSettings lastBossInstanceSettings;

	// new nsi system
	private Map<Integer, Integer> iLayoutVars;

	// creates Player and saved classes
	public Player() {
		super(Settings.START_PLAYER_LOCATION);
		super.setHitpoints(Settings.START_PLAYER_HITPOINTS);
		slayerCreatures = new HashMap<String, Integer>();
		vars = new HashMap<Integer, Integer>();
		varBits = new HashMap<Integer, Integer>();
		arealoot = new AreaLoot();
		loyaltyPoints = new LoyaltyPoints();
		donationManager = new DonationManager();
		appearence = new Appearence();
		inventory = new Inventory();
		moneyPouch = new MoneyPouch();
		treasureHunter = new TreasureHunter();
		equipment = new Equipment();
		skills = new Skills();
		combatDefinitions = new CombatDefinitions();
		prayer = new Prayer();
		bank = new Bank();
		controlerManager = new ControlerManager();
		musicsManager = new MusicsManager();
		emotesManager = new EmotesManager();
		notes = new Notes();
		toolbelt = new Toolbelt();
		dominionTower = new DominionTower();
		charges = new ChargesManager();
		auraManager = new AuraManager();
		questManager = new QuestManager();
		petManager = new PetManager();
		farmingManager = new FarmingManager();
		geManager = new GrandExchangeManager();
		slayerManager = new SlayerManager();
		treasureTrailsManager = new TreasureTrailsManager();
		coalTrucksManager = new CoalTrucksManager();
		dungManager = new DungManager();
		house = new House();
		actionbar = new ActionBar();
		doomsayerManager = new DoomsayerManager();
		timersManager = new TimersManager();
		playerExamineManager = new PlayerExamineManager();
		cosmeticsManager = new CosmeticsManager();
		runEnergy = 100;
		allowChatEffects = true;
		mouseButtons = true;
		profanityFilter = true;
		guidanceSystemHints = true;
		toogleQuickChat = true;
		makeXProgressWindow = true;
		taskInformationWindow = true;
		rs3Camera = true;
		targetReticules = true;
		alwaysShowTargetInformation = true;
		toggleBuffTimers = true;
		utcClock = 1;
		pouches = new int[4];
		resetBarrows();
		shosRewards = new boolean[4];
		warriorPoints = new double[6];
		subMenus = new int[10];
		prayerBook = new boolean[PrayerBooks.BOOKS.length];
		SkillCapeCustomizer.resetSkillCapes(this);
		ownedObjectsManagerKeys = new LinkedList<String>();
		resetILayoutVars();
		setEcoClearStage(10);
	}

	public void init(Session session, boolean lobby, String username, String displayName, String lastGameMAC,
			String email, int rights, int messageIcon, boolean masterLogin, boolean donator, boolean extremeDonator,
			boolean support, boolean gfxDesigner, boolean muted, long lastVote, int displayMode, int screenWidth,
			int screenHeight, MachineInformation machineInformation, IsaacKeyPair isaacKeyPair) {
		if (slayerCreatures == null)
			slayerCreatures = new HashMap<String, Integer>();
		if (doomsayerManager == null)
			doomsayerManager = new DoomsayerManager();
		if (timersManager == null)
			timersManager = new TimersManager();
		if (playerExamineManager == null)
			playerExamineManager = new PlayerExamineManager();
		if (cosmeticsManager == null)
			cosmeticsManager = new CosmeticsManager();

		this.session = session;
		this.lobby = lobby;
		this.username = username;
		this.displayName = displayName;  
		this.email = email;
		this.rights = rights; 
		this.masterLogin = masterLogin;
		this.messageIcon = messageIcon;
		this.donator = donator;
		this.extremeDonator = extremeDonator;
		this.isSupporter = support;
		this.isGraphicDesigner = gfxDesigner;
		this.muted = muted;
		this.lastVote = lastVote;
		this.lastGameMAC = lastGameMAC;
		this.displayMode = displayMode;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.machineInformation = machineInformation;
		this.isaacKeyPair = isaacKeyPair;

		interfaceManager = new InterfaceManager(this);
		dialogueManager = new DialogueManager(this);
		hintIconsManager = new HintIconsManager(this);
		priceCheckManager = new PriceCheckManager(this);
		localPlayerUpdate = new LocalPlayerUpdate(this);
		localNPCUpdate = new LocalNPCUpdate(this);
		actionManager = new ActionManager(this);
		cutscenesManager = new CutscenesManager(this);
		trade = new Trade(this);
		varsManager = new VarsManager(this);
		friendsIgnores = new FriendsIgnores(this);
		// loads player on saved instances
		arealoot.setPlayer(this);
		appearence.setPlayer(this);
		loyaltyPoints.setPlayer(this);
		donationManager.setPlayer(this);
		treasureHunter.setPlayer(this);
		inventory.setPlayer(this);
		moneyPouch.setPlayer(this);
		equipment.setPlayer(this);
		skills.setPlayer(this);
		combatDefinitions.setPlayer(this);
		prayer.setPlayer(this);
		bank.setPlayer(this);
		controlerManager.setPlayer(this);
		musicsManager.setPlayer(this);
		emotesManager.setPlayer(this);
		notes.setPlayer(this);
		toolbelt.setPlayer(this);
		dominionTower.setPlayer(this);
		auraManager.setPlayer(this);
		charges.setPlayer(this);
		questManager.setPlayer(this);
		petManager.setPlayer(this);
		house.setPlayer(this);
		actionbar.setPlayer(this);
		doomsayerManager.setPlayer(this);
		timersManager.setPlayer(this);
		playerExamineManager.setPlayer(this);
		cosmeticsManager.setPlayer(this);
		farmingManager.setPlayer(this);
		geManager.setPlayer(this);
		slayerManager.setPlayer(this);
		treasureTrailsManager.setPlayer(this);
		coalTrucksManager.setPlayer(this);
		dungManager.setPlayer(this);
		initEntity(); // generates hash thats why
		if (!lobby) {
			setDirection(Utils.getAngle(0, -1));
			logicPackets = new ConcurrentLinkedQueue<LogicPacket>();
			switchItemCache = Collections.synchronizedList(new ArrayList<Integer>());
			World.addPlayer(this);
			World.updateEntityRegion(this);
		} else {
			World.addLobbyPlayer(this);
		}
		if (Settings.DEBUG)
			Logger.log(this, "Initiated player: " + username);

	}

	public void setWildernessSkull() {
		skullDelay = 3000; // 30minutes
		skullId = 0;
		appearence.generateIconsData();
	}

	public void setFightPitsSkull() {
		skullDelay = Integer.MAX_VALUE; // infinite
		skullId = 1;
		appearence.generateIconsData();
	}

	public void setSkullInfiniteDelay(int skullId) {
		skullDelay = Integer.MAX_VALUE; // infinite
		this.skullId = skullId;
		appearence.generateIconsData();
	}

	public void removeSkull() {
		skullDelay = -1;
		appearence.generateIconsData();
	}

	public boolean hasSkull() {
		return skullDelay > 0;
	}

	public int setSkullDelay(int delay) {
		return this.skullDelay = delay;
	}

	public void completeReset() {
		bank = new Bank();
		bank.setPlayer(this);
		equipment.reset();
		inventory.reset();
		moneyPouch.setCoinsAmount(0);
		actionbar = new ActionBar();
		actionbar.setPlayer(this);
		for (int skill = 0; skill < 25; skill++) {
			skills.setXp(skill, 0);
			skills.set(skill, 1);
		}
		skills.init();
	}

	public void refreshSpawnedItems() {
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId).getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if (item.isInvisible() && (item.hasOwner() && !getUsername().equals(item.getOwner())))
					continue;
				getPackets().sendRemoveGroundItem(item);
			}
		}
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId).getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if ((item.isInvisible()) && (item.hasOwner() && !getUsername().equals(item.getOwner())))
					continue;
				getPackets().sendGroundItem(item);
			}
		}
	}

	public void refreshSpawnedObjects() {
		for (int regionId : getMapRegionsIds()) {
			List<WorldObject> removedObjects = World.getRegion(regionId).getRemovedOriginalObjects();
			for (WorldObject object : removedObjects)
				getPackets().sendRemoveObject(object);
			List<WorldObject> spawnedObjects = World.getRegion(regionId).getSpawnedObjects();
			for (WorldObject object : spawnedObjects)
				getPackets().sendAddObject(object);
		}
	}

	// now that we inited we can start showing game
	public void start() {
		Logger.globalLog(username, session.getIP(), new String(" has logged in."));
		loadMapRegions();
		started = true;
		run();
	}

	public void startLobby() {
		started = true;
		sendLobbyVars();
		runLobby();
		LoginClientChannelManager.sendReliablePacket(LoginChannelsPacketEncoder
				.encodePlayerWorldListStatusRequest(getUsername(), 0).getBuffer());
	}

	public void runLobby() {

		interfaceManager.sendInterfaces();

		if (GameLauncher.delayedShutdownStart != 0) {
			int delayPassed = (int) ((Utils.currentTimeMillis() - GameLauncher.delayedShutdownStart) / 1000);
			getPackets().sendSystemUpdate(GameLauncher.delayedShutdownDelay - delayPassed, true);
		}

		friendsIgnores.initialize();
		if (lastFriendsChat != null) {
			FriendsChat.requestJoin(this, lastFriendsChat);
			lastFriendsChat = null;
		}
		if (clanName != null) {
			if (!ClansManager.connectToClan(this, clanName, false))
				clanName = null;
		}

	}
	
	
	

	private short hefinLaps;

	public void addHefinLaps() {
		this.hefinLaps++;
	}

	public short getHefinLaps() {
		return hefinLaps;
	}

	public boolean hefinLapReward;
	
	private int lapsRan;

	public void addLapsRan() {
		this.lapsRan++;
	}

	public int getLapsRan() {
		return lapsRan;
	} 

	public void sendLobbyVars() {
		System.out.println("SENDLOBBYVARS");
		getPackets().refreshLobbyInformation();
		getVarsManager().sendVar(1751, 16912800);
		getVarsManager().sendVar(1752, 8036241);
		getVarsManager().sendVar(1753, 161);
		getVarsManager().sendVar(1754, 37);
		getVarsManager().sendVarBit(16464, 1);
		getVarsManager().sendVarBit(16465, 0);
		getPackets().sendCSVarInteger(4660, getLoyaltyPoints().getAllPoints());// Loyalty Points
		getPackets().sendCSVarInteger(4659, 0);// Runecoins
		getPackets().sendCSVarInteger(4266, getTreasureHunter().getAllKeys());// Treasure hunter keys
		getPackets().sendCSVarInteger(4267, getTreasureHunter().getHearts());// Treasure chest heart amount
	}

	public void stopAll() {
		stopAll(true);
	}

	public void stopAll(boolean stopWalk) {
		stopAll(stopWalk, true);
	}

	public void stopAll(boolean stopWalk, boolean stopInterface) {
		stopAll(stopWalk, stopInterface, true);
	}

	// as walk done clientsided
	public void stopAll(boolean stopWalk, boolean stopInterfaces, boolean stopActions) {
		routeEvent = null;
		if (stopInterfaces)
			closeInterfaces();
		if (stopWalk && !cantWalk)
			resetWalkSteps();
		if (stopActions)
			actionManager.forceStop();
		combatDefinitions.resetSpells(false);
		interfaceManager.removeInterface(1251);
		varsManager.sendVar(1176, 0);
		getSkills();
		Skills.xpMultiplier = 1;
	}

	@Override
	public void setHitpoints(int hitpoints) {
		super.setHitpoints(hitpoints);
		refreshHitPoints();
	}

	@Override
	public void reset(boolean attributes) {
		super.reset(attributes);
		hintIconsManager.removeAll();
		skills.restoreSkills();
		combatDefinitions.resetSpecialAttack();
		prayer.reset();
		combatDefinitions.resetSpells(false);
		resting = 0;
		skullDelay = 0;
		foodDelay = 0;
		potDelay = 0;
		castedVeng = false;
		cantWalk = false;
		setRunEnergy(100);
		appearence.generateAppearenceData();
		appearence.generateIconsData();
	}

	@Override
	public void reset() {
		reset(true);
	}

	public void closeInterfaces() {
		if (interfaceManager.containsScreenInterface())
			interfaceManager.removeCentralInterface();
		if (interfaceManager.containsBankInterface())
			interfaceManager.removeBankInterface();
		if (interfaceManager.containsInventoryInter())
			interfaceManager.removeInventoryInterface();
		if (interfaceManager.containsInputTextInterface())
			interfaceManager.removeInputTextInterface();
		if (interfaceManager.containsWorldMapInterface())
			interfaceManager.removeWorldMapInterface();
		dialogueManager.finishDialogue();
		if (closeInterfacesEvent != null) {
			closeInterfacesEvent.run();
			closeInterfacesEvent = null;
		}
		interfaceManager.closeMenu();
	}

	public void setClientHasntLoadedMapRegion() {
		clientLoadedMapRegion = Utils.currentWorldCycle() + 30;
	}

	@Override
	public void loadMapRegions() {
		boolean wasAtDynamicRegion = isAtDynamicRegion();
		super.loadMapRegions();
		setClientHasntLoadedMapRegion();
		if (isAtDynamicRegion()) {
			getPackets().sendDynamicGameScene(!started);
			if (!wasAtDynamicRegion)
				localNPCUpdate.reset();
		} else {
			getPackets().sendGameScene(!started);
			getPackets().sendResetCamera();
			if (wasAtDynamicRegion)
				localNPCUpdate.reset();
		}
		forceNextMapLoadRefresh = false;
	}

	public void addAdrenalineBar() {
		if (getNextHitBars().isEmpty())
			getNextHitBars().add(new AdrenalineHitBar(this));
	}

	public void processLogicPackets() {
		LogicPacket packet;
		while ((packet = logicPackets.poll()) != null)
			WorldPacketsDecoder.decodeLogicPacket(this, packet);
	}

	public void processProjectiles() {

		for (int regionId : getMapRegionsIds()) {
			Region region = World.getRegion(regionId);
			for (Projectile projectile : region.getProjectiles()) {

				int fromSizeX, fromSizeY;
				if (projectile.getFrom() instanceof Entity)
					fromSizeX = fromSizeY = ((Entity) projectile.getFrom()).getSize();
				else if (projectile.getFrom() instanceof WorldObject) {
					ObjectDefinitions defs = ((WorldObject) projectile.getFrom()).getDefinitions();
					fromSizeX = defs.getSizeX();
					fromSizeY = defs.getSizeY();
				} else
					fromSizeX = fromSizeY = 1;
				int toSizeX, toSizeY;
				if (projectile.getTo() instanceof Entity)
					toSizeX = toSizeY = ((Entity) projectile.getTo()).getSize();
				else if (projectile.getTo() instanceof WorldObject) {
					ObjectDefinitions defs = ((WorldObject) projectile.getTo()).getDefinitions();
					toSizeX = defs.getSizeX();
					toSizeY = defs.getSizeY();
				} else
					toSizeX = toSizeY = 1;

				getPackets().sendProjectileNew(projectile.getFrom(), fromSizeX, fromSizeY, projectile.getTo(), toSizeX,
						toSizeY, projectile.getFrom() instanceof Entity ? (Entity) projectile.getFrom() : null,
						projectile.getTo() instanceof Entity ? (Entity) projectile.getTo() : null,
						projectile.isAdjustFlyingHeight(), projectile.isAdjustSenderHeight(),
						projectile.getSenderBodyPart(), projectile.getGraphicId(), projectile.getStartHeight(),
						projectile.getEndHeight(), projectile.getStartTime(), projectile.getEndTime(),
						projectile.getSlope(), projectile.getAngle(), 0);
			}
		}
	}

	@Override
	public void processEntityUpdate() {
		super.processEntityUpdate();
	}

	@Override
	public void processEntity() {
		processLogicPackets();
		// actionbar.processQueuedShortcut();
		actionManager.process();
		if (routeEvent != null && routeEvent.processEvent(this))
			routeEvent = null;
		super.processEntity();
		charges.process();
		auraManager.process();
		timersManager.process();
		prayer.processPrayer();
		controlerManager.process();
		farmingManager.process();
		cutscenesManager.process();
		if (isDead())
			return;
		if (musicsManager.musicEnded())
			musicsManager.replayMusic();
		if (hasSkull()) {
			skullDelay--;
			if (!hasSkull())
				appearence.generateAppearenceData();
		}
		getCombatDefinitions().processCombatStance();
	}

	@Override
	public void processReceivedHits() {
		if (isLocked())
			return;
		super.processReceivedHits();
	}

	@Override
	public void applyHit(Hit hit) {
		Entity source = hit.getSource();
		if (source != this && source instanceof Player && !isCanPvp())
			return;
		super.applyHit(hit);
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		/*
		 * if (!clientHasLoadedMapRegion()) { // load objects and items here
		 * setClientHasLoadedMapRegion(); refreshSpawnedObjects();
		 * refreshSpawnedItems(); }
		 */
	}
	public DonationManager getDonationManager() {
		return donationManager;
	}
	
	public LoyaltyPoints getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void toogleRun(boolean update) {
		super.setRun(!getRun());
		if (update)
			sendRunButtonConfig();
	}

	public void setRunHidden(boolean run) {
		super.setRun(run);
	}

	@Override
	public void setRun(boolean run) {
		if (run != getRun()) {
			super.setRun(run);
			sendRunButtonConfig();
		}
	}

	public void sendRunButtonConfig() {
		getVarsManager().sendVar(463, resting == 1 ? 3 : resting == 2 ? 4 : getRun() ? 1 : 0);
	}

	public void restoreRunEnergy() {
		if (getNextRunDirection() != -1 || runEnergy >= 100)
			return;
		runEnergy++;
		getPackets().sendRunEnergy();
	}

	/*
	 * notice this may end up not being called if player dcs at same time he
	 * logs in use it just for stuff that cant be sent right away
	 */
	public void runAfterLoad() {
		interfaceManager.refreshInterface(true);
		skills.sendCombatLevel();
		runAfterLoad = true;
	}

	public void run() {
		if (!masterLogin)
			lastGameIp = getSession().getIP();
		lastGameLogin = Utils.currentTimeMillis();
		loginCount += 1;
		refreshInterfaceVars();
		interfaceManager.sendInterfaces();
		if (GameLauncher.delayedShutdownStart != 0) {
			int delayPassed = (int) ((Utils.currentTimeMillis() - GameLauncher.delayedShutdownStart) / 1000);
			getPackets().sendSystemUpdate(GameLauncher.delayedShutdownDelay - delayPassed, false);
		}
		varsManager.sendVarBit(19928,
				(legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode || hideTitleBarsWhenLocked ? 1 : 0);
		varsManager.sendVarBit(19925,
				(legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode || lockInterfaceCustomization ? 1 : 0);
		varsManager.sendVarBit(19924,
				(legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode || slimHeaders ? 1 : 0);
		varsManager.sendVarBit(24939, 1);
		varsManager.sendVarBit(24939, 0);
		getPackets().sendRunEnergy();
		getPackets().sendItemsLook();
		refreshAllowChatEffects();
		refreshAcceptAid();
		refreshRightClickReporting();
		refreshMouseButtons();
		refreshHideFamiliarOptions();
		refreshGuidanceSystemHints();
		sendLoginMessages();
		refreshToogleQuickChat();
		refreshProfanityFilter();
		refreshLockZoom();
		refreshCameraType();
		refreshChatsSetup();
		refreshTimeStamps();
		refreshVirtualLeveling();
		refreshGoldTrim();
		refreshLootInterface();
		refreshAreaLoot();
		refreshQuestConfigs();
		refreshRetroCapes();
		refreshLootBeamValue();
		refreshLootBeamOption();
		refreshCapIcon();
		refreshCapIcon2();
		initiateVarsAndVarbits();
		refreshVarBits();
		refreshVars();
		sendRunButtonConfig();
		Familiar.refreshDefaultPetOptions(this);
		getPackets().sendGameMessage("Welcome to " + Settings.SERVER_NAME + ".");
		if (getXpRateMode() != 0)
			getPackets().sendGameMessage("Your xp rate mode is: x" + Settings.getXpRate(this) + " xp, x"
					+ Settings.getCombatXpRate(this) + " combat xp.");
		getPackets().sendGameMessage(Settings.LATEST_UPDATE);
		sendDefaultPlayersOptions();
		arealoot.init();
		inventory.init();
		moneyPouch.init();
		equipment.checkItems();
		equipment.init();
		bank.init();
		skills.init();
		combatDefinitions.init();
		prayer.init();
		refreshHitPoints();
		warriorCheck();
		prayer.refreshPrayerPoints();
		getVarsManager().sendVar(1295, 1000);
		getVarsManager().sendVarBit(20940, 120);
		getPackets().sendGameBarStages();
		musicsManager.init();
		emotesManager.init();
		questManager.init();
		notes.init();
		house.init();
		actionbar.init();
		doomsayerManager.init();
		timersManager.init();
		playerExamineManager.init();
		cosmeticsManager.init();
		farmingManager.init();
		toolbelt.init();
		geManager.init();
		coalTrucksManager.init();
		refreshBuffs();
		ItemRemover.check(this);
		sendUnlockedObjectConfigs();
		friendsIgnores.initialize();
		if (lastFriendsChat != null)
			FriendsChat.requestJoin(this, lastFriendsChat);
		else {
			FriendsChat.requestJoin(this, Utils.formatPlayerNameForDisplay(Settings.MAIN_FC));
			lastFriendsChat = Utils.formatPlayerNameForDisplay(Settings.MAIN_FC);
		}
		if (clanName != null) {
			if (!ClansManager.connectToClan(this, clanName, false))
				clanName = null;
		}
		if (familiar != null)
			familiar.respawnFamiliar(this);
		else
			petManager.init();
		running = true;
		appearence.generateAppearenceData();
		appearence.generateIconsData();
		controlerManager.login(); // checks what to do on login after welcome
		OwnedObjectManager.linkKeys(this);
		GraveStone.linkPlayer(this);
		if (machineInformation != null)
			machineInformation.sendSuggestions(this);
		getTreasureHunter().giveDailyKeys();
		loyaltyPoints.giveDailyPoints();
		slayerManager.updateInterface();
		onDifferentExamineTab = false;
		if (Settings.SERVER_OWNERS.contains(getUsername()) || Settings.SERVER_DEVELOPERS.contains(getUsername())
				|| Settings.SERVER_ADMINISTRATORS.contains(getUsername())){
			setRights(2);
			System.out.println("Rights: 2");
		}else if (Settings.SERVER_MODERATORS.contains(getUsername())){
			setRights(1);
			System.out.println("Rights: 1");
		}else{
			System.out.println("Rights: 0");
			setRights(0);
		}
		if (isDead())
			sendDeath(null);
	}

	
	
	
	
	private void sendLoginMessages() {
		getPackets().sendForceGameMessage(
				!Settings.DEBUG ? "Welcome to " + Settings.SERVER_NAME + "."
						: "Welcome to The crazy world.");
		if (getUsername().equalsIgnoreCase("timelord") || getUsername().equalsIgnoreCase("dylanpage95")) {
			System.out.print("We are processing this method only once");
			for (Player p : World.getPlayers())
			p.getPackets().sendGameMessage("[<img=1><col=ff0ff0><shad=000000>Owner/Coder</col>] <img=1><col=ffff00> "+getDisplayName()+" Has logged in.");
		}
		if (getUsername().equalsIgnoreCase("propker009")) {
			for (Player p : World.getPlayers())
			p.getPackets().sendGameMessage("[<img=1><col=ff0ff0><shad=000000>Developer/Owner</col>] <img=1><col=ffff00> "+getDisplayName()+" Has logged in.");
		}
		if (getUsername().equalsIgnoreCase("")) {
			for (Player p : World.getPlayers())// JA EN NEE DIT
			p.getPackets().sendGameMessage("[<img=1><col=ff0ff0><shad=000000>Developer</col>] <img=1><col=ffff00> "+getDisplayName()+" Has logged in.");
		}
		getSlayerManager().updateInterface();
		
		loginCount++;
	}
	
	
	
	
	
	private void sendUnlockedObjectConfigs() {
		refreshKalphiteLairEntrance();
		refreshKalphiteLair();
		refreshFightKilnEntrance();
		refreshLairofTarnRazorlorEntrance();
		refreshTreeofJadinko();
	}

	private void refreshTreeofJadinko() {
		getVarsManager().sendVarBit(9513, 1);
	}

	private void refreshLairofTarnRazorlorEntrance() {
		getVarsManager().sendVar(382, 11);
	}

	private void refreshKalphiteLair() {
		if (khalphiteLairSetted)
			getVarsManager().sendVarBit(16280, 1);
	}

	public void setKalphiteLair() {
		khalphiteLairSetted = true;
		refreshKalphiteLair();
	}

	private void refreshFightKilnEntrance() {
		if (completedFightCaves)
			getVarsManager().sendVarBit(3910, 1);
	}

	private void refreshKalphiteLairEntrance() {
		if (khalphiteLairEntranceSetted)
			getVarsManager().sendVarBit(16281, 1);
	}

	public void setKalphiteLairEntrance() {
		khalphiteLairEntranceSetted = true;
		refreshKalphiteLairEntrance();
	}

	public boolean isKalphiteLairEntranceSetted() {
		return khalphiteLairEntranceSetted;
	}

	public boolean isKalphiteLairSetted() {
		return khalphiteLairSetted;
	}

	public void sendDefaultPlayersOptions() {
		getPackets().sendPlayerOption("Follow", 2, false);
		getPackets().sendPlayerOption("Trade with", 4, false);
		if (assistStatus != 2)
			sendAssistOption();
		getPackets().sendPlayerOption("Examine", 6, false);
	}

	public void sendAssistOption() {
		getPackets().sendPlayerOption(assistStatus == 2 ? "null" : "Req Assist", 5, false);
	}

	/**
	 * Logs the player out.
	 * 
	 * @param lobby
	 *            If we're logging out to the lobby.
	 */
	public void logout(boolean lobby) {
		if (!running || !started)
			return;
		long currentTime = Utils.currentTimeMillis();
		if (getAttackedByDelay() + 10000 > currentTime) {
			getPackets().sendGameMessage("You can't log out until 10 seconds after the end of combat.");
			return;
		}
		if (getEmotesManager().getNextEmoteEnd() >= currentTime) {
			getPackets().sendGameMessage("You can't log out while performing an emote.");
			return;
		}
		if (isLocked()) {
			getPackets().sendGameMessage("You can't log out while performing an action.");
			return;
		}
		disconnect(false, lobby);
	}

	public void disconnect(boolean immediate, boolean lobby) {
		immediateFinish = immediate;
		ChannelFuture future = getPackets().sendLogout(lobby);
		if (isLobby() || immediate) { // worldthread does this anyway, so just
			// need to send packet for normal logout
			if (future == null)
				getSession().getChannel().close();
			else
				future.addListener(ChannelFutureListener.CLOSE);
		}
	}

	private transient boolean immediateFinish;
	private transient boolean finishing;

	public int[] grandExchangeLimit;

	@Override
	public void finish() {
		finish(0);
	}

	public boolean isFinishing() {
		return finishing;
	}
	
	public int getSilverhawkFeathers() {
		return silverhawkFeathers;
	}

	public TreasureHunter getTreasureHunter() {
		return treasureHunter;
	}

	public TreasureTrailsManager getTreasureTrailsManager() {
		return treasureTrailsManager;
	}

	
	public void setSilverhawkFeathers(int amount) {
		this.silverhawkFeathers = amount;
	}

	public CompletionistCapeManager getCompCapeManager() {
		return getCompCapeManager();
	}
	public void finish(final int tryCount) {
		if (finishing || hasFinished())
			return;
		finishing = true;
		if (lobby) {
			finishLobby();
			return;
		}
		// if combating doesnt stop when xlog this way ends combat
		stopAll(false, true, !(actionManager.getAction() instanceof PlayerCombat));

		if (!immediateFinish && ((isDead() || isUnderCombat() || isLocked() || getEmotesManager().isDoingEmote()))
				&& tryCount < 4) {
			GameExecutorManager.slowExecutor.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						finishing = false;
						finish(tryCount + 1);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 10, TimeUnit.SECONDS);
			return;
		}
		realFinish();
	}

	public void finishLobby() {
		if (hasFinished())
			return;
		/*
		 * friendsIgnores.sendFriendsMyStatus(false); if (currentFriendChat !=
		 * null) currentFriendChat.leaveChat(this, true); if (clanManager !=
		 * null) clanManager.disconnect(this, false);
		 */
		if (currentFriendsChat != null)
			FriendsChat.detach(this);
		if (clanManager != null)
			clanManager.disconnect(this, false);
		setFinished(true);
		session.getChannel().close();
		PlayerHandlerThread.addLogout(this);
		World.removeLobbyPlayer(this);
		if (Settings.DEBUG)
			Logger.log(this, "Finished Lobby Player: " + username);
	}

	public void realFinish() {
		if (hasFinished())
			return;
		Logger.globalLog(username, session.getIP(), new String(" has logged out."));
		// login
		running = false;
		stopAll();
		onlineTime += getSessionTime();
		cutscenesManager.logout();
		controlerManager.logout(); // checks what to do on before logout for
		house.finish();
		dungManager.finish();
		GrandExchange.unlinkOffers(this);
		if (currentFriendsChat != null)
			FriendsChat.detach(this);
		if (clanManager != null)
			clanManager.disconnect(this, false);
		if (guestClanManager != null)
			guestClanManager.disconnect(this, true);
		if (familiar != null && !familiar.isFinished())
			familiar.dissmissFamiliar(true);
		else if (pet != null)
			pet.finish();
		if (slayerManager.getSocialPlayer() != null)
			slayerManager.resetSocialGroup(true);
		if (getNextWorldTile() != null)
			setLocation(getNextWorldTile());
		setFinished(true);
		session.getChannel().close();
		PlayerHandlerThread.addLogout(this);
		Highscores.updatePlayer(this);
		World.updateEntityRegion(this);
		World.removePlayer(this);
		if (Settings.DEBUG)
			Logger.log(this, "Finished Player: " + username);
	}

	public void refreshHitPoints() {
		if (getVarsManager().sendVarBit(1668, getHitpoints()))
			updateBuffs();
	}

	@Override
	public int getMaxHitpoints() {
		return skills.getLevel(Skills.HITPOINTS) * 100 + equipment.getEquipmentHpIncrease();
	}

	public String getUsername() {
		return username;
	}
	
	public boolean getDivineCoin() {
		return divineCoin;
	}

	public void setDivineCoin(boolean divineCoin) {
		this.divineCoin = divineCoin;
	}

	@Override
	public void processHit(Hit hit) {
		if (appearence.isHidden())
			return;
		super.processHit(hit);
	}

	public int getRights() {
		return rights;
	}

	public void setRights(int rights) {
		Account acc = Login.forceLoadAccount(getDisplayName());
		if (acc != null)
			acc.setRights(rights);
		this.rights = rights;
	}

	public int getMessageIcon() {
		return getRights() == 2 ? 2 : getRights();
	}

	public void setMessageIcon(int icon) {
		this.messageIcon = icon;
	}

	public WorldPacketsEncoder getPackets() {
		return session.getWorldPackets();
	}

	public boolean hasStarted() {
		return started;
	}

	public boolean isRunning() {
		return running;
	}

	public String getEmail() {
		return email;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String newName) {
		this.displayName = newName;
		getAppearence().generateAppearenceData();
	}

	public Appearence getAppearence() {
		return appearence;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public LocalPlayerUpdate getLocalPlayerUpdate() {
		return localPlayerUpdate;
	}

	public LocalNPCUpdate getLocalNPCUpdate() {
		return localNPCUpdate;
	}

	public int getDisplayMode() {
		return displayMode;
	}

	public InterfaceManager getInterfaceManager() {
		return interfaceManager;
	}

	public Session getSession() {
		return session;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public boolean clientHasLoadedMapRegion() {
		return clientLoadedMapRegion < Utils.currentWorldCycle();
	}

	public void setClientHasLoadedMapRegion() {
		clientLoadedMapRegion = -1;
	}

	public boolean clientHasLoadedMapRegionFinished() {
		return clientLoadedMapRegion == -1;
	}

	public void setDisplayMode(int displayMode) {
		this.displayMode = displayMode;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public Skills getSkills() {
		return skills;
	}

	public byte getRunEnergy() {
		return runEnergy;
	}

	public double getWeight() {
		return inventory.getInventoryWeight() + equipment.getEquipmentWeight();
	}

	public void drainRunEnergy() {
		if (dungManager.isInside())
			return;
		setRunEnergy(runEnergy - 1);
	}

	public void setRunEnergy(int runEnergy) {
		if (runEnergy == this.runEnergy)
			return;
		if (runEnergy < 0)
			runEnergy = 0;
		else if (runEnergy > 100)
			runEnergy = 100;
		this.runEnergy = (byte) runEnergy;
		getPackets().sendRunEnergy();
	}

	public boolean isResting() {
		return resting > 0;
	}

	public void setResting(int resting) {
		this.resting = resting;
		sendRunButtonConfig();
	}

	public ActionManager getActionManager() {
		return actionManager;
	}

	public void setRouteEvent(RouteEvent routeEvent) {
		this.routeEvent = routeEvent;
	}

	public DialogueManager getDialogueManager() {
		return dialogueManager;
	}

	public CombatDefinitions getCombatDefinitions() {
		return combatDefinitions;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		if (Utils.random(5) == 0 && Combat.fullVeracsEquipped(this))
			return 1.0;
		return 0.6;
	}

	@Override
	public void handleIngoingHit(final Hit hit) {
		if (hit.getLook() == HitLook.REGULAR_DAMAGE) {
			if (getEffectsManager().hasActiveEffect(EffectType.REFLECT))
				hit.setDamage(0);
			return;
		}
		if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		if (invulnerable) {
			hit.setDamage(0);
			return;
		}
		if (auraManager.usingPenance()) {
			int amount = (int) (hit.getDamage() * 0.05);
			if (amount > 0)
				prayer.restorePrayer(amount);
		}
		final Entity source = hit.getSource();
		if (source == null)
			return;
		if (getEffectsManager().hasActiveEffect(EffectType.VESTA_IMMUNITY)) {
			if (equipment.getWeaponId() != 13905 && equipment.getWeaponId() != 13907)
				getEffectsManager().removeEffect(EffectType.VESTA_IMMUNITY);
			else {
				int damage = (int) (hit.getDamage() * 0.5);
				hit.setDamage(damage);
				source.applyHit(new Hit(Player.this, damage, HitLook.REFLECTED_DAMAGE));
			}
		} else if (getEffectsManager().hasActiveEffect(EffectType.MIRRORBACK_SPIDER)) {
			Effect e = getEffectsManager().getEffectForType(EffectType.MIRRORBACK_SPIDER);
			if (e != null) {
				MirrorBackSpider spider = (MirrorBackSpider) e.getArguments()[0];
				if (spider.isDead())
					getEffectsManager().removeEffect(e.getType());
				else {
					int damage = (int) (hit.getDamage() * 0.5);
					hit.setDamage(damage);
					Hit reflectedHit = new Hit(this, damage, HitLook.REFLECTED_DAMAGE);
					spider.applyHit(reflectedHit);
					source.applyHit(reflectedHit);
				}
			}
		} else if (getEffectsManager().hasActiveEffect(EffectType.REFLECT)) {
			int damage = (int) (hit.getDamage() * 0.5);
			hit.setDamage(damage);
			source.applyHit(new Hit(Player.this, damage, HitLook.REFLECTED_DAMAGE));
		} else if (getEffectsManager().hasActiveEffect(EffectType.BARRICADE))
			hit.setDamage(0);
		if (getEffectsManager().hasActiveEffect(EffectType.DEBILITATE))
			hit.setDamage((int) (hit.getDamage() * 0.50));
		if (getEffectsManager().hasActiveEffect(EffectType.IMMORTALITY))
			hit.setDamage((int) (hit.getDamage() * 0.75));
		if (getEffectsManager().hasActiveEffect(EffectType.STAFF_OF_LIGHT)) {
			Item staff = equipment.getItem(Equipment.SLOT_WEAPON);
			if (staff == null || !staff.getName().equals("Staff of light"))
				getEffectsManager().removeEffect(EffectType.STAFF_OF_LIGHT);
			else {
				if (hit.getLook() == HitLook.MELEE_DAMAGE)
					hit.setDamage((int) (hit.getDamage() * 0.5));
			}
		}
		if (getEffectsManager().hasActiveEffect(EffectType.BERSERK))
			hit.setDamage((int) (hit.getDamage() * 1.5));
		if (getEffectsManager().hasActiveEffect(EffectType.RESONANCE)) {
			int damage = hit.getDamage();
			if (damage > 1) {
				hit.setDamage(1);
				heal(damage, 0, 0, true);
				getEffectsManager().removeEffect(EffectType.RESONANCE);
			}
		}
		Effect revengeEffect = getEffectsManager().getEffectForType(EffectType.REVENGE);
		if (revengeEffect != null) {
			if (hit.getDamage() > 0) {
				double nextDmgMultiplier = (double) revengeEffect.getArguments()[0] + 0.10;
				revengeEffect.getArguments()[0] = nextDmgMultiplier > 2.0 ? 2.0 : nextDmgMultiplier;
			}
		}
		if (prayer.hasPrayersOn() && hit.getDamage() != 0) {
			if (source instanceof Familiar) {
				Familiar fam = (Familiar) source;
				if (!fam.hasSpecialOn())
					return;
				Player owner = fam.getOwner();
				if (owner == null)
					return;
				if (prayer.usingPrayer(0, 10))
					hit.setDamage((int) (hit.getDamage() * 0.5));
				else if (prayer.usingPrayer(1, 10)) {
					hit.setDamage((int) (hit.getDamage() * 0.5));
					int deflectedDamage = (int) (hit.getDamage() * 0.1);
					if (deflectedDamage > 0) {
						owner.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
						setNextGraphics(new Graphics(2227));
						setNextAnimationNoPriority(new Animation(12573));
					}
				}
			} else {
				boolean isPvPReducation = source instanceof Player;
				if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
					if (prayer.usingPrayer(0, 11)) {
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getMagePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
					} else if (prayer.usingPrayer(1, 11)) {
						int deflectedDamage = (int) (hit.getDamage() * 0.1);
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getMagePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
						if (deflectedDamage > 0 && prayer.canReflect(source)) {
							source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
							setNextGraphics(new Graphics(2228));
							setNextAnimationNoPriority(new Animation(12573));
						}
					}
				} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
					if (prayer.usingPrayer(0, 12)) {
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getRangePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
					} else if (prayer.usingPrayer(1, 12)) {
						int deflectedDamage = (int) (hit.getDamage() * 0.1);
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getRangePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
						if (deflectedDamage > 0 && prayer.canReflect(source)) {
							source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
							setNextGraphics(new Graphics(2229));
							setNextAnimationNoPriority(new Animation(12573));
						}
					}
				} else if (hit.getLook() == HitLook.MELEE_DAMAGE) {
					if (prayer.usingPrayer(0, 13)) {
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getMeleePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
					} else if (prayer.usingPrayer(1, 13)) {
						int deflectedDamage = (int) (hit.getDamage() * 0.1);
						hit.setDamage((int) (hit.getDamage() * (getEffectsManager().hasActiveEffect(EffectType.DEVOTION)
								? isPvPReducation ? 0.25 : 0.0 : source.getMeleePrayerMultiplier())));
						if (hit.getDamage() == 0)
							hit.setDamage(1);
						if (deflectedDamage > 0 && prayer.canReflect(source)) {
							source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
							setNextGraphics(new Graphics(2230));
							setNextAnimationNoPriority(new Animation(12573));
						}
					}
				}
			}
		}
		int shieldId = equipment.getShieldId();
		if (shieldId == 13740 || shieldId == 23698 || shieldId == 13742 || shieldId == 23699 || shieldId == 13738
				|| shieldId == 23697) { // divine,
										// eylsian,
										// and
										// arcane
			int drain = (int) (Math.ceil(hit.getDamage() * 0.06));
			if (prayer.getPrayerpoints() >= drain) {
				hit.setDamage((int) (hit.getDamage() * 0.70));
				prayer.drainPrayer(drain);
			}
		}
		if (castedVeng && hit.getDamage() >= 4) {
			castedVeng = false;
			setNextForceTalk(new ForceTalk("Taste vengeance!"));
			WorldTasksManager.schedule(new WorldTask() {

				@Override
				public void run() {
					source.applyHit(new Hit(Player.this, (int) (hit.getDamage() * 0.75), HitLook.REGULAR_DAMAGE));
				}
			});
		}
		getControlerManager().processIngoingHit(hit);
		if (source instanceof Player) {
			((Player) source).getPrayer().handleHitPrayers(this, hit);
			((Player) source).getControlerManager().processIncommingHit(hit, this);
		}

	}

	@Override
	public void removeHitpoints(final Hit hit) {
		super.removeHitpoints(hit);
		if (isDead())
			return;
		if (getEquipment().getRingId() == 2550) {
			if (hit.getSource() != null && hit.getSource() != this && hit.getDamage() > 0
					&& (hit.getLook() == HitLook.MELEE_DAMAGE || hit.getLook() == HitLook.RANGE_DAMAGE
							|| hit.getLook() == HitLook.MAGIC_DAMAGE)) {
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						hit.getSource().applyHit(new Hit(Player.this, (int) (Math.ceil(hit.getDamage() * 0.01) * 10),
								HitLook.REGULAR_DAMAGE));
					}
				});
			}
		}
		if (getPrayer().hasPrayersOn()) {
			if (getPrayer().usingPrayer(0, 15) && (getHitpoints() < getMaxHitpoints() * 0.1)) {
				setNextGraphics(new Graphics(436));
				setHitpoints((int) (getHitpoints() + getSkills().getLevelForXp(Skills.PRAYER) * 2.5));
				getSkills().set(Skills.PRAYER, 0);
				getPrayer().setPrayerpoints(0);
			}
		}
		if (getEquipment().getAmuletId() == 11090 && getHitpoints() <= getMaxHitpoints() * 0.2) {// priority
			// over
			// ring
			// of
			// life
			heal((int) (getMaxHitpoints() * 0.3));
			getEquipment().deleteItem(11090, 1);
			getAppearence().generateAppearenceData();
			resetReceivedHits();
			getPackets().sendGameMessage("Your pheonix necklace heals you, but is destroyed in the process.");
		} else if (getEquipment().getAmuletId() != 11090 && getEquipment().getRingId() == 11090
				&& getHitpoints() <= getMaxHitpoints() * 0.1) {
			Magic.sendNormalTeleportSpell(this, 1, 0, DeathEvent.getRespawnHub(this));
			getEquipment().deleteItem(11090, 1);
			resetReceivedHits();
			getPackets().sendGameMessage("Your ring of life saves you, but is destroyed in the process.");
		}
	}

	@Override
	public void sendDeath(final Entity source) {
		if (getEffectsManager().hasActiveEffect(EffectType.IMMORTALITY)) {
			resetReceivedHits();
			setHitpoints((int) (getMaxHitpoints() * 0.40));
			setNextAnimation(new Animation(18119));
			setNextGraphics(new Graphics(3630));
			World.sendGraphics(this, new Graphics(3631, 0, 0, getDirection(), true), this);
			getEffectsManager().removeEffect(EffectType.IMMORTALITY);
			return;
		}
		if (prayer.hasPrayersOn() && getTemporaryAttributtes().get("startedDuel") != Boolean.TRUE) {
			if (prayer.usingPrayer(0, 14)) {
				setNextGraphics(new Graphics(437));
				final Player target = this;

				for (int regionId : getMapRegionsIds()) {
					List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
					if (playersIndexes != null) {
						for (int playerIndex : playersIndexes) {
							Player player = World.getPlayers().get(playerIndex);
							if (player == null || !player.hasStarted() || player.isDead() || player.hasFinished()
									|| !player.withinDistance(this, 1) || !player.isCanPvp()
									|| !target.getControlerManager().canHit(player))
								continue;
							player.applyHit(
									new Hit(target, Utils.random((int) (skills.getLevelForXp(Skills.PRAYER) * 2.5)),
											HitLook.REGULAR_DAMAGE));
						}
					}
					List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
					if (npcsIndexes != null) {
						for (int npcIndex : npcsIndexes) {
							NPC npc = World.getNPCs().get(npcIndex);
							if (npc == null || npc.isDead() || npc.hasFinished() || !npc.withinDistance(this, 1)
									|| !npc.getDefinitions().hasAttackOption()
									|| !target.getControlerManager().canHit(npc))
								continue;
							npc.applyHit(
									new Hit(target, Utils.random((int) (skills.getLevelForXp(Skills.PRAYER) * 25.00)),
											HitLook.REGULAR_DAMAGE));
						}
					}
				}

				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1, target.getY(), target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1, target.getY(), target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX(), target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1, target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() - 1, target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1, target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438),
								new WorldTile(target.getX() + 1, target.getY() + 1, target.getPlane()));
					}
				});
			} else if (prayer.usingPrayer(1, 23)) {
				World.sendProjectile(this, new WorldTile(getX() + 2, getY() + 2, getPlane()), 2261, 24, 0, 41, 35, 30,
						0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY(), getPlane()), 2261, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY() - 2, getPlane()), 2261, 41, 0, 41, 35, 30,
						0);

				World.sendProjectile(this, new WorldTile(getX() - 2, getY() + 2, getPlane()), 2261, 41, 0, 41, 35, 30,
						0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY(), getPlane()), 2261, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY() - 2, getPlane()), 2261, 41, 0, 41, 35, 30,
						0);

				World.sendProjectile(this, new WorldTile(getX(), getY() + 2, getPlane()), 2261, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX(), getY() - 2, getPlane()), 2261, 41, 0, 41, 35, 30, 0);
				final Player target = this;
				WorldTasksManager.schedule(new WorldTask() {

	@Override
					public void run() {
						setNextGraphics(new Graphics(2259));

						for (int regionId : getMapRegionsIds()) {
							List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
							if (playersIndexes != null) {
								for (int playerIndex : playersIndexes) {
									Player player = World.getPlayers().get(playerIndex);
									if (player == null || !player.hasStarted() || player.isDead()
											|| player.hasFinished() || !player.isCanPvp()
											|| !player.withinDistance(target, 2)
											|| !target.getControlerManager().canHit(player))
										continue;
									player.applyHit(new Hit(target,
											(int) Utils.random((skills.getLevelForXp(Skills.PRAYER) * 25.00)),
											HitLook.REGULAR_DAMAGE));
								}
							}
							List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
							if (npcsIndexes != null) {
								for (int npcIndex : npcsIndexes) {
									NPC npc = World.getNPCs().get(npcIndex);
									if (npc == null || npc.isDead() || npc.hasFinished()
											|| !npc.withinDistance(target, 2) || !npc.getDefinitions().hasAttackOption()
											|| !target.getControlerManager().canHit(npc))
										continue;
									npc.applyHit(new Hit(target,
											(int) Utils.random((skills.getLevelForXp(Skills.PRAYER) * 25.00)),
											HitLook.REGULAR_DAMAGE));
								}
							}
						}

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 2, getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 2, getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX(), getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX(), getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() + 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() + 1, getY() - 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() + 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260),
								new WorldTile(getX() - 1, getY() - 1, getPlane()));
					}
				});
			}
		}
		setNextAnimation(new Animation(-1));
		if (!controlerManager.sendDeath())
			return;
		lock(8);
		stopAll();
		if (familiar != null)
			familiar.sendDeath(this);
		final WorldTile deathTile = new WorldTile(this);
		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(getDeathAnimation());
				} else if (loop == 1) {
					getPackets().sendGameMessage("Oh dear, you have died.");
				} else if (loop == 3) {
					controlerManager.startControler("DeathEvent", deathTile, hasSkull());
				} else if (loop == 4) {
					getMusicsManager().playMusicEffect(MusicsManager.DEATH_MUSIC_EFFECT);
					stop();
				}
				loop++;
			}
		}, 0, 1);
	}

	public void sendItemsOnDeath(Player killer, boolean dropItems, boolean dropLostItems) {
		Integer[][] slots = GraveStone.getItemSlotsKeptOnDeath(this, true, dropItems, getPrayer().isProtectingItem());
		sendItemsOnDeath(killer, getLastWorldTile(), new WorldTile(this), true, slots, dropLostItems);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer, boolean dropItems) {
		sendItemsOnDeath(killer, dropItems, true);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer) {
		sendItemsOnDeath(killer, hasSkull());
	}

	public void sendItemsOnDeath(Player killer, WorldTile deathTile, WorldTile respawnTile, boolean wilderness,
			Integer[][] slots, boolean dropLostItems) {
		/*
		 * if ((((killer != null && killer.getRights() == 2) || getRights() ==
		 * 2) && Settings.HOSTED) || hasFinished()) return;
		 */
		if (Settings.HOSTED) {
			if (getRights() == 2 || hasFinished())
				return;
			if (killer != null) {
				if (killer.getRights() == 2)
					return;
			}
		}

		charges.die(slots[1], slots[3]); // degrades droped and lost items only
		auraManager.removeAura();
		Item[][] items = GraveStone.getItemsKeptOnDeath(this, slots);
		inventory.reset();
		equipment.reset();
		appearence.generateAppearenceData();
		for (Item item : items[0])
			inventory.addItemDrop(item.getId(), item.getAmount(), respawnTile);
		if (dropLostItems) {
			if (items[1].length != 0) {
				if (wilderness) {
					if (!isBeginningAccount())
						for (Item item : items[1])
							World.addGroundItem(item, deathTile, killer == null ? this : killer, true, 60,
									killer == null ? 1 : 0);
				} else
					new GraveStone(this, deathTile, items[1]);
			}

		}
		if (killer != null)
			Logger.globalLog(username, session.getIP(),
					new String(killer.getUsername() + " has killed " + username + " with the ip: "
							+ killer.getSession().getIP() + " items are as follows:"
							+ Arrays.toString(items[1]).replace("null,", "") + " ."));
	}

	public void increaseKillCount(Player killed) {
		killed.deathCount++;
		if (!canIncreaseKillCount(killed))
			return;
		killCount++;
	}

	public boolean canIncreaseKillCount(Player killed) {
		if (killed.isBeginningAccount() || killed.getLastGameMAC().equals(lastGameMAC)
				|| killed.getSession().getIP().equals(session.getIP())
				|| (lastPlayerKill != null && killed.getUsername().equals(lastPlayerKill))
				|| (lastPlayerMAC != null && killed.getLastGameMAC().equals(lastPlayerMAC)))
			return false;
		lastPlayerKill = killed.getUsername();
		lastPlayerMAC = killed.getLastGameMAC();
		return true;
	}

	@Override
	public int getSize() {
		return appearence.getSize();
	}

	public boolean isCanPvp() {
		return canPvp;
	}

	public void setCanPvp(boolean canPvp) {
		if (this.canPvp == canPvp)
			return;
		this.canPvp = canPvp;
		appearence.generateAppearenceData();
		getPackets().sendPlayerOption(canPvp ? "Attack" : "null", 1, true);
		getPackets().sendPlayerUnderNPCPriority(canPvp);
		if (canPvp)
			getPackets().sendGameMessage("You cannot display cosmetic gear in PvP areas.", true);
		if (getControlerManager().getControler() instanceof Wilderness && familiar == null)
			skills.sendCombatLevel();
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public boolean isLocked() {
		return lockDelay > WorldThread.WORLD_CYCLE;// Utils.currentTimeMillis();
	}

	public void lock() {
		lockDelay = Long.MAX_VALUE;
	}

	public void lock(long time) {
		lockDelay = time == -1 ? Long.MAX_VALUE
				: WorldThread.WORLD_CYCLE + time;/*
													 * Utils . currentTimeMillis
													 * ( ) + ( time * 600 )
													 */
		;
	}

	public void unlock() {
		lockDelay = 0;
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay) {
		useStairs(emoteId, dest, useDelay, totalDelay, null);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message) {
		useStairs(emoteId, dest, useDelay, totalDelay, message, false);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message,
			final boolean resetAnimation) {
		stopAll();
		lock(totalDelay);
		if (emoteId != -1)
			setNextAnimation(new Animation(emoteId));
		if (useDelay == 0)
			setNextWorldTile(dest);
		else {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (isDead())
						return;
					if (resetAnimation)
						setNextAnimation(new Animation(-1));
					setNextWorldTile(dest);
					if (message != null)
						getPackets().sendGameMessage(message);
				}
			}, useDelay - 1);
		}
	}

	public Bank getBank() {
		return bank;
	}

	public ControlerManager getControlerManager() {
		return controlerManager;
	}

	public void switchMouseButtons() {
		mouseButtons = !mouseButtons;
		refreshMouseButtons();
	}

	public void switchAllowChatEffects() {
		allowChatEffects = !allowChatEffects;
		refreshAllowChatEffects();
	}

	public void switchAcceptAid() {
		acceptAid = !acceptAid;
		refreshAcceptAid();
	}

	public void switchProfanityFilter() {
		profanityFilter = !profanityFilter;
		refreshProfanityFilter();
	}

	public void switchRightClickReporting() {
		rightClickReporting = !rightClickReporting;
		getPackets().sendPlayerOption(rightClickReporting ? "Report" : "null", 6, false);
		refreshRightClickReporting();
	}

	public void refreshAllowChatEffects() {
		getVarsManager().sendVar(456, allowChatEffects ? 0 : 1);
	}

	public void refreshAcceptAid() {
		getVarsManager().sendVar(459, acceptAid ? 1 : 0);
	}

	public void refreshRightClickReporting() {
		getVarsManager().sendVarBit(16564, rightClickReporting ? 1 : 0);
	}

	public void refreshProfanityFilter() {
		getPackets().sendCSVarInteger(2834, profanityFilter ? 1 : 0);
	}

	public void refreshMouseButtons() {
		getVarsManager().sendVar(455, mouseButtons ? 0 : 1);
	}

	private void refreshPrivateChatSetup() {
		getVarsManager().sendVarBit(7423, privateChatSetup);
	}

	private void refreshFriendChatSetup() {
		getVarsManager().sendVarBit(1190, friendChatSetup);
	}

	private void refreshClanChatSetup() {
		getVarsManager().sendVarBit(1188, clanChatSetup);
	}

	private void refreshGuestChatSetup() {
		getVarsManager().sendVarBit(1191, guestChatSetup);
	}

	public void refreshPublicChatSetup() {
		getVarsManager().sendVarBit(30165, publicChatSetup);
		System.out.println(publicChatSetup);
	}

	public void refreshGroupChatSetup() {
		getVarsManager().sendVarBit(24560, groupChatSetup);
	}

	public void refreshGroupTeamChatSetup() {
		getVarsManager().sendVarBit(24561, groupTeamChatSetup);
	}

	private void refreshChatsSetup() {
		refreshFriendChatSetup();
		refreshClanChatSetup();
		refreshGuestChatSetup();
		refreshPrivateChatSetup();
		refreshPublicChatSetup();
		refreshGroupChatSetup();
		refreshGroupTeamChatSetup();
	}

	public void setPrivateChatSetup(int privateChatSetup) {
		this.privateChatSetup = privateChatSetup;
		refreshPrivateChatSetup();
	}

	public void setChatSetup(int chatSetup) {
		int value = getVarsManager().getValue(4738);
		System.out.println("Value; " + value);
		if (value == 0)
			setFriendChatSetup(chatSetup);
		else if (value == 1)
			setPrivateChatSetup(chatSetup);
		else if (value == 2)
			setClanChatSetup(chatSetup);
		else if (value == 3)
			setGuestChatSetup(chatSetup);
		else if (value == 4)
			setGroupChatSetup(chatSetup);
		else if (value == 5)
			setGroupTeamChatSetup(chatSetup);
		else if (value == 7)
			setPublicChatSetup(chatSetup);
	}

	public void setPublicChatSetup(int publicChatSetup) {
		this.publicChatSetup = publicChatSetup;
		System.out.println("public");
		refreshPublicChatSetup();
	}

	public void setGroupChatSetup(int groupChatSetup) {
		this.groupChatSetup = groupChatSetup;
		refreshGroupChatSetup();
	}

	public void setGroupTeamChatSetup(int groupTeamChatSetup) {
		this.groupTeamChatSetup = groupTeamChatSetup;
		refreshGroupTeamChatSetup();
	}

	public void setClanChatSetup(int clanChatSetup) {
		this.clanChatSetup = clanChatSetup;
		refreshClanChatSetup();
	}

	public void setGuestChatSetup(int guestChatSetup) {
		this.guestChatSetup = guestChatSetup;
		refreshGuestChatSetup();
	}

	public void setFriendChatSetup(int friendChatSetup) {
		this.friendChatSetup = friendChatSetup;
		refreshFriendChatSetup();
	}

	public int getPrivateChatSetup() {
		return privateChatSetup;
	}

	public boolean isForceNextMapLoadRefresh() {
		return forceNextMapLoadRefresh;
	}

	public void setForceNextMapLoadRefresh(boolean forceNextMapLoadRefresh) {
		this.forceNextMapLoadRefresh = forceNextMapLoadRefresh;
	}

	public FriendsIgnores getFriendsIgnores() {
		return friendsIgnores;
	}

	public void addPotDelay(long time) {
		potDelay = time + Utils.currentTimeMillis();
	}

	public long getPotDelay() {
		return potDelay;
	}

	public void addFoodDelay(long time) {
		foodDelay = time + Utils.currentTimeMillis();
	}

	public long getFoodDelay() {
		return foodDelay;
	}

	public void setAntipoisonDelay(int cycles) {
		getEffectsManager().startEffect(new Effect(EffectType.ANTIPOISON, cycles));
	}

	public MusicsManager getMusicsManager() {
		return musicsManager;
	}

	public HintIconsManager getHintIconsManager() {
		return hintIconsManager;
	}

	public boolean isCastVeng() {
		return castedVeng;
	}

	public void setCastVeng(boolean castVeng) {
		this.castedVeng = castVeng;
	}

	public int getKillCount() {
		return killCount;
	}

	public int getBarrowsKillCount() {
		return barrowsKillCount;
	}

	public int setBarrowsKillCount(int barrowsKillCount) {
		return this.barrowsKillCount = barrowsKillCount;
	}

	public int setKillCount(int killCount) {
		return this.killCount = killCount;
	}

	public int getDeathCount() {
		return deathCount;
	}

	public int setDeathCount(int deathCount) {
		return this.deathCount = deathCount;
	}

	public void setCloseInterfacesEvent(Runnable closeInterfacesEvent) {
		this.closeInterfacesEvent = closeInterfacesEvent;
	}

	public boolean isMuted() {
		return muted;
	}

	public void setMuted(boolean muted) {
		this.muted = muted;
	}

	public ChargesManager getCharges() {
		return charges;
	}

	public boolean[] getKilledBarrowBrothers() {
		return killedBarrowBrothers;
	}

	public void setHiddenBrother(int hiddenBrother) {
		this.hiddenBrother = hiddenBrother;
	}

	public int getHiddenBrother() {
		return hiddenBrother;
	}

	public void resetBarrows() {
		hiddenBrother = -1;
		killedBarrowBrothers = new boolean[7]; // includes new bro for future
		// use
		barrowsKillCount = 0;
	}

	public void refreshLastVote() {
		lastVote = Utils.currentTimeMillis();
	}

	public boolean hasVotedInLast12Hours() {
		return !Settings.HOSTED || (Utils.currentTimeMillis() - lastVote) < (1000 * 60 * 60 * 12);
	}

	public boolean isDonator() {
		return isExtremeDonator() || donator;
	}

	public void setDonator(boolean value) {
		this.donator = value;
	}

	public boolean isExtremeDonator() {
		return rights == 2 || extremeDonator;
	}

	public void setExtremeDonator(boolean value) {
		this.extremeDonator = value;
	}

	public boolean isGraphicDesigner() {
		return isGraphicDesigner;
	}

	public void setGraphicDesigner(boolean value) {
		this.isGraphicDesigner = value;
	}

	public boolean isSupporter() {
		return isSupporter;
	}

	public void setSupporter(boolean isSupporter) {
		this.isSupporter = isSupporter;
	}

	public int[] getPouches() {
		return pouches;
	}

	public EmotesManager getEmotesManager() {
		return emotesManager;
	}

	public String getLastGameIp() {
		return lastGameIp;
	}

	public String getLastGameMAC() {
		return lastGameMAC;
	}

	public long getLastGameLogin() {
		return lastGameLogin;
	}

	public PriceCheckManager getPriceCheckManager() {
		return priceCheckManager;
	}

	public void setCommendation(int pestPoints) {
		if (pestPoints >= 1000) {
			this.pestPoints = 1000;
			getPackets().sendGameMessage(
					"You have reached the maximum amount of commendation points, you may only have 1000 at a time.");
			return;
		}
		this.pestPoints = pestPoints;
	}

	public int getCommendation() {
		return pestPoints;
	}

	public void increaseStealingCreationPoints(int scPoints) {
		stealingCreationPoints += scPoints;
	}

	public int getStealingCreationPoints() {
		return stealingCreationPoints;
	}

	public long getLastPublicMessage() {
		return lastPublicMessage;
	}

	public void setLastPublicMessage(long lastPublicMessage) {
		this.lastPublicMessage = lastPublicMessage;
	}

	public CutscenesManager getCutscenesManager() {
		return cutscenesManager;
	}

	public void kickPlayerFromClanChannel(String name) {
		if (clanManager == null)
			return;
		clanManager.kickPlayerFromChat(this, name);
	}

	public void sendClanChannelMessage(ChatMessage message) {
		if (clanManager == null)
			return;
		clanManager.sendMessage(this, message);
	}

	public void sendGuestClanChannelMessage(ChatMessage message) {
		if (guestClanManager == null)
			return;
		guestClanManager.sendMessage(this, message);
	}

	public void sendClanChannelQuickMessage(QuickChatMessage message) {
		if (clanManager == null)
			return;
		clanManager.sendQuickMessage(this, message);
	}

	public void sendGuestClanChannelQuickMessage(QuickChatMessage message) {
		if (guestClanManager == null)
			return;
		guestClanManager.sendQuickMessage(this, message);
	}

	public void sendPublicChatMessage(PublicChatMessage message) {

		for (int i = 0; i < getLocalPlayerUpdate().getLocalPlayersIndexesCount(); i++) {
			Player player = getLocalPlayerUpdate()
					.getLocalPlayers()[getLocalPlayerUpdate().getLocalPlayersIndexes()[i]];
			if (player == null || !player.isRunning() || player.hasFinished()) // shouldnt
				continue;
			player.getPackets().sendPublicMessage(this, message);
		}
	}

	public int[] getCompletionistCapeCustomized() {
		return completionistCapeCustomized;
	}

	public void setCompletionistCapeCustomized(int[] skillcapeCustomized) {
		this.completionistCapeCustomized = skillcapeCustomized;
	}

	public int[] getMaxedCapeCustomized() {
		return maxedCapeCustomized;
	}

	public void setMaxedCapeCustomized(int[] maxedCapeCustomized) {
		this.maxedCapeCustomized = maxedCapeCustomized;
	}

	public void setSkullId(int skullId) {
		this.skullId = skullId;
	}

	public int getSkullId() {
		return skullId;
	}

	public void addLogicPacketToQueue(LogicPacket packet) {
		for (LogicPacket p : logicPackets) {
			if (p.getId() == packet.getId()) {
				logicPackets.remove(p);
				break;
			}
		}
		logicPackets.add(packet);
	}

	public DominionTower getDominionTower() {
		return dominionTower;
	}

	public void refreshMeleeAttackRating() {
		if (getVarsManager().sendVar(1029, getMeleeAttackRating()))
			updateBuffs();
	}

	public int getMeleeAttackRating() {
		int percentage = 0;
		if (getEffectsManager().hasActiveEffect(EffectType.DRAGON_BATTLEAXE))
			percentage -= 20;
		return percentage;
	}

	public void refreshMeleeStrengthRating() {
		if (getVarsManager().sendVar(1030, getMeleeStrengthRating()))
			updateBuffs();
	}

	public int getMeleeStrengthRating() {
		int percentage = 0;
		if (getEffectsManager().hasActiveEffect(EffectType.DRAGON_BATTLEAXE))
			percentage += 20;
		return percentage;
	}

	public int getDefenceRating() {
		int percentage = 0;
		if (getEffectsManager().hasActiveEffect(EffectType.DRAGON_BATTLEAXE))
			percentage -= 10;
		return percentage;
	}

	public void refreshDefenceRating() {
		if (getVarsManager().sendVar(1035, getDefenceRating()))
			updateBuffs();
	}

	public Trade getTrade() {
		return trade;
	}

	public void setDFSDelay(long teleDelay) {
		getTemporaryAttributtes().put("dfs_delay", teleDelay + Utils.currentTimeMillis());
		getTemporaryAttributtes().remove("dfs_shield_active");
	}

	public long getDFSDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("dfs_delay");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	public FriendsChat getCurrentFriendsChat() {
		return currentFriendsChat;
	}

	public void setCurrentFriendsChat(FriendsChat chat) {
		this.currentFriendsChat = chat;
	}

	public int getLastFriendsChatRank() {
		return lastFriendsChatRank;
	}

	public void setLastFriendsChatRank(int rank) {
		lastFriendsChatRank = rank;
	}

	public String getLastFriendsChat() {
		return lastFriendsChat;
	}

	public void setLastFriendsChat(String chat) {
		this.lastFriendsChat = chat;
	}

	public int getSummoningLeftClickOption() {
		return summoningLeftClickOption;
	}

	public void setSummoningLeftClickOption(int summoningLeftClickOption) {
		this.summoningLeftClickOption = summoningLeftClickOption;
	}

	public boolean containsOneItem(int... itemIds) {
		if (getInventory().containsOneItem(itemIds))
			return true;
		if (getEquipment().containsOneItem(itemIds))
			return true;
		Familiar familiar = getFamiliar();
		if (familiar != null
				&& ((familiar.getBob() != null && familiar.getBob().containsOneItem(itemIds) || familiar.isFinished())))
			return true;
		return false;
	}

	public boolean canSpawn() {
		if (getControlerManager().getControler() instanceof BossInstanceController
				|| getControlerManager().getControler() instanceof PestControlLobby
				|| getControlerManager().getControler() instanceof PestControlGame
				|| getControlerManager().getControler() instanceof ZGDControler
				|| getControlerManager().getControler() instanceof GodWars
				|| getControlerManager().getControler() instanceof DTControler
				|| getControlerManager().getControler() instanceof CastleWarsPlaying
				|| getControlerManager().getControler() instanceof CastleWarsWaiting
				|| getControlerManager().getControler() instanceof FightCaves
				|| getControlerManager().getControler() instanceof FightKiln
				|| getControlerManager().getControler() instanceof NomadsRequiem
				|| getControlerManager().getControler() instanceof QueenBlackDragonController
				|| getControlerManager().getControler() instanceof WarControler
				|| getControlerManager().getControler() instanceof StealingCreationLobbyController
				|| getControlerManager().getControler() instanceof StealingCreationController) {
			return false;
		}
		return !isCanPvp() && !dungManager.isInside();
	}

	public List<Integer> getSwitchItemCache() {
		return switchItemCache;
	}

	public AuraManager getAuraManager() {
		return auraManager;
	}

	public List<String> getOwnedObjectManagerKeys() {
		if (ownedObjectsManagerKeys == null) // temporary
			ownedObjectsManagerKeys = new LinkedList<String>();
		return ownedObjectsManagerKeys;
	}

	public boolean hasInstantSpecial(Item weapon) {
		return weapon.getName().contains("Noxious") || weapon.getDefinitions().getCSOpcode(4331) == 1;
	}

	public void performInstantSpecial(final Item weapon) {
		int specAmt = weapon.getDefinitions().getSpecialAmmount();
		if (combatDefinitions.hasRingOfVigour())
			specAmt *= 0.9;
		if (combatDefinitions.getSpecialAttackPercentage() < specAmt) {
			getPackets().sendGameMessage("You don't have enough power left.");
			combatDefinitions.desecreaseSpecialAttack(0);
			return;
		}
		if (getSwitchItemCache().size() > 0) {
			ButtonHandler.submitSpecialRequest(this);
			return;
		}
		if (!isUnderCombat()) // cuz of sheating
			PlayerCombat.addAttackingDelay(this);
		switch (weapon.getName()) {
		case "Noxious scythe":
		case "Noxious staff":
		case "Noxious longbow":
		case "Granite maul":
			if (!(getActionManager().getAction() instanceof PlayerCombat)) {
				getPackets().sendGameMessage("You need a target to use this ability.");
				return;
			}
			PlayerCombat combat = (PlayerCombat) getActionManager().getAction();
			Entity target = combat.getTarget();
			if (target == null || target.isDead()) {
				getPackets().sendGameMessage("You need a target to use this ability.");
				return;
			}
			combat.handleSpecialAttack(this);
			return;
		case "Dragon battleaxe":
			setNextAnimation(new Animation(1056));
			setNextGraphics(new Graphics(246));
			setNextForceTalk(new ForceTalk("Raarrrrrgggggghhhhhhh!"));
			getEffectsManager().startEffect(new Effect(EffectType.DRAGON_BATTLEAXE, 100));
			break;
		case "Staff of light":
			setNextAnimation(new Animation(12804));
			setNextGraphics(new Graphics(2319));// 2320
			setNextGraphics(new Graphics(2321));
			getEffectsManager().startEffect(new Effect(EffectType.STAFF_OF_LIGHT, 100));
			break;
		}
		combatDefinitions.desecreaseSpecialAttack(specAmt);
	}

	public void setDisableEquip(boolean equip) {
		disableEquip = equip;
	}

	public boolean isEquipDisabled() {
		return disableEquip;
	}

	public int getPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(int publicStatus) {
		this.publicStatus = publicStatus;
		getPackets().sendGameBarStages();
	}

	public int getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(int gameStatus) {
		this.gameStatus = gameStatus;
		getPackets().sendGameBarStages();
	}

	public int getClanStatus() {
		return clanStatus;
	}

	public void setClanStatus(int clanStatus) {
		this.clanStatus = clanStatus;
		getPackets().sendGameBarStages();
	}

	public int getPersonalStatus() {
		return personalStatus;
	}

	public void setPersonalStatus(int personalStatus) {
		if (legacyCombatMode)
			friendsIgnores.setPmStatus(personalStatus, true);
		this.personalStatus = personalStatus;
		getPackets().sendGameBarStages();
	}

	public int getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
		getPackets().sendGameBarStages();
	}

	public int getAssistStatus() {
		return assistStatus;
	}

	public void setAssistStatus(int assistStatus) {
		if (assistStatus != this.assistStatus) {
			this.assistStatus = assistStatus;
			sendAssistOption();
		}
		getPackets().sendGameBarStages();
	}

	public int getFriendsChatStatus() {
		return friendsChatStatus;
	}

	public void setFriendsChatStatus(int friendsChatStatus) {
		this.friendsChatStatus = friendsChatStatus;
		getPackets().sendGameBarStages();
	}

	public Notes getNotes() {
		return notes;
	}

	public IsaacKeyPair getIsaacKeyPair() {
		return isaacKeyPair;
	}

	public QuestManager getQuestManager() {
		return questManager;
	}

	public boolean isCompletedFightCaves() {
		return completedFightCaves;
	}

	public void setCompletedFightCaves() {
		if (!completedFightCaves) {
			completedFightCaves = true;
			refreshFightKilnEntrance();
		}
	}

	public boolean isCompletedFightKiln() {
		return completedFightKiln;
	}

	public void setCompletedFightKiln() {
		completedFightKiln = true;
	}

	public boolean isCompletedStealingCreation() {
		return completedStealingCreation;
	}

	public void setCompletedStealingCreation() {
		completedStealingCreation = true;
	}

	public boolean isWonFightPits() {
		return wonFightPits;
	}

	public void setWonFightPits() {
		wonFightPits = true;
	}

	public boolean isCantTrade() {
		return cantTrade;
	}

	public void setCantTrade(boolean canTrade) {
		this.cantTrade = canTrade;
	}

	public String getYellColor() {
		return yellColor;
	}

	public void setYellColor(String yellColor) {
		this.yellColor = yellColor;
	}

	/**
	 * Gets the pet.
	 * 
	 * @return The pet.
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Sets the pet.
	 * 
	 * @param pet
	 *            The pet to set.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	/**
	 * Gets the petManager.
	 * 
	 * @return The petManager.
	 */
	public PetManager getPetManager() {
		return petManager;
	}

	/**
	 * Sets the petManager.
	 * 
	 * @param petManager
	 *            The petManager to set.
	 */
	public void setPetManager(PetManager petManager) {
		this.petManager = petManager;
	}

	public boolean isXpLocked() {
		return xpLocked;
	}

	public void setXpLocked(boolean locked) {
		this.xpLocked = locked;
	}

	public boolean isYellOff() {
		return yellOff;
	}

	public void setYellOff(boolean yellOff) {
		this.yellOff = yellOff;
	}

	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;
	}

	public double getHpBoostMultiplier() {
		return hpBoostMultiplier;
	}

	public void setHpBoostMultiplier(double hpBoostMultiplier) {
		this.hpBoostMultiplier = hpBoostMultiplier;
	}

	/**
	 * Gets the killedQueenBlackDragon.
	 * 
	 * @return The killedQueenBlackDragon.
	 */
	public boolean isKilledQueenBlackDragon() {
		return killedQueenBlackDragon;
	}

	/**
	 * Sets the killedQueenBlackDragon.
	 * 
	 * @param killedQueenBlackDragon
	 *            The killedQueenBlackDragon to set.
	 */
	public void setKilledQueenBlackDragon(boolean killedQueenBlackDragon) {
		this.killedQueenBlackDragon = killedQueenBlackDragon;
	}

	public boolean hasLargeSceneView() {
		return largeSceneView;
	}

	public void setLargeSceneView(boolean largeSceneView) {
		this.largeSceneView = largeSceneView;
	}

	public boolean isOldItemsLook() {
		return oldItemsLook;
	}

	public void switchItemsLook() {
		oldItemsLook = !oldItemsLook;
		getPackets().sendItemsLook();
	}

	/**
	 * @return the runeSpanPoint
	 */
	public int getRuneSpanPoints() {
		return runeSpanPoints;
	}

	/**
	 * @param runeSpanPoints
	 *            the runeSpanPoint to set
	 */
	public void setRuneSpanPoint(int runeSpanPoints) {
		this.runeSpanPoints = runeSpanPoints;
	}

	/**
	 * Adds points
	 * 
	 * @param points
	 */
	public void addRunespanPoints(int points) {
		this.runeSpanPoints += points;
	}

	public DuelRules getDuelRules() {
		return duelRules;
	}

	public void setLastDuelRules(DuelRules duelRules) {
		this.duelRules = duelRules;
	}

	public boolean isTalkedWithMarv() {
		return talkedWithMarv;
	}

	public void setTalkedWithMarv() {
		talkedWithMarv = true;
	}

	public int getCrucibleHighScore() {
		return crucibleHighScore;
	}

	public void increaseCrucibleHighScore() {
		crucibleHighScore++;
	}

	public House getHouse() {
		return house;
	}

	public boolean isAcceptingAid() {
		return acceptAid;
	}

	public boolean isFilteringProfanity() {
		return profanityFilter;
	}

	public MoneyPouch getMoneyPouch() {
		return moneyPouch;
	}

	public int getCannonBalls() {
		return cannonBalls;
	}

	public void addCannonBalls(int cannonBalls) {
		this.cannonBalls += cannonBalls;
	}

	public void removeCannonBalls() {
		this.cannonBalls = 0;
	}

	public FarmingManager getFarmingManager() {
		return farmingManager;
	}

	public Toolbelt getToolbelt() {
		return toolbelt;
	}

	public VarsManager getVarsManager() {
		return varsManager;
	}

	public int getFinishedCastleWars() {
		return finishedCastleWars;
	}

	public int getFinishedStealingCreations() {
		return finishedStealingCreations;
	}

	public boolean isCapturedCastleWarsFlag() {
		return capturedCastleWarsFlag;
	}

	public void setCapturedCastleWarsFlag() {
		capturedCastleWarsFlag = true;
	}

	public void increaseFinishedCastleWars() {
		finishedCastleWars++;
	}

	public void increaseFinishedStealingCreations() {
		finishedStealingCreations++;
	}

	public boolean isLootShareEnabled() {
		return lootShare;
	}

	public void enableLootShare() {
		if (!isLootShareEnabled()) {
			getPackets().sendGameMessage("LootShare is now active.");
			lootShare = true;
		}
		refreshLootShare();
	}

	public void disableLootShare() {
		lootShare = false;
		refreshLootShare();
	}

	public void refreshLootShare() {
		// need to force cuz autoactivates when u click on it even if no chat
		varsManager.forceSendVarBit(3306, lootShare ? 1 : 0);
	}

	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || refreshClanIcon;
	}

	public boolean isRefreshClanIcon() {
		return refreshClanIcon;
	}

	public void setRefreshClanIcon(boolean refreshClanIcon) {
		this.refreshClanIcon = refreshClanIcon;
	}

	public ClansManager getClanManager() {
		return clanManager;
	}

	public void setClanManager(ClansManager clanManager) {
		this.clanManager = clanManager;
	}

	public ClansManager getGuestClanManager() {
		return guestClanManager;
	}

	public void setGuestClanManager(ClansManager guestClanManager) {
		this.guestClanManager = guestClanManager;
	}

	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	public boolean isConnectedClanChannel() {
		return connectedClanChannel || lobby;
	}

	public void setConnectedClanChannel(boolean connectedClanChannel) {
		this.connectedClanChannel = connectedClanChannel;
	}

	public void setVerboseShopDisplayMode(boolean verboseShopDisplayMode) {
		this.verboseShopDisplayMode = verboseShopDisplayMode;
		refreshVerboseShopDisplayMode();
	}

	public void refreshVerboseShopDisplayMode() {
		varsManager.sendVarBit(987, verboseShopDisplayMode ? 0 : 1);
	}

	public int getGraveStone() {
		return graveStone;
	}

	public void setGraveStone(int graveStone) {
		this.graveStone = graveStone;
	}

	public GrandExchangeManager getGeManager() {
		return geManager;
	}

	public SlayerManager getSlayerManager() {
		return slayerManager;
	}

	public int getVotePoints() {
		return votePoints;
	}


	public boolean[] getShosRewards() {
		return shosRewards;
	}

	public boolean isKilledLostCityTree() {
		return killedLostCityTree;
	}

	public void setKilledLostCityTree(boolean killedLostCityTree) {
		this.killedLostCityTree = killedLostCityTree;
	}

	public double[] getWarriorPoints() {
		return warriorPoints;
	}

	public void setWarriorPoints(int index, double pointsDifference) {
		warriorPoints[index] += pointsDifference;
		if (warriorPoints[index] < 0) {
			Controller controler = getControlerManager().getControler();
			if (controler == null || !(controler instanceof WarriorsGuild))
				return;
			WarriorsGuild guild = (WarriorsGuild) controler;
			guild.inCyclopse = false;
			setNextWorldTile(WarriorsGuild.CYCLOPS_LOBBY);
			warriorPoints[index] = 0;
		} else if (warriorPoints[index] > 65535)
			warriorPoints[index] = 65535;
		refreshWarriorPoints(index);
	}

	public void refreshWarriorPoints(int index) {
		varsManager.sendVarBitOld(index + 8662, (int) warriorPoints[index]);
	}

	private void warriorCheck() {
		if (warriorPoints == null || warriorPoints.length != 6)
			warriorPoints = new double[6];
	}

	public int getFavorPoints() {
		return favorPoints;
	}

	public void setFavorPoints(int points) {
		if (points + favorPoints >= 2000) {
			points = 2000;
			getPackets().sendGameMessage(
					"The offering stone is full! The jadinkos won't deposite any more rewards until you have taken some.");
		}
		this.favorPoints = points;
		refreshFavorPoints();
	}

	public void refreshFavorPoints() {
		varsManager.sendVarBitOld(9511, favorPoints);
	}

	public boolean containsItem(int id) {
		return getInventory().containsItemToolBelt(id) || getEquipment().getItems().containsOne(new Item(id))
				|| getBank().containsItem(id);
	}

	public void increaseRedStoneCount() {
		redStoneCount++;
	}

	public void resetRedStoneCount() {
		redStoneCount = 0;
	}

	public int getRedStoneCount() {
		return redStoneCount;
	}

	public void setStoneDelay(long delay) {
		redStoneDelay = Utils.currentTimeMillis() + delay;
	}

	public long getRedStoneDelay() {
		return redStoneDelay;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int amount) {
		this.loginCount = amount;
	}

	public void increaseLoginCount() {
		loginCount++;
	}

	public boolean isLobby() {
		return lobby;
	}

	public CoalTrucksManager getCoalTrucksManager() {
		return coalTrucksManager;
	}

	public DungManager getDungManager() {
		return dungManager;
	}

	public boolean[] getPrayerBook() {
		return prayerBook;
	}

	public void setPouchFilter(boolean pouchFilter) {
		this.pouchFilter = pouchFilter;
	}

	public boolean isPouchFilter() {
		return pouchFilter;
	}

	public boolean isCantWalk() {
		return cantWalk;
	}

	public void setCantWalk(boolean cantWalk) {
		this.cantWalk = cantWalk;
	}

	public int getXpRateMode() {
		return xpRateMode;
	}

	public void setXpRateMode(int xpRateMode) {
		this.xpRateMode = xpRateMode;
	}

	@Override
	public boolean canMove(int dir) {
		return getControlerManager().canMove(dir);
	}

	public boolean isKilledWildyWyrm() {
		return killedWildyWyrm;
	}

	public void setKilledWildyWyrm() {
		killedWildyWyrm = true;
	}

	public int getReceivedCompletionistCape() {
		return receivedCompletionistCape;
	}

	public void setReceivedCompletionistCape(int i) {
		receivedCompletionistCape = i;
	}

	public int getEcoClearStage() {
		return ecoClearStage;
	}

	public void setEcoClearStage(int ecoClearStage) {
		this.ecoClearStage = ecoClearStage;
	}

	@Override
	public int[] getBonuses() {
		return combatDefinitions.getBonuses();
	}

	public long getLastArtefactTime() {
		return lastArtefactTime;
	}

	public void setLastArtefactTime(long lastArtefactTime) {
		this.lastArtefactTime = lastArtefactTime;
	}

	public int getVoteCount() {
		return votes;
	}

	public void setVoteCount(int votes) {
		this.votes = votes;
	}

	public long getSessionTime() {
		return Utils.currentTimeMillis() - lastGameLogin;
	}

	public long getTotalOnlineTime() {
		return onlineTime + getSessionTime();
	}

	public void setTotalOnlineTime(long onlineTime) {
		this.onlineTime = onlineTime;
	}

	public boolean isMasterLogin() {
		return masterLogin;
	}

	public boolean isBeginningAccount() {
		return !Settings.DEBUG && !Settings.SPAWN_WORLD && getTotalOnlineTime() < 3600000;
	}

	// updated to rs3
	@Override
	public int getHealRestoreRate() {
		if (isResting())
			return 1;
		int c = super.getHealRestoreRate();
		if (getPrayer().usingPrayer(0, 18) || resting == -1)
			c /= 5;
		else if (getPrayer().usingPrayer(0, 8))
			c /= 2;
		if (getEquipment().getGlovesId() == 11133)
			c /= 3;
		return c;
	}

	public long getLastStarSprite() {
		return lastStarSprite;
	}

	public void setLastStarSprite(long lastStarSprite) {
		this.lastStarSprite = lastStarSprite;
	}

	public boolean isFoundShootingStar() {
		return foundShootingStar;
	}

	public void setFoundShootingStar() {
		this.foundShootingStar = true;
	}

	public long getLastBork() {
		return lastBork;
	}

	public void setLastBork(long lastBork) {
		this.lastBork = lastBork;
	}

	public boolean hasEmailRestrictions() {
		return email == null;
	}

	public Map<Integer, Integer> getILayoutVars() {
		return iLayoutVars;
	}

	public void resetILayoutVars() {
		iLayoutVars = new HashMap<Integer, Integer>(ILayoutDefaults.varsMap);
	}

	public boolean isLockInterfaceCustomization() {
		return lockInterfaceCustomization;
	}

	public void switchLockInterfaceCustomization() {
		lockInterfaceCustomization = !lockInterfaceCustomization;
		refreshLockInterfaceCustomization();
	}

	public boolean isHideInterfaceTitles() {
		return hideTitleBarsWhenLocked;
	}

	public void setHideInterfaceTitles(boolean hideInterfaceTitles) {
		this.hideTitleBarsWhenLocked = hideInterfaceTitles;
	}

	public int getMovementType() {
		return (getNextRunDirection() != -1 || (getRun() && getWalkSteps().size() > 1) ? RUN_MOVE_TYPE : WALK_MOVE_TYPE)
				+ 1;
	}

	public boolean isInLegacyCombatMode() {
		return legacyCombatMode;
	}

	public boolean isInLegacyInterfaceMode() {
		return legacyInterfaceMode;
	}

	private void refreshGoldTrim() {
		varsManager.sendVarBit(19009, goldTrim ? 1 : 0);
	}

	public void switchGoldTrim() {
		goldTrim = !goldTrim;
		refreshGoldTrim();
	}

	private void refreshVirtualLeveling() {
		varsManager.sendVarBit(19007, virtualLeveling ? 1 : 0);
	}

	public void switchVirtualLeveling() {
		virtualLeveling = !virtualLeveling;
		refreshVirtualLeveling();
	}

	public void switchLegacyInterfaceMode() {
		stopAll();
		legacyInterfaceMode = !legacyInterfaceMode;
		refreshInterfaceVars();
		getInterfaceManager().sendLegacyMinimapInterfaces();
		varsManager.sendVarBit(19928, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(19925, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(19924, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(22875, legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(27169, legacyInterfaceMode ? 1 : 0);
		getInterfaceManager().sendMagicAbilities();
		getInterfaceManager().sendMeleeAbilities();
		getInterfaceManager().sendDefenceAbilities();
	}

	public void switchLegacyCombatMode() {
		stopAll();
		legacyCombatMode = !legacyCombatMode;
		varsManager.sendVarBit(19928, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(19925, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(19924, (legacyCombatMode && legacyInterfaceMode) || legacyInterfaceMode ? 1 : 0);
		varsManager.sendVarBit(27168, legacyCombatMode ? 1 : 0);
		getCombatDefinitions().setDefaultAbilityMenu();
		getCombatDefinitions().setCombatMode(
				legacyCombatMode ? CombatDefinitions.LEGACY_COMBAT_MODE : CombatDefinitions.MANUAL_COMBAT_MODE);
		getCombatDefinitions().refreshShowCombatModeIcon();
		getCombatDefinitions().refreshAllowAbilityQueueing();
		getInterfaceManager().sendMagicAbilities();
		getInterfaceManager().sendDefenceAbilities();
		getInterfaceManager().sendLockGameTab(8, legacyCombatMode ? true : false);
		getInterfaceManager().sendLegacyMinimapInterfaces();
	}

	public void switchLegacyModeOld() {
		stopAll();
		legacyCombatMode = !legacyCombatMode;
		refreshInterfaceVars();
		getCombatDefinitions().setDefaultAbilityMenu();
		getCombatDefinitions().setCombatMode(
				legacyCombatMode ? CombatDefinitions.LEGACY_COMBAT_MODE : CombatDefinitions.MANUAL_COMBAT_MODE);
		getCombatDefinitions().refreshShowCombatModeIcon();
		getCombatDefinitions().refreshAllowAbilityQueueing();
	}

	public void switchLegacyInterfaceSkin() {
		legacyInterfaceSkin = !legacyInterfaceSkin;
		refreshLegacyInterfaceSkin();
	}

	public void refreshLegacyInterfaceSkin() {
		varsManager.sendVarBit(22875, legacyInterfaceSkin ? 1 : 0);
	}

	public void refreshMapIcons() {
		varsManager.sendVarBit(22874, legacyCombatMode ? 1 : 0);
	}

	public void refreshHideTitleBarsWhenLocked() {
		varsManager.sendVarBit(19928, legacyCombatMode || hideTitleBarsWhenLocked ? 1 : 0);
	}

	public void refreshLockInterfaceCustomization() {
		varsManager.sendVarBit(19925, legacyCombatMode || lockInterfaceCustomization ? 1 : 0);
	}

	public void refreshSlimHeaders() {
		varsManager.sendVarBit(19924, legacyCombatMode || slimHeaders ? 1 : 0);
	}

	public void switchSlimHeaders() {
		slimHeaders = !slimHeaders;
		refreshSlimHeaders();
	}

	public void switchHideTitleBarsWhenLocked() {
		hideTitleBarsWhenLocked = !hideTitleBarsWhenLocked;
		refreshHideTitleBarsWhenLocked();
	}

	public void switchClickThroughtChatBoxes() {
		clickThroughtChatboxes = !clickThroughtChatboxes;
		refreshClickThroughtChatBoxes();
	}

	private void refreshClickThroughtChatBoxes() {
		varsManager.sendVarBit(20188, legacyCombatMode || legacyInterfaceMode || clickThroughtChatboxes ? 1 : 0);
	}

	public void switchTimeStamps() {
		timeStamps = !timeStamps;
		refreshTimeStamps();
	}

	private void refreshTimeStamps() {
		varsManager.sendVarBit(27452, timeStamps ? 1 : 0);
	}

	private void refreshGameframe() {
		varsManager.sendVarBit(22875, (legacyInterfaceMode) || (legacyCombatMode && legacyInterfaceMode) ? 1 : 0);
	}

	private void refreshTargetReticules() {
		varsManager.sendVarBit(19929, !legacyInterfaceMode && !legacyCombatMode && targetReticules ? 0 : 1);
	}

	public void switchTargetReticules() {
		targetReticules = !targetReticules;
		refreshTargetReticules();
	}

	private void refreshAlwaysShowTargetInformation() {
		varsManager.sendVarBit(19927, legacyCombatMode || legacyInterfaceMode || alwaysShowTargetInformation ? 0 : 1);
	}

	public boolean isAlwaysShowTargetInformation() {
		return !legacyInterfaceMode && !legacyCombatMode && alwaysShowTargetInformation;
	}

	public boolean isTargetReticule() {
		return !legacyInterfaceMode && !legacyCombatMode && targetReticules;
	}

	public void switchAlwaysShowTargetInformation() {
		alwaysShowTargetInformation = !alwaysShowTargetInformation;
		refreshAlwaysShowTargetInformation();
	}

	/*
	 * privatechat setup -> color(now you can have color and not be splited)
	 * split -> exactly what it says
	 */
	public void refreshSplitPrivateChat() {
		varsManager.sendVarBit(20187, splitPrivateChat ? 1 : 0);
	}

	public void switchSplitPrivateChat() {
		splitPrivateChat = !splitPrivateChat;
		refreshSplitPrivateChat();
	}

	public void refreshMakeXProgressWindow() {
		varsManager.sendVarBit(3034, makeXProgressWindow ? 0 : 1);
	}

	public void switchMakeXProgressWindow() {
		makeXProgressWindow = !makeXProgressWindow;
		getPackets().sendGameMessage(
				"You have toggled the Production Progress Dialog " + (makeXProgressWindow ? "on" : "off") + ".");
		refreshMakeXProgressWindow();
	}

	public void refreshHideFamiliarOptions() {
		varsManager.sendVarBit(18564, hideFamiliarOptions ? 1 : 0);
	}

	public void switchHideFamiliarOptions() {
		hideFamiliarOptions = !hideFamiliarOptions;
		refreshHideFamiliarOptions();
	}

	public void refreshGuidanceSystemHints() {
		varsManager.sendVarBit(20924, guidanceSystemHints ? 0 : 1);
	}

	public void switchGuidanceSystemHints() {
		guidanceSystemHints = !guidanceSystemHints;
		refreshGuidanceSystemHints();
	}

	public void refreshToogleQuickChat() {
		varsManager.sendVarBit(21242, toogleQuickChat ? 0 : 1);
	}

	public void refreshLockZoom() {
		varsManager.sendVarBit(19926, lockZoom ? 1 : 0);
	}

	public void refreshCameraType() {
		varsManager.sendVarBit(19949, rs3Camera ? 0 : 1);
	}

	public void setCameraType(boolean rs3Camera) {
		this.rs3Camera = rs3Camera;
		refreshCameraType();
	}

	public void switchLockZoom() {
		lockZoom = !lockZoom;
		refreshLockZoom();
	}

	public void switchToogleQuickChat() {
		toogleQuickChat = !toogleQuickChat;
		refreshToogleQuickChat();
	}

	private void refreshCombatMode() {
		varsManager.sendVarBit(27168, legacyCombatMode ? 1 : 0);
	}

	private void refreshInterfaceMode() {
		varsManager.sendVarBit(27169, legacyInterfaceMode ? 1 : 0);
	}

	public void refreshInterfaceVars() {
		resetAlwaysChatOnMode();
		refreshMapIcons();
		refreshSlimHeaders();
		refreshLockInterfaceCustomization();
		refreshClickThroughtChatBoxes();
		refreshHideTitleBarsWhenLocked();
		refreshTargetReticules();
		refreshAlwaysShowTargetInformation();
		refreshMakeXProgressWindow();
		refreshSplitPrivateChat();
		refreshTaskCompletePopups();
		refreshTaskInformationWindow();
		refreshTooglePlayerNotification();
		refreshToogleAbilityCooldownTimer();
		refreshSkillTargetBasedXPPopup();
		refreshUTCClock();
		refreshGameframe();
		refreshCombatMode();
		refreshInterfaceMode();
		refreshBackPackColumn();
		refreshToggleBuffTimer(true);
	}

	public void switchBuffTimer() {
		toggleBuffTimers = !toggleBuffTimers;
		refreshToggleBuffTimer(false);
	}

	public boolean hasBuffTimersEnabled() {
		return !legacyCombatMode || toggleBuffTimers;
	}

	public void refreshToggleBuffTimer(boolean login) {
		getVarsManager().sendVarBit(24832, toggleBuffTimers ? 1 : 0);
		getPackets().sendExecuteScript(364, toggleBuffTimers ? 1 : 0, login ? 0 : 1);
	}

	public void setUTCClock(int type) {
		this.utcClock = type;
		refreshUTCClock();
	}

	private void refreshUTCClock() {
		varsManager.sendVarBit(26696, utcClock);
		getPackets().sendHideIComponent(635, 2, utcClock == 0);
		getPackets().sendHideIComponent(635, 7, utcClock == 2);
	}

	public int getUTCClock() {
		return utcClock;
	}

	public void switchSkillTargetBasedXPPopup() {
		skillTargetBasedXPPopup = !skillTargetBasedXPPopup;
		refreshSkillTargetBasedXPPopup();
	}

	public void refreshSkillTargetBasedXPPopup() {
		varsManager.sendVarBit(26632, skillTargetBasedXPPopup ? 1 : 0);
	}

	public void switchToogleAbilityCooldownTimer() {
		toogleAbilityCooldownTimer = !toogleAbilityCooldownTimer;
		refreshToogleAbilityCooldownTimer();
	}

	public void refreshToogleAbilityCooldownTimer() {
		varsManager.sendVarBit(25401, toogleAbilityCooldownTimer ? 1 : 0);
	}

	public void switchTogglePlayerNotification() {
		tooglePlayerNotification = !tooglePlayerNotification;
		refreshTooglePlayerNotification();
	}

	public void refreshTooglePlayerNotification() {
		varsManager.sendVarBit(24940, tooglePlayerNotification ? 1 : 0);
	}

	public void switchPublicEffects() {
		publicChatEffects = !publicChatEffects;
		refreshPublicEffects();
	}

	private void refreshPublicEffects() {
		varsManager.sendVar(456, publicChatEffects ? 1 : 0);
	}

	public void switchTaskInformationWindow() {
		taskInformationWindow = !taskInformationWindow;
		refreshTaskInformationWindow();
	}

	public void refreshTaskInformationWindow() {
		varsManager.sendVarBit(3568, taskInformationWindow ? 0 : 1); // TODO
	}

	public void switchTaskCompletePopups() {
		taskCompletePopup = !taskCompletePopup;
		refreshTaskCompletePopups();
	}

	public void refreshTaskCompletePopups() {
		// varsManager.sendVarBit(22310, taskCompletePopup ? 1 : 0); //TODO
	}

	private void resetAlwaysChatOnMode() {
		setAlwaysChatOnMode(legacyCombatMode);
	}

	public boolean isAlwaysChatOnMode() {
		return alwaysOnChatMode;
	}

	public void setAlwaysChatOnMode(boolean alwaysOnChatMode) {
		this.alwaysOnChatMode = alwaysOnChatMode;
		refreshAlwaysChatOnMode();
	}

	public void switchAlwaysChatOnMode() {
		alwaysOnChatMode = !alwaysOnChatMode;
	}

	public void refreshAlwaysChatOnMode() {
		varsManager.sendVarBit(22310, alwaysOnChatMode ? 1 : 0); // TODO
	}

	public ActionBar getActionbar() {
		return actionbar;
	}

	public int getPreviousLodestone() {
		return previousLodestone;
	}

	public void setPreviousLodestone(int previousLodestone) {
		this.previousLodestone = previousLodestone;
	}

	public void updateBuffs() {
		getVarsManager().sendVar(895, getVarsManager().getValue(895) + 1);
	}

	// for buffs that arent used exept for showing, needs to be called at login
	public void refreshBuffs() {
		getEffectsManager().refreshAllBuffs();
		refreshMeleeAttackRating();
		refreshMeleeStrengthRating();
		refreshDefenceRating();
	}

	@Override
	public String getName() {
		return getDisplayName();
	}

	@Override
	public int getCombatLevel() {
		return skills.getCombatLevelWithSummoning();
	}

	public boolean isRunAfterLoad() {
		return runAfterLoad;
	}

	public Animation getDeathAnimation() {
		setNextGraphics(new Graphics(Utils.random(2) == 0 ? 4399 : 4398));
		return new Animation(21769);
	}

	public int[] getSubMenus() {
		return subMenus;
	}

	public boolean hasFireImmunity() {
		return getEffectsManager().hasActiveEffect(EffectType.FIRE_IMMUNITY)
				|| getEffectsManager().hasActiveEffect(EffectType.SUPER_FIRE_IMMUNITY);
	}

	@Override
	public boolean isPoisonImmune() {
		return getEffectsManager().hasActiveEffect(EffectType.ANTIPOISON);
	}

	public DoomsayerManager getDoomsayerManager() {
		return doomsayerManager;
	}

	public PlayerExamineManager getPlayerExamineManager() {
		return playerExamineManager;
	}

	@Override
	public void giveXP() {
		Combat.giveXP(this, getTotalDamageReceived() / 10);
	}

	public TimersManager getTimersManager() {
		return timersManager;
	}

	public CosmeticsManager getCosmeticsManager() {
		return cosmeticsManager;
	}
	

	
	public boolean isEnteredDonatorZone() {
		return enteredDonatorZone;
	}

	public void setEnteredDonatorZone() {
		enteredDonatorZone = true;
	}

	public void setCurrentOptionsMenu(int interfaceId) {
		getTemporaryAttributtes().put(Key.OPTION_MENU, interfaceId);
	}

	public String getLastBossInstanceKey() {
		return lastBossInstanceKey;
	}

	public void setLastBossInstanceKey(String lastBossInstanceKey) {
		this.lastBossInstanceKey = lastBossInstanceKey;
	}

	public InstanceSettings getLastBossInstanceSettings() {
		return lastBossInstanceSettings;
	}

	public void setLastBossInstanceSettings(InstanceSettings lastBossInstanceSettings) {
		this.lastBossInstanceSettings = lastBossInstanceSettings;
	}

	public boolean isInstantSwitchToLegacy() {
		return instantSwitchToLegacy;
	}

	public void switchInstantSwitchToLegacy() {
		instantSwitchToLegacy = !instantSwitchToLegacy;
	}

	public int getGameSettingsCategory() {
		return gameSettingsCategory;
	}

	public void setGameSettingsCategory(int gameSettingsCategory) {
		this.gameSettingsCategory = gameSettingsCategory;
	}

	public boolean isOnBoBBank() {
		return bobBank;
	}

	public void setBoBBank(boolean bobBank) {
		this.bobBank = bobBank;
	}

	public int getOptionType() {
		return optionType;
	}

	public void setOptionType(int option) {
		this.optionType = option;
	}

	public void setBackPackColumn(int backpackColumn) {
		this.backPackColumn = backpackColumn;
		varsManager.sendVar(3704, backpackColumn);
		varsManager.sendVar(4736, -1);
		varsManager.sendVar(4734, -1);
		varsManager.sendVar(4735, -1);
	}

	public void refreshBackPackColumn() {
		varsManager.sendVar(3704, backPackColumn);
		varsManager.sendVar(4736, -1);
		varsManager.sendVar(4734, -1);
		varsManager.sendVar(4735, -1);
	}

	public void refreshSlayerCounter() {
		slayerCounter = !slayerCounter;
		getPackets().sendHideIComponent(1639, 0, slayerCounter ? true : false);
	}

	public boolean getChatBadge() {
		return chatBadge;
	}

	public void setChatBadge(boolean chatBadge) {
		refreshChatBadge();
		this.chatBadge = chatBadge;
	}

	private void refreshChatBadge() {
		// varsManager.sendVarBit(22332, getChatBadge() ? 1 : 0); // aint
		// correct
	}

	public AreaLoot getAreaLooting() {
		return arealoot;
	}

	public void switchLootInterface() {
		lootInterface = !lootInterface;
		refreshLootInterface();
	}

	public void refreshLootInterface() {
		varsManager.sendVarBit(27942, lootInterface ? 1 : 0);
	}

	public void switchAreaLoot() {
		areaLoot = !areaLoot;
		refreshAreaLoot();
	}

	public void refreshAreaLoot() {
		varsManager.sendVarBit(27943, areaLoot ? 1 : 0);
	}

	public boolean getLootInterface() {
		return lootInterface;
	}

	public boolean getAreaLoot() {
		return areaLoot;
	}

	public HashMap<Integer, Integer> getVarbits() {
		return varBits;
	}

	public HashMap<Integer, Integer> getVars() {
		return vars;
	}
	
	public HashMap<String, Integer> getSlayerCreatures() {
		return slayerCreatures;
	}
	
	public void sendData() {
		for (int i = 0; i < KILLCOUNTDATA.length - 1; i++)
			getVarsManager().sendVarBit((int) KILLCOUNTDATA[i][1],
					slayerCreatures.get(KILLCOUNTDATA[i][0]) == null ? 0 : slayerCreatures.get(KILLCOUNTDATA[i][0]));
	}

	public void refreshVarBits() {
		varBits.forEach((varBit, value) -> getVarsManager().sendVarBit(varBit, value));
	}

	public void refreshVars() {
		vars.forEach((var, value) -> getVarsManager().sendVar(var, value));
	}

	public void initiateVarsAndVarbits() {
		vars.put(3, -1);//lodestone
		varBits.put(22915, 1);
		varBits.put(26407, 1);
		varBits.put(28241, 1);
		varBits.put(33484, 1);
		varBits.put(34846, 1);
		varBits.put(34902, 1);
		varBits.put(36173, 1);//menaphos lodestone
		varBits.put(9482, 15);//bandit lodestone
		varBits.put(10236, 190);//lunar isle lodestone
	}

	private void refreshQuestConfigs() {
		getVarsManager().sendVar(2091, 250);
		getVarsManager().sendVar(4260, 200);
		getVarsManager().sendVar(2599, 22368316);
		getVarsManager().sendVar(2802, 200);
		getVarsManager().sendVar(2430, 400);
		getVarsManager().sendVar(2732, 11);
		getVarsManager().sendVarBit(17711, 1);
		getVarsManager().sendVarBit(21782, 1);
		getVarsManager().sendVarBit(21783, 1);
	}

	public int getLootBeamValue() {
		return lootBeamValue;
	}

	public void setLootBeamOption(int value) {
		this.lootBeamOption = value;
		refreshLootBeamOption();
	}

	public int getLootBeamOption() {
		return this.lootBeamOption;
	}

	public void refreshLootBeamOption() {
		varsManager.sendVarBit(23261, lootBeamOption);
	}

	public int getLootBeamGFX(ItemDefinitions drop) {
		switch (lootBeamOption) {
		case 0:
			return 0;
		case 1:
			return 4419 + getLootBeamGFXMultiplier(drop);
		case 2:
			return 5050 + getLootBeamGFXMultiplier(drop);
		case 3:
			return 5297 + getLootBeamGFXMultiplier(drop);
		case 4:
			return 5528 + getLootBeamGFXMultiplier(drop);
		case 5:
			return 6328 + getLootBeamGFXMultiplier(drop);
		case 6:
			return 6501 + getLootBeamGFXMultiplier(drop);
		case 7:
			return 0; // TODO
		}
		return 0;
	}

	public String getLootBeamMessage() {
		switch (lootBeamOption) {
		case 0:
			return "";
		case 1:
			return "A golden beam shines over one of your items.";
		case 2:
			return "A rainbow shines over one of your items.";
		case 3:
			return "A festive beam shines over one of your items.";
		case 4:
			return "A sandcastle scene shines over one of your items.";
		case 5:
			return "A water spout sprays over one of your items.";
		case 6:
			return "A gravestone falls over one of your items.";
		case 7:
			return ""; // TODO
		}
		return "";
	}

	public int getLootBeamGFXMultiplier(ItemDefinitions drop) {
		if (drop.getValue() >= 50000 && drop.getValue() <= 999999)
			return 1;
		else if (drop.getValue() >= 1000000 && drop.getValue() <= 9999999)
			return 2;
		else if (drop.getValue() >= 10000000 && drop.getValue() <= 99999999)
			return 3;
		else if (drop.getValue() >= 100000000)
			return 4;
		return 0;
	}

	public void setLootBeamValue(int amount) {
		this.lootBeamValue = amount;
		refreshLootBeamValue();
	}

	public void refreshLootBeamValue() {
		varsManager.sendVar(4013, getLootBeamValue());
	}

	public void switchRetroCapes() {
		retroCapes = !retroCapes;
		refreshRetroCapes();
	}
	
	public void setExaminedPlayer(Player player){
		this.examinedPlayer = player;
	}

	public Player getExaminedPlayer(){
		return examinedPlayer;
	}
	
	public void setOnDifferentExamineTab(boolean onDifferentTab){
		this.onDifferentExamineTab = onDifferentTab;
	}
	
	public boolean isOnDifferentExamineTab(){
		return onDifferentExamineTab;
	}
	
	public boolean getRetroCapes() {
		return retroCapes;
	}

	public boolean isIronman() {
		return ironMan;
	}

	public boolean isHardcoreIronman() {
		return hcIronMan;
	}

	public int getCapIcon() {
		return capIcon;
	}

	public int getCapIcon2() {
		return capIcon2;
	}

	public void setCapIcon(int value) {
		this.capIcon = value;
		refreshCapIcon();
	}

	public void setCapIcon2(int value) {
		this.capIcon2 = value;
		refreshCapIcon2();
	}

	public void increaseCapIcon() {
		int value = varsManager.getBitValue(19010);
		if (value >= 7)
			return;
		else
			this.capIcon++;
		refreshCapIcon();
	}

	public void increaseCapIcon2() {
		int value = varsManager.getBitValue(19011);
		if (value >= 7)
			return;
		else
			this.capIcon2++;
		refreshCapIcon2();
	}

	public void decreaseCapIcon() {
		int value = varsManager.getBitValue(19010);
		if (value <= 0)
			return;
		else
			this.capIcon--;
		refreshCapIcon();
	}

	public void decreaseCapIcon2() {
		int value = varsManager.getBitValue(19011);
		if (value <= 0)
			return;
		else
			this.capIcon2--;
		refreshCapIcon2();
	}

	public void refreshCapIcon() {
		varsManager.sendVarBit(19010, capIcon);
	}

	public void refreshCapIcon2() {
		varsManager.sendVarBit(19011, capIcon2);
		System.out.println(capIcon2);
	}

	public void switchMoveTargetInterface() {
		targetInterface = !targetInterface;
		refreshTargetInterface();
	}

	public void refreshTargetInterface() {
		getPackets().sendEntityInterface(getCombatDefinitions().getCurrentTarget(), true, targetInterface ? 1477 : 1488,
				targetInterface ? 422 : 2, 1490);
	}
	
	public void eggBurst(int X, int Y, int Z) {
		if (AraxxorEggBurst == false) {
			World.sendGraphics(null, new Graphics(4996), new WorldTile(X + 3, Y, Z));
			World.sendGraphics(null, new Graphics(4996), new WorldTile(X + 2, Y, Z));
			World.sendGraphics(null, new Graphics(4996), new WorldTile(X + 2, Y + 1, Z));
			World.sendGraphics(null, new Graphics(4982), new WorldTile(X + 3, Y, Z));
			World.sendGraphics(null, new Graphics(4982), new WorldTile(X + 2, Y, Z));
			World.sendGraphics(null, new Graphics(4982), new WorldTile(X + 2, Y + 1, Z));
			AraxxorEggBurst = true;
			stopAll();
		}
	}

	public void setKilledAraxxor(boolean killedAraxxor) {
		this.killedAraxxor = killedAraxxor;
	}

	public void refreshRetroCapes() {
		for (int x = 5134; x < 5198; x++)
			varsManager.sendVar(x, retroCapes ? -1 : 0);
		varsManager.sendVar(5197, 0);
		if (retroCapes) {
			getCosmeticsManager().setCosmeticPreview(equipment.getCosmeticItems().getItemsCopy());
			getCosmeticsManager().getCosmeticPreview()[1] = null;
			for (com.rs.game.Capes.CapesData cape : CapesData.values()) {
				if (equipment.getCapeId() == cape.getRegularCapeId()) {
					getCosmeticsManager().getCosmeticPreview()[1] = new Item(cape.getRegularRetroCapeId(), 1);
					equipment.getCosmeticItems().set(1, new Item(cape.getRegularRetroCapeId(), 1));
					appearence.generateAppearenceData();
					getPackets().sendAppearenceLook();

				} else if (equipment.getCapeId() == cape.getTrimmedCapeId()) {
					getCosmeticsManager().getCosmeticPreview()[1] = new Item(cape.getTrimmedRetroCapeId(), 1);
					equipment.getCosmeticItems().set(1, new Item(cape.getTrimmedRetroCapeId(), 1));
					appearence.generateAppearenceData();
					getPackets().sendAppearenceLook();

				} else if (equipment.getCapeId() == cape.getHoodedCapeId()) {
					getCosmeticsManager().getCosmeticPreview()[1] = new Item(cape.getHoodedRetroCapeId(), 1);
					equipment.getCosmeticItems().set(1, new Item(cape.getHoodedRetroCapeId(), 1));
					getPackets().sendAppearenceLook();
				} else if (equipment.getCapeId() == cape.getHoodedTrimmedCapeId()) {
					getCosmeticsManager().getCosmeticPreview()[1] = new Item(cape.getHoodedTrimmedRetroCapeId(), 1);
					equipment.getCosmeticItems().set(1, new Item(cape.getHoodedTrimmedRetroCapeId(), 1));
					getPackets().sendAppearenceLook();
				} else {
					System.out.println("lol");
				}

			}
		} else {
			for (CapesData cape : CapesData.values()) {
				if (equipment.getCapeId() == cape.getRegularCapeId() || equipment.getCapeId() == cape.getTrimmedCapeId()
						|| equipment.getCapeId() == cape.getHoodedCapeId()
						|| equipment.getCapeId() == cape.getHoodedTrimmedCapeId()) {
					equipment.getCosmeticItems().set(1, null);
					getCosmeticsManager().setCosmeticPreview(equipment.getCosmeticItems().getItemsCopy());
					getPackets().sendAppearenceLook();
				} else if (equipment.getCapeId() != cape.getRegularCapeId()
						|| equipment.getCapeId() != cape.getTrimmedCapeId()
						|| equipment.getCapeId() != cape.getHoodedCapeId()
						|| equipment.getCapeId() != cape.getHoodedTrimmedCapeId()) {
					equipment.getCosmeticItems().set(1, null);
					getCosmeticsManager().setCosmeticPreview(equipment.getCosmeticItems().getItemsCopy());
					getPackets().sendAppearenceLook();
				}
			}
		}
	}
	
	public long getTotalValue() {
		return getMoneyPouch().getCoinsAmount() + getInventoryValue() + getEquipmentValue() + getBankValue();
	}

	public long getInventoryValue() {
		long value = 0;
		for (Item inventory : getInventory().getItems().toArray()) {
			if (inventory == null)
				continue;
			long amount = inventory.getAmount();
			value += inventory.getDefinitions().getPrice() * amount;
		}
		return value;
	}

	public long getEquipmentValue() {
		long value = 0;
		for (Item equipment : getEquipment().getItems().toArray()) {
			if (equipment == null)
				continue;
			long amount = equipment.getAmount();
			value += equipment.getDefinitions().getPrice() * amount;
		}
		return value;
	}

	public long getBankValue() {
		long value = 0;
		for (Item bank : getBank().getContainerCopy()) {
			if (bank == null)
				continue;
			long amount = bank.getAmount();
			value += bank.getDefinitions().getPrice() * amount;
		}
		return value;
	}
	
	public boolean hasMoney(int amount) {
		int money = getInventory().getAmountOf(995) + getMoneyPouch().getCoinsAmount();
		return money >= amount;
	}

	public boolean takeMoney(int amount) {
		if (!hasMoney(amount))
			return false;
		if (amount < 0)
			return false;
		int inPouch = getMoneyPouch().getCoinsAmount();
		int inInventory = getInventory().getAmountOf(995);
		if (inPouch >= amount) {
			getMoneyPouch().setAmount(amount, true);
			return true;
		}
		if (inInventory >= amount) {
			getInventory().deleteItem(new Item(995, amount));
			return true;
		}
		if (inPouch + inInventory >= amount) {
			amount = amount - inPouch;
			getMoneyPouch().setAmount(inPouch, true);
			getInventory().deleteItem(new Item(995, amount));
			return true;
		}
		return false;
	}

		
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	public void addMoney(int random) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasItem(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

    public void useItem() {
    }
}
