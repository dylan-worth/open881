package discordBot.main.events.command.commands;

import java.awt.Color;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

import discordBot.main.Constants;
import discordBot.main.Main;
import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class InfoCommand implements Command {
	Guild guild;

	/*
	 * (non-Javadoc)
	 * 
	 * @see dylan.discord.bot.command.Command#called(java.lang.String[],
	 * net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dylan.discord.bot.command.Command#action(java.lang.String[],
	 * net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Member member;

		if (args.length > 0) {
			member = event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0));
		} else {
			member = event.getMember();
		}
		int total = 0;
		int offline = 0;
		int online = 0;
		for (int i = 0; i < event.getGuild().getMembers().size(); i++) {
			if (!event.getGuild().getMembers().get(i).getUser().isBot()) {
				total++;
			}
			if (!event.getGuild().getMembers().get(i).getOnlineStatus().equals(OnlineStatus.OFFLINE) && !event.getGuild().getMembers().get(i).getUser().isBot()) {
				online++;
			}
			if (event.getGuild().getMembers().get(i).getOnlineStatus().equals(OnlineStatus.OFFLINE)) {
				offline++;
			}
		}
		String totalMembers = Long.toString(total);
		String onlineMembers = Long.toString(online);
		String offlineMembers = Long.toString(offline);
		guild = Main.bot.getGuildById(Constants.GUILD_ID);
		EmbedBuilder eb = new EmbedBuilder();
		eb.setAuthor("Discord Server Info", guild.getIconUrl(), guild.getIconUrl());
		eb.setThumbnail(guild.getIconUrl());
		eb.addField("Server Name", event.getGuild().getName().toString(), false);
		eb.addField("Server Creation", event.getGuild().getCreationTime().format(DateTimeFormatter.RFC_1123_DATE_TIME).toString(), false);
		eb.addField("You joind", member.getJoinDate().format(DateTimeFormatter.RFC_1123_DATE_TIME).toString(), false);
		eb.addField("Total Members", totalMembers, false);
		eb.addField("Online Members", onlineMembers, false);
		eb.addField("Offline Members", offlineMembers, false);
		eb.setColor(Color.RED);
		eb.setTimestamp(Instant.now());
		event.getChannel().sendMessage(eb.build()).queue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dylan.discord.bot.command.Command#executed(boolean, net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dylan.discord.bot.command.Command#description()
	 */
	@Override
	public String description() {
		return "Sends a list of Info about the server.";
	}

}
