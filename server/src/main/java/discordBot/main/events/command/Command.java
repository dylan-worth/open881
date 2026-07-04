package discordBot.main.events.command;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95(dyln1010) dylan_page_95@hotmail.com
 *
 * Created on : 04-06-2018 at 7:37:09 pm
 */
public interface Command {
	
	boolean called(String[] args, MessageReceivedEvent event);

    void action(String[] args, MessageReceivedEvent event);

    void executed(boolean sucess, MessageReceivedEvent event);

    String description();
}
