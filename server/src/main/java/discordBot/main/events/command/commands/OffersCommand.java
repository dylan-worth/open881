package discordBot.main.events.command.commands;

import java.awt.Color;
import java.text.DecimalFormat;
import java.time.Instant;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.grandExchange.Offer;

import discordBot.main.Constants;
import discordBot.main.Main;
import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 *         Created on : 08-10-2018 at 5:56:55 pm
 */
public class OffersCommand implements Command {
	
	private static DecimalFormat df2 = new DecimalFormat(".##");

	/*
	 * (non-Javadoc)
	 * 
	 * @see discordBot.main.events.command.Command#called(java.lang.String[],
	 * net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see discordBot.main.events.command.Command#action(java.lang.String[],
	 * net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Player player;
		String[] cmd = event.getMessage().getContentRaw().substring(1).split(" ");
		if (cmd.length < 2) {
			event.getChannel().sendMessage("Use proper formatting: .offers <player_name>").queue();
			return;
		}
		player = World.getPlayer(cmd[1].toLowerCase());
		if (player == null) {
			event.getChannel().sendMessage("This player is currently offline.").queue();
		} else {
			String message = "\n";
			for (int i = 0; i <= 7; i++) {
				Offer offer = GrandExchange.getOffer(World.getPlayer(player.getUsername()), i);
				if (offer == null || offer.getAmount() - offer.getTotalAmmountSoFar() == 0) {
					continue;
				}
				String suffix = "gp";
				String esuffix = "gp";
				int amt = offer.getAmount() - offer.getTotalAmmountSoFar();
				int tot = offer.getPrice() * amt;
				int each = offer.getPrice();
				int edivisor = 1;
				int divisor = 1;
				if ((tot / 1000) >= 1.0 && ((tot) / 1000) <= 999.9) {
					suffix = "k";
					divisor = 1000;
				} else if ((tot / 1000000) >= 1.0) {
					suffix = "m";
					divisor = 1000000;
				}
				if ((each / 1000) >= 1.0 && ((each) / 1000) <= 999.9) {
					esuffix = "k";
					edivisor = 1000;
				} else if ((each / 1000000) >= 1.0) {
					esuffix = "m";
					edivisor = 1000000;
				}
				message += (offer.isBuying() == true ? "Buying: " : "Selling: ") + "- " + offer.getName() + " x" + amt
						+ " for " + df2.format(tot / divisor) + "" + suffix + "(" + df2.format(each / edivisor) + ""
						+ esuffix + " each)\n";
			}
			Guild guild = Main.bot.getGuildById(Constants.GUILD_ID);
			EmbedBuilder eb = new EmbedBuilder();
			eb.setAuthor("Grand Exchange Offers Lister", guild.getIconUrl(), guild.getIconUrl());
			eb.setColor(Color.RED);
			eb.addField("Offers for " + cmd[1].toUpperCase(), message, false);
			eb.setTimestamp(Instant.now());
			event.getChannel().sendMessage(eb.build()).queue();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see discordBot.main.events.command.Command#executed(boolean,
	 * net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see discordBot.main.events.command.Command#description()
	 */
	@Override
	public String description() {
		return "Checks the GE offers from specified player";
	}

}
