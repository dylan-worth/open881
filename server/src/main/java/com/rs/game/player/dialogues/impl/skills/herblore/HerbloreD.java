package com.rs.game.player.dialogues.impl.skills.herblore;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.herblore.Herblore;
import com.rs.game.player.actions.skills.herblore.Herblore.CleanAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

/**
 * author: Tommeh
 */

public class HerbloreD extends Dialogue {

	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		CleanAction herb = (CleanAction) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, herb
				.getProducedHerb().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CleanAction herb = CleanAction.getHerbByProduce(result.getProduce());
		if (herb == null)
			return;
		player.getActionManager().setAction(
				new Herblore(herb, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
