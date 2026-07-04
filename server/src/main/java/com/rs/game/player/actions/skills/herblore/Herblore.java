package com.rs.game.player.actions.skills.herblore;

import java.util.HashMap;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.SkillsDialogue;

/**
 * @author Tommeh
 */

public class Herblore extends Action {
	
	public enum HerbloreType {
		CLEAN(),
		POTION()
	}
	
	public enum CleanAction {
	
		
	    GUAM(1, 2.5, 10119, new Item[]{ new Item(199)}, new Item(249), Skills.HERBLORE),
	    SNAKE_WEED(3, 2.5, 10119, new Item[]{ new Item(1525)}, new Item(1526), Skills.HERBLORE),
	    ARDIGAL(3, 2.5, 10119, new Item[]{ new Item(1527)}, new Item(1528), Skills.HERBLORE),
	    ROGUES_PURSE(3, 2.5, 10119, new Item[]{ new Item(1533)}, new Item(1534), Skills.HERBLORE),
	    SITO_FOIL(3, 2.5, 10119, new Item[]{ new Item(1529)}, new Item(1530), Skills.HERBLORE),
	    VOLENCIA_MOSS(3, 2.5, 10119, new Item[]{ new Item(1531)}, new Item(1532), Skills.HERBLORE),
	    MARRENTIL(9, 5, 10119, new Item[]{ new Item(201)}, new Item(251), Skills.HERBLORE),
	    TARROMIN(9, 3.8, 10119, new Item[]{ new Item(203)}, new Item(253), Skills.HERBLORE),
	    HARRALANDER(20, 6.3, 10119, new Item[]{ new Item(205)}, new Item(255), Skills.HERBLORE),
	    RANARR(25, 7.5, 10119, new Item[]{ new Item(207)}, new Item(257), Skills.HERBLORE),
	    TOADFLAX(30, 8, 10119, new Item[]{ new Item(3049)}, new Item(2998), Skills.HERBLORE),
	    SPIRIT_WEED(35, 7.8, 10119, new Item[]{ new Item(12174)}, new Item(12172), Skills.HERBLORE),
	    IRIT(40, 8.8, 10119, new Item[]{ new Item(209)}, new Item(259), Skills.HERBLORE),
	    WERGALI(41, 9.5, 10119, new Item[]{ new Item(14836)}, new Item(14854), Skills.HERBLORE),
	    AVANTOE(48, 10, 10119, new Item[]{ new Item(211)}, new Item(261), Skills.HERBLORE),
	    KWUARM(54, 11.3, 10119, new Item[]{ new Item(213)}, new Item(263), Skills.HERBLORE),
	    SNAPDRAGON(59, 11.8, 10119, new Item[]{ new Item(3051)}, new Item(3000), Skills.HERBLORE),
	    CADANTINE(65, 12.5, 10119, new Item[]{ new Item(215)}, new Item(265), Skills.HERBLORE),
	    LANTADYME(67, 13.1, 10119, new Item[]{ new Item(2485)}, new Item(2481), Skills.HERBLORE),
	    DWARF_WEED(70, 13.8, 10119, new Item[]{ new Item(217)}, new Item(267), Skills.HERBLORE),
	    TORSTOL(75, 15, 10119, new Item[]{ new Item(219)}, new Item(269), Skills.HERBLORE),
	    FELLSTALK(91, 16.8, 10119, new Item[]{ new Item(21626)}, new Item(21624), Skills.HERBLORE),
	
