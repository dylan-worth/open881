package com.rs.game.player.dialogues.impl.skills.crafting;

import com.rs.game.item.Item;
import com.rs.game.player.actions.skills.crafting.NoxiousWeaponCreation;
import com.rs.game.player.actions.skills.crafting.NoxiousWeaponCreation.CreateWeapon;
import com.rs.game.player.content.SkillsDialogue;
import com.rs.game.player.content.SkillsDialogue.SkillDialogueResult;
import com.rs.game.player.dialogues.Dialogue;

public class NoxiousWeaponCreationD extends Dialogue {

	private Item item;

	@Override
	public void start() {
		item = (Item) parameters[0];
		CreateWeapon weapon = (CreateWeapon) parameters[1];
		SkillsDialogue.sendSkillDialogueByProduce(player, weapon
				.getProducedWeapon().getId());
	}

	@Override
	public void run(int interfaceId, int componentId)
			throws ClassNotFoundException {
		SkillDialogueResult result = SkillsDialogue.getResult(player);
		end();
		CreateWeapon weapon = CreateWeapon.getWeaponByProduce(result
				.getProduce());
		if (weapon == null)
			return;
		player.getActionManager().setAction(
				new NoxiousWeaponCreation(weapon, item, result.getQuantity()));
	}

	@Override
	public void finish() {
	}

}
