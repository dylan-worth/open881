package com.rs.net.decoders.handlers;

import com.rs.Settings;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.RenderAnimDefinitions;
import com.rs.game.Animation;
import com.rs.game.EffectsManager.EffectType;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.constants.Shops;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.minigames.PuroPuro;
import com.rs.game.minigames.Sawmill;
import com.rs.game.minigames.pest.CommendationExchange;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.familiar.impl.Pyrelord;
import com.rs.game.npc.others.ConditionalDeath;
import com.rs.game.npc.others.FireSpirit;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.LivingRock;
import com.rs.game.npc.others.MutatedZygomites;
import com.rs.game.npc.others.Pet;
import com.rs.game.npc.others.PolyporeCreature;
import com.rs.game.npc.others.Strykewyrm;
import com.rs.game.npc.others.WildyWyrm;
import com.rs.game.player.*;
import com.rs.game.player.FarmingManager.ProductInfo;
import com.rs.game.player.QuestManager.Quests;
import com.rs.game.player.actions.Fishing;
import com.rs.game.player.actions.Fishing.FishingSpots;
import com.rs.game.player.actions.Rest;
import com.rs.game.player.actions.skills.divination.Wisp;
import com.rs.game.player.actions.skills.mining.LivingMineralMining;
import com.rs.game.player.actions.skills.mining.MiningBase;
import com.rs.game.player.actions.skills.runecrafting.SiphonActionCreatures;
import com.rs.game.player.actions.skills.thieving.PickPocketAction;
import com.rs.game.player.actions.skills.thieving.PickPocketableNPC;
import com.rs.game.player.content.*;
import com.rs.game.player.content.CarrierTravel.Carrier;
import com.rs.game.player.content.Slayer.SlayerMaster;
import com.rs.game.player.content.Summoning.Pouch;
import com.rs.game.player.content.agility.HefinAgility;
import com.rs.game.player.content.dungeoneering.DungeonRewardShop;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.ColouredRecessRoom.Block;
import com.rs.game.player.content.dungeoneering.rooms.puzzles.SlidingTilesRoom;
import com.rs.game.player.controllers.RuneEssenceController;
import com.rs.game.player.controllers.SorceressGarden;
import com.rs.game.player.dialogues.impl.BoatingDialouge;
import com.rs.game.player.dialogues.impl.FremennikShipmaster;
import com.rs.game.player.dialogues.impl.PetShopOwner;
import com.rs.cache.loaders.RenderAnimDefinitions;
import com.rs.cache.loaders.AnimationDefinitions;
import com.rs.game.player.dialogues.impl.cities.draynorvillage.Olivia;
import com.rs.io.InputStream;
import com.rs.tools.NPCCheck;
import com.rs.utils.Logger;
import com.rs.utils.NPCExamines;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;

public class NPCHandler {

	public static void handleExamine(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.readUnsignedByte128() == 1;
		if (forceRun)
			player.setRun(forceRun);
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
			return;
		player.getPackets().sendEntityMessage(0, 15263739, npc, NPCExamines.getExamine(npc));
		player.getPackets().sendResetMinimapFlag();
		if (Settings.DEBUG)
			Logger.log("NPCHandler", "examined npc: " + npcIndex + ", " + npc.getId());
	}

