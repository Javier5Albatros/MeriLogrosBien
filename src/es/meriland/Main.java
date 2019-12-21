package es.meriland;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import es.meriland.commands.LogroCommand;
import es.meriland.commands.TestCommand;
//import es.meriland.events.PlayerFallEvent;
import es.meriland.events.CraftEvent;
import es.meriland.events.VillagerEvent;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		//Bukkit.getServer().getPluginManager().registerEvents(new PlayerFallEvent(), this);
		Bukkit.getPluginCommand("logro").setExecutor(new LogroCommand());
		Bukkit.getPluginCommand("test").setExecutor(new TestCommand()); 
		Bukkit.getServer().getPluginManager().registerEvents(new CraftEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new VillagerEvent(), this);
		
		//Tesoros		
		
	}
	
	public void onDisable() {
		
	}

}
