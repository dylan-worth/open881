package com.rs.game.player.dialogues.impl.cities.catherby;

import com.rs.game.player.content.Shop;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.utils.ShopsHandler;

public class Harry extends Dialogue {

    private int npcId = 576;

    @Override
    public void start() {
        sendNPCDialogue(npcId, HAPPY, "Welcome! You can buy Fishing equipment at my store. We'll also give you a good price for any fish that you catch.");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            sendOptionsDialogue("Choose an Option:", "Let's see what you've got, then.", "Can I get a fish for this bowl?", "Do you have any fish food?", "Sorry, I'm not interested.");
            stage = 0;
        }
        else if (stage == 0) {
            switch (componentId) {

                case OPTION_1: sendPlayerDialogue(NORMAL, "Let's see what you've got, then.");
                stage = 1;
                break;

                case OPTION_2: sendPlayerDialogue(NORMAL, "Can I get a fish for this bowl?");
                stage = 10;
                break;

                case OPTION_3: sendPlayerDialogue(NORMAL, "Do you have any fish food?");
                stage = 15;
                break;

                case OPTION_4: sendPlayerDialogue(NORMAL, "Sorry, I'm not interested.");
                stage = 5;
                break;
            }
        }
        else if ( stage == 1 ){
            ShopsHandler.openShop(player, 10);
            end();
        }
        else if (stage == 10) {
            sendDialogue("This feature is not currently implemented in Open881. This is placeholder, so it doesn't go for forgotten.");
            stage = 5;
        }
        else if (stage == 15 ) {
            sendNPCDialogue(npcId, NORMAL, "Sorry, I'm all out. I used up the last of it feeding the fish in the aquarium. I have some empty boxes, though - they have the ingredients written on the back. I'm sure if you pick up a pestle and mortar you will be able to make your own.");
            stage = 16;
        }
        else if (stage == 16) {
            player.getInventory().addItem(6675, 1);
            sendNPCDialogue(npcId, NORMAL, "Here. I can hardly charge you for an empty box.");
            stage = 5;
        }
        else if (stage == 5) {
            end();
        }
    }

    @Override
    public void finish() {

    }
}
