package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Wydin extends Dialogue {

    private int npcId = 557;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Welcome to my food store! Would you like to buy anything?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:","Yes, please", "No, thank you.", "What can you recommend?");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(NORMAL, "Yes, please.");
                    stage = 10;
                    break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "No, thank you.");
                    stage = 20;
                    break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "What can you recommend?");
                    stage = 30;
                    break;
            }

        }

        else if (stage == 10){
            ShopsHandler.openShop(player, 30);
            end();
        }
        // Option 2:

        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "No, thank you.");
            stage = 15;
        }

        // Option 3:
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "We have this really exotic fruit all the way from Karamja. It's called a banana.");
            stage = 31;

        }
        else if (stage == 31 ) {
            sendOptionsDialogue("Choose One:", "Hmm, I think I'll try one.", "I don't like the sound of that.");
            stage = 32;
        }
        else if (stage == 32) {
            switch (componentId) {
                case OPTION_1: sendPlayerDialogue(NORMAL, "Hmm, I think I'll try one.");
                stage = 40;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL,"I don't like the sound of that");
                stage = 50;
                break;
            }
        }
        else if (stage == 40) {
            ShopsHandler.openShop(player, 30);
            end();
        }
        else if (stage == 50) {
            sendNPCDialogue(npcId, NORMAL, "Well, it's your choice, but I do recommend them.");
            stage = 15;
        }
        else if (stage == 15){
            end();
        }
    }

    @Override
    public void finish() {

    }
}
