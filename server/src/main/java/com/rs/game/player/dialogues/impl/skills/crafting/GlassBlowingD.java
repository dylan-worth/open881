package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.crafting.GlassBlowing;
import com.rs.game.player.actions.skills.crafting.GlassBlowing.CraftGlassAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class GlassBlowingD extends Dialogue {
	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		CraftGlassAction craft = (CraftGlassAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, craft
				.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CraftGlassAction craft = CraftGlassAction.getBarByProduce(result
				.getProduce());
		if (craft == null)
			return;
		player.getActionManager().setAction(
				new GlassBlowing(craft, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
