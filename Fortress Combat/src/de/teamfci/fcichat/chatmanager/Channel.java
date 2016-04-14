package de.teamfci.fcichat.chatmanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Channel {	
	

	public static void chatGlobal(String Nachricht){
		Bukkit.broadcastMessage("[" + ChatColor.GOLD + "GLOBAL" + ChatColor.RESET + "] " + Nachricht);
	}
	
	public static void CombatCast(String Nachricht){
		Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED + "COMBATCAST" + ChatColor.GRAY + "] " + ChatColor.RESET + Nachricht);
	}

}
