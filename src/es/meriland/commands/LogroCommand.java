package es.meriland.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import es.meriland.api.Logros;

public class LogroCommand implements CommandExecutor {


	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getLabel().equalsIgnoreCase("logro")) {
			Player p = (Player)sender;
			if(args.length==1) {
				
				if(args[0].equalsIgnoreCase("veterano")) {
					if(Logros.tiempoHoras(p, 600, Statistic.PLAY_ONE_MINUTE)) {
						sender.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" <user> only meriland:meriland/veterano");
					}
					else sender.sendMessage("Error, tienes que jugar mas.");
				} 
				
				
				if(args[0].equalsIgnoreCase("shift")) {
					if(Logros.tiempoHoras(p, 24, Statistic.SNEAK_TIME)) {
						sender.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" <user> only meriland:meriland/shift");
					}
					else sender.sendMessage("Error, tienes que jugar mas.");
				} 
				
				
				else if(args[0].equalsIgnoreCase("adiccion")) {
					if(Logros.tiempoHoras(p, 200, Statistic.PLAY_ONE_MINUTE)) {
						sender.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/adiccion");
					}
					else sender.sendMessage("Error, tienes que jugar mas.");
				}
				
				
				else if(args[0].equalsIgnoreCase("fosil")) {
					if(Logros.tiempoHoras(p, 4000, Statistic.PLAY_ONE_MINUTE)) {
						sender.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/fosil");
					}
					else sender.sendMessage("Error, tienes que jugar mas.");
				}
				
				
				
				else if(args[0].equalsIgnoreCase("markankaro")) {
					if(Logros.numeroItems(p, Material.DIAMOND) >=640 || (Logros.numeroItems(p, Material.DIAMOND_BLOCK) == 71 && Logros.numeroItems(p, Material.DIAMOND) >=1) || Logros.numeroItems(p, Material.DIAMOND_BLOCK)>=72) {
						sender.sendMessage("Markankaro es tuyo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant " +p.getName()+ " only meriland:meriland/markankaro");
					} else sender.sendMessage("Mina más anda.");
				}
				
				
				else if(args[0].equalsIgnoreCase("zipchu")) {
					if(Logros.numeroItems(p, Material.GOLDEN_CARROT) == 2304) {
						sender.sendMessage("Zipchu guapo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
					} else sender.sendMessage("Mal zanahorio");
				}
				
				
				else if(args[0].equalsIgnoreCase("80dias")) {
					if(Logros.bloquesVolados(p)>=500000) {
						sender.sendMessage("BNuen volador");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(),  "advancement grant \"+p.getName()+\" only meriland:meriland/80dias");
					} else {
						sender.sendMessage("No vuelas bien");
					}
				}
				
				
				else if(args[0].equalsIgnoreCase("xray")) {
					if(Logros.bloquesMinados(p, Material.DIAMOND_ORE) >=1024) {
						sender.sendMessage("Buen xray");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/xray");
					} else {
						sender.sendMessage("Tu eres legal <3");
					}
				}
				
				
				else if(args[0].equalsIgnoreCase("encantador")) {
					if(Logros.entidadesMatadas(p, EntityType.ENDERMAN)>=40000 && p.getStatistic(Statistic.ITEM_ENCHANTED) >=1000) {
						sender.sendMessage("Tas enfermo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/encantador");
					} else {
						sender.sendMessage("Tas bien");
					}
				}
				
				
				else if(args[0].equalsIgnoreCase("149")) {
					if(Logros.entidadesMatadas(p, EntityType.ENDER_DRAGON)>=149) {
						sender.sendMessage("Matadragonas");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/149");
					} else {
						sender.sendMessage("Ere uninuti");
					}
				}
				
				else if(args[0].equalsIgnoreCase("campanas")) {
					if(p.getStatistic(Statistic.BELL_RING)>= 1000000) {
						sender.sendMessage("Buen campanero");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/bell");
					} else {
						sender.sendMessage("Mal campanero");
					}
				}
				
				else if(args[0].equalsIgnoreCase("jesus")) {
					if(p.getStatistic(Statistic.WALK_ON_WATER_ONE_CM)/100 >= 6000) {
						sender.sendMessage("Ave cristo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/jesus");
					} else {
						sender.sendMessage("Mal papo");
					}
				}
				
				
				else sender.sendMessage("Logro no encontrado");
			}else sender.sendMessage("Usa /logro <comando>");
		}
		return true;
	}
}
