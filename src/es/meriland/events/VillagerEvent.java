package es.meriland.events;

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
			event.setCancelled(true);
			Logros.darLogros((Player)event.getPlayer());
		}
	}

}
