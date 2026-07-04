package com.rs.game.player.dialogues.impl.cities.varrock;

import com.rs.game.player.dialogues.Dialogue;

public class KingRoald extends Dialogue {

    private int npcId = 648;

    @Override
    public void start() {
        sendOptionsDialogue("What do you want to do?:", "Ask about the kingdom.", "Greet the king.", "I don't have anything more to talk about, actually. ");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(NORMAL, "Greetings, your majesty. How fares the kingdom?");
                stage = 0;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Greetings, your majesty.");
                stage = 10;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "I don't have anything more to talk about, actually.");
                stage = 20;
                break;
            }
        }
        else if (stage == 0) {
            sendNPCDialogue(npcId, NORMAL, "The kingdom is at peace again after the battle of Lumbridge! I'm glad to see Saradomin and Zamorak are both gone from there now. I really hope that sort of thing doesn't happen again in my kingdom! There is a lot to tidy up! So as you can see I'm very busy right now. Please don't waste my time.");
            stage = 30;
        }
        else if (stage == 10) {
            sendNPCDialogue(npcId, NORMAL, "Do you have anything of importance to say?");
            stage = 11;
        }
        else if (stage == 11) {
            sendPlayerDialogue(NORMAL, "...Not really.");
            stage = 12;
        }
        else if (stage == 12) {
            sendNPCDialogue(npcId, NORMAL, "You will have to excuse me, I am very busy. I must keep a fixed eye on Morytania to the east.");
            stage = 13;
        }
        else if (stage == 13) {
            sendPlayerDialogue(QUESTIONS, "Or both eyes, perhaps?");
            stage = 14;
        }
        else if (stage == 14 ) {
            sendNPCDialogue(npcId, NORMAL, "Indeed, we cannot all be heroes, wandering from one crisis to another. Ever since Kara-Meir and her friends became famous, adventuring has become a career of choice amongst our youth. Yet, people forget that her tale is a cautionary one.");
            stage = 15;
        }
        else if (stage == 15) {
            sendPlayerDialogue(NORMAL, "Why? What happened to her?");
            stage = 16;
        }
        else if (stage == 16) {
            sendNPCDialogue(npcId, NORMAL, "She withheld important information about one of her associates, and it very nearly led to disaster for all of us: every man, woman and child.");
            stage = 17;
        }
        else if (stage == 17) {
            sendPlayerDialogue(NORMAL, "And?");
            stage = 18;
        }
        else if (stage == 18) {
            sendNPCDialogue(npcId, NORMAL, "And what? I have spent enough time on you, adventurer. You will have to excuse me, I have a kingdom to run.");
            stage = 30;
        }


        else if (stage == 20) {
            sendNPCDialogue(npcId, ANGERY, "Then begone; I am a busy man.");
            stage = 30;
        }

        else if (stage == 30) {
            end();
        }
    }


    @Override
    public void finish() {

    }
}
