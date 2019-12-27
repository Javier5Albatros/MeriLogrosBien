package es.meriland.api;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.entity.Player;

public class AdvancementsMethods {
	
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
    
    public static void concederLogro(Player p, String logro) {
    	Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "advancement grant "+p.getName()+" only "+logro);
    }

}
