package com.rs.game.player.dialogues.impl.cities.catherby;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class CandleMaker extends Dialogue {

    private int npcId = 562;
    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "Ah, you again. You're quite a trend setter. Can't believe the number of black candle requests I've had since you came. I couldn't pass up a business opportunity like that, bad luck or no. So I'm selling them now. Would you be interested in some of my fine candles?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if (stage == -1 ) {
        sendOptionsDialogue("Choose an Option:", "Yes Please", "No thank you.");
        stage = 0;
    }
    else if (stage == 0) {
        switch (componentId) {

            case OPTION_1: sendPlayerDialogue(NORMAL, "Yes Please");
            stage = 1;
            break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "No thank you");
            stage = 10;
            break;
        }
    }
    else if (stage == 1) {
        ShopsHandler.openShop(player, 60);
        end();
    }
    else if ( stage == 10) {
        end();
    }
    }

    @Override
    public void finish() {

    }
}
