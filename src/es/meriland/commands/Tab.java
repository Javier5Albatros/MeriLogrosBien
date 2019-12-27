package es.meriland.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.EntityType;
import org.bukkit.util.StringUtil;

public class Tab implements TabCompleter {

	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        List<String> sret = new ArrayList<String>();
        if(args.length==1) {
            for (Statistic e : Statistic.values()) {
                sret.add(e.name());
            	}
        }
            
        if(args.length==2) {
            for (Material m : Material.values()) {
                sret.add(m.name());
            	}
        	}
        
        if(args.length==2) {
            for (EntityType en : EntityType.values()) {
                sret.add(en.name());
            	}
        	}
        
        StringUtil.copyPartialMatches(args[0], sret, new ArrayList<String>(sret.size()));
          Collections.sort(sret);
        



        return sret;
	}

}
