package com.sneakyspeedyboii.veryswagplugin.iteminven;

import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;


public class inven implements InventoryHolder {
    private Inventory inv;

    public inven() {
        inv = Bukkit.createInventory(this, 54, "Item gui");
        init();
    }

    private void init() {
        inv.setItem(inv.firstEmpty(), itemmanager.explody);
        inv.setItem(inv.firstEmpty(), itemmanager.neow);
        inv.setItem(inv.firstEmpty(), itemmanager.boop);
        inv.setItem(inv.firstEmpty(), itemmanager.modular);
        inv.setItem(inv.firstEmpty(), itemmanager.magnet);
        inv.setItem(inv.firstEmpty(), itemmanager.reaper);
        inv.setItem(inv.firstEmpty(), itemmanager.golem);
        inv.setItem(inv.firstEmpty(), itemmanager.golemitemm);
        inv.setItem(inv.firstEmpty(), itemmanager.bbb);
        inv.setItem(inv.firstEmpty(), itemmanager.anduril);
        inv.setItem(inv.firstEmpty(), itemmanager.emans);
        inv.setItem(inv.firstEmpty(), itemmanager.emansp);
        inv.setItem(inv.firstEmpty(), itemmanager.pekkaschestplatei);
        inv.setItem(inv.firstEmpty(), itemmanager.tchest);
        inv.setItem(inv.firstEmpty(), itemmanager.tlegg);
        inv.setItem(inv.firstEmpty(), itemmanager.tboot);
        inv.setItem(inv.firstEmpty(), itemmanager.stocking);
        inv.setItem(inv.firstEmpty(), itemmanager.thoraxe);
        inv.setItem(inv.firstEmpty(), itemmanager.atomphaser);
        inv.setItem(inv.firstEmpty(), itemmanager.spic);
        inv.setItem(inv.firstEmpty(), itemmanager.fcortex);
        inv.setItem(inv.firstEmpty(), itemmanager.tenacity);
        inv.setItem(inv.firstEmpty(), itemmanager.invsring);
        inv.setItem(inv.firstEmpty(), itemmanager.crown);
        inv.setItem(inv.firstEmpty(), itemmanager.scrown);
        inv.setItem(inv.firstEmpty(), itemmanager.sca);
        inv.setItem(inv.firstEmpty(), itemmanager.posboots);
        inv.setItem(inv.firstEmpty(), itemmanager.poslegs);
        inv.setItem(inv.firstEmpty(), itemmanager.sirenhelm);
        inv.setItem(inv.firstEmpty(), itemmanager.inventestitem);
        inv.setItem(inv.firstEmpty(), itemmanager.kods);
        inv.setItem(inv.firstEmpty(), itemmanager.soulwhip);
        inv.setItem(inv.firstEmpty(), itemmanager.voidblock);
        inv.setItem(inv.firstEmpty(), itemmanager.oscargay);
    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
