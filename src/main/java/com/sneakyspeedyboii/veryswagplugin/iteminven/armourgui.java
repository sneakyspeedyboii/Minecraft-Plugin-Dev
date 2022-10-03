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

public class armourgui implements InventoryHolder {
    private Inventory inv;

    public armourgui() {
        inv = Bukkit.createInventory(this, 54, "Armour");
        init();
    }

    private void init() {
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.bbb));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.pekkaschestplatei));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.tchest));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.tlegg));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.tboot));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.stocking));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.atomphaser));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.crown));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.scrown));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.poslegs));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.posboots));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.sirenhelm));

        for (int i = 12; i < 49; i++) {
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


