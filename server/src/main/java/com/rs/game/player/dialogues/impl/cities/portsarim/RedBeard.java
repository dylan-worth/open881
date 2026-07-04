package com.rs.game.player.dialogues.impl.cities.portsarim;

import com.rs.game.player.dialogues.Dialogue;

public class RedBeard extends Dialogue {

   private int npcId = 375;

    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "Arr, Matey!");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ){
            sendOptionsDialogue("Choose One:", "Arr!", "Do you have anything for trade?", "Ask about Task System");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId) {
                case OPTION_1: sendPlayerDialogue(NORMAL, "Arr!");
                stage = 1;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Do you have anything to trade?");
                stage = 10;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "Tell me about the Achievement System.");
                stage = 20;
                break;
            }

        }
        else if (stage == 1) {
            sendNPCDialogue(npcId, NORMAL, "Arr!");
            stage = 0;

        }
        else if (stage == 10) {
            sendNPCDialogue(npcId, NORMAL, "Nothin' at the moment, but then again the Customs Agents are on the warpath right now.");
            stage = 3;
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Arr! Matey!, Open881 is still working on the Task Systems.");
            stage = 3;
        }
        else if (stage == 3) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
