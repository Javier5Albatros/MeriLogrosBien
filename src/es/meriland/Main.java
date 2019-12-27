package es.meriland;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import es.meriland.commands.Tab;
import es.meriland.commands.TestCommand;
import es.meriland.events.ClickEntityEvent;
import es.meriland.events.CraftEvent;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getPluginCommand("test").setExecutor(new TestCommand()); 
		Bukkit.getServer().getPluginManager().registerEvents(new CraftEvent(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ClickEntityEvent(), this);
		Bukkit.getPluginCommand("test").setTabCompleter(new Tab());
		
		
	}
	
	public void onDisable() {
		
	}

}
