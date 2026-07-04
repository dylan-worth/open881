package discordBot.main.events.command.commands;

import java.awt.Color;
import java.util.Map;

import discordBot.main.events.command.Command;
import discordBot.main.events.command.CommandHandler;
import discordBot.main.misc.Misc;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class CommandsCommand implements Command {
	
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {

		Misc.sendMessage(event, "please check your DM", Color.CYAN);
		String message = "Commands List\n";
		for (Map.Entry<String, Command> command : CommandHandler.COMMAND_MAP.entrySet()) {
			message += command.getKey().toString() + " - " + command.getValue().description().toString() + "\n";
		}
		Misc.sendPrivateMessage(event.getAuthor(), message);
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {

	}

	@Override
	public String description() {
		return "Sends a list of commands.";
	}

}
