package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Cook extends Dialogue {

    private int npcId = 278;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Hello, friend, how is the adventuring going?");
        stage = -1;

    }
    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            sendOptionsDialogue("Options", "I'm getting strong and mighty. Grr", "I keep on dying", "Can I use your ranged?", "What happened to the castle?");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId) {
                case OPTION_1:
                    sendPlayerDialogue(HAPPY, "I'm getting strong and mighty. Grr.");
                    stage = 10;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(SAD, "I keep dying");
                    stage = 20;
                    break;

                case OPTION_3:
                    sendPlayerDialogue(QUESTIONS, "Can I use your ranged?");
                    stage = 30;
                    break;

                case OPTION_4:
                    sendPlayerDialogue(QUESTIONS, "What happened to the castle?");
                    stage = 40;
                    break;

            }
            //Option 1
        } else if (stage == 10 ){
                sendNPCDialogue(npcId, HAPPY, "Glad to hear it.");
                stage = 1;
            }
            //Option 2
        else if (stage == 20) {
             sendNPCDialogue(npcId, NORMAL, "Ah, well, at least you keep coming back to life too!");
             stage = 1;
        }
        //Option 3
        else if (stage == 30 ) {
            sendNPCDialogue(npcId,  HAPPY, "Go ahead! It's a very good range; it's better than most other ranges.");
            stage = 31;
        }
        else if (stage == 31) {
            sendNPCDialogue(npcId, HAPPY, "It's called the Cook-o-Matic 25 and it uses a combination of state-of-the-art temperature regulation and magic.");
            stage = 32;
        }
        else if (stage == 32) {
            sendPlayerDialogue(QUESTIONS, "Will it mean my food will burn less often?");
            stage = 33;
        }
        else if (stage == 33) {
            sendNPCDialogue(npcId, NORMAL, "As long as the food is fairly easy to cook in the first place!");
            stage = 1;
        }
        //Option 4
        else if (stage == 40) {
            sendNPCDialogue(npcId, NORMAL, "The castle really did suffer in the battle of Lumbridge. I'm glad it's over!");
            stage = 41;
        }
        else if (stage == 41 ) {
            sendNPCDialogue(npcId, HAPPY, "People came from all over the world to help rebuild, and now things are getting back to normal. I'm glad - I have important things to cook and I'm not letting anything get in the way!");
            stage = 1;
        }
        else if (stage == 1){
            end();
        }

    }

    @Override
    public void finish() {

    }
}
