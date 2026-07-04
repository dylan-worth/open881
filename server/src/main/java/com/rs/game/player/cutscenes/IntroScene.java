package com.rs.game.player.cutscenes;

import java.util.ArrayList;

import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.actions.CutsceneAction;
import com.rs.game.player.cutscenes.actions.CutsceneCodeAction;
import com.rs.game.player.cutscenes.actions.DialogueAction;
import com.rs.game.player.cutscenes.actions.LookCameraAction;
import com.rs.game.player.cutscenes.actions.MovePlayerAction;
import com.rs.game.player.cutscenes.actions.PosCameraAction;




public class IntroScene extends Cutscene {

	@Override
	public boolean hiddenMinimap() {
		return true;
	}

	@Override
	public boolean showYourselfToOthers() {
		return false;
	}

	@Override
	public int getMapSize() {
		return 3;
	}

	// exeption
	@Override
	public void stopCutscene(Player player) {
		super.stopCutscene(player);
		player.getMusicsManager().reset();
	}

	@Override
	public CutsceneAction[] getActions(Player player) {
		ArrayList<CutsceneAction> actionsList = new ArrayList<CutsceneAction>();

		actionsList.add(new CutsceneCodeAction(new Runnable() {

			@Override
			public void run() {
				player.getMusicsManager().forcePlayMusic(1207);
			}

		}, -1));

		// player starts walking and camera goes ahead
		actionsList.add(new MovePlayerAction(2207, 3360, 1,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(2205, 3359, false, -1));

		actionsList.add(new LookCameraAction(2207, 3361, 950, 6, 6, -1));
		actionsList.add(new PosCameraAction(2209, 3365, 5000, 6, 6, 3));

		actionsList.add(new LookCameraAction(2210, 3358, 950, 6, 6, -1));
		actionsList.add(new PosCameraAction(2211, 3354, 5000, 6, 6, 10));

		actionsList
				.add(new DialogueAction(
						"Welcome to Velorium, let's learn the basics and send you on your way."));

		actionsList.add(new LookCameraAction(2707, 3732, 1000, 6, 6, -1));
		actionsList.add(new PosCameraAction(2707, 3725, 5000, 6, 6, 3));

		actionsList.add(new MovePlayerAction(2711, 3726, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(2717, 3726, false, 10));

		actionsList
				.add(new DialogueAction(
						"Training: Here we have Rock Crabs, suitable training NPC's from beginner warriors like you."));

		actionsList.add(new LookCameraAction(2592, 3420, 1000, 6, 6, -1));
		actionsList.add(new PosCameraAction(2600, 3420, 1500, 6, 6, 3));

		actionsList.add(new MovePlayerAction(2597, 3412, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(2603, 3411, false, 10)); //fishing
		
		actionsList.add(new LookCameraAction(3495, 3611, 1000, 6, 6, -1));
		actionsList.add(new PosCameraAction(3497, 3617, 1500, 6, 6, 3));

		actionsList.add(new MovePlayerAction(3494, 3610, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(3492, 3606, false, 10));//woodcutting
		
		actionsList.add(new LookCameraAction(1043, 4575, 1000, 6, 6, -1));
		actionsList.add(new PosCameraAction(1048, 4576, 1500, 6, 6, 3));

		actionsList.add(new MovePlayerAction(1063, 4574, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(2603, 3411, false, 10));//mining
		
		actionsList
				.add(new DialogueAction(
						"Skills: Fishing, Woodcutting, and Mining are great skills for quick cash."));

		actionsList.add(new LookCameraAction(2273, 4685, 1000, -1, -1, -1));
		actionsList.add(new PosCameraAction(2269, 4694, 2500, 6, 6, 10));
		
		actionsList.add(new MovePlayerAction(2272, 4690, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new DialogueAction("King Black Dragon: The easiest RS3 boss to exist, drops great resources to start the boss grind with."));
		
		actionsList.add(new LookCameraAction(4633, 5107, 1000, 6, 6, -1));
		actionsList.add(new PosCameraAction(4638, 5103, 1500, 6, 6, 3));

		actionsList.add(new MovePlayerAction(4634, 5100, 0,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new MovePlayerAction(4634, 5091, false, 10)); //fight pots
		actionsList.add(new DialogueAction(
				"Show your worth in Fight Caves, and get rewarded with Tokkul & a Fire Cape."));
		actionsList.add(new MovePlayerAction(2208, 3360, 1,
				Player.TELE_MOVE_TYPE, 0));
		actionsList.add(new DialogueAction(
				"You're finished with the tutorial, now shine bring young warrior!"));
		actionsList.add(new DialogueAction(
				"Incase you were not paying attention and wish to replay this introdcution, come speak to me again."));

		return actionsList.toArray(new CutsceneAction[actionsList.size()]);
	}
}