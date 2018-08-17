package com.A55.skyrimRPG.EventHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class commandEventHandler implements Listener {
	public commandEventHandler(){
		
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if ((label.equalsIgnoreCase("srpg"))){
			if(args.length==0)
				showInfo(sender);
			else if(args.length!=0) {
				handleCommand(sender, args);
			}
		}
		return true;
	}
	private void errorMeg(CommandSender sender) {
		sender.sendMessage("§c命令有误");
	}
	private void showInfo(CommandSender sender) {
		sender.sendMessage("§c=====SkyrimRPG插件信息======");
		sender.sendMessage("§e/srpg help ——§a查看帮助");
		sender.sendMessage("§e/srpg reload ——§a重载插件");
		sender.sendMessage("§e/srpg addexp [技能名] [玩家名] ——§a增加技能的经验");
		sender.sendMessage("§e/srpg delexp [技能名] [玩家名] ——§a减少技能的经验");
		sender.sendMessage("§e/srpg addpoint [技能名] [玩家名] ——§a增加技能点");
		sender.sendMessage("§e/srpg clear [技能名] [玩家名] ——§a清空玩家某个技能的经验值和技能点");
	}
	private void handleCommand(CommandSender sender,String[] args) {
		switch(args[0]) {
			case "help":
				showInfo(sender);
				break;
			case "reload":
				break;
			case "addexp":
				if(args.length==3) {
					
				}
				else if(args.length!=3){
					errorMeg(sender);
				}
				break;
			case "delexp":
				if(args.length==3) {
					
				}
				else if(args.length!=3){
					errorMeg(sender);
				}
				break;
			case "addpoint":
				if(args.length==3) {
					
				}
				else if(args.length!=3){
					errorMeg(sender);
				}
				break;
			case "clear":
				if(args.length==3) {
					
				}
				else if(args.length!=3){
					errorMeg(sender);
				}
				break;
		}
	}
}
