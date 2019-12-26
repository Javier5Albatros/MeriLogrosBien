package es.meriland.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import es.meriland.Main;
import es.meriland.api.Logros;
public class TestCommand implements CommandExecutor {
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			Player p = (Player)sender;
		}
		return true;
	}
	
	

}
