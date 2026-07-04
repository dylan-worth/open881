package com.rs.game.activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimerTask;

import com.rs.executor.GameExecutorManager;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.map.MapBuilder;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.utils.Utils;

/**
 * @author Kris 
 * {@link} https://www.rune-server.ee/members/kris/
 */
public abstract class Instance {
	
	public ArrayList<Player> players;
	public final Player owner;
	public final int instanceDuration, respawnSpeed, playersLimit, bossId, password;
	public int totalSeconds;
	public final int[] boundChunks, sizes, chunksToBind;
	public final boolean hardMode;
	public boolean isStable, finished;
	public NPC boss;
	public NPC boss2;
	
	public Instance(Player owner, int instanceDuration, int respawnSpeed, int playersLimit, int password, int bossId, boolean hardMode) {
		players = new ArrayList<Player>();
		this.owner = owner;
		this.instanceDuration = getTime(owner, instanceDuration);
		this.respawnSpeed = respawnSpeed;
		this.playersLimit = playersLimit;
		this.password = password;
		this.bossId = bossId;
		this.hardMode = hardMode;
		int[] map = Arrays.stream(InstanceData.values()).filter(data -> data.getNPCId() == bossId).findAny().get().getMapData();
		this.chunksToBind = new int[] { map[0], map[1] };
		this.sizes = new int[] { map[2], map[3] };
		boundChunks = MapBuilder.findEmptyChunkBound(sizes[0], sizes[1]);
		isStable = true;
		addPlayer(owner);
		World.getInstances().add(this);
	}
	
	public static final int getTime(Player player, int time) {
		/*if (player.isMasterDonator())
			return (int) (time * 1.3);
		if (player.isUltimateDonator())
			return (int) (time * 1.25);
		if (player.isSupremeDonator())
			return (int) (time * 1.2);
		if (player.isLegendaryDonator())
			return (int) (time * 1.15);
		if (player.isExtremeDonator())
			return (int) (time * 1.1);
		if (player.isDonator())
			return (int) (time * 1.05);*/
		return time;
	}
	
	public abstract NPC getBossNPC();
	public abstract NPC getBoss2NPC();
	
	public abstract WorldTile getWaitingRoomCoords();
	
	public abstract WorldTile getOutsideCoordinates();
	
	public final void destroyInstance() {
		MapBuilder.destroyMap(boundChunks[0], boundChunks[1], sizes[0], sizes[1]);
		World.getInstances().remove(this);
	}
	
	public final void constructInstance() {
		MapBuilder.copyAllPlanesMap(chunksToBind[0], chunksToBind[1], boundChunks[0], boundChunks[1], sizes[0], sizes[1]);
		owner.setNextWorldTile(getWaitingRoomCoords());
		initiateSpawningSequence();
	}
	
	public final void enterInstance(Player player) {
		if (playersLimit != 0 && players.size() >= playersLimit) {
			player.getPackets().sendGameMessage("This instance is currently full.");
			return;
		}
		if (!isStable) {
			player.getPackets().sendGameMessage("The instance isn't stable enough to enter it.");
			return;
		}
		if (password != -1 && !player.getDisplayName().equalsIgnoreCase(owner.getDisplayName())) {
			player.getPackets().sendExecuteScript(108, "Enter password:");
			player.getTemporaryAttributtes().put("instancepasswordenter", this);
			return;
		}
		addPlayer(player);
		player.setNextWorldTile(getWaitingRoomCoords());
	}
	
	public final void enterInstance(Player player, int password) {
		if (playersLimit != 0 && players.size() >= playersLimit) {
			player.getPackets().sendGameMessage("This instance is currently full.");
			return;
		}
		if (!isStable) {
			player.getPackets().sendGameMessage("The instance isn't stable enough to enter it.");
			return;
		}
		if (password != this.password) {
			player.getPackets().sendGameMessage("The password you entered is incorrect.");
			return;
		}
		addPlayer(player);
		player.setNextWorldTile(getWaitingRoomCoords());
	}
	
	public abstract void performOnSpawn();
	
	public abstract void performOnSpawn2();
	
	public void initiateSpawningSequence() {
			Instance instance = this;
			GameExecutorManager.fastExecutor.scheduleAtFixedRate(new TimerTask() {
				int seconds;
				boolean resetSeconds;
				@Override
				public void run() {
					if (!isStable && players.size() == 0 || (totalSeconds % 60 == 0 && (totalSeconds / 60) == instanceDuration + 5)) {
						if (players.size() > 0) {
							players.forEach(player -> {
								if (player != null && player.currentInstance == instance)
									player.setNextWorldTile(getOutsideCoordinates());
							});
						}
						destroyInstance();
						if (boss != null)
							boss.finish();
						if (boss2 != null)
							boss2.finish();
						cancel();
						return;
					}
					if (seconds == 0 && !finished) {
						resetSeconds = false;
						if (boss == null || boss.hasFinished()) {
							boss = getBossNPC();
							boss.setForceMultiArea(true);
							performOnSpawn();
						}
						if (boss2 == null || boss2.hasFinished()) {
							boss2 = getBoss2NPC();
							boss2.setForceMultiArea(true);
							performOnSpawn2();
						}
					}
					if (boss.hasFinished() && !resetSeconds)  {
						seconds = 0 - respawnSpeed;
						resetSeconds = true;
					}
					if (boss2.hasFinished() && !resetSeconds)  {
						seconds = 0 - respawnSpeed;
						resetSeconds = true;
					}
					if (totalSeconds % 60 == 0 && (totalSeconds / 60) == instanceDuration) {
						finished = true;
						players.forEach(player -> player.getPackets().sendGameMessage("The instance has ended. No more monsters will be spawned in this instance."));
					} if (totalSeconds % 60 == 0 && (totalSeconds / 60) == instanceDuration - 2) {
						players.forEach(player -> player.getPackets().sendGameMessage("The instance will remain open for two more minutes."));
						isStable = false;
					}
					seconds++;
					totalSeconds++;
				}
			}, 0, 1000);
	}
	
	public WorldTile getWorldTile(int x, int y) {
		return new WorldTile((boundChunks[0] * 8) + x, (boundChunks[1] * 8) + y, 0);
	}
	
	public void addPlayer(Player player) {
		players.add(player);
		player.setForceMultiArea(true);
		if (this instanceof Instance)
			player.currentInstance = this;
		player.getPackets().sendGameMessage("You've joined " + Utils.formatPlayerNameForDisplay(owner.getDisplayName()) + "'s " + (hardMode ? "hard " : "normal ") +  "instance. This instance will remain active for approximately " + getMinutesRemaining() + " minutes.");
	}
	
	public final boolean removePlayer(Player player) {
		player.currentInstance = null;
		return players.remove(player);
	}
	
	public final int getMinutesRemaining() {
		return (int) Math.floor(instanceDuration - (totalSeconds / 60));
	}
	
	public final boolean isHardMode() {
		return hardMode;
	}
	
	public final int getBoss() {
		return bossId;
	}
	
	public final int getPassword() {
		return password;
	}
	
	public final int getPlayersLimit() {
		return playersLimit;
	}
	
	public final int getRespawnSpeed() {
		return respawnSpeed;
	}
	
	public final int getInstanceDuration() {
		return instanceDuration;
	}
	
	public final ArrayList<Player> getPlayers() {
		return players;
	}
	
	public final Player getOwner() {
		return owner;
	}
}