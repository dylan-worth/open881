package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.WorldObject;
import com.rs.game.player.actions.skills.crafting.BowlSinging;
import com.rs.game.player.actions.skills.crafting.BowlSinging.CreateCrystal;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class BowlSingingD extends Dialogue {

	private WorldObject object;

	@Override
	public void start() {
		object = (WorldObject) parameters[0];
		CreateCrystal crystal = (CreateCrystal) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, crystal
				.getProducedBar().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreateCrystal crystal = CreateCrystal.getBarByProduce(result
				.getProduce());
		if (crystal == null)
			return;
		player.getActionManager().setAction(
				new BowlSinging(crystal, object, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}
