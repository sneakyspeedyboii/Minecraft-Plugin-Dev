package com.sneakyspeedyboii.veryswagplugin.iteminven;

import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemmenu implements InventoryHolder {
    private Inventory inv;

    public itemmenu() {
        inv = Bukkit.createInventory(this, 45, "VSP Items");
        init();
    }

    private void init() {
        List<String> e = new ArrayList<>();
        e.add("");

        for (int i = 0; i < 11; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }
        inv.setItem(11, itemmanager.tmpsw);
        inv.setItem(12, itemmanager.tmppane);
        inv.setItem(13, itemmanager.tmpch);
        inv.setItem(14, itemmanager.tmppane);
        inv.setItem(15, itemmanager.tmpmis);

        for (int i = 16; i < 31; i++) {
            inv.setItem(i, itemmanager.tmppane);
        }

        inv.setItem(31, itemmanager.tmpcraf);

        for (int i = 32; i < 45; i++) {
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