		COCONUT_MILK(1, 1, 363, new Item[]{ new Item(5976), new Item (9085)}, new Item(5935), Skills.HERBLORE),
        GUAM_UNF(1, 1, 363, new Item[]{ new Item(249), new Item (227)}, new Item(91), Skills.HERBLORE),
        SNAKEWEED_MIXTURE(1, 1, 363,  new Item[]{ new Item(249), new Item (227)}, new Item(737), Skills.HERBLORE),
        ARDIGAL_MIXTURE(1, 1, 363, new Item[]{ new Item(249), new Item (227)}, new Item(738), Skills.HERBLORE),
        ROGUES_PURSE_UNF(1, 1, 363, new Item[]{ new Item(249), new Item (227)}, new Item(4840), Skills.HERBLORE),
        TARROMIN_UNF(5, 1, 363,  new Item[]{ new Item(253), new Item (227)}, new Item(95), Skills.HERBLORE),
        MARRENTIL_UNF(9, 1, 363, new Item[]{ new Item(251), new Item (227)}, new Item(93), Skills.HERBLORE),
        HARRALANDER_UNF(18, 1, 363,  new Item[]{ new Item(255), new Item (227)}, new Item(97), Skills.HERBLORE),
        RANARR_UNF(25, 1, 363, new Item[]{ new Item(257), new Item (227)}, new Item(99), Skills.HERBLORE),
        TOADFLAX_UNF(30, 1, 363, new Item[]{ new Item(2998), new Item (227)}, new Item(3002), Skills.HERBLORE),
        SPIRIT_WEED_UNF(35, 1, 363, new Item[]{ new Item(12172), new Item (227)}, new Item(12181), Skills.HERBLORE),
        IRIT_UNF(40, 1, 363, new Item[]{ new Item(259), new Item (227)}, new Item(101), Skills.HERBLORE),
        WERGALI_UNF(41, 1, 363, new Item[]{ new Item(14854), new Item (14854)}, new Item(14856), Skills.HERBLORE),
        AVANTOE_UNF(48, 1, 363, new Item[]{ new Item(261), new Item (227)}, new Item(103), Skills.HERBLORE),
        KWUARM_UNF(54, 1, 363, new Item[]{ new Item(263), new Item (227)}, new Item(105), Skills.HERBLORE),
        MAGIC_ESSENCE_UNF(57, 1, 363, new Item[]{ new Item(3), new Item (227)}, new Item(157), Skills.HERBLORE),
        SNAPDRAGON_UNF(59, 1, 363, new Item[]{ new Item(3000), new Item (227)}, new Item(3004), Skills.HERBLORE),
        CADANTINE_UNF(65, 1, 363, new Item[]{ new Item(265), new Item (227)}, new Item(107), Skills.HERBLORE),
        LANTADYME_UNF(67, 1, 363, new Item[]{ new Item(2481), new Item (227)}, new Item(2483), Skills.HERBLORE),
        ANTIPOISON_PLUS_UNF(68, 1, 363, new Item[]{ new Item(2998), new Item (5935)}, new Item(5942), Skills.HERBLORE),
        DWARF_WEED_UNF(70, 1, 363, new Item[]{ new Item(267), new Item (227)}, new Item(109), Skills.HERBLORE),
        WEAPONPOISON_PLUS_UNF(73, 1, 363, new Item[]{ new Item(5935), new Item (6016)}, new Item(5936), Skills.HERBLORE),
        TORSTOL_UNF(75, 1, 363, new Item[]{ new Item(269), new Item (227)}, new Item(111), Skills.HERBLORE),
        ANTIPOISON_PLUS_PLUS_UNF(79, 1, 363, new Item[]{ new Item(5935), new Item (227)}, new Item(5951), Skills.HERBLORE),
        WEAPONPOISON_PLUS_PLUS_UNF(82, 1, 363, new Item[]{ new Item(5935), new Item (2398)}, new Item(5939), Skills.HERBLORE),
        FELLSTALK_UNF(91, 1, 363,  new Item[]{ new Item(21624), new Item (227)}, new Item(21628), Skills.HERBLORE),
        
