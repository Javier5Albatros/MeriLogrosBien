package es.meriland.api;

import org.bukkit.entity.Player;

import es.meriland.Main;

public class Logros {
	Main plugin;

	
	
	public static void darLogros(Player p) {
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/veterano")) {//600
			AdvancementsChecker.veterano(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/adiccion")) {//2000
			AdvancementsChecker.adiccion(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/fosil")) {//4000
			AdvancementsChecker.fosil(p);			
		}

		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/shift")) {
			AdvancementsChecker.shift(p);
		}

		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/markankaro")) {
			AdvancementsChecker.markankaro(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/zipchu")) {
			AdvancementsChecker.zipchu(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/80dias")) {
			AdvancementsChecker.ochentadias(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/xray")) {
			AdvancementsChecker.xray(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/encantador")) {
			AdvancementsChecker.encantador(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:mobteca/149")) {
			AdvancementsChecker.dragon(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/bell")) {
			AdvancementsChecker.bell(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/jesus")) {
			AdvancementsChecker.jesus(p);
		}
	
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/insomnio")) {
			AdvancementsChecker.insomnio(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:mobteca/raid200")) {
			AdvancementsChecker.raids(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/porky")) {
			AdvancementsChecker.porky(p);
		}
		
		if(!AdvancementsMethods.hasAdvancement(p, "meriland:meriland/farlands")) {
			AdvancementsChecker.farlands(p);
		}
		p.sendMessage("No logro");
		
	}
	

}