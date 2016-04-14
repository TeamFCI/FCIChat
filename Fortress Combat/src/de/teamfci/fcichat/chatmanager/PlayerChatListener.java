package de.teamfci.fcichat.chatmanager;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class PlayerChatListener implements Listener {

	public PlayerChatListener() {

	}

	@EventHandler
	public void onChat(PlayerChatEvent e) {
		if (e.getMessage().startsWith("@all")) {

			String msg = e.getMessage().replaceAll("@all", "");
			msg = e.getPlayer().getDisplayName() + " §5» §f" + msg;
			Channel.chatGlobal(msg);
			e.setCancelled(true);

		} else {
			Player p = e.getPlayer();
			e.setCancelled(true);
			for (Player p2 : Bukkit.getOnlinePlayers()) {

				if (e.getMessage().startsWith("@t")) {
					if (p.hasPermission("fci.team.team")) {
						if (p2.hasPermission("fci.team.team")) {
							p2.sendMessage("[§8Serverteam§f]" + p.getDisplayName() + " §5»§f "
									+ e.getMessage().replaceAll("@t", ""));
						}
					}
				} else {
					if (p.hasPermission("fci.team.green")) {
						if (p2.hasPermission("fci.team.green")) {
							p2.sendMessage("[§aTeam§f] " + p.getDisplayName() + " §5»§f " + e.getMessage());
						}
					}
					if (p.hasPermission("fci.team.red")) {
						if (p2.hasPermission("fci.team.red")) {
							p2.sendMessage("[§cTeam§f] " + p.getDisplayName() + " §5»§f " + e.getMessage());
						}
					}
					if (p.hasPermission("fci.team.blue")) {
						if (p2.hasPermission("fci.team.blue")) {
							p2.sendMessage("[§9Team§f] " + p.getDisplayName() + " §5»§f " + e.getMessage());
						}
					}

				}
			}

		}
	}

}
