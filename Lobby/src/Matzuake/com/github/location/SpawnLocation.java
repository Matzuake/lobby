package Matzuake.com.github.location;

import Matzuake.com.github.manager.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SpawnLocation {

    public static void mainspawn(Player p) {
        double x = FileManager.mainSpawn.getDouble("lobby.spawn.x");
        double y = FileManager.mainSpawn.getDouble("lobby.spawn.y");
        double z = FileManager.mainSpawn.getDouble("lobby.spawn.z");
        Location loc = new Location(Bukkit.getWorld(FileManager.mainSpawn.getString("lobby.spawn.world")), x, y, z);
        loc.setPitch((float)FileManager.mainSpawn.getDouble("lobby.spawn.pitch"));
        loc.setYaw((float)FileManager.mainSpawn.getDouble("lobby.spawn.yaw"));
        p.teleport(loc);
    }

}
