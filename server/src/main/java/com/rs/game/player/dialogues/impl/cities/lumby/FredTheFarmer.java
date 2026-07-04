package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class FredTheFarmer extends Dialogue {

    private int npcId = 758;

    @Override
    public void start() {
        sendNPCDialogue(npcId, ANGRY, "What are you doing on my land?");
        stage = -1;


    }

    @Override
    public void run(int interfaceId, int componentId) {

        // npcId is defined at the top, Face expressions are defined under Dialogue.java, Quoted text comes from RS3.

        if (stage == -1) {
            sendNPCDialogue(npcId, ANGRY, "You're not the one who keeps leaving all my gates open?");
            stage = 0;
        } else if (stage == 0) {
            sendNPCDialogue(npcId, ANGRY, "And letting out all my sheep? ");
            stage = 1;
        } else if (stage == 1) {
            sendNPCDialogue(npcId, ANGRY, "And letting out all my sheep? ");
            stage = 2;
        } else if (stage == 2) {
            sendOptionsDialogue("Choose One", "I'm looking for something to kill", "I'm lost", "Nevermind");
            stage = 3;
        } else if (stage == 3) {
            switch (componentId) {
                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "I'm looking for something to kill");
                    stage = 10;
                    break;
                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "I'm lost.");
                    stage = 20;
                    break;
                case OPTION_3:
                    stage = 30;
                    break;

            }

        } else if (stage == 10) {
            sendNPCDialogue(npcId, ANGRY, "What on my land?");
            stage = 11;
        } else if (stage == 11) {
            sendNPCDialogue(npcId, ANGRY, "Leave my livestock alone you scoundrel");
            stage = 4;
        } else if (stage == 20) {
            sendNPCDialogue(npcId, CONFUSED, "Just follow the road east and south");
            stage = 21;
        } else if (stage == 21) {
            sendNPCDialogue(npcId, CONFUSED, "You'll end up in Lumbridge fairly quickly");
            stage = 4;
        }
        else if (stage == 30){
            sendPlayerDialogue(NORMAL, "Nevermind.");
            stage = 4;
        }
        else if (stage == 4) {
            end();
        }
    }





        @Override
        public void finish () {

        }
    }

