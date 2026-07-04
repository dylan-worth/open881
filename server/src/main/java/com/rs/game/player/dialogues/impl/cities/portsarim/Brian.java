package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Brian extends Dialogue {

   private int npcId = 559;
    @Override
    public void start() {
        sendOptionsDialogue("Choose One:", "So, are you selling something?", "Ello");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            switch (componentId){

                case OPTION_1: sendPlayerDialogue(NORMAL, "So, are you selling something?");
                stage = 10;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Ello");
                stage = 20;
                break;
            }

        }
        else if (stage == 10) {
                sendNPCDialogue(npcId,NORMAL,"Yep, take a look at these great axes.");
                stage = 11;
        }
        else if (stage == 11){
            ShopsHandler.openShop(player, 33);
            end();
        }
        // Option 2:

        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Ello");
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
