package Matzuake.com.github.manager;

import org.bukkit.entity.Player;

public class GroupManager {
    public static boolean isPlayerInGroup(Player player, String group) {
        return player.hasPermission("group." + group);
    }
}
