package discordBot.main.events.command.commands;

import com.rs.game.World;
import com.rs.game.player.Player;

import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 * Edited from Nocturne
 */
public class OnlineCommand implements Command {

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Player player;
		String[] cmd = event.getMessage().getContentRaw().substring(1).split(" ");
		if (cmd.length < 2) {
			event.getChannel().sendMessage("Use proper formatting: .online <player_name>").queue();
			return;
		}
		player = World.getPlayer(cmd[1].toLowerCase());
		if (player == null)
			event.getChannel().sendMessage(cmd[1].toLowerCase() + " is currently offline.").queue();
		else
			event.getChannel().sendMessage(cmd[1].toLowerCase() + " is currently online.").queue();
		return;		
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		
	}

	@Override
	public String description() {
		return "Checks if the player is online";
	}

}
