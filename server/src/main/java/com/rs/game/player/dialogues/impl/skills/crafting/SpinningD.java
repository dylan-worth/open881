package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.player.actions.skills.crafting.Spinning;
import com.rs.game.player.actions.skills.crafting.Spinning.CreateSpin;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class SpinningD extends Dialogue {

	@Override
	public void start() {
		CreateSpin cape = (CreateSpin) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, cape
				.getProducedItem().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreateSpin cape = CreateSpin.getSpinByProduce(result.getProduce());
		if (cape == null)
			return;
		player.getActionManager().setAction(
				new Spinning(cape, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
