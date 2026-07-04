package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.player.actions.skills.crafting.RobustGlass;
import com.rs.game.player.actions.skills.crafting.RobustGlass.CreateGlass;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class RobustGlassD extends Dialogue {

	@Override
	public void start() {
		CreateGlass glass = (CreateGlass) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, glass
				.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreateGlass bar = CreateGlass.getBarByProduce(result.getProduce());
		if (bar == null)
			return;
		player.getActionManager().setAction(
				new RobustGlass(bar, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
