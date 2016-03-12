package me.filipzocktan.fortresscombat1;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FCICCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			 p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
			if (p.hasPermission("fci.fci")) {
				p.sendMessage(
						"§f[§aFCIChat§f] §2/cc [Nachricht mit Leerzeichen] oder /combatcast [Nachricht mit Leerzeichen] zum Senden von Servernachrichten.");
				p.sendMessage(
						"§f[§aFCIChat§f] §2Bitte keine \"*\"-Permissions verwenden, bzw. die Permissions \"-fci.team.'falschesteam1'\" & \"-fci.team.'faschesteam2'\"");
			}
			p.sendMessage("§f[§aFCIChat§f] §2Nachrichten mit \"@all\" zum Senden von Globalnachrichten.");
			p.sendMessage("§f[§aFCIChat§f] §2Ansonsten bleiben die Nachrichten innerhalb eures Teams.");
             p.sendMessage("§a§l *-*-*-*-*-*-*-*-*-*-*-*");
		}
		return false;
	}

}
