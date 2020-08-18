package Matzuake.com.github.lang;

import Matzuake.com.github.main.Lobby;
import Matzuake.com.github.manager.FileManager;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;


import java.io.File;
import java.io.IOException;

public class ger_DE {
    private Lobby plugin;

    public ger_DE(Lobby plugin){
        this.plugin = plugin;
    }
    public void ger_DE_lang (Plugin plugin1){
        FileManager.cfg_ger.set("ger_DE.NoPerm.tren", "============Ingame Permission sachen ==================");
        FileManager.cfg_ger.set("ger_DE.NoPerm.noperm", "&cDu haste dazu keine Rechte !");
        FileManager.cfg_ger.set("ger_DE.Meldung.tren", "============ Text Meldungen==================");
        FileManager.cfg_ger.set("ger_DE.Meldung.Willkommnen", "&7Willkommen auf &6Testserver&7, ");
        FileManager.cfg_ger.set("ger_DE.Meldung.WillkommenI", "&7Hallo &6%player% &7ich wünsche dir viel Spass auf unserem Netzwerk.");
        FileManager.cfg_ger.set("ger_DE.Meldung.Flyon", "&7Du hast denn Flugmodus &aaktiviert");
        FileManager.cfg_ger.set("ger_DE.Meldung.Flyoff", "&7Du hast denn Flugmodus &cdeaktiviert");
        FileManager.cfg_ger.set("ger_DE.Datenschutz.tren", "============== Datenschutz ================");
        FileManager.cfg_ger.set("ger_DE.Datenschutz.DatenGUI", "&eDatenschutz");
        FileManager.cfg_ger.set("ger_DE.Datenschutz.Datenon", "&eAkzeptieren");
        FileManager.cfg_ger.set("ger_DE.Datenschutz.Datenoff", "&eAkzeptieren");
        FileManager.cfg_ger.set("ger_DE.Datenschutz.DatenLoreOn", "&cBesätige die Datenschutzrichtlinien.");
        FileManager.cfg_ger.set("ger_De.Datenschutz.DatenLoreOff", "&cLehne die Datenschutzrichtlinien.");
        FileManager.cfg_ger.set("ger_DE.GUINames.Navigator", "&5&lNavigator");
        FileManager.cfg_ger.set("ger_DE.GUINames.PlayerHider", "&5&lSpieler Verstecken");
        FileManager.cfg_ger.set("Shop1.Miner.Material", "STONE");
        try {
            if (!FileManager.file_de.exists())
                FileManager.cfg_ger.save(FileManager.file_de);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
