package es.meriland.commands;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.apache.commons.lang3.EnumUtils;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import es.meriland.Main;


public class TestCommand implements CommandExecutor {
	Main plugin;
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("test")) {
			Player p = (Player)sender;
			if(args.length == 2) {
				try {
					p.setStatistic(getStat(args[0]), Integer.parseInt(args[1]));
					p.sendMessage(ChatColor.GREEN+"Estadística "+args[0]+" cambiada correctamente a "+args[1]+".");
				} catch(Exception e) {
					sender.sendMessage(ChatColor.RED+"Asegurate de haber hecho /test <estadística> <nivel>");
				}
			} else if (args.length == 3) {
				if(EnumUtils.isValidEnum(Material.class, args[1])) {
					try {
						p.setStatistic(getStat(args[0]), material(args[1]), Integer.parseInt(args[2]));
						p.sendMessage(ChatColor.GREEN+"Estadística "+args[0]+" del material "+args[1]+" cambiada correctamente a "+args[2]+".");
					} catch (Exception e) {
						sender.sendMessage(ChatColor.RED+"Asegurate de que has escogido una estadística aplicable a un material.");
					}

				} else if (EnumUtils.isValidEnum(EntityType.class, args[1])){
					try {
						p.setStatistic(getStat(args[0]), entity(args[1]), Integer.parseInt(args[2]));
						p.sendMessage(ChatColor.GREEN+"Estadística "+args[0]+" de la entidad "+args[1]+" cambiada correctamente a "+args[2]+".");
					} catch(Exception e) {
						sender.sendMessage(ChatColor.RED+"Asegurate de que has escogido una estadística aplicable a una entidad.");
					}

				}
			} else {
				sender.sendMessage(ChatColor.RED+"El uso correcto es /test <Stat> <Nivel>");
			}
		}
		return true;
	
	}	
	
	Statistic getStat(String s) {
		Statistic stat = Statistic.valueOf(s);
		return stat;
	}
	
	Material material(String s) {
		Material mat = Material.valueOf(s);
		return mat;
	}
	
	EntityType entity(String s) {
		EntityType mat = EntityType.valueOf(s);
		return mat;
	}

}
