/**package com.rs.utils.discord;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.javacord.AccountType;
import org.javacord.DiscordApi;
import org.javacord.DiscordApiBuilder;
import org.javacord.entity.channel.TextChannel;
import org.javacord.entity.message.Message;
import org.javacord.entity.message.embed.EmbedBuilder;
import org.javacord.entity.server.Server;
import org.javacord.entity.user.User;



public class DiscordBot {

	private DiscordApi api;
	private Server server;
	private HashMap<User, Integer> warnings = new HashMap<>();
	final String token = "NDIzNjAwODc2Nzc5OTk1MTM2.DYss7A.6uWOKNxcMM7Af_SUTLKK0UXdYFs";
	final String serverId = "323882435882516480";


public static EmbedBuilder createEmbed(String title, String body) {
	EmbedBuilder builder = new EmbedBuilder();
	builder.setColor(new Color(21,56,111));
	builder.setAuthor(title);
	builder.setDescription(body);
	return builder;
}
	public DiscordBot() {
		api = new DiscordApiBuilder().setAccountType(AccountType.BOT)
				.setWaitForServersOnStartup(true)
				.setToken("NDIzNjAwODc2Nzc5OTk1MTM2.DYss7A.6uWOKNxcMM7Af_SUTLKK0UXdYFs").setRecommendedTotalShards()
				.join().login().join();

		server = api.getServerById(serverId).get();
		api.addMessageCreateListener(event -> {
			Message message = event.getMessage();
			// if (!message.isPrivateMessage())
			// handleWarnings(message); TODO
			if (message.getContent().charAt(0) != '.')
				return;
			Player player;
			String[] cmd = message.getContent().substring(1).split(" ");
			switch (cmd[0]) {
			case "players":
				message.getChannel()
						.sendMessage(createEmbed("Server", "There " + (World.getPlayers().size() == 1 ? "is" : "are") + " currently "
								+ World.getPlayers().size() + " "
								+ (World.getPlayers().size() == 1 ? "person" : "people") + " playing Gallifrey!"));
				break;
			case "events":
				message.getChannel()
				.sendMessage("Current event information for Gallifrey:\n" + "Evil Tree: "
						+ WorldEvents.EVIL_TREE_STATUS + "\n" + "Penguin H&S: Hint - " + WorldEvents.PENGUIN_HS_STATUS
						+ "\n" + "Harmonized Rocks: " + WorldEvents.HARMONIZED_STATUS + "\n"
						+ "Shooting Stars: Available - Check your house telescope for the location!\n"
						+ "Skiller's Dream: " + (World.MODIFIER / 10) + "x bonus for "
						+ Skills.SKILL_NAME[World.SKILL_ID] + "!\n" + "Wilderness Warbands: Time remaining - "
						+ (Warbands.warband == null ? "None" : Utils.getHoursMinsLeft(Warbands.warband.time)) + "\n"
						+ "Global Events: " + GlobalEvents.getEvent().getDescription());
				break;
			case "staff":
				List<String> moderators = new ArrayList<>(), administrators = new ArrayList<>(),
						developers = new ArrayList<>(), owners = new ArrayList<>();
				for (Player p : World.getPlayers()) {
					if (Settings.SERVER_OWNERS.contains(p.getUsername().toLowerCase().replace(" ", "_")))
						owners.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
					else if (Settings.SERVER_DEVELOPERS.contains(p.getUsername().toLowerCase().replace(" ", "_")))
						developers.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
					else if (p.getRights() == 1)
						moderators.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
					else if (p.getRights() == 2)
						administrators
								.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
				}
				int staffAmt = moderators.size() + administrators.size() + developers.size() + owners.size();
				message.getChannel().sendMessage("There " + (World.getPlayers().size() == 1 ? "is" : "are")
						+ " currently " + staffAmt + " staff " + (staffAmt == 1 ? "member" : "members")
						+ " on Gallifrey!\n" + "Owners: "
						+ owners.stream().map(Object::toString).collect(Collectors.joining(", ")).toString() + "\n"
						+ "Developers: "
						+ developers.stream().map(Object::toString).collect(Collectors.joining(", ")).toString() + "\n"
						+ "Administrators: "
						+ administrators.stream().map(Object::toString).collect(Collectors.joining(", ")).toString()
						+ "\n" + "Moderators: "
						+ moderators.stream().map(Object::toString).collect(Collectors.joining(", ")).toString());
				break;
			case "stats":
				if (cmd.length < 2) {
					message.getChannel().sendMessage("Use proper formatting: .stats <player_name>");
					break;
				}
				player = World.getPlayer(cmd[1].toLowerCase());
				if (player == null)
					message.getChannel().sendMessage("This player is currently offline.");
				else {
					String statsMessage = "Current stats for "
							+ (player.getUsername().substring(0, 1).toUpperCase() + player.getUsername().substring(1))
							+ " (" + player.getSkills().getCombatLevel() + ")\n";
					for (int i = Skills.ATTACK; i <= Skills.DIVINATION; i++) {
						statsMessage += (Skills.SKILL_NAME[i] + " - Level: " + player.getSkills().getLevel(i)
								+ ", Exp: " + Utils.format(player.getSkills().getXp(i)) + "\n");
					}
					statsMessage += "Total Level: " + Utils.format(player.getSkills().getTotalLevel()) + ", Total Exp: "
							+ Utils.format(player.getSkills().getTotalXp());
					message.getChannel().sendMessage(statsMessage);
				}
				break;
			case "wealth":
				if (cmd.length < 2) {
					message.getChannel().sendMessage("Use proper formatting: .wealth <player_name>");
					break;
				}
				player = World.getPlayer(cmd[1].toLowerCase());
				if (player == null)
					message.getChannel().sendMessage("This player is currently offline.");
				else {
					message.getChannel().sendMessage("Current wealth of "
							+ (player.getUsername().substring(0, 1).toUpperCase() + player.getUsername().substring(1))
							+ "\n" + "Inventory: " + Utils.format(player.getInventoryValue()) + "gp\n" + "Money Pouch: "
							+ Utils.format(player.getMoneyPouch().getCoinsAmount()) + "gp\n" + "Equipment: "
							+ Utils.format(player.getEquipmentValue()) + "gp\n" + "Bank: "
							+ Utils.format(player.getBankValue()) + "gp\n" + "Total: "
							+ Utils.format(player.getTotalValue()) + "gp");
				}
				break;
			case "online":
				if (cmd.length < 2) {
					message.getChannel().sendMessage("Use proper formatting: .online <player_name>");
					break;
				}
				player = World.getPlayer(cmd[1].toLowerCase());
				if (player == null)
					message.getChannel().sendMessage("This player is currently offline.");
				else
					message.getChannel().sendMessage("This player is currently online.");
				break;
			case "drops":
				if (cmd.length < 2) {
					message.getChannel().sendMessage("Use proper formatting: .drops <npc_id>");
					break;
				} else if (NPCDefinitions.getNPCDefinitions(Integer.parseInt(cmd[1])) == null) {
					message.getChannel().sendMessage("You have entered an invalid npc id.");
					break;
				}
				Drops drops = NPCDrops.getDrops(Integer.parseInt(cmd[1]));
				List<Drop> dropL = drops.getAllDrops();
				String dropText = "Drops for " + NPCDefinitions.getNPCDefinitions(Integer.parseInt(cmd[1])).getName()
						+ " (" + cmd[1] + ")\n";
				for (Drop drop : dropL) {
					dropText += ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + " Amount: "
							+ Utils.format(drop.getMinAmount()) + "-" + Utils.format(drop.getMaxAmount()) + "\n";
				}
				dropText += "In addition to the global wealth drop table.";
				message.getChannel().sendMessage(dropText);
				break;
			case "commands":
				message.getChannel()
						.sendMessage("Current Gallifrey commands:\n" + ".players\n" + ".staff\n" + ".events\n"
								+ ".online <player_name>\n" + ".wealth <player_name>\n" + ".stats <player_name>\n"
								+ ".drops <npc_id>");
				break;
			default:
				message.getChannel().sendMessage("Invalid command, use .commands for a list of commands");
				break;
			}
		});
	}

	

	public void handleWarnings(Message message) {
		TextChannel channel = message.getChannel();
		if (message.getContent().contains("nigg")
				|| (message.getContent().contains("porch") && message.getContent().contains("monkey"))
				|| (message.getContent().contains("gang") && message.getContent().contains("scape"))) {
			warnings.putIfAbsent(message.getUserAuthor().get(), 0);
			warnings.put(message.getUserAuthor().get(), warnings.get(message.getAuthor()) + 1);
			String text = "You have been issued a warning for the following message:\n" + message + "\n";
			switch (warnings.get(message.getAuthor())) {
			case 1:
				text += "This is a warning, the next offence is a kick, after that you will be banned.";
				break;
			case 2:
				channel.sendMessage(message.getAuthor().getName() + " has been kicked from the server.");
				server.kickUser(message.getUserAuthor().get());
				text += "You have been kicked from the channel, one more warning and you will be banned.";
				break;
			case 3:
				channel.sendMessage(message.getAuthor().getName() + " has been banned from the server.");
				server.banUser(message.getUserAuthor().get(), 1);
				text += "You have been banned from the channel for the next 24 hours.";
				break;
			}
			message.getChannel().sendMessage(text);
			for (User user : server.getMembers())
				if (user.getRoles(server).contains(server.getRoleById("355877113590579200")))
					user.sendMessage(
							message.getAuthor().getName() + " has been issued a warning for the following message:\n"
									+ message + "\n" + "They now have " + warnings.get(message.getAuthor()) + " warning"
									+ (warnings.get(message.getAuthor()) == 1 ? "" : "s") + ".");
		}
	}

	public TextChannel getChannel(String id) {
		return api.getTextChannelById(id).get();
		}
}
**/