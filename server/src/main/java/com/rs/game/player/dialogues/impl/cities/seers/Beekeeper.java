package com.rs.game.player.dialogues.impl.cities.seers;

import com.rs.game.player.dialogues.Dialogue;

public class Beekeeper extends Dialogue {

   private int npcId = 8649;
    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Hello! What do you think of my apiary? Nice, isn't it?");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {

        if (stage == -1 ) {
            sendPlayerDialogue(NORMAL, "You mean all these beehives?");
            stage = 0;
        }
        else if (stage == 0) {
            sendNPCDialogue(npcId,  HAPPY, "Yup! They're filled with bees. Also wax, and delicious honey too! You're welcome to help yourself to as much wax and honey as you like.");
            stage = 1;
        }
        else if (stage == 1){
            if (!player.getInventory().containsItem(28, 1)) {
                sendNPCDialogue(npcId, NORMAL, "Oh, but you'll need some insect repellent - here.");
                stage = 10;
            } else {
                stage = 2;
            }
        }
        else if (stage == 10) {
            sendDialogue("The beekeeper hands you some insect repellent.");
            player.getInventory().addItem(28, 1);
            stage = 2;
        }
        else if (stage == 2) {
            sendNPCDialogue(npcId, NORMAL, "Leave the bees, though. The bees are mine! I love bees!");
            stage = 3;
        }
        else if (stage == 3) {
            sendOptionsDialogue("Choose One:", "What is honey good for?", "About beeswax... ", "See you later. ");
            stage = 4;
        }
        else if (stage == 4) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(NORMAL, "What is honey good for?");
                stage = 15;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "About beeswax...");
                stage = 20;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "See you later.");
                stage = 25;
            }
        }
        else if (stage == 15) {
            sendNPCDialogue(npcId, NORMAL, "Ah, well, it's more the honeycomb that you'll want. I hear some people use it to infuse pouches to summon the dreaded honey badger! So long as you are carrying some repellent, you can just grab as much as you like.");
            stage = 3;
        }
        else if (stage == 20) {
            sendNPCDialogue(npcId, NORMAL, "Hmm, well, you'll need an empty bucket to collect some beeswax. There's a spare bucket around here somewhere you can have. It's trickier to get hold of than honeycomb. You'll have to actually use some repellent on the hive before filling your bucket with wax. I'm not sure what you'd want it for, though - it doesn't have many uses.");
            stage = 3;
        }
        else if (stage == 25){
            end();
        }
     }

    @Override
    public void finish() {

    }
}
