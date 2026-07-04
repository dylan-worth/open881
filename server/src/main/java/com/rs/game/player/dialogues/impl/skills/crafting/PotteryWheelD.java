package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.player.actions.skills.crafting.PotteryWheel;
import com.rs.game.player.actions.skills.crafting.PotteryWheel.CreatePot;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class PotteryWheelD extends Dialogue {

	@Override
	public void start() {
		CreatePot pot = (CreatePot) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, pot.getProducedPot().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreatePot pot = CreatePot.getPotByProduce(result.getProduce());
		if(pot == null)
			return;
		player.getActionManager().setAction(new PotteryWheel(pot,result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}

