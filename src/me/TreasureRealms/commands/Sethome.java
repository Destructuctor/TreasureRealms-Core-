package me.TreasureRealms.commands;

import java.io.File;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.TreasureRealms.coreMain.Main;

public class Sethome implements Listener, CommandExecutor {
	private Main main;
	File file;
	FileConfiguration config;
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		file = new File(main.getDataFolder(), "homes.yml");
		FileConfiguration config = YamlConfiguration.loadConfiguration(file);
		if (command.getName().equalsIgnoreCase("sethome")) {
			Location home = player.getLocation();
			main.getHomesFC().getConfig().set("homes.player. " + player.getName(), home);
			try {
				config.save(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return true;
	}

}
