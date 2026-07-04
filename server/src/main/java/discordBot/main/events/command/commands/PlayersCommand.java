package discordBot.main.events.command.commands;

import java.awt.Color;
import java.time.Instant;

import com.rs.game.World;

import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 * Edited from Nocturne
 */
public class PlayersCommand implements Command {
	
	Guild guild;

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		EmbedBuilder eb = new EmbedBuilder();
		eb.setAuthor("Players online");
		eb.addField("Server", "There " + (World.getPlayers().size() == 1 ? "is" : "are") + " currently "
				+ World.getPlayers().size() + " "
				+ (World.getPlayers().size() == 1 ? "person" : "people") + " playing Gallifrey!", false);
		eb.setColor(Color.RED);
		eb.setTimestamp(Instant.now());
		event.getChannel().sendMessage(eb.build()).queue();
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		
	}

	@Override
	public String description() {
		return "Displays online players ammount";
	}

}
