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
		sender.sendMessage("��c��������");
	}
	private void showInfo(CommandSender sender) {
		sender.sendMessage("��c=====SkyrimRPG�����Ϣ======");
		sender.sendMessage("��e/srpg help ������a�鿴����");
		sender.sendMessage("��e/srpg reload ������a���ز��");
		sender.sendMessage("��e/srpg addexp [������] [�����] ������a���Ӽ��ܵľ���");
		sender.sendMessage("��e/srpg delexp [������] [�����] ������a���ټ��ܵľ���");
		sender.sendMessage("��e/srpg addpoint [������] [�����] ������a���Ӽ��ܵ�");
		sender.sendMessage("��e/srpg clear [������] [�����] ������a������ĳ�����ܵľ���ֵ�ͼ��ܵ�");
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
