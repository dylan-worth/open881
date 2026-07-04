package discordBot.main.events.command.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rs.Settings;
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
public class StaffCommand implements Command {

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		List<String> moderators = new ArrayList<>(), administrators = new ArrayList<>(), developers = new ArrayList<>(),
				owners = new ArrayList<>();
		for (Player p : World.getPlayers()) {
			if (Settings.SERVER_OWNERS.contains(p.getUsername().toLowerCase().replace(" ", "_")))
				owners.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
			else if (Settings.SERVER_DEVELOPERS.contains(p.getUsername().toLowerCase().replace(" ", "_")))
				developers.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
			else if (p.getRights() == 1)
				moderators.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
			else if (p.getRights() == 2)
				administrators.add(p.getUsername().substring(0, 1).toUpperCase() + p.getUsername().substring(1));
		}
		int staffAmt = moderators.size() + administrators.size() + developers.size() + owners.size();
		event.getChannel().sendMessage("There " + (World.getPlayers().size() == 1 ? "is" : "are")
				+ " currently " + staffAmt + " staff " + (staffAmt == 1 ? "member" : "members")
				+ " on Gallifrey!\n" + "Owners: "
				+ owners.stream().map(Object::toString).collect(Collectors.joining(", ")).toString() + "\n"
				+ "Developers: "
				+ developers.stream().map(Object::toString).collect(Collectors.joining(", ")).toString() + "\n"
				+ "Administrators: "
				+ administrators.stream().map(Object::toString).collect(Collectors.joining(", ")).toString()
				+ "\n" + "Moderators: "
				+ moderators.stream().map(Object::toString).collect(Collectors.joining(", ")).toString()).queue();;
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {

	}

	@Override
	public String description() {

		return "Lists online staff";
	}

}
