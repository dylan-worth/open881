package discordBot.main.events.command.commands;

import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.npc.Drop;
import com.rs.game.npc.Drops;
import com.rs.utils.NPCDrops;
import com.rs.utils.Utils;

import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 * Edited from Nocturne
 */
public class DropsCommand implements Command {

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {//TODO: fix bug
		String[] cmd = event.getMessage().getContentRaw().substring(1).split(" ");
		if (cmd.length < 2) {
			event.getChannel().sendMessage("Use proper formatting: .drops <npc_id>").queue();
			return;
		} else if (NPCDefinitions.getNPCDefinitions(Integer.parseInt(cmd[1])) == null) {
			event.getChannel().sendMessage("You have entered an invalid npc id.").queue();
			return;
		}
		Drops drops = NPCDrops.getDrops(Integer.parseInt(cmd[1]));
		List<Drop> dropL = drops.getAllDrops();
		String dropText = "Drops for " + NPCDefinitions.getNPCDefinitions(Integer.parseInt(cmd[1])).getName()
				+ " (" + cmd[1] + ")\n";
		for (Drop drop : dropL) {
			dropText += ItemDefinitions.getItemDefinitions(drop.getItemId()).getName() + " Amount: "
					+ Utils.format(drop.getMinAmount()) + "-" + Utils.format(drop.getMaxAmount()) + "\n";
		}
		dropText += "In addition to the global wealth drop table.";
		event.getChannel().sendMessage(dropText).queue();
		return;
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		
	}

	@Override
	public String description() {
		return "displays drops of specified npc id";
	}

}
