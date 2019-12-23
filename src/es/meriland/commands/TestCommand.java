package es.meriland.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Statistic;
import org.bukkit.Tag;
import org.bukkit.advancement.Advancement;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import es.meriland.Main;
import es.meriland.api.Logros;

public class TestCommand implements CommandExecutor {
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			Player p = (Player)sender;
			Advancement logro = Bukkit.getAdvancement(NamespacedKey.minecraft("story/root"));
			Material material = null;
			int i = p.getStatistic(Statistic.MINE_BLOCK, material);
			if(p.getAdvancementProgress(logro).isDone())sender.sendMessage("si");
			else sender.sendMessage("no");
			
		}
		return true;
	}
	
	
	public static int slabs(Player p, Material material) {
		if(Tag.SLABS.isTagged(material)) {
			for(material : Material.lis)
			
		}
		int i = p.getStatistic(Statistic.MINE_BLOCK, Material.getMaterial("a"));
		return i;
	}

}
