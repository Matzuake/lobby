package Matzuake.com.github.command;

import Matzuake.com.github.main.Lobby;
import Matzuake.com.github.manager.FileManager;
import Matzuake.com.github.manager.GroupManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

public class SetSpwan implements CommandExecutor {

    private final Lobby plugin;

    public SetSpwan(Lobby plugin) {
        this.plugin = plugin;
        plugin.getCommand("setspawn").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String label, String[] args) {
       String Prefix = ChatColor.translateAlternateColorCodes('&', Lobby.cfg.getString("Prefix.IngamePrefix"));
       String noperm = ChatColor.translateAlternateColorCodes('&', FileManager.cfg_ger.getString("ger_DE.NoPerm.noperm"));
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (GroupManager.isPlayerInGroup(player, "owner")) {
                if (args.length== 0){
                    String world = player.getLocation().getWorld().getName();
                    double x = player.getLocation().getX();
                    double y = player.getLocation().getY();
                    double z = player.getLocation().getZ();
                    double yaw = player.getLocation().getYaw();
                    double pitch = player.getLocation().getPitch();
                    FileManager.mainSpawn.set("lobby.spawn.world", world);
                    FileManager.mainSpawn.set("lobby.spawn.x", Double.valueOf(x));
                    FileManager.mainSpawn.set("lobby.spawn.y", Double.valueOf(y));
                    FileManager.mainSpawn.set("lobby.spawn.z", Double.valueOf(z));
                    FileManager.mainSpawn.set("lobby.spawn.yaw", Double.valueOf(yaw));
                    FileManager.mainSpawn.set("lobby.spawn.pitch", Double.valueOf(pitch));
                    try{
                        FileManager.mainSpawn.save(FileManager.file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    player.sendMessage(Prefix + " §cDer Spawnpunkt wurde gesetzt!");
                }

            } else {
                player.sendMessage(Prefix + noperm);
            }
        } else {
            commandSender.sendMessage(Lobby.log("Die Console kann dieses Command nicht ausführen!"));
        }

        return false;
    }


}
