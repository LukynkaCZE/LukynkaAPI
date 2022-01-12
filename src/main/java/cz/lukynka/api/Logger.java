package cz.lukynka.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public abstract class Logger {

    public static void info(String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        Bukkit.getLogger().info(msg);
    }

    public static void warning(String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        Bukkit.getLogger().warning(msg);
    }


    public static void fine(String msg) {
        msg = ChatColor.translateAlternateColorCodes('&', msg);
        Bukkit.getLogger().fine(msg);
    }



}
