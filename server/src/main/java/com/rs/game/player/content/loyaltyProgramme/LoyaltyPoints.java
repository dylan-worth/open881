package com.rs.game.player.content.loyaltyProgramme;

import java.io.Serializable;

import com.rs.game.player.Player;
import com.rs.utils.Utils;

import discordBot.main.events.ingame.LoyaltyListener;

/**
 * @author DylanPage95 || dylan_page_95@hotmail.com
 *
 * Created on : 10-10-2018 at 5:27:06 pm
 */
public class LoyaltyPoints implements Serializable {

private static final long serialVersionUID = 6952020761936257316L;
	
	private transient Player player;
	
	private long lastDailyPoints;
	
	public int daily = 0, earned = 1, total = 2;
	
	private int dailyPoints, earnedPoints, boughtPoints;
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public LoyaltyPoints() {
		lastDailyPoints = Utils.currentTimeMillis();
		dailyPoints = 0;
		earnedPoints = 0;
		boughtPoints = 0;
	}
	
	public void giveDailyPoints() {
		if (Utils.currentTimeMillis() - lastDailyPoints < (24 * 60 * 60 * 1000))
			return;
		lastDailyPoints = Utils.currentTimeMillis();
		int previous = dailyPoints;
		dailyPoints += 100;
		if (dailyPoints > previous) {
			LoyaltyListener.SendMessage(player.getName() + " just gained " + (dailyPoints - previous) + " (" + getAllPoints() + ") loyalty points for logging in today");
		}
	}
	
	public int getAllPoints() {
		return dailyPoints + earnedPoints + boughtPoints;
	}
	
	public int getDailyPoints() {
		return dailyPoints;
	}

	public void setDailyPoints(int dailyPoints) {
		this.dailyPoints = dailyPoints;
	}

	public int getEarnedPoints() {
		return earnedPoints;
	}

	public void setEarnedPoints(int earnedPoints) {
		this.earnedPoints = earnedPoints;
	}

	public int getBoughtPoints() {
		return boughtPoints;
	}

	public void setboughtPoints(int boughtPoints) {
		this.boughtPoints = boughtPoints;
	}

	public void handleBoughtLoyalty(int amount) {
		this.boughtPoints += amount;
	}

	public void handleEarnedLoyalty(int amount) {
		this.earnedPoints += amount;
	}
	
}
