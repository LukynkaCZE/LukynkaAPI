package cz.lukynka.api;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private String prefix = Chat.translated("&8[&dLukynkaAPI&8] ");
    public static boolean isDev = false;



    @Override
    public void onEnable() {
        Load.sendMessage(prefix, false, isDev, false);
    }

    @Override
    public void onDisable() {
        Chat.sendToConsole(prefix +"&7Plugin Disabled! See ya next time :3");

    }
}
