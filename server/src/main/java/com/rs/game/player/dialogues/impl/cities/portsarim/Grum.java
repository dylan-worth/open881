package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Grum extends Dialogue {

    private int npcId = 556;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Would you like to buy or sell some gold jewellery?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:","Yes, please", "No, I'm not that rich.");
            stage = 0;
        }
        if (stage == 0) {
            switch (componentId){

                case OPTION_1: sendPlayerDialogue(NORMAL, "Yes, please.");
                    stage = 10;
                    break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "No, I'm not that rich.");
                    stage = 20;
                    break;
            }

        }

        else if (stage == 10){
            ShopsHandler.openShop(player, 32);
            end();
        }
        // Option 2:

        else if (stage == 20) {
            sendNPCDialogue(npcId, MAD, "Get out, then! We don't want any riff-raff in here.");
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
