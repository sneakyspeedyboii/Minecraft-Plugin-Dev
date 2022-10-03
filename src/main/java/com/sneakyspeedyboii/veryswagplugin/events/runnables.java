package com.sneakyspeedyboii.veryswagplugin.events;

import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

import static java.lang.Math.sin;

public class runnables {

    private Player player;

    public void grabloc(Player play) {
        player = play;
    }

    private BukkitRunnable template = new BukkitRunnable() {
        @Override
        public void run() {

        }
    };

    private BukkitRunnable entarmour = new BukkitRunnable() {
        @Override
        public void run() {
            for (World world : Bukkit.getWorlds()) {
                for (Entity ent : world.getEntities()) {
                    if (ent.getType().equals(EntityType.ARMOR_STAND)) {
                        if (ent.getName().equals("Veryswagplugin - entblock")) {
                            int points = 100;
                            int radius = 5;

                            Location origin = ent.getLocation().add(0, 1, 0);
                            for (int i = 0; i < points; i++) {
                                double angle = 2 * Math.PI * i / points;
                                Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                                ent.getWorld().spawnParticle(Particle.FLAME, point, 1, 0, 0, 0, 0);
                            }
                        }

                        List<Entity> entner = ent.getNearbyEntities(5,5,5);
                        if (!entner.equals(null)) {
                            for (Entity entity : entner) {
                                if (entity instanceof Damageable) {
                                    ((Damageable) entity).damage(1000000000000000000000d);
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable blacklist = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                for (ItemStack item : player.getInventory()) {
                    if (item != null) {
                        if (!item.getItemMeta().equals(null)) {
                            if (item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                                String foundValue = item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                                if (foundValue.equals("Veryswagplugin - noinv")) {
                                    player.getInventory().remove(item);
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    public BukkitRunnable sirenhparticle = new BukkitRunnable() {
        @Override
        public void run() {
            boolean dave = true;
            while(dave == true) {
                int points = 100;
                int endradius = 7;
                int startradius = 1;

                Location origin = player.getLocation().add(0, 1, 0);

                for (int radius = startradius; radius < endradius + 1; radius++) {
                    for (int i = 0; i < points; i++) {
                        double angle = 2 * Math.PI * i / points;
                        Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                        player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, point, 1, 0, 0, 0, 0);
                    }
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    private BukkitRunnable andurilcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - anduril")) {
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5, 1));
                                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 5, 1));
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable pekkachestplatecheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getChestplate() != null) {
                        if (player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - pekkaschestplate")) {
                                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 5, 2));
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable springloadedbootcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.getInventory().getBoots() != null) {
                    if (player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - springloadedboots")) {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 10, 1));
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable scaffoldtotemcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player: Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getItemInOffHand() != null) {
                        if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
                            if (player.getInventory().getItemInOffHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                                String foundValue = player.getInventory().getItemInOffHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                                if (foundValue.equals("Veryswagplugin - ssca")) {
                                    if (player.getLocation().add(0, -1, 0).getBlock().getType().equals(Material.AIR)) {
                                        player.getWorld().setType(player.getLocation().add(0, -1, 0), Material.GRASS_BLOCK);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable tuxchestcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getChestplate() != null) {
                        if (player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - tuxchest")) {
                                if (player.getInventory().getChestplate().getItemMeta().getLore().equals(itemmanager.tchest.getItemMeta().getLore())) {
                                    if (player.hasPotionEffect(PotionEffectType.SLOW)) {
                                        player.removePotionEffect(PotionEffectType.SLOW);
                                    } else if (player.hasPotionEffect(PotionEffectType.SLOW_DIGGING)) {
                                        player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
                                    } else if (player.hasPotionEffect(PotionEffectType.CONFUSION)) {
                                        player.removePotionEffect(PotionEffectType.CONFUSION);
                                    } else if (player.hasPotionEffect(PotionEffectType.BLINDNESS)) {
                                        player.removePotionEffect(PotionEffectType.BLINDNESS);
                                    } else if (player.hasPotionEffect(PotionEffectType.HUNGER)) {
                                        player.removePotionEffect(PotionEffectType.HUNGER);
                                    } else if (player.hasPotionEffect(PotionEffectType.WEAKNESS)) {
                                        player.removePotionEffect(PotionEffectType.WEAKNESS);
                                    } else if (player.hasPotionEffect(PotionEffectType.POISON)) {
                                        player.removePotionEffect(PotionEffectType.POISON);
                                    } else if (player.hasPotionEffect(PotionEffectType.WITHER)) {
                                        player.removePotionEffect(PotionEffectType.WITHER);
                                    } else if (player.hasPotionEffect(PotionEffectType.UNLUCK)) {
                                        player.removePotionEffect(PotionEffectType.UNLUCK);
                                    } else if (player.hasPotionEffect(PotionEffectType.BAD_OMEN)) {
                                        player.removePotionEffect(PotionEffectType.BAD_OMEN);
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable tuxfullsetcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemuse") || player.isOp()) {
                    if (player.getInventory().getChestplate() != null && player.getInventory().getLeggings() != null && player.getInventory().getBoots() != null) {
                        if (player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING) && player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING) && player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String chestkey = player.getInventory().getChestplate().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            String legkey = player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            String bootkey = player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (chestkey.equals("Veryswagplugin - tuxchest") && legkey.equals("Veryswagplugin - tuxleg") && bootkey.equals("Veryswagplugin - tuxboot")) {
                                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 2, 20));
                                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(26);
                                return;
                            }
                        }
                    }
                }
                player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20);
            } // WIP - needs work on, health boost is perma disabled throught the server unless this armour is on
        }
    };

    private BukkitRunnable stockingscheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getLeggings() != null) {
                        if (player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - stockings")) {
                                List<Entity> nearby = player.getNearbyEntities(5, 5, 5);
                                if (nearby == null) {
                                    return;
                                }
                                for (Entity tmp : nearby) {
                                    if (tmp instanceof Player) {
                                        ((Player) tmp).addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 40, 2));
                                        ((Player) tmp).addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 40, 2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable posbootcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                    if (player.getInventory().getBoots() != null) {
                        if (player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - posboots")) {
                                if (player.getInventory().getBoots().getItemMeta().getLore().equals(itemmanager.posboots.getItemMeta().getLore())) {
                                    if (player.getLocation().getBlock().isLiquid()) {
                                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,1,2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    private BukkitRunnable posfullsetcheck = new BukkitRunnable() {
        @Override
        public void run() {
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (player.hasPermission("veryswagplugin.itemuse") || player.isOp()) {
                    if (player.getInventory().getBoots() != null && player.getInventory().getLeggings() != null) {
                        if (player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING) && player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String legkey = player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            String bootkey = player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (legkey.equals("Veryswagplugin - posleg") && bootkey.equals("Veryswagplugin - posboots")) {
                                if(player.getLocation().getBlock().isLiquid()) {
                                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 210, 10));
                                    player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 30, 255));
                                }
                            }
                        }
                    }
                }
            }
        }
    };


    public void run() {
        andurilcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        pekkachestplatecheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        springloadedbootcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        scaffoldtotemcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        tuxchestcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        tuxfullsetcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        posbootcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        posfullsetcheck.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);
        blacklist.runTaskTimer(Bukkit.getPluginManager().getPlugin("veryswagplugin"), 0, 1);

    }

}

