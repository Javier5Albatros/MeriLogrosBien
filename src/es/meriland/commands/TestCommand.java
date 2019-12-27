package es.meriland.commands;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import es.meriland.Main;
import es.meriland.api.AdvancementsMethods;
import es.meriland.api.AdvancementsStats;


public class TestCommand implements CommandExecutor {
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			Player p = (Player)sender;
			if(AdvancementsMethods.hasAdvancement(p, "meriland:meriland/zipchu")) {
				if(AdvancementsStats.numeroItems(p, Material.GOLDEN_CARROT) >= 2304) {
					p.sendMessage("Zipchu guapo");
					Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
				}
			}
		}
		return true;
	}
	
	

}
