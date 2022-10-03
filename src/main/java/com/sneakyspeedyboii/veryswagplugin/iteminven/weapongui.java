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

public class weapongui implements InventoryHolder {
    private Inventory inv;

    public weapongui() {
        inv = Bukkit.createInventory(this, 54, "Weapons");
        init();
    }

    private void init() {
        inv.setItem(inv.firstEmpty(), utils.blacklistuncraftableitem(itemmanager.explody));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.neow));
        inv.setItem(inv.firstEmpty(), utils.blacklistuncraftableitem(itemmanager.boop));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.modular));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.reaper));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.golem));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.anduril));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.emans));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.thoraxe));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.tenacity));
        inv.setItem(inv.firstEmpty(), utils.blacklistuncraftableitem(itemmanager.fcortex));
        inv.setItem(inv.firstEmpty(), utils.blacklistitem(itemmanager.kods));
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


