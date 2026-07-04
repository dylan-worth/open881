package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class DukeHoracio extends Dialogue {

    private int npcId = 741;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Greetings. Welcome to my castle." );
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "I seek a shield that will protect me from dragonbreath.", "Have you any quests for me?", "Where can I find money?");
            stage = 0;
        }

         else if (stage == 0) {
            switch (componentId) {

                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "I seek a shield that will protect me from dragonbreath");
                    stage = 10;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "Have you any quests for me?");
                    stage = 20;
                    break;

                case OPTION_3:
                    sendPlayerDialogue(NORMAL, "Where can I find money?");
                    stage = 30;
                    break;


            }
        }
        else if (stage == 10) {
            sendNPCDialogue(npcId, QUESTIONS, "A Knight going on a dragon quest, hmm? Sure thing");
            player.getInventory().addItem(1540, 1);
            stage = 1;
            }
        else if ( stage == 20 ) {
            sendNPCDialogue(npcId, NORMAL, "No, all is well");
            stage = 1;
        }
        else if ( stage == 30) {
            sendNPCDialogue(npcId, HAPPY, "I hear many of the local people earn money from learning a skill. Many people get by in life by becoming accomplished smiths, cooks, miners and woodcutters.");
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
