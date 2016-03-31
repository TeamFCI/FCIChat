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
			msg = e.getPlayer().getDisplayName() + " §5» §f" + msg;
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
			prefix = prefix.replace("-GRTeam-",  "§aTeam§6").replace("-BLTeam-",  "§bTeam§6").replace("-RTeam-",  "§cTeam§6");
			
				for (Player p2 : channel) {
					
						p2.sendMessage(p.getDisplayName() + " " + prefix +  " §5» §f" + e.getMessage());
			
				}
				
			
		}
	}

}
