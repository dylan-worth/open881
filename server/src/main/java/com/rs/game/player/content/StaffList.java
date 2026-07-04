package com.rs.game.player.content;

import com.rs.game.World;
import com.rs.game.player.Player;

public class StaffList {

	private final static int INTERFACE = 1158;

	private final static String ONLINE = "<col=02AB2F>Online</col>";
	private final static String OFFLINE = "<col=DB0000>Offline</col>";

	private enum Staff {

		OWNER("timelord", "Owner", "timelord"),

		CO_OWNER("lil mitch75", "Co-Owner", "lil_mitch75", "", ""),

		ADMINISTRATOR1("Propker009", "Developer", "propker009"),

		ADMINISTRATOR2("", "Administrator", ""),

		MODERATOR1("alex", "Moderator", "alex"),

		MODERATOR2("rewter", "Moderator", "rewter"),
		
		SUPPORT1("tigermastres", "Supporter", "tigermastres"),

		SUPPORT2("", "Supporter", "", "");

		private final String username, position;
		private final String[] usernames;

		Staff(String username, String position, String... usernames) {
			this.username = username;
			this.position = position;
			this.usernames = usernames;
		}

		public String getUsername() {
			return username;
		}

		public String getPosition() {
			return position;
		}

		public String getOnline() {
			for (String name : usernames) {
				if (World.containsPlayer(name))
					return ONLINE;
			}
			return OFFLINE;
		}
	}

	public static void send(Player player) {
		player.getInterfaceManager().sendCentralInterface(INTERFACE);

		player.getPackets().sendIComponentText(INTERFACE, 74, "Staff List");
		int componentId = 8;
		int number = 1;
		for (Staff staff : Staff.values()) {
			if (componentId >= 56) // end of interface
				return;
			player.getPackets().sendIComponentText(INTERFACE, componentId++,
					"" + number++);
			player.getPackets().sendIComponentText(INTERFACE, componentId++,
					staff.getUsername());
			player.getPackets().sendIComponentText(INTERFACE, componentId++,
					staff.getPosition());
			player.getPackets().sendIComponentText(INTERFACE, componentId++,
					staff.getOnline());
			componentId++;
		}
	}
}