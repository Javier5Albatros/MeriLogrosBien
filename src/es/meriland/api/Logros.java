package es.meriland.api;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import es.meriland.Main;

public class Logros {
	Main plugin;
	
	public static boolean tiempoHoras(Player player, long horas, Statistic stat) {
		long tics = horas*3600*20;
		long jugado = player.getStatistic(stat);
		if(tics<=jugado)return true;
		else return false;
	}
	
	
	public static int numeroItems(Player player, Material item) {
		
		int cantidad = 0;
		for (int i = 0; i < 36; i++) {
            ItemStack slot = player.getInventory().getItem(i);
            if (slot == null || !slot.isSimilar(new ItemStack(item)))
                continue;
            cantidad += slot.getAmount();
        }
		return cantidad;
	}

	public static int bloquesVolados(Player player) {
		return player.getStatistic(Statistic.AVIATE_ONE_CM)/100;
	}
	
	public static int bloquesMinados(Player player, Material item) { 
		return player.getStatistic(Statistic.MINE_BLOCK, item);
	}
	
	public static int entidadesMatadas(Player player, EntityType entity) {
		return player.getStatistic(Statistic.KILL_ENTITY, entity);
	}

	

    public static Advancement getAdvancement(String name) {
        Iterator<Advancement> it = Bukkit.getServer().advancementIterator();
        while (it.hasNext()) {
            Advancement a = it.next();
            if (a.getKey().toString().equalsIgnoreCase(name)) {
                return a;
            }
        }
        return null;
    }
	
	
    public static boolean hasAdvancement(Player player, String name) {
        Advancement a = getAdvancement(name);
        if(a == null) {
            return false;
        }
        AdvancementProgress progress = player.getAdvancementProgress(a);
        return progress.isDone();
    }

	
	
	
	
	
	public static void darLogros(Player p) {
		
		if(!hasAdvancement(p, "meriland:meriland/veterano")) {//600
			if(tiempoHoras(p, 600, Statistic.PLAY_ONE_MINUTE)) {
				p.sendMessage("Logro concedido!1");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/veterano");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/")) {//2000
			if(tiempoHoras(p, 2000, Statistic.PLAY_ONE_MINUTE)) {
				p.sendMessage("Logro concedido!2");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/fosil")) {//4000
			if(tiempoHoras(p, 4000, Statistic.PLAY_ONE_MINUTE)) {
				p.sendMessage("Logro concedido!");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+ " only meriland:meriland/fosil");
				return;
			}
		}

		if(!hasAdvancement(p, "meriland:meriland/shift")) {
			if(tiempoHoras(p, 24, Statistic.SNEAK_TIME)) {
				p.sendMessage("Logro concedido!");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/shift");
				return;
			}
		}

		if(!hasAdvancement(p, "meriland:meriland/markankaro")) {
			if(numeroItems(p, Material.DIAMOND) >=640 || (numeroItems(p, Material.DIAMOND_BLOCK) == 71 && numeroItems(p, Material.DIAMOND) >=1) || numeroItems(p, Material.DIAMOND_BLOCK)>=72) {
				p.sendMessage("Markankaro es tuyo");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant " +p.getName()+ " only meriland:meriland/markankaro");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/zipchu")) {
			if(numeroItems(p, Material.GOLDEN_CARROT) >= 2304) {
				p.sendMessage("Zipchu guapo");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/80dias")) {
			if(bloquesVolados(p)>=500000) {
				p.sendMessage("Buen volador");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/80dias");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/xray")) {
			if(bloquesMinados(p, Material.DIAMOND_ORE) >=1024) {
				p.sendMessage("Buen xray");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/xray");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/encantador")) {
			if(entidadesMatadas(p, EntityType.ENDERMAN)>=40000 && p.getStatistic(Statistic.ITEM_ENCHANTED) >=1000) { 
				p.sendMessage("Tas enfermo");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/encantador");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:mobteca/149")) {
			if(entidadesMatadas(p, EntityType.ENDER_DRAGON)>=149) {
				p.sendMessage("Matadragonas");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/149");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/bell")) {
			if(p.getStatistic(Statistic.BELL_RING)>= 1000000) {
				p.sendMessage("Buen campanero");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/bell");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/jesus")) {
			if(p.getStatistic(Statistic.WALK_ON_WATER_ONE_CM)/100 >= 6000) {
				p.sendMessage("Ave cristo");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/jesus");
				return;
			}
		}
	
		if(!hasAdvancement(p, "meriland:meriland/insomnio")) {
			if(tiempoHoras(p, 456, Statistic.TIME_SINCE_DEATH) && tiempoHoras(p, 456, Statistic.TIME_SINCE_REST)) {
				p.sendMessage("Vete al psiquiatra");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/insomnio");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:mobteca/raid200")) {
			if(p.getStatistic(Statistic.RAID_WIN)>=200) {
				p.sendMessage("Aczino draids");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:mobteca/raid200");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/porky")) {
			if(p.getStatistic(Statistic.PIG_ONE_CM)/100 >= 10000) {
				p.sendMessage("Vaya cerdaco");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/porky");
				return;
			}
		}
		
		if(!hasAdvancement(p, "meriland:meriland/farlands")) {
			if ((p.getStatistic(Statistic.WALK_ONE_CM)/100 + p.getStatistic(Statistic.SPRINT_ONE_CM)/100) >=36000000) {
				p.sendMessage("Vaya patas");
				Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/farlands");
				return;
			}
		}
		p.sendMessage("No logro");
		
	}
	

}