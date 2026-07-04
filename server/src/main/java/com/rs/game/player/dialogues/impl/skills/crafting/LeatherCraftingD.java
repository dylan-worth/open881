package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.crafting.LeatherCrafting;
import com.rs.game.player.actions.skills.crafting.LeatherCrafting.CraftAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class LeatherCraftingD extends Dialogue {

	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		CraftAction craft = (CraftAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, craft
				.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CraftAction craft = CraftAction.getBarByProduce(result.getProduce());
		if (craft == null)
			return;
		player.getActionManager().setAction(
				new LeatherCrafting(craft, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
