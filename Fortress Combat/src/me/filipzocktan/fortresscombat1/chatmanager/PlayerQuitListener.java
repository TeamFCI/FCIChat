package me.filipzocktan.fortresscombat1.chatmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;


/**
 * 
 * @author Filip Zocktan &#064; Filip Zocktan Development
 *
 */
public class PlayerQuitListener implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		try {
			Channel.blue.remove(p);
			Channel.red.remove(p);
			Channel.green.remove(p);
		} catch (Exception ex) {
		}
	}

	@EventHandler
	public void onLeave(PlayerKickEvent e) {
		Player p = e.getPlayer();
		try {
			Channel.blue.remove(p);
			Channel.red.remove(p);
			Channel.green.remove(p);
		} catch (Exception ex) {
		}
	}

}
