package es.meriland.api;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class AdvancementsChecker {

	
	
	public static void veterano(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 600, Statistic.PLAY_ONE_MINUTE)) {
			p.sendMessage("Logro concedido!1");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/veterano");
			return;
		}
	}
	
	public static void fosil(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 4000, Statistic.PLAY_ONE_MINUTE)) {
			p.sendMessage("Logro concedido!");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/fosil");
			return;
		}
	}
	
	public static void shift(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 24, Statistic.SNEAK_TIME)) {
			p.sendMessage("Logro concedido!");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/shift");
			return;
		}
	}
	
	public static void markankaro(Player p) {
		if(AdvancementsStats.numeroItems(p, Material.DIAMOND) >=640 || (AdvancementsStats.numeroItems(p, Material.DIAMOND_BLOCK) == 71 && AdvancementsStats.numeroItems(p, Material.DIAMOND) >=1) || AdvancementsStats.numeroItems(p, Material.DIAMOND_BLOCK)>=72) {
			p.sendMessage("Markankaro es tuyo");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant " +p.getName()+ " only meriland:meriland/markankaro");
			return;
		}
	}
	
	public static void zipchu(Player p) {
		if(AdvancementsStats.numeroItems(p, Material.GOLDEN_CARROT) >= 2304) {
			p.sendMessage("Zipchu guapo");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
			return;
		}
	}
	
	public static void ochentadias(Player p) {
		if(AdvancementsStats.bloquesVolados(p)>=500000) {
			p.sendMessage("Buen volador");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/80dias");
			return;
		}
	}
	
	public static void xray(Player p) {
		if(AdvancementsStats.bloquesMinados(p, Material.DIAMOND_ORE) >=1024) {
			p.sendMessage("Buen xray");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/xray");
			return;
		}
	}
	
	public static void encantador(Player p) {
		if(AdvancementsStats.entidadesMatadas(p, EntityType.ENDERMAN)>=40000 && p.getStatistic(Statistic.ITEM_ENCHANTED) >=1000) { 
			p.sendMessage("Tas enfermo");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/encantador");
			return;
		}
	}
	
	public static void dragon(Player p) {
		if(AdvancementsStats.entidadesMatadas(p, EntityType.ENDER_DRAGON)>=149) {
			p.sendMessage("Matadragonas");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/149");
			return;
		}
	}
	
	public static void bell(Player p) {
		if(p.getStatistic(Statistic.BELL_RING)>= 1000000) {
			p.sendMessage("Buen campanero");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/bell");
			return;
		}
	}
	
	public static void jesus(Player p) {
		if(p.getStatistic(Statistic.WALK_ON_WATER_ONE_CM)/100 >= 6000) {
			p.sendMessage("Ave cristo");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/jesus");
			return;
		}
	}
	
	public static void insomnio(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 456, Statistic.TIME_SINCE_DEATH) && AdvancementsStats.tiempoHoras(p, 456, Statistic.TIME_SINCE_REST)) {
			p.sendMessage("Vete al psiquiatra");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/insomnio");
			return;
		}
	}
	
	public static void raids(Player p) {
		if(p.getStatistic(Statistic.RAID_WIN)>=200) {
			p.sendMessage("Aczino draids");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/raid200");
			return;
		}
	}
	
	public static void porky(Player p) {
		if(p.getStatistic(Statistic.PIG_ONE_CM)/100 >= 10000) {
			p.sendMessage("Vaya cerdaco");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/porky");
			return;
		}
	}
	
	public static void farlands(Player p) {
		if ((p.getStatistic(Statistic.WALK_ONE_CM)/100 + p.getStatistic(Statistic.SPRINT_ONE_CM)/100) >=36000000) {
			p.sendMessage("Vaya patas");
			Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/farlands");
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
