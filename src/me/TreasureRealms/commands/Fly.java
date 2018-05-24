package me.TreasureRealms.commands;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.TreasureRealms.coreMain.Main;
import me.TreasureRealms.util.Chat;

public class Fly implements Listener, CommandExecutor {
	private Main main;
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if (command.getName().equalsIgnoreCase("fly")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getMessagesFC().getConfig().getString("fly-enabled.message")));
				
			}
		}
		return true;
	}


	public Fly(Main main) {
		this.main = main;
	}
}
