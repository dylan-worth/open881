package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public abstract class BondsD extends Dialogue {

	/**
	 * @author: Pax M
	 */

	@Override
	public void start() {
		stage = 1;
		sendOptionsDialogue("Convert into what?", "Donator credits/points",
				"Nothing.");
	}

	@Override
	public void run(int interfaceId, int componentId, int slotId) {
		switch (stage) {
		case -1:
			end();
			break;
		case 1:
			switch (componentId) {
			case OPTION_1:
				player.getDonationManager().handleBond();
				break;
			case OPTION_2:
				break;
			}
			end();
			break;
		}
	}

	@Override
	public void finish() {

	}
}