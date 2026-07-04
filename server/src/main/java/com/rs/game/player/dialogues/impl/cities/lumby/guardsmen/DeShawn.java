package com.rs.game.player.dialogues.impl.cities.lumby.guardsmen;

import com.rs.game.player.dialogues.Dialogue;

public class DeShawn extends Dialogue {
    private int npcId = 17520;
    @Override
    public void start() {
        sendPlayerDialogue(NORMAL, "Good day.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            sendNPCDialogue(npcId, NORMAL, "Well, hello there.");
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
            sendNPCDialogue(npcId, NORMAL, "I won't pretend that we're an elite fighting force, but we know how to work with the castle's defences. That means just a few of us can hold a fairly strong defence, if we ever need to again.");
            stage = 2;
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Although the battle is over, the problems of the world have not gone away. There are many people who need help nearby. Perhaps Xenia or Explorer Jack have some work!");
            stage = 2;
        }
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "It used to be much nicer here, before the Battle of Lumbridge. Sure, we had goblins raiding from time to time, but they're easy compared to Zamorakian demons!");

        }
        else if (stage == 40) {
            sendNPCDialogue(npcId, NORMAL, "We work for the safety of the people and the Duke, and must be vigilant at all times against potential threats, be they acts of god or goblin invasion.");
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
