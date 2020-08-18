package Matzuake.com.github.listener;

import Matzuake.com.github.joinitems.SetItems;
import Matzuake.com.github.location.SpawnLocation;
import Matzuake.com.github.main.Lobby;
import Matzuake.com.github.manager.FileManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class onJoinPlayer implements Listener {
    private static Lobby plugin;

    public onJoinPlayer(Lobby plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        if (!FileManager.file.exists()){
            player.sendMessage("Error");
        }else {

            SpawnLocation.mainspawn(player);
        }

        SetItems.setJoinItems(player);
        
    }
}
