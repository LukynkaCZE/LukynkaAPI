package cz.lukynka.api;

import org.bukkit.Bukkit;

import java.util.Arrays;

public abstract class Load {

    static Main main;
    public Load(Main plugin) {
        this.main = plugin;
    }


    @Deprecated
    public static void sendLoadMessage(String prefix, String pluginVersion, String pluginSystem, String pluginAuthor, Boolean broadcastAuthor, Boolean isDevVersion, Boolean broadcast) {
        if(broadcast) {
            Chat.broadcast(prefix +"&aPlugin Loaded!");
            Chat.broadcast(prefix +"&7Running plugin version &e" +pluginVersion +" &7on &b" +pluginSystem);
            if(broadcastAuthor) {
                Chat.broadcast(prefix +"&7Author: &d" +pluginAuthor);
            }
            if(isDevVersion) {
                Chat.broadcast(prefix +"&cYou are running developer version! You should never use developer version on public servers!");
            }
        } else {
            Chat.sendToConsole(prefix +"&aPlugin Loaded!");
            Chat.sendToConsole(prefix +"&7Running plugin version &e" +pluginVersion +" &7on &b" +pluginSystem);
            if(broadcastAuthor) {
                Chat.sendToConsole(prefix +"&7Author: &d" +pluginAuthor);
            }
            if(isDevVersion) {
                Chat.sendToConsole(prefix +"&cYou are running developer version! You should never use developer version on public servers!");
            }
        }
    }

    public static void sendMessage(String prefix, Boolean broadcastAuthor, Boolean isDevVersion, Boolean broadcast) {
        String pluginVersion = main.getDescription().getVersion();
        String pluginSystem = Bukkit.getServer().getName();
        String[] pluginAuthor = (String[]) main.getDescription().getAuthors().toArray();

        if(broadcast) {
            Chat.broadcast(prefix +"&aPlugin Loaded!");
            Chat.broadcast(prefix +"&7Running plugin version &e" +pluginVersion +" &7on &b" +pluginSystem);
            if(broadcastAuthor) {
                Chat.broadcast(prefix +"&7Author: &d" + Arrays.toString(pluginAuthor));
            }
            if(isDevVersion) {
                Chat.broadcast(prefix +"&cYou are running developer version! You should never use developer version on public servers!");
            }
        } else {
            Chat.sendToConsole(prefix +"&aPlugin Loaded!");
            Chat.sendToConsole(prefix +"&7Running plugin version &e" +pluginVersion +" &7on &b" +pluginSystem);
            if(broadcastAuthor) {
                Chat.sendToConsole(prefix +"&7Author: &d" + Arrays.toString(pluginAuthor));
            }
            if(isDevVersion) {
                Chat.sendToConsole(prefix +"&cYou are running developer version! You should never use developer version on public servers!");
            }
        }
    }
}
