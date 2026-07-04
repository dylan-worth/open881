package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.player.actions.skills.crafting.Looming;
import com.rs.game.player.actions.skills.crafting.Looming.CreateCape;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class LoomingD extends Dialogue {

	@Override
	public void start() {
		CreateCape cape = (CreateCape) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, cape.getProducedBar()
				.getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreateCape cape = CreateCape.getBarByProduce(result.getProduce());
		if (cape == null)
			return;
		player.getActionManager().setAction(
				new Looming(cape, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
