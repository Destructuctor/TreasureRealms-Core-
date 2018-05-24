package me.TreasureRealms.coreMain;

import java.io.File;
import gyurix.inventory.*;


import org.bukkit.plugin.java.JavaPlugin;

import me.TreasureRealms.api.ConfigListener;
import me.TreasureRealms.api.FileControl;
import me.TreasureRealms.commands.Fly;

public class Main extends JavaPlugin {
	private ConfigListener cl;
	
	private FileControl configFc;
	private FileControl messagesFc;
	private FileControl homesFc;
	@Override
	public void onEnable() {
		
		getCommand("fly").setExecutor(new Fly(this));
		configFc = new FileControl(new File(getDataFolder(), "config.yml"));
		homesFc = new FileControl(new File(getDataFolder(), "homes.yml"));
		messagesFc = new FileControl(new File(getDataFolder(), "messages.yml"));
		cl = new ConfigListener(this);
	}
	
	public FileControl getConfigFC() {
		return this.configFc;
	}
	public FileControl getMessagesFC() {
		return this.messagesFc;
	}
	public FileControl getHomesFC() {
		return this.homesFc;
	}
}
