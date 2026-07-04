package com.rs.game.player.dialogues.impl.skills.magic;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.magic.BoltEnchanting;
import com.rs.game.player.actions.skills.magic.BoltEnchanting.EnchantAction;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class BoltEnchantingD extends Dialogue {

	private Item item;

	@Override
	public void start() {
		EnchantAction enchant = (EnchantAction) parameters[0];
		SkillsDialogue.sendSkillDialogueByProduce(player, enchant
				.getProducedBow().getId());
	}

	@Override
	public void run(int interfaceId, int componentId) {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		EnchantAction enchant = EnchantAction.getBarByProduce(result
				.getProduce());
		if (enchant == null)
			return;
		player.getActionManager().setAction(
				new BoltEnchanting(enchant, result.getQuantity()));
	}

	@Override
	public void finish() {
	}
}