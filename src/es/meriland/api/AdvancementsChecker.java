package es.meriland.api;


import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class AdvancementsChecker {

	
	
	public static void veterano(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 600, Statistic.PLAY_ONE_MINUTE)) {
			AdvancementsMethods.concederLogro(p, "meriland/veterano");
			return;
		}
	}
	
	public static void adiccion(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 2000, Statistic.PLAY_ONE_MINUTE)) {
			AdvancementsMethods.concederLogro(p, "meriland/adiccion");
			return;
		}
	}
	
	public static void fosil(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 4000, Statistic.PLAY_ONE_MINUTE)) {
			AdvancementsMethods.concederLogro(p, "meriland/fosil");
			return;
		}
	}
	
	public static void shift(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 24, Statistic.SNEAK_TIME)) {
			AdvancementsMethods.concederLogro(p, "meriland/shift");
			return;
		}
	}
	
	public static void markankaro(Player p) {
		if(AdvancementsStats.numeroItems(p, Material.DIAMOND) >=640 || (AdvancementsStats.numeroItems(p, Material.DIAMOND_BLOCK) == 71 && AdvancementsStats.numeroItems(p, Material.DIAMOND) >=1) || AdvancementsStats.numeroItems(p, Material.DIAMOND_BLOCK)>=72) {
			AdvancementsMethods.concederLogro(p, "meriland/markankaro");
			return;
		}
	}
	
	public static void zipchu(Player p) {
		if(AdvancementsStats.numeroItems(p, Material.GOLDEN_CARROT) >= 2304) {
			AdvancementsMethods.concederLogro(p, "meriland:meriland/zipchu");
			return;
		}
	}
	
	public static void ochentadias(Player p) {
		if(AdvancementsStats.bloquesVolados(p)>=500000) {
			AdvancementsMethods.concederLogro(p, "meriland/80dias");
			return;
		}
	}
	
	public static void xray(Player p) {
		if(AdvancementsStats.bloquesMinados(p, Material.DIAMOND_ORE) >=1024) {
			AdvancementsMethods.concederLogro(p, "meriland/xray");
			return;
		}
	}
	
	public static void encantador(Player p) {
		if(AdvancementsStats.entidadesMatadas(p, EntityType.ENDERMAN)>=40000 && p.getStatistic(Statistic.ITEM_ENCHANTED) >=1000) { 
			AdvancementsMethods.concederLogro(p, "meriland/encantador");
			return;
		}
	}
	
	public static void dragon(Player p) {
		if(AdvancementsStats.entidadesMatadas(p, EntityType.ENDER_DRAGON)>=149) {
			AdvancementsMethods.concederLogro(p, "mobteca/149");
			return;
		}
	}
	
	public static void bell(Player p) {
		if(p.getStatistic(Statistic.BELL_RING)>= 1000000) {
			AdvancementsMethods.concederLogro(p, "meriland/bell");
			return;
		}
	}
	
	public static void jesus(Player p) {
		if(p.getStatistic(Statistic.WALK_ON_WATER_ONE_CM)/100 >= 6000) {
			AdvancementsMethods.concederLogro(p, "meriland/jesus");
			return;
		}
	}
	
	public static void insomnio(Player p) {
		if(AdvancementsStats.tiempoHoras(p, 456, Statistic.TIME_SINCE_DEATH) && AdvancementsStats.tiempoHoras(p, 456, Statistic.TIME_SINCE_REST)) {
			AdvancementsMethods.concederLogro(p, "meriland/insomnio");
			return;
		}
	}
	
	public static void raids(Player p) {
		if(p.getStatistic(Statistic.RAID_WIN)>=200) {
			AdvancementsMethods.concederLogro(p, "mobteca/raid200");
			return;
		}
	}
	
	public static void porky(Player p) {
		if(p.getStatistic(Statistic.PIG_ONE_CM)/100 >= 10000) {
			AdvancementsMethods.concederLogro(p, "meriland/porky");
			return;
		}
	}
	
	public static void farlands(Player p) {
		if ((p.getStatistic(Statistic.WALK_ONE_CM)/100 + p.getStatistic(Statistic.SPRINT_ONE_CM)/100) >=36000000) {
			AdvancementsMethods.concederLogro(p, "meriland/farlands");
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
