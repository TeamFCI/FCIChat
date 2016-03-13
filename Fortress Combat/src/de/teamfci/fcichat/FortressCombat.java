package de.teamfci.fcichat;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.teamfci.fcichat.chatmanager.CombatCast;
import de.teamfci.fcichat.chatmanager.PlayerChatListener;
import de.teamfci.fcichat.chatmanager.PlayerJoinListener;
import de.teamfci.fcichat.chatmanager.PlayerQuitListener;

/**
 * 
 * @author Filip Zocktan
 * 
 * @version 1.2
 * 
 * @see PlayerJoinListener
 * @see PlayerQuitListener
 * @see PlayerChatListener
 * @see CombatCast
 * @see FCICCommand
 *
 */

public class FortressCombat extends JavaPlugin {

	
	/**
	 * Wird automatisch von Der Spigot-API angesprochen
	 */
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new PlayerJoinListener(), this);
		pm.registerEvents(new PlayerChatListener(), this);
		pm.registerEvents(new PlayerQuitListener(), this);
		pm.registerEvents(new PluginEnableListener(), this);
		CombatCast command1 = new CombatCast(this);
		this.getCommand("combatcast").setExecutor(command1);
		this.getCommand("cc").setExecutor(command1);
		FCICCommand command2 = new FCICCommand();
		this.getCommand("fcic").setExecutor(command2);
		this.getCommand("fortresscombat1chat").setExecutor(command2);
		this.getCommand("fcichat").setExecutor(command2);
		System.out.println("FCI Chat aktiv.");
	}

	/**
	 * Wird automatisch von Der Spigot-API angesprochen
	 */
	public void onDisable() {
		System.out.println("Das FortressCombat I Hauptplugin wurde erfolgreich deaktiviert");
	}
	

}
