package com.rs.game.player.dialogues.impl.cities.lumby;

import com.rs.game.player.dialogues.Dialogue;

public class LumbridgeSage extends Dialogue {

    private int npcId = 2244;
    @Override
    public void start() {
        sendNPCDialogue(npcId, NORMAL, "Greetings, adventurer. How may I help you?" );
        stage = -1;
    }

    @Override
    public void run(int interfaceId, int componentId) throws ClassNotFoundException {

        if (stage == -1) {
            sendOptionsDialogue("Choose One:", "Who are you?", "Tell me about the town of Lumbridge.", "Goodbye.");
            stage = 0;
        }
    else if (stage == 0) {
            switch (componentId) {

                case OPTION_1:
                    sendPlayerDialogue(NORMAL, "Who are you?");
                    stage = 10;
                    break;

                case OPTION_2:
                    sendPlayerDialogue(NORMAL, "Tell me about the town of Lumbridge.");
                    stage = 20;
                    break;

                case OPTION_3:
                    sendPlayerDialogue(NORMAL, "Good bye.");
                    stage = 30;
                    break;
            }
        }
            // Option 1 Dialogue: Who are you?

            else if (stage == 10) { sendNPCDialogue(npcId, NORMAL, "I am Phileas, the Lumbridge Sage. In times past, people came from all around to ask me for advice. My renown seems to have diminished somewhat in recent years, though. Can I help you with anything?"); stage = 1; }

            // Option 2 Dialogue: Tell me about the town of Lumbridge.

            else if (stage == 20) { sendNPCDialogue(npcId, NORMAL, "Lumbridge is one of the older towns in the human-controlled kingdoms. IT was founded over two hundred years ago towards the end of the Fourth Age. It's called Lumbridge because of this bridge built over the River Lum."); stage = 21; }
            else if (stage == 21) { sendNPCDialogue(npcId, NORMAL, "The town is governed by Duke Horacio, who is a good friend of our monarch, King Roald of Misthalin."); stage = 22; }
            else if (stage == 22) { sendNPCDialogue(npcId, NORMAL, "Recently, however, there have been great changes due to the Battle of Lumbridge."); stage = 23; }
            else if (stage == 23) { sendPlayerDialogue(QUESTIONS, "What about the battle?"); stage = 24; }
            else if (stage == 24) { sendNPCDialogue(npcId, NORMAL, "Indeed, not long ago there was a great fight between Saradomin and Zamorak on the battlefield to the west of the castle."); stage = 25; }
            else if (stage == 25) { sendNPCDialogue(npcId, NORMAL, "Titanic forces were unleashed as neither side could gain the upper hand. Each side sought advantages, but it was close until the end."); stage = 26; }
            else if (stage == 26) { sendNPCDialogue(npcId, NORMAL, "The battle lasted for months, but in the end the forces of the holy Saradomin were triumphant. Zamorak was defeated... but..."); stage = 27; }
            else if (stage == 27) { sendNPCDialogue(npcId, NORMAL, "Before Saradomin could complete his victory, Moia, the general of Zamorak's forces, transported him away."); stage = 28; }
            else if (stage == 28) { sendNPCDialogue(npcId, NORMAL, "Now, the battlefield lies empty save for a single Saradominist devotee, and Lumbridge lies in ruins. Luckily, Foreman George is organising a rebuilding effort, to the north of the castle."); stage = 1; }


            // Option 3 Dialogue: Goodbye.

            else if (stage == 30) { sendNPCDialogue(npcId, NORMAL, "Good adventuring, traveller."); stage = 1; }

            // End of chat:

            else if (stage == 1) { end(); }

    }

    @Override
    public void finish() {

    }
}
