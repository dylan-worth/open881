package com.rs.game.player.dialogues.impl.skills.runecrafting;

import com.rs.game.player.actions.skills.runecrafting.TectonicCrafting;
import com.rs.game.player.actions.skills.runecrafting.TectonicCrafting.CraftTectonicAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class TectonicCraftingD extends Dialogue {

	@Override
	public void start() {
		CraftTectonicAction craft = (CraftTectonicAction) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, craft
				.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId)
			throws ClassNotFoundException {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CraftTectonicAction craft = CraftTectonicAction.getBarByProduce(result
				.getProduce());
		if (craft == null)
			return;
		player.getActionManager().setAction(
				new TectonicCrafting(craft, result.getQuantity()));
	}

	@Override
	public void finish() {
	}

}
