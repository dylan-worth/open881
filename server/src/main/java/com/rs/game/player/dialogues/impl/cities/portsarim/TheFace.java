package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;

public class TheFace extends Dialogue {

    private int npcId = 2950;
    @Override
    public void start() {
            sendPlayerDialogue(NORMAL, "Hello");
            stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendDialogue("She looks through you as if you don't exist.");
            stage = 0;
        }
        else if (stage == 0){
            end();
        }

    }

    @Override
    public void finish() {

    }
}
