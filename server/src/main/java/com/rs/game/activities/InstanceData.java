package com.rs.game.activities;

/**
 * @author Kris 
 * {@link} https://www.rune-server.ee/members/kris/
 */
public enum InstanceData {
	
	TWINFURIES(22455, 384, 880, 8, 10),
	GREGOROVIC(22443, 407, 879, 8, 10),
	VINDICTA(22460, 384, 857, 8, 10),
	HELWYR(22438, 407, 856, 8, 10),
	GIANT_MOLE(18932, 215, 647, 11, 10),
	GENERAL_GRAARDOR(6260, 355, 667, 7, 7),
	KRIL_TSUTSAROTH(6203, 362, 663, 7, 7),
	COMMANDER_ZILYANA(6247, 362, 654, 7, 7),
	KREE_ARRA(6222, 350, 659, 7, 7),
	NIHIL(19146, 505, 785, 6, 7),
	MUSPAH(19150, 528, 776, 8, 8),
	DAGANNOTH_KING_ALL(2880, 360, 553, 7, 7),
	DAGANNOTH_SUPREME(2881, 360, 553, 7, 7),
	DAGANNOTH_REX(2882, 360, 553, 7, 7),
	DAGANNOTH_PRIME(2883, 360, 553, 7, 7),
	CORPOREAL_BEAST(8133, 368, 544, 8, 7);
	
	private final int npcId;
	private final int[] mapData;
	
	private InstanceData(final int npcId, final int... mapData) {
		this.npcId = npcId;
		this.mapData = mapData;
	}
	
	public final int getNPCId() {
		return npcId;
	}
	
	public final int[] getMapData() {
		return mapData;
	}
	
}