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
		  
		  case SHULKER_BOX: AdvancementsMethods.concederLogro(p, "meriland:meriland/dora");
		  break;
		  
		  case CAKE: AdvancementsMethods.concederLogro(p, "cake");
		  break;
		  
		  default:
		  break;
		  }
	  }
  }
}
