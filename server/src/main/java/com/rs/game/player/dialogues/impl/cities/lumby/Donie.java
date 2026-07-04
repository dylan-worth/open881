package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Donie extends Dialogue {

    /* If you would like to learn Dialogue, check out my guide under the Notes Folder.
    @author Dylan W
     */

    private int npcId = 2238;
    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "Hello there, can I help you?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "Where am I?", "How are you today?", "Are there any quests I can do here?", "What's happened here lately?", "Your shoe lace is untied.");
            stage = 0;
        } else if (stage == 0) {
            switch (componentId) {

                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "Where am I?");
                    stage = 10;
                    break;
                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "How are you today?");
                    stage = 20;
                    break;
                case OPTION_3:
                    sendPlayerDialogue(NORMAL, "Are there any quests I can do here?");
                    stage = 30;
                    break;
                case OPTION_4:
                    sendPlayerDialogue(NORMAL, "What's happened here lately?");
                    stage = 40;
                    break;
                case OPTION_5:
                    sendPlayerDialogue(NORMAL, "Your shoe lace is untied.");
                    stage = 50;
                    break;
            }
        }

        // Option 1:

        else if (stage == 10) {
            sendNPCDialogue(npcId, NORMAL, "This is the town of Lumbridge my friend.");
            stage = -1;
        }

        // Option 2:
        else if (stage == 20){
            sendNPCDialogue(npcId, HAPPY, "Aye, not too bad thank you. Lovely weather in Gielinor this fine day.");
            stage = 21;
        }
        else if (stage == 21) {
            sendPlayerDialogue(QUESTIONS, "Weather?");
            stage = 22;
        }
        else if (stage == 22){
            sendNPCDialogue(npcId, NORMAL, "Yes weather, you know. The state or condition of the atmosphere at a time and place, with respect to variables such as temperature, moisture, wind velocity, and barometric pressure.");
            stage = 23;
        }
        else if (stage == 23){
            sendPlayerDialogue(NORMAL, "...");
            stage = 24;
        }
        else if (stage == 24) {
            sendNPCDialogue(npcId, LAUGHING, "Not just a pretty face eh? Ha ha ha.");
            stage = 1;
        }

        //Option 3: This will become more Authentic if Quests are ever added.

        else if (stage == 30) {
            sendNPCDialogue(npcId, HAPPY, "No Quests are added in Open881 currently!");
            stage = 31;
        }
        else if (stage == 31 ){
            sendNPCDialogue(npcId, HAPPY, "If you really want a personal achievement, you should try fletching 1,000,000 arrowshafts like Dylan did in 2009scape.");
            stage = 1;
        }


        //Option 4:

        else if (stage == 40 ) {
            sendNPCDialogue(npcId, NORMAL, "Lumbridge has recently been damaged by a battle between Saradomin and Zamorak in the crater to the west of the castle. The battle is over now, though. There's a Saradominist zealot keeping vigil there now.");
            stage = 1;
        }

        //Option 5:

        else if (stage == 50) {
            sendNPCDialogue(npcId, UPSET, "No it's not!");
            stage = 51;
        }
        else if (stage == 51) {
            sendPlayerDialogue(HAPPY, "No you're right. I have nothing to back that up.");
            stage = 52;
        }
        else if (stage == 52 ) {
            sendNPCDialogue(npcId, ANGRY, "Fool! Leave me alone!");
            stage = 1;
        }

        // End

        else if (stage == 1){
            end();
        }
    }


    @Override
    public void finish() {

    }
}

