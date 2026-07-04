package discordBot.main.events.members;

import java.time.Instant;

import discordBot.main.Constants;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MemberJoin extends ListenerAdapter {
	
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		EmbedBuilder eb = new EmbedBuilder();
		eb.addField("Welcome", event.getMember().getAsMention().toString() + " we hope you enjoy your time with us", false);
		eb.setTimestamp(Instant.now());
		event.getGuild().getTextChannelById(Constants.WELCOME).sendMessage(eb.build()).queue();
	}

	@Override
	public void onGuildMemberLeave(GuildMemberLeaveEvent event) {
		EmbedBuilder eb = new EmbedBuilder();
		eb.addField("Goodbye", event.getMember().getEffectiveName().toString() + " sorry to see you leave", false);
		eb.setTimestamp(Instant.now());
		event.getGuild().getTextChannelById(Constants.GOODBYE).sendMessage(eb.build()).queue();
	}
}
