package es.meriland.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

import es.meriland.api.Logros;

public class ClickEntityEvent implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEntityEvent event) {
		if(event.getHand().equals(EquipmentSlot.HAND)) {
			if(event.getRightClicked().getScoreboardTags().contains("logros") && event.getRightClicked() != null) {
				event.setCancelled(true);
				Logros.darLogros((Player)event.getPlayer());
			}
		}
	}

}
