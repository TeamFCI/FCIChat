package me.filipzocktan.fortresscombat1.chatmanager;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Channel {

	public static List<Player> green = new LinkedList<Player>();
	public static List<Player> blue = new LinkedList<Player>();
	public static List<Player> red = new LinkedList<Player>();
	static ChatChannel ccg = ChatChannel.CHANNEL_GREEN;
	public static String pg = ccg.getPrefix();
	
	static ChatChannel ccb = ChatChannel.CHANNEL_BLUE;
	public static String pb = ccb.getPrefix();
	
	static ChatChannel ccr = ChatChannel.CHANNEL_RED;
	public static String pr = ccr.getPrefix();
	

	public static void chatGlobal(String Nachricht){
		Bukkit.broadcastMessage("[" + ChatColor.GOLD + "GLOBAL" + ChatColor.RESET + "] " + Nachricht);
	}
	
	public static void CombatCast(String Nachricht){
		Bukkit.broadcastMessage(ChatColor.GRAY + "[" + ChatColor.RED + "COMBATCAST" + ChatColor.GRAY + "] " + ChatColor.RESET + Nachricht);
	}

}
