package Matzuake.com.github.manager;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileManager {
    public static File file = new File("plugins/Lobby/Data/Spawns/spawn.yml");
    public static YamlConfiguration mainSpawn = YamlConfiguration.loadConfiguration(file);

    public static File file_de = new File("plugins/Lobby/Data/lang/ger_DE.yml");
    public static YamlConfiguration cfg_ger = YamlConfiguration.loadConfiguration(file_de);
}
