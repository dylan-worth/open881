package com.rs.game.player.dialogues.impl;

import com.rs.game.player.dialogues.Dialogue;

public class HcIronmanLifes extends Dialogue {
	//credits timelord

	@Override
	public void finish() {

	}
	
	@Override
	public void start() {
		sendOptionsDialogue("What would you like to do?", "Buy an Hardcore iron man life", "No, get me out of here!");
		stage = 1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch (stage) {//yeye it's fine
		case 1:
			stage = 1;
			if (componentId == OPTION_1) {
                if (player.isHardcoreIronman()) {
				if (player.getDivineCoin()) {
					player.getPackets().sendGameMessage("You already have an Harcore iron man life,"//
							+ "It is not possible for you to have several lifes!");
					end();
					break;
				} else {
					if (!player.getInventory().containsItem(995, 10000000)) {
						sendNPCDialogue(npcId, 8808, "You need 10,000,000 Coins to buy a life");
						end();
						return;
					} else {
					player.setDivineCoin(true);
					player.getInventory().deleteItem(995, 10000000);
					player.getPackets().sendGameMessage("10 million coins has been removed from youre inventory");
					stage = 2;
					end();
					break;
					}
				}
              }
           }
					case 2:
					  if (componentId == OPTION_2) {
						  sendNPCDialogue(npcId, 9827, "Alright warrior, i will let you go for now!"
						  		+ "Hardcore Ironman or woman life's are very important"
						  		+ "Don't miss out the sale!");
							end();
							break;
				}
            }
		}
}