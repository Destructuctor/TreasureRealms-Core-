package me.TreasureRealms.util;


import org.apache.commons.lang.WordUtils;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

import io.netty.util.internal.chmv8.ConcurrentHashMapV8.Fun;

public class Chat {
	
	public static String translate(String str)
	{
		return ChatColor.translateAlternateColorCodes('&', str);
	}

	public static String formatName(String str)
	{
		return WordUtils.capitalizeFully(str.toLowerCase().replaceAll("_", " "));
	}
	
	public static String formatItemName(ItemStack item)
	{
		if(item.getItemMeta().hasDisplayName())
		{
			return formatName(item.getItemMeta().getDisplayName());
		}
		return formatName(item.getType().toString());
	}
}