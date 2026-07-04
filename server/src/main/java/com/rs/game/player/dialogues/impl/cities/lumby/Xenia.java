package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Xenia extends Dialogue {

    private int npcId = 9633;
    @Override
    public void start() {
            sendNPCDialogue(npcId, HAPPY, "Hello again, Adventurer.");
            stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendNPCDialogue(npcId, HAPPY, "I hear you learned Bob the Cat's secret. You're part of an exclusive club.");
            stage = 0;
        }
        else if (stage == 0){
            sendNPCDialogue(npcId, HAPPY, "I grew up hearing stories of Robert the Strong. To think that he was real, and he's living among us...");
            stage = 1;
        }
        else if (stage == 1){
            sendNPCDialogue(npcId, LAUGHING, "Hah. Maybe in a few thousand years you'll be a cat, or I will, and some future adventurer will learn our secrets.");
            stage = 2;
        }
        else if (stage == 2){
            end();
        }
    }

    @Override
    public void finish() {

    }
}
