package com.rs.game.player.dialogues.impl.outskirts;

import com.rs.game.player.dialogues.Dialogue;

public class GrandpaJack extends Dialogue {

    private int npcId = 230;
    @Override
    public void start() {
        if (player.getAppearence().isMale()) {
            sendNPCDialogue(npcId, HAPPY, "Hello young man! Come to visit old Grandpa Jack? I can tell ye stories for sure. I sued to be the best fisherman these parts have seen!");
            stage = -1;
        }
        else  {
        sendNPCDialogue(npcId, HAPPY, "Hello young lady! Come to visit old Grandpa Jack? I can tell ye stories for sure. I sued to be the best fisherman these parts have seen!");
        stage = -1;
        }
    }


    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "Tell me a story then. ", "Are you entering the fishing competition?", "Sorry, I don't have time now.", "Can I buy one of your fishing rods?", "I've forgotten how to fish, can you remind me?");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId){

                case OPTION_1: sendPlayerDialogue(NORMAL, "Tell me a story then.");
                stage = 1;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Are you entering the fishing competition?");
                stage = 5;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "Sorry, I don't have time now.");
                stage = 15;
                break;

                case OPTION_4: sendPlayerDialogue(NORMAL, "Can I buy one of your fishing rods");
                stage = 20;
                break;

                case OPTION_5: sendPlayerDialogue(NORMAL, "I've forgotten how to fish, can you remind me? ");
                stage = 30;
                break;
            }
        }

        else if (stage == 1) {
            sendNPCDialogue(npcId, NORMAL, "Well, when I were a young man we used to take fishing trips over to Catherby: The fishing over there – now that was something! Anyway, we decided to do a bit of fishing with our nets, I wasn't having the best of days turning up nothing but old boots and bits of seaweed. Then my net suddenly got really heavy! I pulled it up... To my amazement I'd caught this little chest thing! Even more amazing was when I opened it it contained a diamond the size of a radish! That's the best catch I've ever had!");
            stage = 17;
        }

        else if (stage == 3 ) {
            sendNPCDialogue(npcId, NORMAL, "Ah... the Hemenster fishing competition... I know all about that... I won that four years straight! I'm too old for that lark now though...");
            stage = 4;
        }
        else if (stage == 4) {
            sendOptionsDialogue("Choose One:", "I don't suppose you could give me any hints?", "That's less competition for me then. ");
            stage = 5;
        }
        else if (stage == 5) {
            sendPlayerDialogue(NORMAL, "I don't suppose you could give me any hints?");
            stage = 7;
        }
        else if (stage == 6) {
            sendPlayerDialogue(NORMAL, "That's less competition for me then. ");
            stage = 11;
        }
        else if (stage == 7){
            sendNPCDialogue(npcId, NORMAL, "Well, you sometimes get these really big fish in the water just by the outflow pipes. I think they're some kind of carp... Try to get a spot round there. The best sort of bait for them is red vine worms. I used to get those from McGrubor's wood, north of here. Just dig around in the red vines up there but be careful of the guard dogs.");
            stage = 8;
        }
        else if (stage == 8) {
            sendPlayerDialogue(NORMAL, "There's this weird creepy guy who says he's not a vampyre using that spot. He keeps winning too.");
            stage = 9;
        }
        else if (stage == 9) {
            sendNPCDialogue(npcId, NORMAL, "Ahh well, I'm sure you'll find something to put him off. Afer all, there must be a kitchen around here with some garlic in it, perhaps in Seers Village or Ardougne. If e's pretending to be a vampyre then he can pretend to be scared of garlic!");
            stage = 10;
        }
        else if (stage == 10) {
            sendPlayerDialogue(NORMAL, "You're right! Thanks Jack!");
            stage = 17;
        }
        else if (stage == 11) {
            sendNPCDialogue(npcId, NORMAL, "Why you young whippersnapper! If I was twenty years younger I’d show you something that’s for sure!");
            stage = 17;
        }
        else if (stage == 20) {
            if (player.getAppearence().isMale()) {
                sendNPCDialogue(npcId, HAPPY, "Of course you can young man. Let’s see now…I think 5 gold is a fair price for a rod which has won the Fishing contest before eh? ");
                stage = 21;
            } else {
                sendNPCDialogue(npcId, HAPPY, "Of course you can young lady. Let’s see now…I think 5 gold is a fair price for a rod which has won the Fishing contest before eh? ");
                stage = 21;
            }
        }
        else if (stage == 21) {
            if (player.getInventory().containsItem(995, 5)) {
                sendOptionsDialogue("Choose One:", "Very fair, I’ll buy that rod!", "That’s too rich for me, I’ll go to Catherby.");
                stage = 22;
            }
            else if (!player.getInventory().containsItem(995, 5)) {
                sendPlayerDialogue(NORMAL, "I don’t have enough money for that, I’ll go get some and come back.");
                stage = 27;
            }
        }
        else if (stage == 22) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(NORMAL, "Very fair, I'll buy that rod!");
                stage = 23;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "That's too rich for me, I'll go to Catherby.");
                stage = 26;
                break;
            }
        }
        else if (stage == 23) {
            sendNPCDialogue(npcId, HAPPY, "Excellent choice!");
            player.getInventory().deleteItem(995, 5);
            player.getInventory().addItem(307,1);
            stage = 24;
        }
        else if (stage == 24) {
            sendPlayerDialogue(HAPPY, "Thanks!");
            stage = 25;
        }
        else if (stage == 25) {
            sendNPCDialogue(npcId, HAPPY, "You’re welcome young ‘un.");
            stage = 17;
        }
        else if (stage == 26) {
            sendNPCDialogue(npcId, NORMAL, "If you’re sure… passing up an opportunity of a lifetime you are.");
            stage = 17;
        }
        else if (stage == 27) {
            sendNPCDialogue(npcId, NORMAL, "Right you are. I’ll be here.");
            stage = 17;
        }
        else if (stage == 30) {
            sendNPCDialogue(npcId, NORMAL, "Of course! Let me see now... You'll need a rod and bait. You can fish with a net too, but not in the competition.");
            stage = 31;
        }
        else if (stage == 31) {
            sendPlayerDialogue(NORMAL, "Ok... I think I can get those in Catherby.");
            stage = 32;
        }
        else if (stage == 32) {
            sendNPCDialogue(npcId, NORMAL, "Then simply find yourself a fishing spot, either in the competition near here, or wherever you can – I recommend net fishing in Catherby. Net or Lure the fish in the fishing spot by clicking on it and then be patient...");
            stage = 33;
        }
        else if (stage == 33) {
            sendPlayerDialogue(NORMAL, "It's that simple?");
            stage = 34;
        }
        else if (stage == 34) {
            sendNPCDialogue(npcId, NORMAL, "Yep! Go get em tiger.");
            stage = 35;
        }
        else if (stage == 15) {
            sendNPCDialogue(npcId, NORMAL, "Sigh… Young people – always in such a rush.");
            stage = 17;
        }
        else if (stage == 17) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
