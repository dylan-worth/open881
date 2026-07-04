package com.rs.game.player.dialogues.impl.items.rings;

import com.rs.game.WorldTile;
import com.rs.game.player.content.Magic;
import com.rs.game.player.dialogues.Dialogue;

public class RingOfRespawn extends Dialogue {

    private int itemID = 39364;
    @Override
    public void start() {
        sendOptionsDialogue( "Ring of respawn", "Lumbridge","Falador", "Camelot", "SoulWars", "Burthorpe");
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {
        if (stage == -1 ) {
            switch (componentId) {
                case OPTION_1:
                    Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2603, 1, 0, new WorldTile(3222, 3224, 0), 10, true, Magic.ITEM_TELEPORT);
                    break;
                case OPTION_2:
                    Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2972, 1, 0, new WorldTile(2973, 3344, 0), 10, true, Magic.ITEM_TELEPORT);
                    break;
                case OPTION_3:
                    Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2603, 1, 0, new WorldTile(2757, 3479, 0), 10, true, Magic.ITEM_TELEPORT);
                    break;
                case OPTION_4:
                    Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2603, 1, 0, new WorldTile(1890, 3178, 0), 10, true, Magic.ITEM_TELEPORT);
                    break;
                case OPTION_5:
                    Magic.sendTeleportSpell(player, 13652, 13654, 2602, 2603, 1, 0, new WorldTile(2890, 3530, 0), 10, true, Magic.ITEM_TELEPORT);
                    stage = 0;
                    break;
            }
        }

        }

    @Override
    public void finish() {

    }
}