        ATTACK_POTION(1, 25, 363, new Item[]{ new Item(91), new Item (221)}, new Item(121), Skills.HERBLORE),
        RANGING_POTION(3, 30, 363, new Item[]{ new Item(91), new Item (1951)}, new Item(27506), Skills.HERBLORE),
        MAGIC_POTION(5, 35, 363, new Item[]{ new Item(95), new Item (1474)}, new Item(14271), Skills.HERBLORE),
        STRENGTH_POTION(7, 40, 363, new Item[]{ new Item(95), new Item (225)}, new Item(115), Skills.HERBLORE),
        RELICYM_BALM(8, 40, 363, new Item[]{ new Item(4840), new Item (9736)}, new Item(4844), Skills.HERBLORE),
        DEFENCE_POTION(9, 45, 363, new Item[]{ new Item(93), new Item (948)}, new Item(133), Skills.HERBLORE),
        ANTIPOISON(13, 50, 363, new Item[]{ new Item(93), new Item (235)}, new Item(175), Skills.HERBLORE),
        SERUM207(15, 50, 363, new Item[]{ new Item(95), new Item (235)}, new Item(3411), Skills.HERBLORE),
        GUTHIX_REST(18, 59.5, 363, new Item[]{ new Item(97), new Item (251)}, new Item(4419), Skills.HERBLORE),
        RESTORE_POTION(22, 62.5, 363, new Item[]{ new Item(97), new Item (223)}, new Item(127), Skills.HERBLORE),
        GUTHIX_BALANCE_UNF(22, 25, 363, new Item[]{ new Item(127), new Item (1550)}, new Item(7652), Skills.HERBLORE),
        GUTHIX_BALANCE(22, 25, 363, new Item[]{ new Item(7652), new Item (7650)}, new Item(7662), Skills.HERBLORE),
        BLAMISH_OIL(25, 80, 363, new Item[]{ new Item(97), new Item (1581)}, new Item(1582), Skills.HERBLORE),
        ENERGY_POTION(26, 67.5, 363, new Item[]{ new Item(97), new Item (1975)}, new Item(3010), Skills.HERBLORE),
        SUPER_FISHING_EXPLOSIVE(31, 55, 363, new Item[]{ new Item(91), new Item (12630)}, new Item(12633), Skills.HERBLORE),
        AGILITY_POTION(34, 80, 363, new Item[]{ new Item(3002), new Item (2152)}, new Item(3034), Skills.HERBLORE),
        COMBAT_POTION(36, 84, 363, new Item[]{ new Item(97), new Item (9736)}, new Item(9741), Skills.HERBLORE),
        GOBLIN_POTION(37, 85, 363, new Item[]{ new Item(3002), new Item (11807)}, new Item(11810), Skills.HERBLORE),
        PRAYER_POTION(38, 87.5, 363, new Item[]{ new Item(99), new Item (231)}, new Item(139), Skills.HERBLORE),
        SUMMONING_POTION(40, 92, 363, new Item[]{ new Item(12181), new Item (12654)}, new Item(14281), Skills.HERBLORE),
        CRAFTING_POTION(42, 95, 363, new Item[]{ new Item(14856), new Item (5004)}, new Item(14840), Skills.HERBLORE),
        SUPER_ATTACK(45, 100, 363, new Item[]{ new Item(101), new Item (221)}, new Item(145), Skills.HERBLORE),
        SUPER_ANTIPOISON(48, 106.3, 363, new Item[]{ new Item(101), new Item (235)}, new Item(181), Skills.HERBLORE),
        FISHING_POTION(50, 112.5, 363, new Item[]{ new Item(103), new Item (231)}, new Item(151), Skills.HERBLORE),
        SUPER_ENERGY(52, 117.5, 363, new Item[]{ new Item(103), new Item (2970)}, new Item(3018), Skills.HERBLORE),
        HUNTER_POTION(53, 120, 363, new Item[]{ new Item(103), new Item (10111)}, new Item(10000), Skills.HERBLORE),
        SUPER_STRENGTH_POTION(55, 125, 363, new Item[]{ new Item(105), new Item (225)}, new Item(157), Skills.HERBLORE),
        MAGIC_ESSENCE_POTION(57, 130, 363, new Item[]{ new Item(9019), new Item (9018)}, new Item(9022), Skills.HERBLORE),
        FLETCHING_POTION(58, 132, 363, new Item[]{ new Item(14856), new Item (11525)}, new Item(14848), Skills.HERBLORE),
        WEAPON_POISON(60, 137.5, 363, new Item[]{ new Item(105), new Item (241)}, new Item(25487), Skills.HERBLORE),
        SUPER_RESTORE_POTION(63, 142.5, 363, new Item[]{ new Item(3004), new Item (223)}, new Item(3026), Skills.HERBLORE),
        MIXTURE_STEP1(65, 47.5, 363, new Item[]{ new Item(3026), new Item (235)}, new Item(10911), Skills.HERBLORE),
        MIXTURE_STEP2(65, 52.5, 363, new Item[]{ new Item(10915), new Item (1526)}, new Item(10919), Skills.HERBLORE),
        SANFEW_SERUM(65, 60, 363, new Item[]{ new Item(10923), new Item (10937)}, new Item(10928), Skills.HERBLORE),
        SUPER_DEFENCE_POTION(66, 150, 363, new Item[]{ new Item(107), new Item (239)}, new Item(163), Skills.HERBLORE),
        ANTIPOISON_PLUS(68, 155, 363, new Item[]{ new Item(5942), new Item (6049)}, new Item(5943), Skills.HERBLORE),
        ANTIFIRE_POTION(69, 157.5, 363, new Item[]{ new Item(2483), new Item (241)}, new Item(2454), Skills.HERBLORE),
        SUPER_RANGING_POTION(72, 162.5, 363, new Item[]{ new Item(109), new Item (245)}, new Item(169), Skills.HERBLORE),
        WEAPON_POISON_PLUS(73, 165, 363, new Item[]{ new Item(5936), new Item (6018)}, new Item(5937), Skills.HERBLORE),
        SUPER_MAGIC_POTION(76, 172.5, 363, new Item[]{ new Item(2483), new Item (3138)}, new Item(3042), Skills.HERBLORE),
        ZAMORAK_BREW(78, 175, 363, new Item[]{ new Item(111), new Item (247)}, new Item(189), Skills.HERBLORE),
        ANTIPOISON_PLUS_PLUS(79, 177.5, 363, new Item[]{ new Item(5951), new Item (6051)}, new Item(5952), Skills.HERBLORE),
        SARADOMIN_BREW(81, 180, 363, new Item[]{ new Item(3002), new Item (6693)}, new Item(6687), Skills.HERBLORE),
        WEAPON_POISON_PLUS_PLUS(82, 190, 363, new Item[]{ new Item(5939), new Item (6018)}, new Item(25503), Skills.HERBLORE),
        ADRENALINE_POTION(84, 200, 363, new Item[]{ new Item(3018), new Item (5972)}, new Item(15301), Skills.HERBLORE),
        SUPER_ANTIFIRE(85, 210, 363, new Item[]{ new Item(2454), new Item (4621)}, new Item(15305), Skills.HERBLORE),
        EXTREME_ATTACK(88, 220, 363, new Item[]{ new Item(145), new Item (261)}, new Item(15309), Skills.HERBLORE),
        EXTREME_STRENGTH(89, 230, 363, new Item[]{ new Item(157), new Item (267)}, new Item(15313), Skills.HERBLORE),
        EXTREME_DEFENCE(90, 240, 363, new Item[]{ new Item(163), new Item (2481)}, new Item(15317), Skills.HERBLORE),
        EXTREME_MAGIC(91, 2450, 363, new Item[]{ new Item(3042), new Item (9594)}, new Item(15321), Skills.HERBLORE),
        EXTREME_RANGING(92, 260, 363, new Item[]{ new Item(169), new Item (12539, 5)}, new Item(15325), Skills.HERBLORE),
        SUPER_ZAMORAK_BREW(93, 180, 363, new Item[]{ new Item(189), new Item (245)}, new Item(28201), Skills.HERBLORE),
        SUPER_SARADOMIN_BREW(93, 180, 363, new Item[]{ new Item(6687), new Item (28256)}, new Item(28193), Skills.HERBLORE),
        SUPER_GUTHIX_REST(93, 59.3, 363, new Item[]{ new Item(4419), new Item (28253)}, new Item(28209), Skills.HERBLORE),
        SUPER_PRAYER(94, 270, 363, new Item[]{ new Item(139), new Item (6810)}, new Item(15329), Skills.HERBLORE),
        PRAYER_RENEWAL(94, 190, 363, new Item[]{ new Item(21628), new Item (21622)}, new Item(21632), Skills.HERBLORE),
        OVERLOAD(96, 1000, 363, new Item[]{ new Item(269), new Item (15309), new Item (15313), new Item(15317), new Item(15321), new Item(15325)},
        		new Item(15333), Skills.HERBLORE),
        
