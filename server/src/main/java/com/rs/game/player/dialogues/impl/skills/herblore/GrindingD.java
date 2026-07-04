package com.rs.game.player.dialogues.impl.skills.herblore;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.herblore.Grinding;
import com.rs.game.player.actions.skills.herblore.Grinding.GrindAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

/**
 * author: Tommeh
 */

public class GrindingD extends Dialogue {
	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		GrindAction herb = (GrindAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, herb
				.getProducedHerb().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		GrindAction herb = GrindAction.getHerbByProduce(result.getProduce());
		if (herb == null)
			return;
		player.getActionManager().setAction(
				new Grinding(herb, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
