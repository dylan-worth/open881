package discordBot.main.events.command;

import java.util.HashMap;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class CommandHandler {

	public static final CommandParser parse = new CommandParser();
	public static HashMap<String, Command> COMMAND_MAP = new HashMap<>();

	public static void handleCommand(CommandParser.commandContainer cmd) {
		if (COMMAND_MAP.containsKey(cmd.invoke)) {
			boolean safe = COMMAND_MAP.get(cmd.invoke).called(cmd.args, cmd.event);
			if (!safe) {
				COMMAND_MAP.get(cmd.invoke).action(cmd.args, cmd.event);
				COMMAND_MAP.get(cmd.invoke).executed(safe, cmd.event);
			} else {
				COMMAND_MAP.get(cmd.invoke).executed(safe, cmd.event);
			}

		}

	}

}