        GRAND_STRENGTH(75, 123.8, 363, new Item[]{ new Item(2440), new Item(113), new Item (32843)}, new Item(32958), Skills.HERBLORE),
        GRAND_RANGING(76, 144.4, 363, new Item[]{ new Item(2444), new Item(14249), new Item (32843)}, new Item(32970), Skills.HERBLORE),
        GRAND_MAGIC(77, 155.7, 363, new Item[]{ new Item(3040), new Item(14269), new Item (32843)}, new Item(32982), Skills.HERBLORE),
        GRAND_ATTACK(78, 93.8, 363, new Item[]{ new Item(2428), new Item(2436), new Item (32843)}, new Item(32994), Skills.HERBLORE),
        GRAND_DEFENCE(79, 146.3, 363, new Item[]{ new Item(2433), new Item(2442), new Item (32843)}, new Item(33006), Skills.HERBLORE),
        SUPER_MELEE(81, 281.3, 363, new Item[]{ new Item(2436), new Item(2440), new Item(2442), new Item (32843)}, new Item(33018), Skills.HERBLORE),
        SUPER_WARMASTER(85, 500, 363, new Item[]{ new Item(2436), new Item(2440), new Item(2442), new Item(2444), new Item(3040)}, new Item(33030), Skills.HERBLORE),
        REPLENISHMENT(87, 256.9, 363, new Item[]{ new Item(15300), new Item(3024), new Item (32843)}, new Item(33042), Skills.HERBLORE),
        WYRMFIRE(89, 275.7, 363, new Item[]{ new Item(2452), new Item(15304), new Item (32843)}, new Item(33054), Skills.HERBLORE), //26025 buff
        EXTREME_BRAWLER(91, 367.5, 363, new Item[]{ new Item(15308), new Item(15312), new Item(15316), new Item (32843)}, new Item(33066), Skills.HERBLORE),
        EXTREME_BATTLEMAGE(91, 367.5, 363, new Item[]{ new Item(15320), new Item(15316), new Item (32843)}, new Item(33078), Skills.HERBLORE),
        EXTREME_SHARPSHOOTER(91, 367.5, 363, new Item[]{ new Item(15324), new Item (15316)}, new Item(33090), Skills.HERBLORE),
        EXTREME_WARMASTER(93, 500, 363, new Item[]{ new Item(15308), new Item(15312), new Item(15316), new Item(15320), new Item(15324), new Item (32843)}, new Item(33102), Skills.HERBLORE),
        SUPREME_STRENGTH(93, 266.3, 363, new Item[]{ new Item(15312), new Item(113), new Item (32843)}, new Item(33114), Skills.HERBLORE),
        SUPREME_ATTACK(93, 240, 363, new Item[]{ new Item(15308), new Item(2436), new Item (32843)}, new Item(33126), Skills.HERBLORE),
        SUPREME_DEFENCE(93, 292.5, 363, new Item[]{ new Item(15316), new Item(2442), new Item (32843)}, new Item(33138), Skills.HERBLORE),
        SUPREME_MAGIC(93, 316.9, 363, new Item[]{ new Item(15320), new Item (3040), new Item (32843)}, new Item(33150), Skills.HERBLORE),
        SUPREME_RANGING(93, 217.5, 363, new Item[]{ new Item(15324), new Item (2444), new Item (32843)}, new Item(33162), Skills.HERBLORE),
        BRIGHTFIRE(94, 300, 363, new Item[]{ new Item(15304), new Item(21630), new Item (32843)}, new Item(33174), Skills.HERBLORE),
        SUPER_PRAYER_RENEWAL(96, 208.2, 363, new Item[]{ new Item(21630), new Item (2434), new Item(32843)}, new Item(33186), Skills.HERBLORE), // 25852 buff
        HOLY_OVERLOAD(97, 350, 363, new Item[]{ new Item(21630), new Item (15332), new Item(32843)}, new Item(33246), Skills.HERBLORE),
        SEARING_OVERLOAD(97, 350, 363, new Item[]{ new Item(15304), new Item (15332), new Item(32843)}, new Item(33258), Skills.HERBLORE),
        OVERLOAD_SALVE(97, 500, 363, new Item[]{ new Item(15332), new Item(15304), new Item(2452), new Item(21630), new Item(2434), new Item(2448),
        		new Item (32843)}, new Item(33198), Skills.HERBLORE),
        SUPREME_OVERLOAD(98, 600, 363, new Item[]{ new Item(15332), new Item(2436), new Item(2440), new Item(2442), new Item(2444), new Item(3040),
        		new Item (32843)}, new Item(33210), Skills.HERBLORE),
        SUPREME_OVERLOAD_SALVE(98, 700, 363, new Item[]{ new Item(33210), new Item(15304), new Item(2452), new Item(21630), new Item(2434),
        		new Item(2448), new Item (32843)}, new Item(33222), Skills.HERBLORE),
        PERFECT_PLUS(99, 1000, 363, new Item[]{ new Item(15332), new Item(32947), new Item(32270), new Item (32843)}, new Item(33234), Skills.HERBLORE); //25854 buff
        
        
     
