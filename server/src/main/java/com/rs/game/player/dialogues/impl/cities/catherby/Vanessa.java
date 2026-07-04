package com.rs.game.player.dialogues.impl.cities.catherby;

import com.rs.game.constants.Shops;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Vanessa extends Dialogue {

    private int npcId = 2305;
    @Override
    public void start() {
    sendNPCDialogue(npcId, NORMAL, "Hello. How can I help you?");
    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if ( stage == -1 ) {
        sendOptionsDialogue("Select an option", "What are you selling?", "Can you give me any farming advice?", "I'm okay, thank you.");
        stage = 0;
    }
    else if ( stage == 0 ) {
        switch (componentId) {

            case OPTION_1: sendPlayerDialogue(NORMAL, "What are you selling?");
            stage = 1;
            break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "Can you give me any farming advice?");
            stage = 10;
            break;

            case OPTION_3: sendPlayerDialogue(NORMAL, "I'm okay, thank you");
            stage = 5;
            break;
        }
    }
    else if (stage == 1) {
        ShopsHandler.openShop(player, Shops.VANESSAS_FARMING_SHOP);
        end();
    }
    else if ( stage == 10) {
        sendNPCDialogue(npcId, NORMAL, "Yes - ask a gardener");
        stage = 5;
    }
    else if ( stage == 5) {
        end();
    }
    }

    @Override
    public void finish() {

    }
}
