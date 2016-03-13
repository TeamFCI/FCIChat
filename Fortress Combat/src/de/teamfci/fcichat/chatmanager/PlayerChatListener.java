package de.teamfci.fcichat.chatmanager;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class PlayerChatListener implements Listener {

	private List<Player> channel = new LinkedList<Player>();
	private String prefix;

	public PlayerChatListener() {
		
	}
	
	@EventHandler
	public void onChat(PlayerChatEvent e) {
		if (e.getMessage().startsWith("@all")) {
			
			String msg = e.getMessage().replaceAll("@all", "");
			msg = e.getPlayer().getName() + " " + msg;
			Channel.chatGlobal(msg);
			e.setCancelled(true);
			
		} else {
			Player p = e.getPlayer();
			e.setCancelled(true);
			if (Channel.blue.contains(p)) {
				channel = Channel.blue;
				prefix = Channel.pb;
			}
			if (Channel.green.contains(p)) {
				channel = Channel.green;
				prefix = Channel.pg;
			}
			if (Channel.red.contains(p)) {
				channel = Channel.red;
				prefix = Channel.pr;
			}
			prefix = prefix.replace("-GRTeam-",  "§aTeam§b").replace("-BLTeam-",  "§bTeam§b").replace("-RTeam-",  "§cTeam§b");
			if(channel.size() != 1) {
				for (Player p2 : channel) {
					if(p2 != p) {
						p2.sendMessage(p.getName() + "§b | " + prefix +  " §f» §b" + e.getMessage());
					}
				}
				p.sendMessage("§fDU §b| " + prefix + " §f» §b" + e.getMessage());
			} else {
				p.sendMessage("§fDU §b| " + prefix + " §f» §b" + e.getMessage());
			}
		}
	}

}
