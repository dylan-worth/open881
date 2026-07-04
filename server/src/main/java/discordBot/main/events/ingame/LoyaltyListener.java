package discordBot.main.events.ingame;

import java.awt.Color;
import java.time.Instant;

import discordBot.main.Constants;
import discordBot.main.Main;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 11-10-2018 at 1:24:12 pm
 */
public class LoyaltyListener extends ListenerAdapter {
	
	public static JDA bot;
	public static Guild guild;

	public static void SendMessage(String message) {
		try {
			guild = Main.bot.getGuildById(Constants.GUILD_ID);
			EmbedBuilder eb = new EmbedBuilder();
	        eb.setAuthor("LOYALTY", guild.getIconUrl(), guild.getIconUrl());
	        eb.setColor(Color.RED);
	        eb.addField("congratulations", message, true);
	        eb.setTimestamp(Instant.now());
	        guild.getTextChannelById(Constants.LOYALTY).sendMessage(eb.build()).queue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
