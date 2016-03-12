package me.filipzocktan.fortresscombat1;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEnableEvent;

import me.filipzocktan.fortresscombat1.chatmanager.Channel;

public class PluginEnableListener implements Listener {
    public PluginEnableListener() {
    }

    @EventHandler
    public void onEnable(PluginEnableEvent e) {
    	Bukkit.broadcastMessage("§d§m----------------------------");
        Bukkit.broadcastMessage("§bProject-Addons");
        Bukkit.broadcastMessage("§bPlugin by §aFilip Zocktan & HappyHappyBoy aka. xXFreakDevXx");
        Bukkit.broadcastMessage("§b/fcic für weitere Infos");
        Bukkit.broadcastMessage("§d§m----------------------------");
        for(Player p : Bukkit.getOnlinePlayers()){

    		try {
    			Channel.blue.remove(p);
    			Channel.red.remove(p);
    			Channel.green.remove(p);
    		} catch (Exception ex) {
    		}
        	
        	
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
}