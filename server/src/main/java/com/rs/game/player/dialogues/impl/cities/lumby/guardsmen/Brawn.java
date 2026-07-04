package com.rs.game.player.dialogues.impl.cities.lumby.guardsmen;

import com.rs.game.player.dialogues.Dialogue;

public class Brawn extends Dialogue {
    private int npcId = 17521;
    @Override
    public void start() {
        sendPlayerDialogue(NORMAL, "Howdy.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            sendNPCDialogue(npcId, NORMAL, "Good day to you, adventurer.");
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
            sendNPCDialogue(npcId, NORMAL, "The Guardsmen are mainly local farmers who come to the town's defence in hours of need. We were here and ready, for example, when Saradomin and Zamorak fought the Battle of Lumbridge.");
            stage = 2;
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "If you want to train your creative skills, there are trees to cut, or you could collect leather from the cow fields to the east.");
            stage = 2;
        }
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "Lumbridge was devastated by the battle between Zamorak and Saradomin. I'm glad it's over, and we have a chance to rebuild.");

        }
        else if (stage == 40) {
            sendNPCDialogue(npcId, NORMAL, "Although we are in a time of relative peace, the Battle of Lumbridge taught us that we always need to be prepared for any eventually.");
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
