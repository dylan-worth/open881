package com.rs.game.player.dialogues.impl.outskirts;

import com.rs.game.player.dialogues.Dialogue;

public class Morris extends Dialogue {
    @Override
    public void start() {
        if (!player.getInventory().containsItem(27, 1)) {
            sendNPCDialogue(npcId, NORMAL, "Competition pass please.");
            stage = -1;
        }
        else if (player.getInventory().containsItem(27, 1)) {
            sendDialogue("I'm not sure how you obtained this item, but this area is not currently implemented.");
            stage = 10;
        }
    }


    private int npcId = 227;

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if(stage == -1) {
            sendPlayerDialogue(NORMAL, "I don’t have one of them.");
            stage = 0;
        }
        else if (stage == 0) {
            sendNPCDialogue(npcId, NORMAL, "Oh well. I can’t let you pass then.");
            stage = 1;
        }
        else if (stage == 1) {
            sendPlayerDialogue(NORMAL, "What do I need that for?");
            stage = 2;
        }
        else if (stage == 2) {
            sendNPCDialogue(npcId, NORMAL, "This is the entrance to the Hemenster fishing competition. It’s a high class competition. Invitation only.");
            stage = 10;
        }
        else if (stage == 10){
            end();
        }
    }

    @Override
    public void finish() {

    }
}
