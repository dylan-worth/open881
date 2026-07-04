package com.rs.game.player.actions.skills.herblore;

import java.util.HashMap;

import com.rs.game.Animation;
import com.rs.game.item.Item;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.game.player.actions.Action;
import com.rs.game.player.content.SkillsDialogue;

/**
 * author: Tommeh
 */

public class Grinding extends Action {
	
	public enum GrindAction {

        UNICORN_HORN_DUST(1, 1, 364, new Item[]{ new Item(237)}, new Item(235), Skills.HERBLORE),
        DRAGON_SCALE_DUST(1, 1, 364, new Item[]{ new Item(243)}, new Item(241), Skills.HERBLORE),
        CRUSHED_NEST(1, 1, 364, new Item[]{ new Item(5075)}, new Item(6693), Skills.HERBLORE),
        KEBBIT_TEETH_DUST(1, 1, 364, new Item[]{ new Item(10109)}, new Item(10111), Skills.HERBLORE),
        GOAT_HORN_DUST(1, 1, 364, new Item[]{ new Item(9735)}, new Item(9736), Skills.HERBLORE),
        GROUND_MUD_RUNE(1, 1, 364, new Item[]{ new Item(4698)}, new Item(9594), Skills.HERBLORE),
        ANCHOVY_PASTE(1, 1, 364, new Item[]{ new Item(321)}, new Item(11266), Skills.HERBLORE),
        GORAK_CLAW_POWDER(1, 1, 364, new Item[]{ new Item(9016)}, new Item(9018), Skills.HERBLORE),
        
        CHOCOLATE_DUST(1, 1, 364, new Item[]{ new Item(1973)}, new Item(1975), Skills.COOKING),
        GROUND_GUAM(1, 1, 364, new Item[]{ new Item(249)}, new Item(6681), Skills.COOKING),
        GROUND_SEAWEED(1, 1, 364, new Item[]{ new Item(401)}, new Item(6683), Skills.COOKING),
        GROUND_CRAB_MEAT(1, 1, 364, new Item[]{ new Item(7518)}, new Item(7527), Skills.COOKING),
        GROUND_COD(1, 1, 364, new Item[]{ new Item(341)}, new Item(7528), Skills.COOKING),
        GROUND_KELP(1, 1, 364, new Item[]{ new Item(7516)}, new Item(7517), Skills.COOKING),
        BREADCRUMBS(1, 1, 364, new Item[]{ new Item(2309)}, new Item(7515), Skills.COOKING),
        
        GUAM_TAR(19, 30, 364, new Item[]{ new Item(1939, 15), new Item(249)}, new Item(10142, 15), Skills.HERBLORE),
        MARRENTIL_TAR(31, 42.5, 364, new Item[]{ new Item(1939, 15), new Item(251)}, new Item(10143, 15), Skills.HERBLORE),
        TARROMIN_TAR(39, 55, 364, new Item[]{ new Item(1939, 15), new Item(253)}, new Item(10144, 15), Skills.HERBLORE),
        HARRALANDER_TAR(44, 72.5, 364, new Item[]{ new Item(1939, 15), new Item(255)}, new Item(10145, 15), Skills.HERBLORE),
        
        GROUND_ASHES(1, 1, 364, new Item[]{ new Item(592)}, new Item(8865), Skills.HERBLORE),
        GROUND_TOOTH(1, 1, 364, new Item[]{ new Item(9079)}, new Item(9082), Skills.HERBLORE),
        DUST_OF_ARMADYL(1, 1, 364, new Item[]{ new Item(21776)}, new Item(21774, 8), Skills.HERBLORE);
        
        

		
		public static GrindAction getHerbByProduce(int id) {
		    for(GrindAction herb : GrindAction.values())
				if(herb.getProducedHerb().getId() == id)
				    return herb;
		    return null;
		}

		public static GrindAction getHerb(int id) {
		    for(GrindAction herb : GrindAction.values())
				for(Item item : herb.getItemsRequired())
				    if(item.getId() == id)
				    	return herb;
		    return null;
		}
		
		private static final HashMap<Integer, GrindAction> HERBLORE = new HashMap<>();
		
		static {
			for (GrindAction f : values())
				HERBLORE.put(f.getItemsRequired()[0].getId(), f);
		}
		
		public static GrindAction getHerbItem(int id) {
			return HERBLORE.get(id);
		}

		private int levelRequired;
		private double experience;
		private Item[] itemsRequired;
		private Item producedHerb;
		private int skillType;
		private int emote;

		private GrindAction(int levelRequired, double experience, int emote, Item[] itemsRequired, Item producedHerb, int skillType) {
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

    public GrindAction herb;
    public Item item;
    public int ticks;
    private int xpMultiplier = 1;

    public Grinding(GrindAction herb, Item item, int ticks) {
		this.herb = herb;
		this.item = item;
		this.ticks = ticks;
    }
	

	@Override
	public boolean start(Player player) {
		if (herb == null || player == null)
		    return false;
		return true;
	}

    @Override
    public boolean process(Player player) {
		if (herb == null || player == null){
			player.getInterfaceManager().removeInterface(1251);
		    return false;
		}
		else if (!player.getInventory().containsItemToolBelt(herb.getItemsRequired()[0].getId(), herb.getItemsRequired()[0].getAmount())){
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		else if (herb.getItemsRequired().length > 1 && !player.getInventory().containsItemToolBelt(herb.getItemsRequired()[1].getId(), herb.getItemsRequired()[1].getAmount())){
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}
		else if (player.getSkills().getLevel(herb.getSkillType()) < herb.getLevelRequired()){
			player.getInterfaceManager().removeInterface(1251);
			return false;
		}  
		return true;
	}
	    
	public static GrindAction isAttaching(Player player, Item used, Item usedWith) {
    	GrindAction herb = GrindAction.getHerbItem(used.getId());
		if (herb == null)
			herb = GrindAction.getHerbItem(usedWith.getId());
		return herb;
    }

	@Override
	public int processWithDelay(Player player) {
		ticks--;			
		int multiplier = 1;	
		int emote = herb.getEmote();
		double xp = herb.getExperience();
		int maxQuantity = player.getVarsManager().getBitValue(1002);
		int amount = herb.getProducedHerb().getAmount() * multiplier ;
		for (Item required : herb.getItemsRequired())
		    player.getInventory().deleteItem(required.getId(), required.getAmount());
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
