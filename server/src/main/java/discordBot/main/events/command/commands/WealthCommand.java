package discordBot.main.events.command.commands;

import com.rs.game.World;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

import discordBot.main.events.command.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 08-10-2018 at 12:17:48 am
 * Edited from Nocturne
 */
public class WealthCommand implements Command {

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Player player;
		String[] cmd = event.getMessage().getContentRaw().substring(1).split(" ");
		if (cmd.length < 2) {
			event.getChannel().sendMessage("Use proper formatting: .wealth <player_name>").queue();;
			return;
		}
		player = World.getPlayer(cmd[1].toLowerCase());
		if (player == null)
			event.getChannel().sendMessage("This player is currently offline.").queue();
		else {
			event.getChannel().sendMessage("Current wealth of "
					+ (player.getUsername().substring(0, 1).toUpperCase() + player.getUsername().substring(1))
					+ "\n" + "Inventory: " + Utils.format(player.getInventoryValue()) + "gp\n" + "Money Pouch: "
					+ Utils.format(player.getMoneyPouch().getCoinsAmount()) + "gp\n" + "Equipment: "
					+ Utils.format(player.getEquipmentValue()) + "gp\n" + "Bank: "
					+ Utils.format(player.getBankValue()) + "gp\n" + "Total: "
					+ Utils.format(player.getTotalValue()) + "gp").queue();
		}
		
	}

	@Override
	public void executed(boolean sucess, MessageReceivedEvent event) {
		
	}

	@Override
	public String description() {
		return "gets the total wealth of specified player";
	}

}
