package com.sneakyspeedyboii.veryswagplugin.iteminven;

import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import com.sneakyspeedyboii.veryswagplugin.utils.utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class craftgui implements InventoryHolder {
    private Inventory inv;

    public craftgui() {
        inv = Bukkit.createInventory(this, 54, "Crafting Items");
        init();
    }

    private void init() {
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.golemitemm));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.emansp));

        for (int i = 2; i < 49; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        inv.setItem(49,itemmanager.tmpbar);

        for (int i = 50; i < 54; i++) {
            inv.setItem(i, itemmanager.tmppane);
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


