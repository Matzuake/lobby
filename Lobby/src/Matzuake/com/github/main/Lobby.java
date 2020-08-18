package Matzuake.com.github.main;

import Matzuake.com.github.command.SetSpwan;
import Matzuake.com.github.lang.ger_DE;
import Matzuake.com.github.listener.onJoinPlayer;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Lobby extends JavaPlugin {

    public static Lobby plugin;
    public static Lobby instance;
    public static FileConfiguration cfg;
    public static File file;

    public static Lobby getPlugin() {
        return plugin;
    }

    public static Lobby getInstance() {
        return instance;
    }

    public static String log(String message) {
        Bukkit.getConsoleSender().sendMessage(message);
        return message;
    }

    @Override
    public void onDisable() {
        log("&7========== &4Lobby Plugin ist Gestoppt &7==========");
    }

    @Override
    public void onEnable() {
        log("Loadingfiles.........");
        loadconfig();
        log("§7========== §2Lobby Plugin ist Gestartet §7==========");
        savelang();
init();
    }

    private void loadconfig() {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        file = new File("plugins/Lobby/", "config.yml");
        cfg = YamlConfiguration.loadConfiguration(file);
    }

    private void savelang() {
        (new ger_DE(this)).ger_DE_lang((Plugin) this);
    }

    private void init() {
        new SetSpwan(this);
        new onJoinPlayer(this);
    }


}
