package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class Victoria extends Dialogue {

    private int npcId = 7872;

    @Override
    public void start() {
        sendPlayerDialogue( NORMAL, "Good day");
        stage = -1;


    }

    @Override
    public void run(int interfaceId, int componentId) {

        // npcId is defined at the top, Face expressions are defined under Dialogue.java, Quoted text comes from RS3.

        if (stage == -1) { sendNPCDialogue(npcId, NORMAL, "To you too, traveller. I am Victoria. If you see my brother in town do not lend him any money."); stage = 0; }
        else if (stage == 0) { sendNPCDialogue(npcId, NORMAL, "My brother is such a waste of space. I've \n" + "been lending him things for years and he never gives them back."); stage = 1; }
        else if (stage == 1) { sendNPCDialogue(npcId, NORMAL, "Yes, but it never used to be this bad. You see.."); stage = 2; }
        else if (stage == 2) { sendNPCDialogue(npcId, NORMAL, "Lachtopher used to live on the east side of the river, before it was overrun with goblins. Although he \n" +  "didn't have a steady job, he used to help out around the farms when he needed cash."); stage = 3; }
        else if (stage == 3) { sendNPCDialogue(npcId, NORMAL, "Then, one day, the Duke told us it was no longer safe to live on the east riverbank, so some villagers \n" + "had to move across here."); stage = 4; }
        else if (stage == 4) { sendNPCDialogue(npcId, SAD, "With no money for lodgings, and nowhere else to go, Lachtopher came to live with me. I've only a small house, \n" +  "so he sleeps downstairs on the floor."); stage = 5; }
        else if (stage == 5) { sendPlayerDialogue( SAD_SHOCKED, "Goodness. That sounds quite uncomfortable."); stage = 6; }
        else if (stage == 6 ) { sendNPCDialogue(npcId, ANGRY, "Not uncomfortable enough, it seems."); stage = 7; }
        else if (stage == 7) { sendNPCDialogue(npcId, SAD, "I thought he'd only be staying for a couple of weeks, just until he'd got some money together, but \n" + "he's been here for ages now. "); stage = 8; }
        else if (stage == 8) { sendPlayerDialogue(CONFUSED, "So, why not just throw him out on the streets?" ); stage = 9; }
        else if (stage == 9) { sendNPCDialogue(npcId, SAD_SHOCKED, "Oh, no! I couldn't do that to my brother."); stage = 10; }
        else if (stage == 10) { sendNPCDialogue(npcId, NORMAL, "Besides, my parents taught me to support and care for those in need. I'm sure that, if I try hard enough, I can change my brother's ways."); stage = 11; }
        else if (stage == 11) { sendNPCDialogue(npcId, ANGRY, "That doesn't mean he's having any more money out of me, however. He can have a roof over his head, but that's all."); stage = 12; }
        else if (stage == 12) { sendPlayerDialogue(NORMAL, "Good luck with that. I don't think Lachtopher deserves a sister like you."); stage = 13; }
        else if (stage == 13) { sendNPCDialogue(npcId, NORMAL, "Such kind words. Thank you. Remember: don't give him any money - tell him to get a job instead." ); stage = 14; }
        else if (stage == 14) { sendPlayerDialogue(NORMAL, "Okay, I'll try to remember that."); stage = 15; }
        else if (stage == 15) { end(); }

    }


    @Override
    public void finish () {

    }
}

