package com.rs.game.player.dialogues.impl.cities.lumby.swamp;

import com.rs.game.player.Player;
import com.rs.game.player.Inventory;
import com.rs.game.player.dialogues.Dialogue;

public class FatherUrhney extends Dialogue {

    private int npcId = 458;

    @Override
    public void start() {
        sendNPCDialogue(npcId, ANGRY, "Go away! I'm meditating!");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if ( stage == -1 ) {
        sendOptionsDialogue("Choose an option", "Well, that's friendly.", "I've come to repossess your house.", "I've lost that ghostspeak amulet you gave me. ", "Can you tell me about the crater?");
        stage = 0;
    }
    else if (stage == 0) {
        switch (componentId){

            case OPTION_1: sendPlayerDialogue(NORMAL, "Well, that's friendly.");
            stage = 1;
            break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "I've come to reposses your house.");
            stage = 10;
            break;

            case OPTION_3: sendPlayerDialogue(NORMAL, "I've lost that ghostspeak amulet you gave me");
            stage = 20;
            break;

            case OPTION_4: sendPlayerDialogue(NORMAL, "Can you tell me about the crater?");
            stage = 30;
            break;

        }
    }
    else if (stage == 1) {
        sendNPCDialogue(npcId, ANGRY, "I said go away!");
        stage = 2;
    }
    else if (stage == 2) {
        sendPlayerDialogue(NORMAL, "Okay, okay. Sheesh, what a grouch.");
        stage = 3;
    }
    else if (stage == 10) {
        sendNPCDialogue(npcId, QUESTIONS, "On what grounds?");
        stage = 11;
    }
    else if (stage == 11) {
        sendOptionsDialogue("Choose an Option","Repeated failure to make mortgage repayments.", "I don't know, I just wanted this house.");
        stage = 12;
    }
    else if (stage == 12) {
        switch (componentId) {

            case OPTION_1: sendPlayerDialogue(NORMAL, "Repeated failure to make mortgage repayments.");
            stage = 15;
            break;

            case OPTION_2: sendPlayerDialogue(NORMAL, "I don't know, I just wanted this house.");
            stage = 35;
            break;
        }
    }
    else if ( stage == 15 ) {
        sendNPCDialogue(npcId, ANGRY, "What? But I don't have a mortgage - I build this house myself!");
        stage = 16;
    }
    else if (stage == 16) {
        sendPlayerDialogue(NORMAL, "Sorry, I must have got the wrong address. All the houses look the same around here.");
        stage = 17;
    }
    else if (stage == 17 ) {
        sendNPCDialogue(npcId, CONFUSED, "What? What houses? This is the only one. What are you talking about?");
        stage = 18;
    }
    else if (stage == 18) {
        sendPlayerDialogue(NORMAL, "Nevermind.");
        stage = 3;
    }
    else if (stage == 35) {
        sendNPCDialogue(npcId, ANGRY, "Oh, go away and stop wasting my time.");
        stage = 3;
    }
    // Option 3:

        else if (stage == 20 ) {
            if (player.getInventory().containsItem(4250, 1) || player.getEquipment().getAmuletId() == 4250) {
                sendNPCDialogue(npcId, CONFUSED, "What are you talking about? I can see you've got it with you.");
                stage = 3;
            }
            else if (player.getBank().containsItem(4250)) {
                sendNPCDialogue(npcId, ANGRY, "Why do you insist on wasting my time? Has it even occured to you to look in your bank? Now go away!");
                stage = 3;
            }
            else {
                sendDialogue("Father Urhney sighs.");
                stage = 21;
            }

    }
        else if (stage == 21) {
            sendNPCDialogue(npcId, ASKING_FACE, "How careless can you get? Those things aren't easy to come by, you know! It's a good job I've got a spare.");
            stage = 22;
    }
        else if (stage == 22 ) {
            sendDialogue("Father Urhney hands you an amulet.");
            player.getInventory().addItem(4250, 1);
            stage = 23;
    }
        else if (stage == 23) {
            sendNPCDialogue(npcId, NORMAL, "Be more careful this time.");
            stage = 24;
    }
        else if (stage == 24 ) {
            sendPlayerDialogue(NORMAL, "Okay, I will.");
            stage = 3;
    }
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "There were enough people clattering around my house before, and then Zamorak decides he wants a war camp right next to my hut.");
            stage = 31;
    }
        else if (stage == 31) {
            sendNPCDialogue(npcId, NORMAL, "At least Zamorak has gone now, but he's left his camp littering my swamp.");
            stage = 3;
    }
        else if (stage == 3) {
            end();
    }
    }

    @Override
    public void finish() {

    }
}
