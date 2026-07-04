package discordBot.main.events.command.commands;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.game.player.Skills;
import com.rs.utils.Utils;

import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 * Edited from Nocturne
 */
public class StatsCommand implements Command {

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Player player;
		String[] cmd = event.getMessage().getContentRaw().substring(1).split(" ");
		if (cmd.length < 2) {
			event.getChannel().sendMessage("Use proper formatting: .stats <player_name>").queue();
			return;
		}
		player = World.getPlayer(cmd[1].toLowerCase());
		if (player == null)
			event.getChannel().sendMessage("This player is currently offline.").queue();
		else {
			String statsMessage = "Current stats for " + (player.getUsername().substring(0, 1).toUpperCase() + player.getUsername().substring(1)) + " (" + player.getSkills().getCombatLevel() + ")\n";
			for (int i = Skills.ATTACK; i <= Skills.DIVINATION; i++) {
				statsMessage += (Skills.SKILL_NAME[i] + " - Level: " + player.getSkills().getLevel(i) + ", Exp: " + Utils.format(player.getSkills().getXp(i)) + "\n");
			}
			statsMessage += "Total Level: " + Utils.format(player.getSkills().getTotalLevel()) + ", Total Exp: " + Utils.format(player.getSkills().getTotalXp());
			event.getChannel().sendMessage(statsMessage).queue();
		}
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		
	}

	@Override
	public String description() {
		return "Shows stats of specified player";
	}

}
