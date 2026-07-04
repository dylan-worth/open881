package com.rs.game.player.dialogues.impl.cities.draynorvillage;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Olivia extends Dialogue {

    private int npcId = 2233;
    @Override
    public void start() {

        sendOptionsDialogue("Choose one:", "Would you like to trade?", "Where do I get higher-level seeds?", "About the recent bank robbery?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {

        if (stage == -1) {
            switch (componentId) {

                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "Would you like to trade?");
                    stage = 0;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "Where do I get higher-level seeds?");
                    stage = 10;
                    break;

                case OPTION_3:
                    sendPlayerDialogue(NORMAL, "About the recent bank robbery... The robber attacked you, didn't he? ");
                    stage = 20;
                    break;

            }
        } else if (stage == 0) {
            sendNPCDialogue(npcId, NORMAL, "Certainly");
            stage = 1;
        } else if (stage == 1) {
            ShopsHandler.openShop(player, 99);
            end();
        } else if (stage == 10) {
            sendNPCDialogue(npcId, NORMAL, "Master farmers usually carry a few higher-level seeds around with them, although I don't know if they'd want to part with them for any price, to be honest.");
            stage = 11;
        } else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Something like that, yes. I was just minding my own business, trying to keep these pesky thieves off my stalls, when I heard a strange noise and a scream.");
            stage = 21;
        } else if (stage == 21) {
            sendNPCDialogue(npcId, NORMAL, "I went across to see what was going on, but there was a bright purple flash and everything went black. Before I knew what had happened, I was standing in Falador!");
            stage = 22;
        } else if (stage == 22) {
            sendNPCDialogue(npcId, NORMAL, "It took me ages to get back, and when I arrived I saw there was a huge hole in the bank wall and some of the bankers had been killed! ");
            stage = 23;
        } else if (stage == 23) {
            sendPlayerDialogue(NORMAL, "Did you see who teleported you to Falador? ");
            stage = 24;
        } else if (stage == 24) {
            sendNPCDialogue(npcId, NORMAL, "No, they were standing behind that old man's door.");
            stage = 25;
        } else if (stage == 25) {
            sendNPCDialogue(npcId, NORMAL, "He really shouldn't leave his door open all day, especially in this neighbourhood - there are thousands of thieves around, and anyone could wander in! ");
            stage = 26;
        } else if (stage == 26) {
            sendPlayerDialogue(NORMAL, "Okay, thanks for your time. ");
            stage = 27;
        } else if (stage == 27) {
            sendNPCDialogue(npcId, NORMAL, "You're welcome. Would you like to see my fine selection of seeds? ");
            stage = 28;
        } else if (stage == 28) {
            sendOptionsDialogue("Choose One:", "Yes please.", "No thanks.");
            stage = 29;
        }
        else if (stage == 29) {
            switch (componentId) {

                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "Yes Please.");
                    stage = 2;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "No thanks");
                    stage = 11;
                    break;

            }
        }
        else if (stage == 11) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