		public static CleanAction getHerbByProduce(int id) {
		    for(CleanAction herb : CleanAction.values())
				if(herb.getProducedHerb().getId() == id)
					return herb;
		    return null;
		}

		public static CleanAction getHerb(int id) {
		    for(CleanAction herb : CleanAction.values())
		    	for(Item item : herb.getItemsRequired())
		    		if(item.getId() == id)
		    			return herb;
		    return null;
		}
		
		private static final HashMap<Integer, CleanAction> HERBLORE =new HashMap<>();
		
		static {
			for (CleanAction f : values()) {
				HERBLORE.put(f.getItemsRequired()[0].getId(), f);
			}
		}
		
		public static CleanAction getHerbItem(int id) {
			return HERBLORE.get(id);
		}

		private int levelRequired;
		private double experience;
		private Item[] itemsRequired;
		private Item producedHerb;
		private int skillType;
		private int emote;

		CleanAction(int levelRequired, double experience, int emote, Item[] itemsRequired, Item producedHerb, int skillType) {
		    this.levelRequired = levelRequired;
		    this.experience = experience;
		    this.itemsRequired = itemsRequired;
		    this.producedHerb = producedHerb;
		    this.skillType = skillType;
		    this.emote = emote;
		}

		public Item[] getItemsRequired() {
		    return itemsRequired;
		}

