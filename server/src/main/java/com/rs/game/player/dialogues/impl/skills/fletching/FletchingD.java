package com.rs.game.player.dialogues.impl.skills.fletching;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.fletching.Fletching;
import com.rs.game.player.actions.skills.fletching.Fletching.FletchAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class FletchingD extends Dialogue {

	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		FletchAction fletch = (FletchAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, fletch
				.getProducedBow().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		FletchAction fletch = FletchAction.getBarByProduce(result.getProduce());
		if (fletch == null)
			return;
		player.getActionManager().setAction(
				new Fletching(fletch, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
