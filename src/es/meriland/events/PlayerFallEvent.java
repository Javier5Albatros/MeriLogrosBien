package es.meriland.events;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class PlayerFallEvent implements Listener {
	
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();


	@EventHandler
	public void onPlayerFall(EntityDamageEvent e) {
		Entity entity = e.getEntity();
		if(entity instanceof Player) {
			if(e.getCause() == DamageCause.FALL) {
				Damageable p = (Damageable)entity;
				double h = p.getHealth();
				double damage = e.getDamage();
				double hfinal = h-damage;
				double caida = p.getFallDistance();
				
				
				if(caida >= 250 && hfinal > 0) {//Puenting fallido
					p.sendMessage("pos si");
				}
				
				if(hfinal <= 1 && hfinal > 0) {
					p.sendMessage("coresto"); //Cero dramas
					Bukkit.dispatchCommand(console, "advancement grant "+p.getName()+" only meriland:meriland/zipchu");
				}
			}
		}
	}
}
