package com.rs.game.player.dialogues.impl.cities.varrock;

import com.rs.game.player.dialogues.Dialogue;

public class CaptainRovin extends Dialogue {

    private int npcId = 884;
    @Override
    public void start() {
    sendNPCDialogue(npcId, NORMAL, "What are you doing here? Only palace guards are allowed to come up here.");
    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if (stage == -1) {
        sendPlayerDialogue(NORMAL, "Just exploring, really.");
        stage = 0;
    }
    else if (stage == 0) {
        sendNPCDialogue(npcId, ANGRY, "Well go and do it somewhere else!" );
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
