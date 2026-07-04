package com.rs.game.player.dialogues.impl.cities.varrock;

import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.controllers.RuneEssenceController;
import com.rs.game.player.dialogues.Dialogue;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.ShopsHandler;
import com.rs.utils.Utils;


public class Aubury extends Dialogue {

    private int npcId = 5913;
    private NPC npc;

    @Override
    public void start() {
    sendNPCDialogue(npcId, NORMAL, "Do you want to buy some runes?");
    stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1) {
            sendOptionsDialogue("Choose an option", "Yes, please.", "No thanks.", "Can you teleport me to the rune essence?");
            stage = 0;
        } else if (stage == 0) {
           switch (componentId) {

               case OPTION_1: sendPlayerDialogue(NORMAL, "Yes, please.");
               stage = 1;
               break;

               case OPTION_2: sendPlayerDialogue(NORMAL, "No thanks");
               stage = 10;
               break;

               case OPTION_3: sendPlayerDialogue(NORMAL, "Can you teleport me to the rune essence?");
               stage = 15;
               break;
           }
        }
        else if ( stage == 1 ) {
            ShopsHandler.openShop(player, 184);
            end();
        }
        else if (stage == 10 ) {
            end();
        }
        else if (stage == 15) {
                sendDialogue("Work in Progress");
                stage = 12;
            }

        }



    @Override
    public void finish() {

    }
}


