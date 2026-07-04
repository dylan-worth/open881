package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Sigmund extends Dialogue {

    private int npcId = 2082;
    @Override
    public void start() {
        sendNPCDialogue(npcId, ANGRY, "You win this time" + player.getDisplayName() + "." + "But I will have my revenge!");
        stage = -1;
        end();
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {

    }

    @Override
    public void finish() {

    }
}
