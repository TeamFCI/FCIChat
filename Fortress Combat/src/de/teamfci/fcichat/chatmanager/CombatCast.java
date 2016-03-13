package de.teamfci.fcichat.chatmanager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.teamfci.fcichat.FortressCombat;

public class CombatCast implements CommandExecutor {
	public static String noPerm = "§cDu hast keine Permission dazu!";
	@SuppressWarnings("unused")
	private FortressCombat plugin;

	public CombatCast(FortressCombat fortressCombat) {
		this.plugin = fortressCombat;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player p = (Player) sender;
			if(args.length == 0) {
				if(p.hasPermission("fci.fci")) {
					p.sendMessage("§7/cc (Text: Mit Leerzeichen)");
				} else {
					p.sendMessage(noPerm);
					return true;
				}
			}
			
			if(args.length > 0) {
				if(p.hasPermission("fci.fci")) {
					String msg = "";
					for(int i = 0; i < args.length; i++) {
						if(i == 0 ) {
							msg = msg + args[i];
						} else {
							msg = msg + " " + args[i];
						}
					}
					Channel.CombatCast(msg);
				} else {
					p.sendMessage(noPerm);
					return true;
				}
			}
		}
		return false;
	}

}
