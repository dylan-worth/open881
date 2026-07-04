package com.rs.game.player.dialogues.impl.skills.fletching;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.fletching.ArrowFletching;
import com.rs.game.player.actions.skills.fletching.ArrowFletching.FletchArrowAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class ArrowFletchingD extends Dialogue {
	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		FletchArrowAction fletch = (FletchArrowAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, fletch
				.getProducedBow().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		FletchArrowAction fletch = FletchArrowAction.getBarByProduce(result
				.getProduce());
		if (fletch == null)
			return;
		player.getActionManager().setAction(
				new ArrowFletching(fletch, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
