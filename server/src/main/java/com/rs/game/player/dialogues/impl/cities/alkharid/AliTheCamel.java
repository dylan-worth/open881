package com.rs.game.player.dialogues.impl.cities.alkharid;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.Utils;

public class AliTheCamel extends Dialogue {


    private int npcId = 2809;
    private final String[] RandomCamel = {"If I go near that camel, it'll probably bite my hand off.", "Mmm... Looks like that camel would make a nice kebab.", "I wonder if that camel has fleas..."};

    @Override
    public void start() {
        sendOptionsDialogue("What would you like to do?", "Ask the camel about its dung.","Say something unpleasant.","Neither - I'm a polite person.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1){
            switch(componentId){
                case OPTION_1: sendPlayerDialogue(QUESTIONS, "I'm sorry to bother you, but could you spare me a little dung?");
                stage = 10;
                break;

                case OPTION_2: sendPlayerDialogue(QUESTIONS, RandomCamel[Utils.random(3)]);
                stage = 20;
                break;

                case OPTION_3:
                    player.getPackets().sendGameMessage("You decide to not be rude");
                    stage = 0;
                    break;
                }
        }
        else if (stage == 10) {
            sendNPCDialogue(npcId, CONFUSED, "Are you serious?");
            stage = 11;
        }
        else if (stage == 11) {
            sendPlayerDialogue(NORMAL, "Oh yes. If you'd be so kind...");
            stage = 12;
        }
        else if (stage == 12) {
            sendNPCDialogue(npcId, NORMAL, "Well, just you close your eyes first. I'm not doing it while you're watching me!");
            stage = 13;
        }
        else if (stage == 13) {
            sendDialogue("You close your eyes...");
            stage = 14;
        }
        else if (stage == 14) {
            sendNPCDialogue(npcId, NORMAL, "I hope that's what you wanted!");
            stage = 15;
        }
        else if (stage == 15) {
            sendPlayerDialogue(HAPPY, "Ohhh yes. Lovely.");
            stage = 0;
        }


        else if (stage == 20) {
            sendNPCDialogue(npcId,NORMAL, "Oh, it's you again. Have you come back to listen to my poems?" );
            stage = 21;
        }
        else if (stage == 21) {
            sendOptionsDialogue("Choose One","I'd love to", "No, thank you.");
            stage = 22;
        }
        else if(stage == 22 ) {
            switch (componentId){
                case OPTION_1: sendPlayerDialogue(HAPPY,"I'd love to");
                stage = 24;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "No, thank you.");
                stage = 40;
                break;
            }

        }
        else if (stage == 23){
            sendNPCDialogue(npcId, NORMAL, "Ah, well. I shall return to writing poems to Elly's beauty.");
            stage = 0;
        }
        else if (stage == 24) {
            sendNPCDialogue(npcId, HAPPY, "That's so kind of you. Which one would you like to hear? 'Shall I compare thee to a Desert's Day' is my finest yet, but I've also composed others.");
            stage = 25;
        }
        else if (stage == 25){
            sendOptionsDialogue("Choose One:", "Listen to 'Shall I compare thee to a Desert's Day'. ", "Listen to 'This is just to say'. ");
            stage = 26;
        }
        else if (stage == 26) {
            switch (componentId) {
                case OPTION_1: sendNPCDialogue(npcId, HAPPY, "That's my favourite poem. Ahem..."); stage = 27; break;
                case OPTION_2: sendNPCDialogue(npcId, HAPPY, "I wrote this poem when I went to the oasis to nibble at a tree, then discovered I'd left nothing for Elly to nibble. I was distraught."); stage = 34; break;
            }
        }
        else if (stage == 27) { sendNPCDialogue(npcId, NORMAL, "Shall I compare thee to a desert's day? Thou art drier and more rough-skinned;"); stage = 28; }
        else if (stage == 28) { sendNPCDialogue(npcId, NORMAL, "Rough sandstorms shake the cacti away And summer's heat defers to autumn wind;"); stage = 29; }
        else if (stage == 29) { sendNPCDialogue(npcId, NORMAL, "Sometimes too hot, the eye of heaven shines, With Guthix's gold complexion often dimmed;"); stage = 30; }
        else if (stage == 30) { sendNPCDialogue(npcId, NORMAL, "And every fair from fair sometime declines, By chance or desert's changing course untrimmed;"); stage = 31; }
        else if (stage == 31) { sendNPCDialogue(npcId, NORMAL, "But thine eternal desert shall not fade Nor lose possession of that sand thou owest;"); stage = 32; }
        else if (stage == 32) { sendNPCDialogue(npcId, NORMAL, "Nor Zamorak brag thou art in his shades, When in eternal lines to sand thou growest;"); stage = 33; }
        else if (stage == 33) { sendNPCDialogue(npcId, NORMAL, "So long as camels breathe or eyes can see, So long lives this, and this gives life to thee."); stage = 34; }
        else if (stage == 34) { sendNPCDialogue(npcId, NORMAL, "Ah, Elly, how beautiful you are."); stage = 0; }

        else if (stage == 35) { sendNPCDialogue(npcId, NORMAL, "This is just to say"); stage = 36; }
        else if (stage == 36) { sendNPCDialogue(npcId, NORMAL, "I have nibbled / the cacti / that were by / the oasis;"); stage = 37; }
        else if (stage == 37) { sendNPCDialogue(npcId, NORMAL, "and which / you were probably / saving / for lunch;"); stage = 38; }
        else if (stage == 38) { sendNPCDialogue(npcId, NORMAL, "Forgive me, / they were delicious, / so crunchy / and so cold."); stage = 39; }
        else if (stage == 39) { sendNPCDialogue(npcId, NORMAL, "I wonder if she's forgiven me for eating her snack."); stage = 0; }

        else if (stage == 40) { sendNPCDialogue(npcId, NORMAL, "Ah, well. I shall return to writing poems to Elly's beauty."); stage = 0; }
        else if (stage == 0) { end(); }

        }


    @Override
    public void finish() {

    }
}