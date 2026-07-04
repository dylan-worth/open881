package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Roddeck extends Dialogue {

    /* If you would like to learn Dialogue, check out my guide under the Notes Folder.
    @author Dylan W
     */
    private int npcId = 7909;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Greetings! I am Roddeck. What can I do for you today?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "Who are you?", "Can you offer advice?", "Nothing, thanks.");
            stage = 0;
        }
        else if (stage == 0){
            switch (componentId){
                case OPTION_1: sendPlayerDialogue(NORMAL, "Who are you?");
                stage = 10;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Can you offer advice?");
                stage = 20;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "Nothing, thanks.");
                stage = 1;
                break;

            }
        }

        //Option 1:

        else if (stage == 10) {
            sendNPCDialogue(npcId, HAPPY, "My name is Roddeck. I'm just an elderly gentleman of Lumbridge, and this is my house.");
            stage = 11;
        }
        // Option 2:

        else if (stage == 20) {
            sendNPCDialogue(npcId, HAPPY, "Advice? Certainly, certainly! Use the Task System to help you find your feet, that's my advice.");
            stage = 11;
        }

        // Response to wrap back to Options.
        else if (stage == 11) {
            sendNPCDialogue(npcId, QUESTIONS, "Now, was there anything else you wanted?");
            stage = -1;
        }
        else if (stage == 1) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
