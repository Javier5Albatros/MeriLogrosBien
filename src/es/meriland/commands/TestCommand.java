package es.meriland.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import es.meriland.Main;
public class TestCommand implements CommandExecutor {
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			
		}
		return true;
	}
	
	

}
