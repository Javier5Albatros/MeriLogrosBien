package es.meriland.api;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class AdvancementsStats {
	
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

}
