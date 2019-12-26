package es.meriland.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import es.meriland.Main;
import es.meriland.api.Logros;

public class VillagerEvent implements Listener {
	Main plugin;
	
	@EventHandler
	public void onClick(PlayerInteractEntityEvent event) {
		if(event.getRightClicked().getScoreboardTags().contains("logros") && event.getRightClicked() != null) {

				Player p = (Player)event.getPlayer();
				event.setCancelled(true);
					
					if(Logros.tiempoHoras(p, 600, Statistic.PLAY_ONE_MINUTE)) {
						p.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" <user> only meriland:meriland/veterano");
					}

				
				
					else if(Logros.tiempoHoras(p, 24, Statistic.SNEAK_TIME)) {
						p.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" <user> only meriland:meriland/shift");
					}
				
				
					else if(Logros.tiempoHoras(p, 2000, Statistic.PLAY_ONE_MINUTE)) {
						p.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/adiccion");
					}
				
				
					else if(Logros.tiempoHoras(p, 4000, Statistic.PLAY_ONE_MINUTE)) {
						p.sendMessage("Logro concedido!");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/fosil");
					}
				
				
				
					else if(Logros.numeroItems(p, Material.DIAMOND) >=640 || (Logros.numeroItems(p, Material.DIAMOND_BLOCK) == 71 && Logros.numeroItems(p, Material.DIAMOND) >=1) || Logros.numeroItems(p, Material.DIAMOND_BLOCK)>=72) {
						p.sendMessage("Markankaro es tuyo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant " +p.getName()+ " only meriland:meriland/markankaro");
					}
				
				
					else if(Logros.numeroItems(p, Material.GOLDEN_CARROT) >= 2304) {
						p.sendMessage("Zipchu guapo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
					}
				
				
					else if(Logros.bloquesVolados(p)>=500000) {
						p.sendMessage("Buen volador");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/80dias");
					} 
				
				
					else if(Logros.bloquesMinados(p, Material.DIAMOND_ORE) >=1024) {
						p.sendMessage("Buen xray");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/xray");
					}
				
					else if(Logros.entidadesMatadas(p, EntityType.ENDERMAN)>=40000 && p.getStatistic(Statistic.ITEM_ENCHANTED) >=1000) { //PENDIENTE DE MONTAR
						p.sendMessage("Tas enfermo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/encantador");
					}
				
				
					else if(Logros.entidadesMatadas(p, EntityType.ENDER_DRAGON)>=149) {
						p.sendMessage("Matadragonas");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/149");
					}
					
					else if(p.getStatistic(Statistic.BELL_RING)>= 1000000) {
						p.sendMessage("Buen campanero");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/bell");
					}
				
					else if(p.getStatistic(Statistic.WALK_ON_WATER_ONE_CM)/100 >= 6000) {
						p.sendMessage("Ave cristo");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/jesus");
					}
					
					else if(Logros.tiempoHoras(p, 456, Statistic.TIME_SINCE_DEATH) && Logros.tiempoHoras(p, 456, Statistic.TIME_SINCE_REST)) {
						p.sendMessage("Vete al psiquiatra");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/insomnio");
					}
					
					else if(p.getStatistic(Statistic.RAID_WIN)>=200) {
						p.sendMessage("Aczino draids");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/raid200");
					}
					
					else if(p.getStatistic(Statistic.PIG_ONE_CM)/100 >= 10000) {
						p.sendMessage("Vaya cerdaco");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/porky");
					}
					
					else if ((p.getStatistic(Statistic.WALK_ONE_CM)/100 + p.getStatistic(Statistic.SPRINT_ONE_CM)/100) >=36000000) {
						p.sendMessage("Vaya patas");
						Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/farlands");
					}
					
					else p.sendMessage("No te he dado ningun logro je");
		}
	}

}
