package com.rs.game.player.dialogues.impl.cities.lumby.guardsmen;

import com.rs.game.player.dialogues.Dialogue;

public class Dante extends Dialogue {
    private int npcId = 17519;
    @Override
    public void start() {
        sendPlayerDialogue(NORMAL, "Greetings.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            sendNPCDialogue(npcId, NORMAL, "Well met, adventurer.");
            stage = 0;
        }
        else if (stage == 0){
            sendOptionsDialogue("Choose One:", "Tell me more about the Lumbridge Guardsmen.", "What is there to do around here?", "Tell me about Lumbridge.","What are you guarding?", "Bye.");
            stage = 1;
        }
        else if (stage == 1){
            switch(componentId){

                case OPTION_1: sendPlayerDialogue(NORMAL, "Tell me more about the Lumbridge Guardsmen.");
                    stage = 10;
                    break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "What is there to do around here?");
                    stage = 20;
                    break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "Tell me about Lumbridge.");
                    stage = 30;
                    break;

                case OPTION_4: sendPlayerDialogue(NORMAL, "What are you guarding?");
                    stage = 40;
                    break;

                case OPTION_5: sendPlayerDialogue(NORMAL, "Bye.");
                    stage = 2;
                    break;
            }
        }
        else if (stage == 10) {
            sendNPCDialogue(npcId, NORMAL, "I spoke to a few people who asked me about signing up for the guardsmen. To be asked, you need to be a true local. I mean, when the call to arms was raised, our troops were waiting here, ready for action.");
            stage = 2;
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "The battlefield is not the only threat to Lumbridge. Goblins have invaded to the east, and we could use your help to keep the numbers down!");
            stage = 2;
        }
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "Lumbridge used to be a safe haven where you could find your feet. It is safe again now, but I wonder if we will ever recover what we've lost.");

        }
        else if (stage == 40) {
            sendNPCDialogue(npcId, NORMAL, "We guard the castle against any resurgence in fighting, such as the Battle of Lumbridge. We must always be ready, especially in these troubled times.");
            stage = 2;
        }
        else if (stage == 2) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}


