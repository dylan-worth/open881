package com.rs.game.player.dialogues.impl.cities.catherby;

import com.rs.game.player.Skills;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Hickton extends Dialogue {

    private int npcId = 575;

    @Override
    public void start() {
    sendNPCDialogue(npcId, HAPPY, "Welcome to Hickton's Archery Emporium. Do you want to see my wares?");
    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if (stage == -1) {
            if (player.getSkills().hasRequiriments(Skills.FLETCHING, 99)) {
                sendOptionsDialogue("Choose One:", "Yes, please.", "Can you sell me a Fletching Skillcape? ", "No, I prefer to bash things close up.");
                stage = 0;
            } else { if (!player.getSkills().hasRequiriments(Skills.FLETCHING, 99)) {
                sendOptionsDialogue("Choose One:", "Yes, please.", "No, I prefer to bash things close up.");
                stage = 20;
            }

            }
    }
    // Sloppy way to do this, will need to rewrite but with 99 Fletching.
    else if (stage == 0) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(HAPPY, "Yes, please.");
                stage = 1;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL,"Can you sell me a Fletching Skill Cape?");
                stage = 5;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "No, I prefer to bash things ");
                stage = 15;
                break;
            }

        }
    // Sloppy way to do this, will need to rewrite but without 99 fletching.
    else if (stage == 20) {
        switch (componentId) {

            case OPTION_1: sendPlayerDialogue(HAPPY, "Yes, please.");
                stage = 1;
                break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "No, I prefer to bash things ");
                stage = 15;
                break;
        }
    }

    else if (stage == 1) {
        ShopsHandler.openShop(player, 59);
        end();
    }
    else if (stage == 5) {
        sendNPCDialogue(npcId, NORMAL, "For a fletcher of your calibre? I'm afraid such things do not come cheaply. They cost 99,000 coins, to be precise! ");
        stage = 6;
    }
    else if (stage == 6) {
        sendOptionsDialogue("Choose one:", "99,000 coins? That's much too expensive.", "I think I have the money right here, actually.");
        stage = 7;
    }
    else if (stage == 7) {
        switch(componentId) {

            case OPTION_1: sendPlayerDialogue(NORMAL, "99,000 coins? That's much too expensive.");
            stage = 8;
            break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "I think I have the money right here, actually.");
            stage = 10;
            break;

        }
    }
    else if (stage == 8) {
        sendNPCDialogue(npcId, NORMAL, "Not at all; there are many other adventurers who would love the opportunity to purchase such a prestigious item! You can find me here if you change your mind.");
        stage = 15;
    }
    else if (stage == 10) {
        if(player.getInventory().containsItem(995, 99000)) {

            sendNPCDialogue(npcId, HAPPY, "Excellent! Wear that cape with pride my friend.");
            player.getInventory().deleteItem(995, 99000);
            player.getInventory().addItem(9783, 1);
            player.getInventory().addItem(9785, 1);
            stage = 15;

            /* It needs a check to see if the player has one or more to determine, but It is late af rn and don't feel like
             typing.

             */
        }
        else if (!player.getInventory().containsItem(995, 99000)) {
            sendPlayerDialogue(SAD, "But, unfortunately, I was mistaken.");
            stage = 15;
        }
    }
    else if (stage == 15) {
        end();
    }


    }

    @Override
    public void finish() {

    }
}
