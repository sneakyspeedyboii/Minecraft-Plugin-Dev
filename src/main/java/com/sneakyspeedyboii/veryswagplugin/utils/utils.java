package com.sneakyspeedyboii.veryswagplugin.utils;


import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class utils {

    //This is all the code I have stolen of spigot and github
    //No clue who made half of it but many thanks to whoever did make the code
    //especially the skull code - made me very happy

    public static ItemStack blacklistitem(ItemStack item) {  //my own code i just stuck it in here for ease of use
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        ItemStack stack = new ItemStack(item.getType(), item.getAmount());
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack blacklistitemamount(ItemStack item, int amount) {  //my own code i just stuck it in here for ease of use
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        ItemStack stack = new ItemStack(item.getType(), amount);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack blacklistuncraftableitem(ItemStack item) {  //my own code i just stuck it in here for ease of use
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        List<String> lore = meta.getLore();
        lore.add(ChatColor.RED + "Uncraftable");
        meta.setLore(lore);
        ItemStack stack = new ItemStack(item.getType(), item.getAmount());
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack isamt(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.DOUBLE, Math.PI);
        List<String> lore = meta.getLore();
        meta.setLore(lore);
        ItemStack stack = new ItemStack(item.getType(), 8);
        stack.setItemMeta(meta);
        return stack;
    }

    public static int removeItems(Inventory inventory, Material type, int amount) {

        if(type == null || inventory == null)
            return -1;
        if (amount <= 0)
            return -1;

        if (amount == Integer.MAX_VALUE) {
            inventory.remove(type);
            return 0;
        }

        HashMap<Integer, ItemStack> retVal = inventory.removeItem(new ItemStack(type,amount));

        int notRemoved = 0;
        for(ItemStack item: retVal.values()) {
            notRemoved+=item.getAmount();
        }
        return notRemoved;
    }
    public static ItemStack makeSkull(String base64EncodedString) {
        final ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        assert meta != null;
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", base64EncodedString));
        try {
            Field profileField = meta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(meta, profile);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        skull.setItemMeta(meta);
        return skull;
    }
    public void spawnParticleAlongLine(Location start, Location end, Particle particle, int pointsPerLine, int particleCount, double offsetX, double offsetY, double offsetZ, double extra, @Nullable Double data, boolean forceDisplay, @Nullable Predicate<Location> operationPerPoint) {
        double d = start.distance(end) / pointsPerLine;
        for (int i = 0; i < pointsPerLine; i++) {
            Location l = start.clone();
            Vector direction = end.toVector().subtract(start.toVector()).normalize();
            Vector v = direction.multiply(i * d);
            l.add(v.getX(), v.getY(), v.getZ());
            if (operationPerPoint == null) {
                start.getWorld().spawnParticle(particle, l, particleCount, offsetX, offsetY, offsetZ, extra, data, forceDisplay);
                continue;
            }
            if (operationPerPoint.test(l)) {
                start.getWorld().spawnParticle(particle, l, particleCount, offsetX, offsetY, offsetZ, extra, data, forceDisplay);
            }
        }
    }

    public void damagePlayer(Player p, double damage) {
        double points = p.getAttribute(Attribute.GENERIC_ARMOR).getValue();
        double toughness = p.getAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS).getValue();
        PotionEffect effect = p.getPotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
        int resistance = effect == null ? 0 : effect.getAmplifier();
        int epf = utils.getEPF(p.getInventory());

        p.damage(calculateDamageApplied(damage, points, toughness, resistance, epf));
    }

    public double calculateDamageApplied(double damage, double points, double toughness, int resistance, int epf) {
        double withArmorAndToughness = damage * (1 - Math.min(20, Math.max(points / 5, points - damage / (2 + toughness / 4))) / 25);
        double withResistance = withArmorAndToughness * (1 - (resistance * 0.2));
        double withEnchants = withResistance * (1 - (Math.min(20.0, epf) / 25));
        return withEnchants;
    }

    public static int getEPF(PlayerInventory inv) {
        ItemStack helm = inv.getHelmet();
        ItemStack chest = inv.getChestplate();
        ItemStack legs = inv.getLeggings();
        ItemStack boot = inv.getBoots();

        return (helm != null ? helm.getEnchantmentLevel(Enchantment.DAMAGE_ALL) : 0) +
                (chest != null ? chest.getEnchantmentLevel(Enchantment.DAMAGE_ALL) : 0) +
                (legs != null ? legs.getEnchantmentLevel(Enchantment.DAMAGE_ALL) : 0) +
                (boot != null ? boot.getEnchantmentLevel(Enchantment.DAMAGE_ALL) : 0);
    }
}
