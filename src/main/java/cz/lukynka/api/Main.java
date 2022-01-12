package cz.lukynka.api;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private String prefix = Chat.translated("&8[&dLukynkaAPI&8] ");
    private String pluginVersion = this.getDescription().getVersion();
    private String system = Bukkit.getServer().getName();

    @Override
    public void onEnable() {
        Chat.sendToConsole(" ");
        Chat.sendToConsole(prefix +"&7Plugin loaded!");
        Chat.sendToConsole(prefix +"&7Running &b" +pluginVersion +" &7on &e" +system);
        Chat.sendToConsole(" ");
    }

    @Override
    public void onDisable() {
        Chat.sendToConsole(prefix +"&7Plugin Disabled! See ya next time :3");

    }
}
