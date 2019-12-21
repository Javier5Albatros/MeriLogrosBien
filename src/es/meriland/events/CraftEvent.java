package es.meriland.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftEvent
  implements Listener
{
  ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
  
  @EventHandler
  public void onShulkerCraft(CraftItemEvent e)
  {
    if (e.getRecipe().getResult().getType() == Material.SHULKER_BOX)
    {
      Player p = (Player)e.getWhoClicked();
      p.sendMessage("Has obtenido el logro de Dora dora");
      Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/dora");

    }
    
    if (e.getRecipe().getResult().getType() == Material.CAKE)
    {
      Player p = (Player)e.getWhoClicked();
      p.sendMessage("Has obtenido el logro de la tarta dora");
      Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only meriland:meriland/cake");

    }
  }
}
