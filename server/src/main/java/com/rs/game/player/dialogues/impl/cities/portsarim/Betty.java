package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Betty extends Dialogue {

    private int npcId = 583;
    @Override
    public void start() {
            sendNPCDialogue(npcId, HAPPY, "Welcome to the magic emporium.");
            stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "Can I see your wares?", "Sorry, I'm not into magic. ");
            stage = 0;
        }
        else if (stage == 0){
            switch (componentId){
                case OPTION_1: sendPlayerDialogue(NORMAL, "Can I see your wares?");
                stage = 10;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Sorry, I'm not into magic.");
                stage = 20;
                break;
            }
        }
        else if (stage == 10) {
            ShopsHandler.openShop(player, 34);
            end();
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Well, if you see anyone who is into magic, please send them my way.");
            stage = 21;
        }
        else if (stage == 21) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
