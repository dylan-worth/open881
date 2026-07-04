package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Gerrant extends Dialogue {

    private int npcId = 12261;
    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "Welcome! You can buy fishing equipment at my store. We'll also buy anything you catch off you.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if(stage == -1) {
            sendOptionsDialogue("Choose one:", "Let's see what you've got then.", "Sorry, I'm not interested. ");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId) {
                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "Let's see what you've got then");
                    stage = 10;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "Sorry, I'm not interested.");
                    stage = 1;
                    break;
            }
        }
            else if (stage == 10){
                ShopsHandler.openShop(player, 31);
                stage = 1;
            }
            else if (stage == 1) {
                end();
        }
        }

    @Override
    public void finish() {

    }
}
