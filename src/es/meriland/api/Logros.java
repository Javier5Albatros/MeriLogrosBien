package es.meriland.api;

import org.bukkit.entity.Player;

import es.meriland.Main;
import net.md_5.bungee.api.ChatColor;

public class Logros {
	Main plugin;

	
	
	public static void darLogros(Player p) {
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/veterano")) {//600
			if(AdvancementsChecker.veterano(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/adiccion")) {//2000
			if(AdvancementsChecker.adiccion(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/fosil")) {//4000
			if(AdvancementsChecker.fosil(p)) return;		
		}

		if(!AdvancementsMethods.hasAdvancement(p, "meriland/shift")) {
			if(AdvancementsChecker.shift(p)) return;
		}

		if(!AdvancementsMethods.hasAdvancement(p, "meriland/markankaro")) {
			if(AdvancementsChecker.markankaro(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/zipchu")) {
			if(AdvancementsChecker.zipchu(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/80dias")) {
			if(AdvancementsChecker.ochentadias(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/xray")) {
			if(AdvancementsChecker.xray(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/encantador")) {
			if(AdvancementsChecker.encantador(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "mobteca/149")) {
			if(AdvancementsChecker.dragon(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/bell")) {
			if(AdvancementsChecker.bell(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/jesus")) {
			if(AdvancementsChecker.jesus(p)) return;
		}
	
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/insomnio")) {
			if(AdvancementsChecker.insomnio(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "mobteca/raid200")) {
			if(AdvancementsChecker.raids(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/porky")) {
			if(AdvancementsChecker.porky(p)) return;
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland/farlands")) { 
			if(AdvancementsChecker.farlands(p)) return;
		}
		p.sendMessage(ChatColor.RED+"No he podido darte nigún logro :(");
		
	}
	

}