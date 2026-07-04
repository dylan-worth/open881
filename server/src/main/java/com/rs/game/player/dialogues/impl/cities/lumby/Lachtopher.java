package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Lachtopher extends Dialogue {

    private int npcId = 7870;

    @Override
    public void start() {
        sendPlayerDialogue( NORMAL, "Hello there.");
        stage = -1;


    }

    @Override
    public void run(int interfaceId, int componentId) {

        // npcId is defined at the top, Face expressions are defined under Dialogue.java, Quoted text comes from RS3.

        if (stage == -1) { sendNPCDialogue(npcId, NORMAL, "Hello, I suppose. I'm Lachtopher. Could you lend me some money?"); stage = 0; }
        else if (stage == 0) { sendPlayerDialogue(CONFUSED, "Lend you money? I really don't think so. Don't you have any of \n" + "your own?"); stage = 1; }
        else if (stage == 1) { sendNPCDialogue(npcId, NORMAL, "I spent is all and I can't be bothered to earn anymore."); stage = 2; }
        else if (stage == 2) { sendPlayerDialogue(CONFUSED, "Right, and you want my hard-earned money instead? No chance!"); stage = 3; }
        else if (stage == 3) { sendNPCDialogue(npcId, NORMAL, "You're just like my sister, Victoria. She won't give me any money."); stage = 4; }
        else if (stage == 4) { sendPlayerDialogue(NORMAL, "Your sister sounds like she has the right idea."); stage = 5; }
        else if (stage == 5) { sendNPCDialogue(npcId, NORMAL, "Yeah, I've heard it all before. 'Oh' she says, 'It's easy to make money; just complete \n" + "Tasks for cash.'"); stage = 6; }
        else if (stage == 6 ) { sendPlayerDialogue(NORMAL, "Well, if you want to make money.."); stage = 7; }
        else if (stage == 7) { sendNPCDialogue(npcId, NORMAL, "That's just it, I don't want to make money. I just want to have money."); stage = 8; }
        else if (stage == 8) { sendPlayerDialogue(ANGRY, "I've had it with you! I don't think I've across a less worthwhile person."); stage = 9; }
        else if (stage == 9) { sendPlayerDialogue(ANGRY, "I think I'll call you Lazy Lachtopher, from now on."); stage = 10; }
        else if (stage == 10) { end(); }

        }


        @Override
        public void finish () {

        }
    }

