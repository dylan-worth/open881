package com.rs.login;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.executor.LoginExecutorManager;
import com.rs.login.account.Account;
import com.rs.net.LoginServerChannelManager;
import com.rs.net.encoders.LoginChannelsPacketEncoder;

public class ForumAuthManager {

	public static void registerAuth(final Account account, final String username, final String password) {
		if (!Settings.HOSTED) {
			LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "Can't auth \"" + username + "\" \"" + password + "\", running in local mode.").getBuffer());
			return;
		}

		LoginExecutorManager.authsExecutor.schedule(new Runnable() {
			@Override
			public void run() {
				try {
					String link = Settings.WEB_API_LINK + "?world=eco&action=regauth" + "&username=" + URLEncoder.encode(username.toString(), "UTF-8") + "&password=" + URLEncoder.encode(password.toString(), "UTF-8") + "&gameuser=" + URLEncoder.encode(account.getUsername(), "UTF-8");
					URLConnection c = new URL(link).openConnection();
					c.setConnectTimeout(5000);
					BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
					String response = reader.readLine();
					reader.close();
					if (response.startsWith("reg-ok:")) {
						String[] spl = response.split("\\:");
						int userID = Integer.parseInt(spl[1]);
						String ranks = spl[2];
						account.syncRanksFromForumGroups(ranks);
						LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "Forum account " + username.toString() + " has been authorized to your game account sucessfully.").getBuffer());

					} else if (response.equals("error")) {
						throw new RuntimeException();
					} else if (response.equals("reg-alreadyauthed")) {
						LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "That account is already authorised by someone else.").getBuffer());
					} else if (response.equals("reg-wronginfo")) {
						LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "You have entered incorrect username or password.").getBuffer());
					} else {
						LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "Unexpected server response.").getBuffer());
					}
				} catch (Throwable t) {
					t.printStackTrace();
					LoginServerChannelManager.sendUnreliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodePlayerGameMessage(account.getUsername(), "An error occured, please try again later.").getBuffer());
				}
			}
		}, 0L, TimeUnit.MILLISECONDS);
	}


}
