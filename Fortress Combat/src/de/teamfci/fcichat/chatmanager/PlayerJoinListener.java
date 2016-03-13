package de.teamfci.fcichat.chatmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

	public PlayerJoinListener() {
		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("fci.team.green")){
			Channel.green.add(p);
		}else{
			if(p.hasPermission("fci.team.blue")){
				Channel.blue.add(p);
			}else{
				if(p.hasPermission("fci.team.red")){
					Channel.red.add(p);
				}else{
					p.sendMessage("§cFehler: Bitte lasse dich von einem Admin zu einem Team zuweisen!");
				}
			}
		}
	}
}
