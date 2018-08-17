package com.A55.skyrimRPG;

import org.bukkit.Bukkit;

import com.sucy.skill.SkillAPI;
import com.sucy.skill.api.*;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;
import com.A55.skyrimRPG.EventHandler.*;
public class Main extends JavaPlugin 
{
 @Override
	public void onEnable()
	   {
	 		SkillAPI gpsapi = null;
		 	if (Bukkit.getPluginManager().getPlugin("SkillAPI").isEnabled()) {
		            Bukkit.getConsoleSender().sendMessage("SkyrimRPG插件启动！");
				    getServer().getPluginManager().registerEvents(new commandEventHandler(), this);
				  
		 	}else{
		 		Bukkit.getConsoleSender().sendMessage("本插件需要SkillAPI作为前置！插件关闭中");
		 		Bukkit.getPluginManager().disablePlugins();
		 	}
	   }
}
