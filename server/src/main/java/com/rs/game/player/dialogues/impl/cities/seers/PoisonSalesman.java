package com.rs.game.player.dialogues.impl.cities.seers;

import com.rs.game.player.dialogues.Dialogue;

public class PoisonSalesman extends Dialogue {

    private int npcId = 820;
    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "I'm afraid I'm all sold out of poison at the moment. People know a bargain when they see it!");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            end();
        }

    }

    @Override
    public void finish() {

    }
}
