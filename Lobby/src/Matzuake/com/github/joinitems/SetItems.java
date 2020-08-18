package Matzuake.com.github.joinitems;

import Matzuake.com.github.handler.ItemHandler;
import Matzuake.com.github.main.Lobby;
import Matzuake.com.github.manager.FileManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class SetItems {

    public static void setJoinItems(Player player) {
        String GUI_Navigator = ChatColor.translateAlternateColorCodes('&', FileManager.cfg_ger.getString("ger_DE.GUINames.Navigator"));
        Material Navigtor = Material.getMaterial(Lobby.cfg.getString("Items.Navigator"));
        int Navigator_place = Lobby.cfg.getInt("Items.Navigator_Platz");

        String GUI_PlayerHide = ChatColor.translateAlternateColorCodes('&', FileManager.cfg_ger.getString("ger_DE.GUINames.PlayerHider"));
        Material PlayerHider = Material.getMaterial(Lobby.cfg.getString("Items.PlayerHide"));
        int PlayerHider_place = Lobby.cfg.getInt("Items.PlayerHide_Platz");




/*############################################################
#+---------------------------------------------------------+ #
# |                     Player Inventory                   | #
#+---------------------------------------------------------+ #
############################################################*/
        player.getInventory().setItem(Navigator_place, (new ItemHandler(GUI_Navigator, Navigtor, (byte) 0, 1)).build());
        player.getInventory().setItem(PlayerHider_place, (new ItemHandler(GUI_PlayerHide, PlayerHider, (byte) 0, 1)).build());
    }
}
