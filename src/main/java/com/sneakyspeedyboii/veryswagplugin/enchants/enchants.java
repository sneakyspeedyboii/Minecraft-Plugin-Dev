package com.sneakyspeedyboii.veryswagplugin.enchants;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;

public class enchants {
    public static final Enchantment snakebite = new enchwrap("snakebite", "Snake bite", 1);

    public static void register() {
        registerench(snakebite);

    }

    public static void registerench(Enchantment enchantment) {
        boolean registered = true;
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        } catch (Exception exc) {
            registered = false;
            exc.printStackTrace();
        }
    }
}
