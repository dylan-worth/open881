package discordBot.main.misc;

import java.awt.Color;
import java.time.Instant;

import discordBot.main.Constants;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 */
public class Misc {
	
public static Guild guild;
	
	public static void sendMessage(MessageReceivedEvent event, String message, Color color) {
        if(Constants.DEBUG) {
            System.out.println(event.getChannel().getId());
        }
        EmbedBuilder eb = new EmbedBuilder();
        eb.setTimestamp(Instant.now());
        eb.setAuthor(event.getMessage().getAuthor().getName(), event.getMessage().getMember().getUser().getAvatarUrl(),event.getMessage().getMember().getUser().getAvatarUrl());
        eb.setDescription("message incoming for: " +  event.getMessage().getAuthor().getAsMention() + "\n" + message);
        event.getChannel().sendMessage(eb.build()).queue();
    }

    public static void sendPrivateMessage(User user, String content) {
        user.openPrivateChannel().queue((channel) ->
        {
            channel.sendMessage(content).queue();
        });
    }
    
}
