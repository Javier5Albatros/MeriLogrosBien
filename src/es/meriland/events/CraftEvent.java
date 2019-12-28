package es.meriland.events;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import es.meriland.api.AdvancementsMethods;


public class CraftEvent
  implements Listener
{
  ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
  
  @EventHandler
  public void onCraftEvent(CraftItemEvent e) {
	  if(e.getWhoClicked() instanceof Player) {
		  Player p = (Player)e.getWhoClicked();
		  switch (e.getRecipe().getResult().getType()) {
		  
		  case PURPLE_SHULKER_BOX: if(!AdvancementsMethods.hasAdvancement(p, "meriland/dora")) AdvancementsMethods.concederLogro(p, "meriland/dora");
		  break;
		  
		  case CAKE: if(!AdvancementsMethods.hasAdvancement(p, "meriland/cake")) AdvancementsMethods.concederLogro(p, "meriland/cake");
		  break;
		  
		  default: 
			  break;
		  }
	  }
  }
}
