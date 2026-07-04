package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class ExplorerJack extends Dialogue {

    private int npcId = 7969;

    @Override
    public void start() {
        sendPlayerDialogue(HAPPY, "Hello, are there any tasks you have for me?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
            if (stage == -1) {
                sendNPCDialogue(npcId, NORMAL, "No, not yet, but check back after you see it in the update log for open881!");
                stage = 0;
            }
            else if (stage == 0) {
                end();
            }
    }

    @Override
    public void finish() {

    }
}
