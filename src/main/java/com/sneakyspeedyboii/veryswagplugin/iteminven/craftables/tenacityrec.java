package com.sneakyspeedyboii.veryswagplugin.iteminven.craftables;

import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import com.sneakyspeedyboii.veryswagplugin.utils.utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class tenacityrec implements InventoryHolder {
    private Inventory inv;

    public tenacityrec() {
        inv = Bukkit.createInventory(this, 54, "Tenacity Recipe");
        init();
    }

    private void init() {
        inv.setItem(24, utils.blacklistitem(itemmanager.tenacity));

        inv.setItem(10, itemmanager.tmppane); //Slot 1
        inv.setItem(11, utils.blacklistitem(new ItemStack(Material.REDSTONE, 64))); //Slot 2
        inv.setItem(12, itemmanager.tmppane); //Slot 3
        inv.setItem(19, utils.blacklistitem(new ItemStack(Material.CROSSBOW, 1))); //Slot 4
        inv.setItem(20, utils.blacklistitem(new ItemStack(Material.DISPENSER, 16))); //Slot 5
        inv.setItem(21, itemmanager.modular); //Slot 6
        inv.setItem(28, itemmanager.tmppane); //Slot 7
        inv.setItem(29, utils.blacklistitem(new ItemStack(Material.REDSTONE, 64))); //Slot 8
        inv.setItem(30, itemmanager.tmppane); //Slot 9

        for (int i = 0; i < 10; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        for (int i = 13; i < 19; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        inv.setItem(22,itemmanager.tmppane);
        inv.setItem(23,itemmanager.tmppane);

        for (int i = 25; i < 28; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        for (int i = 31; i < 45; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        for (int i = 45; i < 54; i++) {
            inv.setItem(i, itemmanager.tmpbar);
        }
    }

    private ItemStack createItem(String name, Material mat) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}