	public static void handleOption1(final Player player, final InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (Settings.DEBUG) Logger.log("Player", "Option1 on " + npc.getId());
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		if (npc.getId() != 13634) {
			npc.faceEntity(player);
		}
		if (npc.getId() == 4296 || npc.getDefinitions().name.toLowerCase().contains("banker")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getBank().openBank();
					return;
				}
			}, true));
			return;
		}
		if (npc instanceof Familiar) {
			Familiar familiar = (Familiar) npc;
			if (player.getFamiliar() != familiar) {
				player.getPackets().sendGameMessage("That isn't your familiar.");
				return;
			}

			 if (familiar.getDefinitions().hasOption("store") || npc.getDefinitions().hasOption("withdraw")) {
				player.getFamiliar().store();
			} else if (familiar.getDefinitions().hasOption("interact")) {
				Object[] paramaters = new Object[2];
				Pouch pouch = player.getFamiliar().getPouch();
				if (pouch == Pouch.SPIRIT_GRAAHK) {
					paramaters[0] = "Karamja's Hunter Area";
					paramaters[1] = new WorldTile(2787, 3000, 0);
				} else if (pouch == Pouch.SPIRIT_KYATT) {
					paramaters[0] = "Piscatorius Hunter Area";
					paramaters[1] = new WorldTile(2339, 3636, 0);
				} else if (pouch == Pouch.SPIRIT_LARUPIA) {
					paramaters[0] = "Feldip Hills Hunter Area";
					paramaters[1] = new WorldTile(2557, 2913, 0);
				} else if (pouch == Pouch.ARCTIC_BEAR) {
					paramaters[0] = "Rellekka Hills Hunter Area";
					paramaters[1] = new WorldTile(2721, 3779, 0);
				} else if (pouch == Pouch.LAVA_TITAN) {
					paramaters[0] = "Lava Maze - *Deep Wilderness*";
					paramaters[1] = new WorldTile(3028, 3840, 0);
				} else {
					player.getPackets().sendGameMessage("Your familiar has nothing to say.");
					return;
				}
				player.getDialogueManager().startDialogue("FamiliarInspection", paramaters[0], paramaters[1]);
			}
			return;
		}

		if (npc.getId() == 4250) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getDialogueManager().startDialogue("SawmillOperator", npc.getId());
					return;
				}
			}, true));
			return;
		}
		if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getGeManager().openGrandExchange();
					return;
				}
			}, true));
			return;
		}
		if (SlidingTilesRoom.handleSlidingBlock(player, npc))
			return;
		if (SiphonActionCreatures.siphon(player, npc))
			return;
		if (npc.getId() == 733) {
			if (player.getTreasureTrailsManager().useNPC(npc))
				return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (!player.getControlerManager().processNPCClick1(npc))
					return;
				FishingSpots spot = FishingSpots.forId(npc.getId() | 1 << 24);
				if (spot != null) {
					player.getActionManager().setAction(new Fishing(spot, npc));
					return; // its a spot, they wont face us
				}
				if (npc.getId() >= 8837 && npc.getId() <= 8839) {
					player.getActionManager().setAction(new LivingMineralMining((LivingRock) npc));
					return;
				}
				if (npc instanceof GraveStone) {
					GraveStone grave = (GraveStone) npc;
					grave.sendGraveInscription(player);
					return;
				}
				if (npc instanceof Wisp) {
					((Wisp) npc).interact(player);
					return;
				}
				if (npc.getId() == 18204) {
					// chronicle artifact
					// player anim TODO
					npc.finish();
					player.getSkills().addXp(Skills.HUNTER, player.getSkills().getLevel(Skills.HUNTER) * 10);
					player.getInventory().addItem(new Item(29293, 1));
				}
				if (npc instanceof Familiar) {
					Familiar familiar = (Familiar) npc;
					if (player.getFamiliar() != familiar) {
						player.getPackets().sendGameMessage("That isn't your familiar.");
						return;
					} else if (familiar.getDefinitions().hasOption("interact")) {
						Object[] paramaters = new Object[2];
						Pouch pouch = player.getFamiliar().getPouch();
						if (pouch == Pouch.SPIRIT_GRAAHK) {
							paramaters[0] = "Karamja's Hunter Area";
							paramaters[1] = new WorldTile(2787, 3000, 0);
						} else if (pouch == Pouch.SPIRIT_KYATT) {
							paramaters[0] = "Piscatorius Hunter Area";
							paramaters[1] = new WorldTile(2339, 3636, 0);
						} else if (pouch == Pouch.SPIRIT_LARUPIA) {
							paramaters[0] = "Feldip Hills Hunter Area";
							paramaters[1] = new WorldTile(2557, 2913, 0);
						} else if (pouch == Pouch.ARCTIC_BEAR) {
							paramaters[0] = "Rellekka Hills Hunter Area";
							paramaters[1] = new WorldTile(2721, 3779, 0);
						} else if (pouch == Pouch.LAVA_TITAN) {
							paramaters[0] = "Lava Maze - *Deep Wilderness*";
							paramaters[1] = new WorldTile(3028, 3840, 0);
						} else
							return;
						player.getDialogueManager().startDialogue("FamiliarInspection", paramaters[0], paramaters[1]);
					}
					return;
				}
				npc.faceEntity(player);
				if (player.getTreasureTrailsManager().useNPC(npc))
					return;
				Object[] shipAttributes = BoatingDialouge.getBoatForShip(npc.getId());
				if (shipAttributes != null)
					player.getDialogueManager().startDialogue("BoatingDialouge", npc.getId());
				else if (npc.getId() == 3709)
					player.getDialogueManager().startDialogue("CostumesD", npc.getId());
				else if (npc.getId() >= 4650 && npc.getId() <= 4656)
					// Stan's
					// Trading
					// Post
					// Charter
					CarrierTravel.openCharterInterface(player);
				else if (npc.getId() == 5141)
					player.getDialogueManager().startDialogue("UgiDialouge", npc);
				if (npc.getId() == 20275) {
					HefinAgility.lightCreature(player, 2);
				} else if (npc.getId() == 15513 || npc.getId() >= 11303 && npc.getId() <= 11307)
					player.getDialogueManager().startDialogue("ServantDialogue", npc.getId());
				else if (npc.getId() == 2290)
					player.getDialogueManager().startDialogue("SirTiffyCashien", npc.getId());
				else if (npc.getId() == 4511)
					player.getDialogueManager().startDialogue("Oneiromancer", npc.getId());
				else if (npc.getId() == 8171 || npc.getId() == 8172)
					player.getDialogueManager().startDialogue("Dimintheis", npc.getId());
				else if (npc.getId() == 8266)
					player.getDialogueManager().startDialogue("Ghommel");
				else if (npc.getId() == 5530)
					player.getDialogueManager().startDialogue("MawnisBurowger");
				else if (npc.getId() == 5532)
					player.getDialogueManager().startDialogue("SorceressGardenNPCs", npc);
				else if (npc.getId() == 5563)
					player.getDialogueManager().startDialogue("SorceressGardenNPCs", npc);
				else if (npc.getId() == 6892 || npc.getId() == 6893)
					player.getDialogueManager().startDialogue("PetShopOwner", npc.getId());
				else if (npc.getId() == 780)
					player.getDialogueManager().startDialogue("Gertrude", npc.getId());
				else if (npc.getId() == 15907)
					player.getDialogueManager().startDialogue("OsmanDialogue", npc.getId());
				else if (npc.getId() == 837)
					player.getDialogueManager().startDialogue("ShantyGuardD", npc.getId());
				else if (npc.getId() == 9712)
					player.getDialogueManager().startDialogue("DungeoneeringTutor");
				else if (npc.getId() == 836)
					player.getDialogueManager().startDialogue("ShantyD");
				else if (npc.getId() == 2301)
					player.getDialogueManager().startDialogue("ShantyMonkeyD");
				else if (npc.getId() == 5915)
					player.getDialogueManager().startDialogue("Scribe", npc.getId(), 20709);
				else if (npc.getId() == 14872)
					player.getDialogueManager().startDialogue("MiladeDeathD");
				else if (npc.getId() == 4247 || npc.getId() == 6715 || npc.getId() == 20105)
					player.getDialogueManager().startDialogue("EstateAgentD", npc.getId());
				else if (npc.getId() == 1526)
					player.getDialogueManager().startDialogue("Lanthus", npc.getId());
				else if (npc.getId() == 13633)
					player.getDialogueManager().startDialogue("ClaimClanItem", npc.getId(), 20708);
				else if (npc.getId() == 2291)
					player.getDialogueManager().startDialogue("RugMerchantD", false, 0);
				else if (npc.getId() == 171)
					player.getDialogueManager().startDialogue("Brimstail", npc);
				else if (npc.getId() == 250)
					player.getDialogueManager().startDialogue("LadyOfTheLake");
				else if (npc.getId() == 3705)
					player.getDialogueManager().startDialogue("Max");
				else if (npc.getId() == 6524)
					player.getDialogueManager().startDialogue("BobBarterD");
				else if (npc.getId() == 8091)
					player.getDialogueManager().startDialogue("StarSpriteD");
				else if (EconomyManager.isEconomyManagerNpc(npc.getId()))
					EconomyManager.processManagerNpcClick(player, npc.getId());
				else if (npc.getId() == 15451 && npc instanceof FireSpirit) {
					FireSpirit spirit = (FireSpirit) npc;
					spirit.giveReward(player);
				} else if (npc.getId() == 1204 || npc.getId() == 1206 || npc.getId() == 4649) {
					boolean onDuty = Utils.random(2) == 0;
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), onDuty ? "I'm on duty, this isn't the time to be talking to strangers" : "It isn't safe here, its best for you to leave now...");
					player.getPackets().sendGameMessage("After all I've been through I think I can handle myself...");
				} else if (npc.getId() == 398 || npc.getId() == 399)
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Welcome. I hope you enjoy your time in the Legends' Guild.");
				else if (npc.getId() >= 1 && npc.getId() <= 6 || npc.getId() >= 7875 && npc.getId() <= 7884)
					player.getDialogueManager().startDialogue("Man", npc.getId());
				else if (npc.getId() == 198)
					player.getDialogueManager().startDialogue("Guildmaster", npc.getId());
				else if (npc.getId() == 11509)
					player.getDialogueManager().startDialogue("CommodreTyr", npc.getId());
				else if (npc.getId() == 9462 || npc.getId() == 9464 || npc.getId() == 9466)
					Strykewyrm.handleStomping(player, npc);
				else if (npc.getId() == 2417)
					WildyWyrm.handleInspect(player, npc);
				else if (npc.getId() == 1208)
					player.getDialogueManager().startDialogue("QuartsMaster");
				else if (npc.getId() == 9707)
					player.getDialogueManager().startDialogue("FremennikShipmaster", npc.getId(), true);
				else if (npc.getId() == 9708)
					player.getDialogueManager().startDialogue("FremennikShipmaster", npc.getId(), false);
				else if (npc.getId() == 456)
					player.getDialogueManager().startDialogue("FatherAereck", npc.getId());
				else if (npc.getId() == 1793)
					player.getDialogueManager().startDialogue("CraftingMaster", npc.getId());
				else if (npc.getId() == 3344 || npc.getId() == 3345)
					MutatedZygomites.transform(player, npc);
				else if (npc.getId() == 5585)
					player.getDialogueManager().startDialogue("SkillAlchemist");
				else if (npc.getId() == 11270)
					ShopsHandler.openShop(player, 19);
				else if (npc.getId() == 563)
					player.getDialogueManager().startDialogue("Arhein");
				else if (npc.getId() == 8527) // nomad capes
					player.getDialogueManager().startDialogue("SimpleNPCMessage", 8527, player.getQuestManager().completedQuest(Quests.NOMADS_REQUIEM) ? "Right click me to see my rewards brother!" : "You must kill nomad inside the tent there to see my rewards.");
				else if (npc.getId() == 6537 || npc.getId() == 6539)
					player.getDialogueManager().startDialogue("Mandrith_Nastroth", npc.getId());
				else if (npc.getId() == 2676)
					player.getDialogueManager().startDialogue("MakeOverMage", npc.getId(), 0);
				else if (npc.getId() == 598)
					player.getDialogueManager().startDialogue("Hairdresser", npc.getId());
				else if (npc.getId() == 548)
					player.getDialogueManager().startDialogue("Thessalia", npc.getId());
				else if (npc.getId() == 659)
					player.getDialogueManager().startDialogue("PartyPete");
				else if (npc.getId() == 579)
					player.getDialogueManager().startDialogue("DrogoDwarf", npc.getId());
				else if (npc.getId() == 3799) // void general store
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 122);
				else if (npc.getId() == 471) // tree gnome village general store
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 124);
				else if (npc.getId() == 582) // dwarves general store
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 31);
				else if (npc.getId() == 1917)
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 106);
				else if (npc.getId() == 932)
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 113);
				else if (npc.getId() == 23009)
					player.getDialogueManager().startDialogue("Ariane", npc.getId());
				else if (npc.getId() == 1040)
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 81);
				else if (npc.getId() == 209) // cannon shop
					player.getDialogueManager().startDialogue("Nulodion", npc.getId());
				else if (npc.getId() == 15099)
					player.getDialogueManager().startDialogue("Freda");
				else if (npc.getId() == 4358)
					player.getDialogueManager().startDialogue("CaveyDavey");
				else if (npc.getId() == 15087)
					player.getDialogueManager().startDialogue("DeathPlatueSoldier");
				else if (npc.getId() == 1334)
					player.getDialogueManager().startDialogue("Jossik", npc.getId());
				else if (npc.getId() == 904)
					player.getDialogueManager().startDialogue("ChamberGaurdian", npc.getId());
				else if (npc.getId() == 2259)
					player.getDialogueManager().startDialogue("MageOfZamorak");
				else if (npc.getId() == 903)
					player.getDialogueManager().startDialogue("Lundail", npc.getId());
				else if (npc.getId() == 528 || npc.getId() == 529) // edge
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 1);
				else if (npc.getId() == 522 || npc.getId() == 523) // varrock
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 8);
				else if (npc.getId() == 520 || npc.getId() == 521) // lumbridge
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 4);
				else if (npc.getId() == 2825 || npc.getId() == 2826)
					player.getDialogueManager().startDialogue("PiratePete", npc);
				else if (npc.getId() == 1301)
					player.getDialogueManager().startDialogue("Yrsa");
				else if (npc.getId() == 594)
					player.getDialogueManager().startDialogue("Nurmof", npc.getId());
				else if (npc.getId() == 665)
					player.getDialogueManager().startDialogue("BootDwarf", npc.getId());
				else if (npc.getId() == 382 || npc.getId() == 3294 || npc.getId() == 4316)
					player.getDialogueManager().startDialogue("MiningGuildDwarf", npc.getId(), false);
				else if (npc.getId() == 3295)
					player.getDialogueManager().startDialogue("MiningGuildDwarf", npc.getId(), true);
				else if (npc.getId() == 537)
					player.getDialogueManager().startDialogue("Scavvo", npc.getId());
				else if (npc.getId() == 536)
					player.getDialogueManager().startDialogue("GeneralStore", npc.getId(), 17);
				else if (npc.getId() == 8070)
					player.getDialogueManager().startDialogue("PKPShopD");
				else if (npc.getId() == 4563) // Crossbow Shop
					player.getDialogueManager().startDialogue("Hura", npc.getId());
				else if (npc.getId() == 2617)
					player.getDialogueManager().startDialogue("TzHaarMejJal", npc.getId());
				else if (npc.getId() == 3802 || npc.getId() == 6140 || npc.getId() == 6141)
					player.getDialogueManager().startDialogue("LanderSquire", npc.getId());
				else if (npc.getId() == 2618)
					player.getDialogueManager().startDialogue("TzHaarMejKah", npc.getId());
				else if (npc.getId() == 1595)
					player.getDialogueManager().startDialogue("SaniBoch", false);
				else if (npc.getId() == 15149)
					player.getDialogueManager().startDialogue("MasterOfFear", 0);
				else if (SlayerMaster.startInteractionForId(player, npc.getId(), 1))
					return;
				else if (npc.getId() == 1282)
					player.getDialogueManager().startDialogue("EcoTestDialog", false);
				else if (npc.getId() == 11519)
					player.getDialogueManager().startDialogue("Mariah");
				else if (npc.getId() == 11516)
					player.getDialogueManager().startDialogue("TerryGord");
				else if (npc.getId() == 11517)
					player.getDialogueManager().startDialogue("MrsGord");
				else if (npc.getId() == 3797)
					player.getDialogueManager().startDialogue("RepairSquire");
				else if (npc.getId() == 3790 || npc.getId() == 3791 || npc.getId() == 3792)
					player.getDialogueManager().startDialogue("VoidKnightExchange", npc.getId());


					//Lumbridge NPCS:

				else if (npc.getId() == 7870)
					player.getDialogueManager().startDialogue("Lachtopher");
				else if (npc.getId() == 7872)
					player.getDialogueManager().startDialogue("Victoria");
				else if (npc.getId() == 758)
					player.getDialogueManager().startDialogue("FredTheFarmer");
				else if (npc.getId() == 278)
					player.getDialogueManager().startDialogue("Cook");
				else if (npc.getId() == 741)
					player.getDialogueManager().startDialogue("DukeHoracio");
				else if (npc.getId() == 2082)
					player.getDialogueManager().startDialogue("Sigmund");
				else if (npc.getId() == 2244)
					player.getDialogueManager().startDialogue("LumbridgeSage");
				else if (npc.getId() == 9633)
					player.getDialogueManager().startDialogue("Xenia");
				else if (npc.getId() == 2238)
					player.getDialogueManager().startDialogue("Donie");
				else if (npc.getId() == 7909)
					player.getDialogueManager().startDialogue("Roddeck");
				else if (npc.getId() == 7969)
					player.getDialogueManager().startDialogue("ExplorerJack");


					//Guardsmen

				else if (npc.getId() == 17519)
					player.getDialogueManager().startDialogue("Dante");
				else if (npc.getId() == 17520)
					player.getDialogueManager().startDialogue("DeShawn");
				else if (npc.getId() == 17521)
					player.getDialogueManager().startDialogue("Brawn");
				else if (npc.getId() == 17522)
					player.getDialogueManager().startDialogue("Pazel");
				else if (npc.getId() == 17523)
					player.getDialogueManager().startDialogue("Peale");

					//Zamorakian Herbalist Family

				else if (npc.getId() == 17476)
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Ever since we've moved again things keep going missing and that awful trapdoor outside keeps creaking in the night!");
				else if (npc.getId() == 17477)
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Our son loves it here! He is always playing around near that trapdoor.");


				// Lumbridge Swamp:

				// Father Urhney

				else if (npc.getId() == 458)
					player.getDialogueManager().startDialogue("FatherUrhney");

				// Draynor Village:

				else if ((npc.getId() == 2233 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Olivia");
				}

				//AlKharid:
				if (npc.getId() == 2809) {
					if (player.getEquipment().getAmuletId() == 6707 || player.getInventory().containsItem(6707, 1)) {
						player.getDialogueManager().startDialogue("AliTheCamel");
						return;
					} else {
						player.getPackets().sendGameMessage("You need to equip a camulet.");
					}
				}


				//Port Sarim:
				if ((npc.getId() == 12261 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Gerrant");
				} else if (npc.getId() == 2950) {
					player.getDialogueManager().startDialogue("TheFace");
				}
				else if ((npc.getId() == 559 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Brian");
				}
				else if ((npc.getId() == 556 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Grum");
				}
				else if ((npc.getId() == 583 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Betty");
				}
				else if ((npc.getId() == 557 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Wydin");
				}
				else if ((npc.getId() == 375 && npc.getDefinitions().hasOption("Talk to"))) {
					player.getDialogueManager().startDialogue("RedBeard");
				}

				//Varrock:

				else if ((npc.getId() == 648 && npc.getDefinitions().hasOption("Talk to"))) {
					player.getDialogueManager().startDialogue("KingRoald");
				}
				else if ((npc.getId() == 884 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("CaptainRovin");
				}
				else if ((npc.getId() == 5913 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Aubury");
				}


				// Catherby:

				else if ((npc.getId() == 576 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Harry");
				}
				else if ((npc.getId() == 575 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Hickton");
				}
				else if ((npc.getId() == 562 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("CandleMaker");
				}
				else if ((npc.getId() == 2305 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Vanessa");
				}

				// Seers Village:

				else if ((npc.getId() == 820 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("PoisonSalesman");
				}
				else if ((npc.getId() == 8590 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Geoffrey");
				}
				else if ((npc.getId() == 8649 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Beekeeper");
				}


				// Fishing Contest Area:

				//Morris:
				else if ((npc.getId() == 227 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("Morris");
				}
				else if ((npc.getId() == 230 && npc.getDefinitions().hasOption("Talk-to"))) {
					player.getDialogueManager().startDialogue("GrandpaJack");
				}


				// dz
				else if (npc.getId() == 20366)
					player.getDialogueManager().startDialogue("DZGuideD", npc.getId());
				else if (npc.getId() == 5445)
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Penguinn rules!");
				else if (npc.getName().toLowerCase().contains("impling")) {
					FlyingEntityHunter.captureFlyingEntity(player, npc);
				} else if (npc instanceof Pet) {
					Pet pet = (Pet) npc;
					if (pet != player.getPet()) {
						player.getPackets().sendGameMessage("This isn't your pet.");
						return;
					}
					player.setNextAnimation(new Animation(827));
					pet.pickup();
				} else if (npc.getDefinitions().hasOption("Trade") || npc.getId() == 7065 || npc.getId() == 7066) {
					player.getDialogueManager().startDialogue("DefaultTradeDialouge", npc.getId(), stream);
				} else {
					switch (npc.getDefinitions().name.toLowerCase()) {
					case "void knight":
						player.getDialogueManager().startDialogue("VoidKnightExchange", npc.getId());
						break;
					case "sheep":
						SheepShearing.shearAttempt(player, npc);
						break;
						
					case "musician":
					case "drummer":
						if (player.isResting()) {
							player.stopAll();
							return;
						}
						if (player.getEmotesManager().isDoingEmote()) {
							player.getPackets().sendGameMessage("You can't rest while perfoming an emote.");
							return;
						}
						if (player.isLocked()) {
							player.getPackets().sendGameMessage("You can't rest while perfoming an action.");
							return;
						}
						player.stopAll();
						player.getActionManager().setAction(new Rest(true));
						break;
					default:
						player.getPackets().sendGameMessage("Nothing interesting happens.");
						if (Settings.DEBUG)
							System.out.println("cliked 1 at npc[" + npc.getIndex() + "] id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
						break;
					}
				}
			}
		}));
	}

	public static void handleOption2(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		if (npc.getId() == 4296 || npc.getDefinitions().name.contains("Banker") || npc.getDefinitions().name.contains("banker")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getDialogueManager().startDialogue("Banker", npc.getId());
					return;
				}
			}, true));

		}
		if (npc.getId() == 4250) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					Sawmill.openPlanksConverter(player);
					return;
				}
			}, true));
			return;
		}
		if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					// dialogue
					// player.getGeManager().openGrandExchange();
					return;
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				player.faceEntity(npc);
				if (player.getTreasureTrailsManager().useNPC(npc))
					return;
				FishingSpots spot = FishingSpots.forId(npc.getId() | (2 << 24));
				if (spot != null) {
					player.getActionManager().setAction(new Fishing(spot, npc));
					return;
				}
				npc.faceEntity(player);
				if (!player.getControlerManager().processNPCClick2(npc))
					return;
				PickPocketableNPC pocket = PickPocketableNPC.get(npc.getId());
				if (pocket != null) {
					player.getActionManager().setAction(new PickPocketAction(npc, pocket));
					return;
				} else if (npc instanceof Familiar) {
					Familiar familiar = (Familiar) npc;
					if (player.getFamiliar() != familiar) {
						player.getPackets().sendGameMessage("That isn't your familiar.");
						return;
					}
					if (familiar.getDefinitions().hasOption("store") || npc.getDefinitions().hasOption("withdraw")) {
						player.getFamiliar().store();
					} else if (familiar.getDefinitions().hasOption("cure")) {
						if (!player.getEffectsManager().hasActiveEffect(EffectType.POISON)) {
							player.getPackets().sendGameMessage("Your arent poisoned or diseased.");
							return;
						} else {
							player.getFamiliar().drainSpecial(2);
							player.setAntipoisonDelay(200);
						}
					} else if (familiar.getDefinitions().hasOption("interact")) {
						Object[] paramaters = new Object[2];
						Pouch pouch = player.getFamiliar().getPouch();
						if (pouch == Pouch.SPIRIT_GRAAHK) {
							paramaters[0] = "Karamja's Hunter Area";
							paramaters[1] = new WorldTile(2787, 3000, 0);
						} else if (pouch == Pouch.SPIRIT_KYATT) {
							paramaters[0] = "Piscatorius Hunter Area";
							paramaters[1] = new WorldTile(2339, 3636, 0);
						} else if (pouch == Pouch.SPIRIT_LARUPIA) {
							paramaters[0] = "Feldip Hills Hunter Area";
							paramaters[1] = new WorldTile(2557, 2913, 0);
						} else if (pouch == Pouch.ARCTIC_BEAR) {
							paramaters[0] = "Rellekka Hills Hunter Area";
							paramaters[1] = new WorldTile(2721, 3779, 0);
						} else if (pouch == Pouch.LAVA_TITAN) {
							paramaters[0] = "Lava Maze - *Deep Wilderness*";
							paramaters[1] = new WorldTile(3028, 3840, 0);
						} else
							return;
						player.getDialogueManager().startDialogue("FamiliarInspection", paramaters[0], paramaters[1]);
					}
					return;
				} else if (npc instanceof GraveStone) {
					GraveStone grave = (GraveStone) npc;
					grave.repair(player, false);
					return;
				}
				switch (npc.getDefinitions().name.toLowerCase()) {
				case "void knight":
					CommendationExchange.openExchangeShop(player);
					break;
				}
				Object[] shipAttributes = BoatingDialouge.getBoatForShip(npc.getId());
				if (shipAttributes != null) {
					CarrierTravel.sendCarrier(player, (Carrier) shipAttributes[0], (boolean) shipAttributes[1]);
				}



				//Port Sarim:
				else if ((npc.getId() == 557 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 30);
				}
				else if ((npc.getId() == 12261 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 31);
				}
				else if ((npc.getId() == 556 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 32);
				}
				else if ((npc.getId() == 559 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 33);
				}
				else if ((npc.getId() == 583 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 34);
				}

				//Catherby:


				else if ((npc.getId() == 576 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 10);
				}
				else if ((npc.getId() == 575 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 59);
				}
				else if ((npc.getId() == 562 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 60);
				}
				else if ((npc.getId() == 2305 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 188);
				}

				// Draynor Village:

				else if ((npc.getId() == 2233 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, Shops.DRAYNORS_SEED_MARKET);
				}

				// Varrock:

				else if ((npc.getId() == 5913 && npc.getDefinitions().hasOption("Trade"))) {
					ShopsHandler.openShop(player, 184);
				}



				else if (npc instanceof Pet) {
					if (npc != player.getPet()) {
						player.getPackets().sendGameMessage("This isn't your pet!");
						return;
					}
					Pet pet = player.getPet();
					player.getPackets().sendMessage(99, "Pet [id=" + pet.getId() + ", hunger=" + pet.getDetails().getHunger() + ", growth=" + pet.getDetails().getGrowth() + ", stage=" + pet.getDetails().getStage() + "].", player);
				} else {
					player.getPackets().sendGameMessage("Nothing interesting happens.");
					if (Settings.DEBUG)
						System.out.println("cliked 2 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
				}
			}


		}));
	}

	public static void handleOption3(final Player player, InputStream stream) {
		System.out.println("option 3");
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll(false);
		if (forceRun)
			player.setRun(forceRun);
		if (npc.getId() == 4296 || npc.getDefinitions().name.toLowerCase().contains("banker")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getGeManager().openCollectionBox();
					return;
				}
			}, true));
			return;
		}
		if (npc.getId() == 4250) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					ShopsHandler.openShop(player, 128);
					return;
				}
			}, true));
			return;
		}
		if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					player.getGeManager().openHistory();
					return;
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				if (!player.getControlerManager().processNPCClick3(npc))
					return;
				player.faceEntity(npc);
				if (npc.getId() >= 8837 && npc.getId() <= 8839) {
					MiningBase.propect(player, "You examine the remains...", "The remains contain traces of living minerals.");
					return;
				}
				if (npc instanceof GraveStone) {
					GraveStone grave = (GraveStone) npc;
					grave.repair(player, true);
					return;
				}
				npc.faceEntity(player);
				if (SlayerMaster.startInteractionForId(player, npc.getId(), 3))
					ShopsHandler.openShop(player, 29);
				else if (npc.getId() == 2619)
					player.getGeManager().openCollectionBox();
				else if ( npc.getId() == 7065 || npc.getId() == 7066) // Trader
					CarrierTravel.openCharterInterface(player);
				else if(npc.getId() >= 4650 && npc.getId() <= 4656)
					// Stan's
					// Trading
					// Post
					// Trade
					ShopsHandler.openShop(player, 88);
				else if (npc.getId() == 1526)
					CastleWars.openCastleWarsTicketExchange(player);
				else if (npc.getId() == 14877)
					player.getDialogueManager().startDialogue("TanningD", npc.getId());
				else if (npc.getId() == 548)
					PlayerLook.openThessaliasMakeOver(player);
				else if (npc.getId() == 1301)
					PlayerLook.openYrsaShop(player);
				else if (npc.getId() == 6892 || npc.getId() == 6893)
					PetShopOwner.sellShards(player);
				else if (npc.getId() == 6524) {
					player.getDialogueManager().startDialogue("SimpleNPCMessage", npc.getId(), "Her ya go chap.");
					Drinkables.decantPotsInv(player);
				} else if (npc.getId() == 2259)
					AbbysObsticals.teleport(player, npc);
				else if (npc.getId() == 4287)
					player.getDialogueManager().startDialogue("GamfriedShield");
				else if (npc.getId() == 359)
					ShopsHandler.openShop(player, 127);
				else if (npc.getId() == 5532)
					SorceressGarden.teleportToSorceressGardenNPC(npc, player);
				else if (npc.getId() == 1334) // Book Shop
					ShopsHandler.openShop(player, 35);
				else
					player.getPackets().sendGameMessage("Nothing interesting happens.");
			}
		}));
		if (Settings.DEBUG)
			System.out.println("cliked 3 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());
	}

	public static void handleOption4(final Player player, InputStream stream) {
		int npcIndex = stream.readUnsignedShort128();
		boolean forceRun = stream.readUnsignedByte128() == 1;
		final NPC npc = World.getNPCs().get(npcIndex);
		if (npc == null || npc.isCantInteract() || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()) || player.isLocked())
			return;
		player.stopAll(false);
		if (forceRun)
			player.setRun(forceRun);
		if (npc.getDefinitions().name.toLowerCase().equals("grand exchange clerk")) {
			player.setRouteEvent(new RouteEvent(npc, new Runnable() {
				@Override
				public void run() {
					player.faceEntity(npc);
					if (!player.withinDistance(npc, 2))
						return;
					npc.faceEntity(player);
					ItemSets.openSets(player);
					return;
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				npc.resetWalkSteps();
				if (!player.getControlerManager().processNPCClick4(npc))
					return;
				player.faceEntity(npc);
				if (npc instanceof GraveStone) {
					GraveStone grave = (GraveStone) npc;
					grave.demolish(player);
					return;
				}
				npc.faceEntity(player);
				if (npc.getId() == 14866)
					ShopsHandler.openShop(player, 39);
				else if (npc.getId() == 6070)
					ShopsHandler.openShop(player, 54);
				else if (npc.getId() == 14872)
					player.getDialogueManager().startDialogue("KillingQuickD");
				else if (npc.getId() == 5110) // Aleck's Hunter Emporium
					ShopsHandler.openShop(player, 56);
				else if (npc.getId() == 14854) // Poletax's Herblore Shop
					ShopsHandler.openShop(player, 68);
				else if (SlayerMaster.startInteractionForId(player, npc.getId(), 4))
					player.getSlayerManager().sendSlayerInterface(SlayerManager.BUY_INTERFACE);
				else
					player.getPackets().sendGameMessage("Nothing interesting happens.");
			}
		}));
		if (Settings.DEBUG)
			System.out.println("cliked 4 at npc id : " + npc.getId() + ", " + npc.getX() + ", " + npc.getY() + ", " + npc.getPlane());

	}

	public static void handleItemOnNPC(final Player player, final NPC npc, final int slot, final Item item) {
		if (item == null)
			return;
		player.setRouteEvent(new RouteEvent(npc, new Runnable() {
			@Override
			public void run() {
				if (!player.getInventory().containsItem(item.getId(), item.getAmount())) {
					return;
				}
				if (npc == null || npc.isDead() || npc.hasFinished() || !player.getMapRegionsIds().contains(npc.getRegionId()))
					return;
				if (npc instanceof Block) {
					Block block = (Block) npc;
					if (!block.useItem(player, item)) {
						return;
					}
				}
				if (npc instanceof Familiar) {
					Familiar familiar = (Familiar) npc;
					if (familiar.getBob() != null) {
						familiar.getBob().addItem(slot, item.getAmount());
					} else if (npc.getId() == 7378 || npc.getId() == 7377) {
						if (Pyrelord.lightLog(familiar, item))
							return;
					} else if (npc.getId() == 7339 || npc.getId() == 7339) {
						if ((item.getId() >= 1704 && item.getId() <= 1710 && item.getId() % 2 == 0) || (item.getId() >= 10356 && item.getId() <= 10366 && item.getId() % 2 == 0) || (item.getId() == 2572 || (item.getId() >= 20653 && item.getId() <= 20657 && item.getId() % 2 != 0))) {
							for (Item item : player.getInventory().getItems().getItems()) {
								if (item == null)
									continue;
								if (item.getId() >= 1704 && item.getId() <= 1710 && item.getId() % 2 == 0)
									item.setId(1712);
								else if (item.getId() >= 10356 && item.getId() <= 10366 && item.getId() % 2 == 0)
									item.setId(10354);
								else if (item.getId() == 2572 || (item.getId() >= 20653 && item.getId() <= 20657 && item.getId() % 2 != 0))
									item.setId(20659);
							}
							player.getInventory().refresh();
							player.getDialogueManager().startDialogue("ItemMessage", "Your ring of wealth and amulet of glory have all been recharged.", 1712);
						}
					}
				} else if (npc instanceof Pet) {
					player.faceEntity(npc);
					player.getPetManager().eat(item.getId(), (Pet) npc);
					return;
				} else if (npc instanceof ConditionalDeath)
					((ConditionalDeath) npc).useHammer(player);
				else if (item.getId() == 22444)
					PolyporeCreature.sprinkleOil(player, npc);
				else if (item.getId() == SpiritshieldCreating.SPIRIT_SHIELD || item.getId() == SpiritshieldCreating.HOLY_ELIXIR && npc.getId() == 802) {
					SpiritshieldCreating.blessShield(player, false);
				} else if (npc.getId() == 7729 && SpiritshieldCreating.isSigil(item.getId()))
					SpiritshieldCreating.attachShield(player, item, false);
				else if ((npc.getId() == 519 || npc.getId() == 3797) && ItemConstants.repairItem(player, player.getInventory().getItems().getThisItemSlot(item), false))
					return;
					//TODO
				else if (npc.getName().toString().equals("Tool leprechaun") && /*(Herblore.isIngredient(item) ||*/ ProductInfo.isProduct(item) && !item.getDefinitions().isNoted() && item.getDefinitions().getCertId() != -1) {
					int quantity = player.getInventory().getAmountOf(item.getId());
					player.getInventory().deleteItem(item.getId(), quantity);
					player.getInventory().addItem(item.getDefinitions().getCertId(), quantity);
					player.getDialogueManager().startDialogue("ItemMessage", "The leprechaun exchanges your items for banknotes.", item.getId());
				} else
					player.getPackets().sendGameMessage("Nothing interesting happens.");
			}
		}));


	}}
