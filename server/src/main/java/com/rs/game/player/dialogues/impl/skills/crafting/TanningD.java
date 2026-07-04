package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.player.actions.skills.crafting.Tanning;
import com.rs.game.player.actions.skills.crafting.Tanning.TanningData;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class TanningD extends Dialogue {

	public int type;
	public boolean dungeoneering;
	private int npcId;

	@Override
	public void start() {
		npcId = (int) parameters[0];
		TanningData bar = (TanningData) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, bar.getProducedBar()
				.getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		TanningData bar = TanningData.getBarByProduce(result.getProduce());
		if (bar == null)
			return;
		player.getActionManager().setAction(
				new Tanning(bar, npcId, result.getQuantity()));
		System.out.println(result.getQuantity());
	}

	@Override
	public void finish() {

	}
}