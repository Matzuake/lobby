package Matzuake.com.github.handler;


import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class ItemHandler {
    ItemStack itemStack;

    ItemMeta itemMeta;

    SkullMeta skullMeta;

    public ItemHandler(String displayname, Material material, byte subid, int amount) {
        this.itemStack = new ItemStack(material, amount, (short)subid);
        this.itemMeta = this.itemStack.getItemMeta();
        this.itemMeta.setDisplayName(displayname);
    }

    public ItemHandler(String displayname, Material material, byte subid, int amount, Enchantment enchantment) {
        this.itemStack = new ItemStack(material, amount, (short)subid);
        this.itemMeta = this.itemStack.getItemMeta();
        this.itemMeta.setDisplayName(displayname);
        this.itemMeta.addEnchant(enchantment, 10, true);
    }

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }

    public ItemHandler(String displayname, String skullOwner, int amount) {
        this.itemStack = new ItemStack(Material.SKULL, 1, (short)3);
        this.skullMeta = (SkullMeta)this.itemStack.getItemMeta();
        this.skullMeta.setDisplayName(displayname);
        this.skullMeta.setOwner(skullOwner);
    }

    public ItemStack buildSkull() {
        this.itemStack.setItemMeta((ItemMeta)this.skullMeta);
        return this.itemStack;
    }

    public ItemHandler(String displayname, String skullOwner, int amount, String lore) {
        this.itemStack = new ItemStack(Material.SKULL, 1, (short)3);
        this.skullMeta = (SkullMeta)this.itemStack.getItemMeta();
        this.skullMeta.setDisplayName(displayname);
        this.skullMeta.setOwner(skullOwner);
        ArrayList<String> list = new ArrayList<>();
        list.add(lore);
        this.skullMeta.setLore(list);
    }

    public ItemStack buildSkullon() {
        this.itemStack.setItemMeta((ItemMeta)this.skullMeta);
        return this.itemStack;
    }

    public ItemHandler(String displayname, int amount, String lore) {
        this.itemStack = new ItemStack(Material.SKULL_ITEM, 1, (short)0);
        this.skullMeta = (SkullMeta)this.itemStack.getItemMeta();
        this.skullMeta.setDisplayName(displayname);
        ArrayList<String> list = new ArrayList<>();
        list.add(lore);
        this.skullMeta.setLore(list);
    }

    public ItemStack buildSkulloff() {
        this.itemStack.setItemMeta((ItemMeta)this.skullMeta);
        return this.itemStack;
    }
}
