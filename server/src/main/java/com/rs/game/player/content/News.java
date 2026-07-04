package com.rs.game.player.content;

import com.rs.Settings;

public enum News {

	
	NEWS1("Revision Update", "Fully converted Matrix 880 to 881.",
			Settings.TECHNICAL, "11/6/2017", true),
	NEWS2("Improved Immersion",
			"Added a bunch of Dialogue to NPCS in Lumby and added the ring of respawn.",
			Settings.GAME_UPDATES, "12/10/2023", true),
	NEWS3("First 100",
			"Added over 100 different changes that can be found soon on the website.",
			Settings.GAME_UPDATES, "19/11/2023", true);


	private String title, message, date;
	private int category;
	private boolean pinned;

	News(String title, String message, int category, String date, boolean pinned) {
		this.title = title;
		this.message = message;
		this.category = category;
		this.date = date;
		this.pinned = pinned;
	}

	public String getTitle() {
		return title;
	}

	public String getMessage() {
		return message;
	}

	public int getCategory() {
		return category;
	}

	public String getDate() {
		return date;
	}

	public boolean isPinned() {
		return pinned;
	}
}