		public int getLevelRequired() {
		    return levelRequired;
		}
		
        
		public Item getProducedHerb() {
		    return producedHerb;
		}
		
		public double getExperience() {
		    return experience;
		}

		public int getSkillType() {
		    return skillType;
		}
		
		public int getEmote() {
			return emote;
		}
	    }

	    public CleanAction herb;
	    public int ticks;
	    public Item item;
	    private int xpMultiplier = 1;

	    public Herblore(CleanAction herb, Item item, int ticks) {
		this.herb = herb;
		this.item = item;
		this.ticks = ticks;
	    }
	
	@Override
	public boolean start(Player player) {

		return !(herb==null||player==null);
	}
	    @Override
	    public boolean process(Player player) {
		if (herb == null || player == null) {
			player.getInterfaceManager().removeInterface(1251);
		    return false;
		}
		if (!player.getInventory().containsItemToolBelt(herb.getItemsRequired()[0].getId(), herb.getItemsRequired()[0].getAmount())) {
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		if (herb.getItemsRequired().length > 1) {
		    if (!player.getInventory().containsItemToolBelt(herb.getItemsRequired()[1].getId(), herb.getItemsRequired()[1].getAmount())) {
		    	player.getInterfaceManager().removeInterface(1251);
		    	return false;
		    }
		}
		    return player.getSkills().getLevel(herb.getSkillType()) >= herb.getLevelRequired();
	    }
	    
	    public static CleanAction isMixing(Player player, Item used, Item usedWith) {
        	CleanAction herb;
        	herb = CleanAction.getHerbItem(used.getId());
    		if (herb == null)
    			herb = CleanAction.getHerbItem(usedWith.getId());
    		if (herb != null)
    			return herb;
    		return null;
        }

	@Override
	public int processWithDelay(Player player) {
		ticks--;			
		int multiplier = 0;	
		int emote = herb.getEmote();
		double xp = herb.getExperience();
		int maxQuantity = player.getVarsManager().getBitValue(1002);
		int amount = herb.getProducedHerb().getAmount() * multiplier ;
		for (Item required : herb.getItemsRequired()) {
		    player.getInventory().deleteItem(required.getId(), required.getAmount());
		}
		if (maxQuantity > 1){
		SkillsDialogue.sendProgressBar(player, herb.getProducedHerb().getId(), maxQuantity, (int) xp);
		player.getPackets().sendExecuteScript(3373, 1018);
		player.getPackets().sendCSVarInteger(2229, maxQuantity - xpMultiplier);
		xpMultiplier++;
		}
		player.getInventory().addItem(herb.getProducedHerb().getId(), amount);
		player.getSkills().addXp(herb.getSkillType(), xp);
		player.setNextAnimation(new Animation(emote));
		return 0;
	}

	@Override
	public void stop(Player player) {
		setActionDelay(player, 3);
		
	}

}
