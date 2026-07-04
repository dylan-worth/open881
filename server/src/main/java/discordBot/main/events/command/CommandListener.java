package discordBot.main.events.command;

import discordBot.main.Constants;
import discordBot.main.Main;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class CommandListener extends ListenerAdapter {
	
	public void onMessageReceived(MessageReceivedEvent event) {
        Main.channel = event.getChannel();
        if (event.getMessage().getContentRaw().startsWith(Constants.PREFIX) && event.getMessage().getAuthor().getId() != event.getJDA().getSelfUser().getId()) {
            CommandHandler.handleCommand(CommandParser.parser(event.getMessage().getContentRaw(), event));
            event.getTextChannel().deleteMessageById(event.getMessageId()).queue();
        }
    }

}
