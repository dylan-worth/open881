package com.rs.game.player.dialogues.impl.cities.seers;

import com.rs.game.player.QuestManager;
import com.rs.game.player.dialogues.Dialogue;

public class Geoffrey extends Dialogue {

   private int npcId = 8590;

    @Override
    public void start() {
        sendPlayerDialogue(NORMAL, "Hello there. You look busy.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
    if (stage == -1) {
        sendNPCDialogue(npcId, HAPPY, "Yes, I am very busy. Picking GLORIOUS flax. The GLORIOUS flax won't pick itself. So I pick it. I pick it all day long.");
        stage = 0;
    }
    else if (stage == 0) {
        sendPlayerDialogue(NORMAL, "Wow, all that flax must really mount up. What do you do with it all?");
        stage = 1;
    }
    else if ( stage == 1) {
        sendNPCDialogue(npcId, HAPPY, "I give it away! I love picking the GLORIOUS flax, but, if I let it all mount up, I wouldn't have any room for more GLORIOUS flax.");
        stage = 2;
    }
    else if (stage == 2) {
        sendPlayerDialogue(NORMAL, "So, you're just picking the flax for fun? You must really like flax.");
        stage = 3;
    }
    else if (stage == 3) {
        sendNPCDialogue(npcId, HAPPY, "'Like' the flax? I don't just 'like' flax. The GLORIOUS flax is my calling, my reason to live. I just love the feeling of it in my hands!");
        stage = 4;
    }
    else if (stage == 4) {
        sendPlayerDialogue(QUESTIONS, "Erm, okay. Maybe I can have some of your spare flax?");
        stage = 5;
    }
    else if (stage == 5) {
        sendNPCDialogue(npcId, NORMAL, "No. I don't trust outsiders. Who knows what depraved things you would do with the GLORIOUS flax? Only locals know how to treat it right.");
        stage = 6;
    }
    else if (stage == 6) {
        sendPlayerDialogue(NORMAL, "I know this area! It's, erm, Seers' Village. There's a pub and, er, a bank.");
        stage = 7;
    }
    else if (stage == 7 ) {
        sendNPCDialogue(npcId, LAUGHING, "Pah! You call that local knowledge? Perhaps if you were wearing some kind of item from one of the seers, I might trust you.");
        stage = 8;
    }
    else if (stage == 8) {
        sendDialogue("When the Diaries are added to Open881, the feature will be added for Daily Flax.");
        stage = 9;
    }
    else if ( stage == 9) {
        end();
    }
    }

    @Override
    public void finish() {

    }
}
