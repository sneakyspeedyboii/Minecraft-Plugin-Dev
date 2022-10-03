package com.sneakyspeedyboii.veryswagplugin.items;


import com.sneakyspeedyboii.veryswagplugin.utils.utils;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class itemmanager {
    public static ItemStack explody;
    public static ItemStack neow;
    public static ItemStack boop;
    public static ItemStack modular;
    public static ItemStack magnet;
    public static ItemStack reaper;
    public static ItemStack golem;
    public static ItemStack bbb;
    public static ItemStack anduril;
    public static ItemStack emans;
    public static ItemStack emansp;
    public static ItemStack pekkaschestplatei;
    public static ItemStack tlegg;
    public static ItemStack tchest;
    public static ItemStack tboot;
    public static ItemStack stocking;
    public static ItemStack golemitemm;
    public static ItemStack thoraxe;
    public static ItemStack atomphaser;
    public static ItemStack spic;
    public static ItemStack tenacity;
    public static ItemStack fcortex;
    public static ItemStack invsring;
    public static ItemStack crown;
    public static ItemStack scrown;
    public static ItemStack sca;
    public static ItemStack kods;
    public static ItemStack poslegs;
    public static ItemStack posboots;
    public static ItemStack testboots;
    public static ItemStack sirenhelm;
    public static ItemStack inventestitem;
    public static ItemStack tmppane;
    public static ItemStack tmpbar;
    public static ItemStack tmpsw;
    public static ItemStack tmpch;
    public static ItemStack tmpmis;
    public static ItemStack tmpcraf;
    public static ItemStack soulwhip;
    public static ItemStack voidblock;
    public static ItemStack oscargay;
    public static ItemStack longsword;


    public static void init() {
        explodystick();
        createmovementstick();
        booper();
        modularbow();
        itemmagnet();
        reaperscythe();
        golemknife();
        golemitem();
        bb();
        andurilitem();
        endermandagger();
        endermandaggerp();
        pekkaschestplate();
        tl();
        tc();
        tb();
        stockings();
        taxe();
        aphaser();
        spicxce();
        ten();
        fluxcortex();
        ringofinv();
        ccrown();
        sccrown();
        ssca();
        kod();
        posleg();
        posboot();
        testboot();
        sirenh();
        inventestitemm();
        tmppanes();
        tmpbarr();
        tmpswor();
        tmpches();
        tmpmisc();
        tmpcra();
        soulw();
        entityclearer();
        oscargay();
    }

    private static void explodystick() {
        ItemStack item = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - explodystick");
        meta.setDisplayName("Explosion rod");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: oops " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight click");
        lore.add(ChatColor.GOLD + "Makes a big-ol boom");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        explody = item;
    }

    private static void createmovementstick() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - movementstick");
        meta.setDisplayName(ChatColor.DARK_PURPLE + "NEOW Stick");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD +"Item Ability: NEEOWW " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight Click");
        lore.add(ChatColor.GOLD + "Sends you flying in the opposite direction you are looking");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 1000, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        neow = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.FEATHER, 32));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.SLIME_BLOCK, 16));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.FEATHER, 32));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.END_CRYSTAL, 1));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.SLIME_BLOCK, 16));
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.END_CRYSTAL, 1));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 16));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.STICK, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 16));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void booper() {
        ItemStack item = new ItemStack(Material.TNT, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - booper");
        meta.setDisplayName("Booper");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: TACTICAL NUKE INCOMING " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight click");
        lore.add(ChatColor.GOLD + "Also makes a big-ol boom");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        boop = item;
    }

    private static void modularbow() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - modularbow");
        meta.setDisplayName(ChatColor.RED + "TP Bow");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD +"Item Ability: TP " + ChatColor.BOLD + ChatColor.YELLOW + "§lOn Arrow Land");
        lore.add(ChatColor.GOLD + "Teleports you to where the arrow you fired lands");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        modular = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("modularbowrecrec"), item);
        nsr.shape(" BC"
                , "D F"
                , " HI");

        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.ENDER_PEARL, 16));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.STRING, 64));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.BOW, 1));

        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.DIAMOND, 16));

        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.ENDER_PEARL, 16));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.STRING, 64));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void itemmagnet() {
        ItemStack item = new ItemStack(Material.LEAD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - item magnet");
        meta.setDisplayName(ChatColor.BLUE + "Item Magnet");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Electromagnetise " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight Click");
        lore.add(ChatColor.GOLD + "Teleports items to you in a 5x5 in 200 blocks");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 100, false);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        magnet = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.REDSTONE, 16));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 8));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.REDSTONE, 16));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.COPPER_INGOT, 8));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.LEAD, 1));
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.COPPER_INGOT, 8));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.REDSTONE, 16));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 8));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.REDSTONE, 16));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void reaperscythe() {
        ItemStack item = new ItemStack(Material.IRON_HOE, 1);
        item.setDurability((short) 240);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - reaper scythe");
        meta.setDisplayName(ChatColor.DARK_RED + "Reaper Scythe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD +"Item Ability: Reaper's touch " + ChatColor.BOLD + ChatColor.YELLOW + "§lPlayer hit");
        lore.add(ChatColor.GOLD + "Removes 25% of your opponents health");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("GENERIC_ATTACK_DAMAGE", -0.99999999999, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        reaper = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , " E "
                , "G  ");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.GOLDEN_APPLE, 1));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.GOLDEN_APPLE, 1));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.IRON_HOE, 1));

        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.BLAZE_ROD, 8));

        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.BLAZE_ROD, 8));

        Bukkit.getServer().addRecipe(nsr);
    }

    private static void golemknife() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - golem knife");
        meta.setDisplayName(ChatColor.BLACK + "Golem's Knife");
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier("attack speed", -3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attack damage", 11, AttributeModifier.Operation.ADD_NUMBER));
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Golem Dunk " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight Click");
        lore.add(ChatColor.GOLD + "Smashes the area around creating area damage");
        lore.add("");
        lore.add(ChatColor.GRAY + "When in Main Hand:");
        lore.add(ChatColor.BLUE + " +12 Attack Damage");
        lore.add(ChatColor.BLUE + " -3 Attack Speed");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        golem = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.POPPY, 64));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8));
        nsr.setIngredient('E', (RecipeChoice) itemmanager.golemitemm);
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.BLAZE_POWDER, 64));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.NETHERITE_SWORD, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.BLAZE_POWDER, 64));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void andurilitem() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - anduril");
        meta.setDisplayName(ChatColor.BLUE + "Andūril");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GREEN+"Damage: 8");
        lore.add(ChatColor.GREEN+"Attack Speed: 1.6");
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: SPEED AND POWER " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Holding");
        lore.add(ChatColor.GOLD + "Gives the holder permanent speed and resistance");
        lore.add(ChatColor.RED + "I straight up copied this out hypixel uhc");
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attack damage", 7, AttributeModifier.Operation.ADD_NUMBER));
        meta.addEnchant(Enchantment.DURABILITY, 1000, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        anduril = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.LAPIS_LAZULI, 64));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.GOLDEN_SWORD, 1));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.LAPIS_LAZULI, 64));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.LAPIS_LAZULI, 64));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.IRON_CHESTPLATE, 1));
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.LAPIS_LAZULI, 64));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.RABBIT_FOOT, 16));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.STICK, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.RABBIT_FOOT, 16));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void endermandagger() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - endermandagger");
        meta.setDisplayName(ChatColor.BLUE + "EnderMan's Dagger");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Void Jump " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight Click");
        lore.add(ChatColor.GOLD + "Teleports the holder 8 blocks");
        lore.add(ChatColor.RED + "Requires Orbs of power");
        meta.setLore(lore);
        item.setItemMeta(meta);
        emans = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "D F"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16));
        nsr.setIngredient('B', (RecipeChoice) utils.isamt(emansp));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.ENDER_PEARL, 16));

        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.ENDER_PEARL, 16));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.CHORUS_FRUIT, 64));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.DIAMOND_SWORD, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.CHORUS_FRUIT, 64));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void endermandaggerp() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.DOUBLE, Math.PI);
        meta.setDisplayName(ChatColor.BLUE + "Orb of Power");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Used to power the Enderman's Dagger");
        lore.add(ChatColor.BLUE + "Uncommon drop from Enderman");
        meta.setLore(lore);
        item.setItemMeta(meta);
        emansp = item;
    }

    private static void golemitem() {
        ItemStack item = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - gitem");
        meta.setDisplayName(ChatColor.BLACK + "Golem's item");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Used to create the Golem Knife");
        lore.add(ChatColor.BLUE + "Rare drop from zombies");
        meta.setLore(lore);
        item.setItemMeta(meta);
        golemitemm = item;
    }

    private static void bb() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - springloadedboots");
        meta.setDisplayName(ChatColor.BLUE + "Spring-Loaded Boots");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Makes you jump higher");
        meta.setLore(lore);
        item.setItemMeta(meta);
        bbb = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.OAK_LOG, 32));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.LILY_PAD, 16));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.OAK_LOG, 32));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.LILY_PAD, 16));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.DIAMOND_BOOTS, 1));
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.LILY_PAD, 16));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 8));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.LILY_PAD, 16));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.IRON_INGOT, 8));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void pekkaschestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - pekkaschestplate");
        meta.setDisplayName(ChatColor.DARK_RED + "Pekka's Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: OverKill " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Grants the wearer permanent strength III");
        meta.setLore(lore);
        item.setItemMeta(meta);
        pekkaschestplatei = item;

        ItemStack pot = new ItemStack(Material.POTION, 1);
        PotionData pd = new PotionData(PotionType.STRENGTH, false, true);
        PotionMeta pm = (PotionMeta) pot.getItemMeta();
        pm.setBasePotionData(pd);
        pot.setItemMeta(pm);

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.DIAMOND, 4));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.GOLDEN_AXE,1));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.DIAMOND, 4));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.CAKE, 1));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.NETHERITE_CHESTPLATE, 1));
        nsr.setIngredient('F', (RecipeChoice) pot);
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.DIAMOND, 4));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.DIAMOND, 4));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void tc() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);                             //need to add extra defense + dura
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.TEAL);
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - tuxchest");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Tuxedo Aegis");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Eradication " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Removes unwanted effects from players");
        lore.add(ChatColor.GOLD + "");
        lore.add(ChatColor.DARK_RED + "Full Set Bonus: Elegance " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing full set");
        lore.add(ChatColor.GOLD + "Adds four extra hearts of health and gives the wearer permanent saturation");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Body:");
        lore.add(ChatColor.BLUE + "+8 Armour");
        lore.add(ChatColor.BLUE + "+3 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 8, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tchest = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("A C"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.MILK_BUCKET, 1));

        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.MILK_BUCKET, 1));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.REDSTONE, 64));
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.NETHERITE_CHESTPLATE, 1));
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.REDSTONE, 64));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.APPLE, 8));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.EMERALD, 64));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.APPLE, 8));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void tl() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.TEAL);
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - tuxleg");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Tuxedo Chausses");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Life Steal " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Heals the wearer half a heart on hit");
        lore.add(ChatColor.GOLD + "");
        lore.add(ChatColor.DARK_RED + "Full Set Bonus: Elegance " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing full set");
        lore.add(ChatColor.GOLD + "Adds four extra hearts of health and gives the wearer permanent saturation");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Legs:");
        lore.add(ChatColor.BLUE + "+6 Armour");
        lore.add(ChatColor.BLUE + "+3 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 6, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tlegg = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "D F"
                , "G I");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.NETHERRACK, 64));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.NETHERITE_LEGGINGS, 1));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.NETHERRACK, 64));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.NETHERRACK, 64));

        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.NETHERRACK, 64));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.EMERALD, 64));

        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.EMERALD, 64));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void tb() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.TEAL);
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - tuxboot");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Tuxedo Sabatons");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Warm Feet " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Cancels all fire damage for the wearer");
        lore.add(ChatColor.GOLD + "");
        lore.add(ChatColor.DARK_RED + "Full Set Bonus: Elegance " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing full set");
        lore.add(ChatColor.GOLD + "Adds four extra hearts of health and gives the wearer permanent saturation");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Feet:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+3 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tboot = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "D F"
                , "   ");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.GOLDEN_CARROT, 32));
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.NETHERITE_BOOTS, 1));
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.GOLDEN_CARROT, 32));
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.EMERALD, 64));

        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.EMERALD, 64));

        Bukkit.getServer().addRecipe(nsr);
    }

    private static void stockings() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.GRAY);
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - stockings");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Stockings");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: GONNA MAKE THEM CUM " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Gives players around you permanent weakness");
        lore.add(ChatColor.BLUE + "Idea by stuart & oscar");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Legs:");
        lore.add(ChatColor.BLUE + "+6 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 6, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 2, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        stocking = item;
    }

    private static void taxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - stormbreaker");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Storm Breaker");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: De-Charge " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhen Attacking");
        lore.add(ChatColor.GOLD + "Strikes the person being attacked with lightning");;
        meta.setLore(lore);
        item.setItemMeta(meta);
        thoraxe= item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape(" B "
                , "D F"
                , "GHI");

        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.LIGHTNING_ROD, 1));

        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 1));

        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 1));
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.COPPER_INGOT, 32));
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.DIAMOND_AXE, 1));
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.COPPER_INGOT, 32));
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void aphaser() {
        ItemStack item = utils.makeSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWYxMzE5N2M2YTdjZjUyNTcwZmU1NjRhYWI5OTQ0YTkwNDNiZGY3ZDk1NzQ3OTMxMWVjZTAyMjVlMWQzOGRmNCJ9fX0=");
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - aphaser");
        meta.setDisplayName(ChatColor.DARK_GRAY +"Atom Phaser Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Money Buys Power " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Takes Away a diamond from the user for 25% more damage");
        lore.add(ChatColor.RED + "Remember to not wear it when you don't want to lose diamonds");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Head:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+3 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        atomphaser = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.IRON_SWORD, 1)); //slot 1
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 2
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.IRON_SWORD, 1)); //slot 3
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 4
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.DIAMOND_HELMET, 1)); //slot 5
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 6
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.DIAMOND_AXE, 1)); //slot 7
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 8
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.DIAMOND_AXE, 1)); //slot 9
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void spicxce() {
        ItemStack item = new ItemStack(Material.GOLDEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - spicaxe");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Super Picaxe");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Big Eat " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhen Break Block");
        lore.add(ChatColor.GOLD + "Breaks a large area of blocks");
        meta.addEnchant(Enchantment.DIG_SPEED, 255, true);
        meta.addEnchant(Enchantment.DURABILITY, 10000, true);
        meta.setLore(lore);
        item.setItemMeta(meta);
        spic = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.GLASS, 32)); //slot 1
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.TNT, 6)); //slot 2
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.GLASS, 32)); //slot 3
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.TNT, 6)); //slot 4
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.GOLDEN_PICKAXE, 1)); //slot 5
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.TNT, 6)); //slot 6
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.DIAMOND_SHOVEL, 1)); //slot 7
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.TNT, 6)); //slot 8
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.DIAMOND_AXE, 1)); //slot 9
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void ten() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - ten");
        meta.setDisplayName(ChatColor.AQUA + "Tenacity");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Sharp Shooter " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhen Fired");
        lore.add(ChatColor.GOLD + "Replaces the arrow with beam of red particles");
        lore.add(ChatColor.DARK_RED + "Kind of works");
        meta.setLore(lore);
        item.setItemMeta(meta);
        tenacity = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape(" B "
                , "DE "
                , " H ");

        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.REDSTONE, 64)); //slot 2

        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.CROSSBOW, 1)); //slot 4
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.DISPENSER, 16)); //slot 5


        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.REDSTONE, 64)); //slot 8

        Bukkit.getServer().addRecipe(nsr);
    }

    private static void fluxcortex() {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - fluxcortex");
        meta.setDisplayName(ChatColor.BLACK + "Flux Cortex");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.MAGIC + "AIMBOT " + ChatColor.YELLOW + "§lWhen Attacking");
        lore.add(ChatColor.GOLD + "All arrows home onto players");
        lore.add(ChatColor.DARK_RED + "Havent tried to make it work");
        meta.setLore(lore);
        item.setItemMeta(meta);
        fcortex = item;
    }

    private static void ringofinv() {
        ItemStack item = new ItemStack(Material.ENDER_EYE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - ringofinv");
        meta.setDisplayName(ChatColor.DARK_BLUE + "Ring of Invisibility");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: " + ChatColor.MAGIC + "Gone " + ChatColor.YELLOW + "§lWhen In Offhand");
        lore.add(ChatColor.GOLD + "Completely hides you from the other players.");
        lore.add(ChatColor.RED + "When i learn how to intercept player equipment packets ill make it work");
        lore.add(ChatColor.RED + "until then this completely broken");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setLore(lore);
        item.setItemMeta(meta);
        invsring = item;
    }

    private static void ccrown() {
        ItemStack item = utils.makeSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWM4YzljMTAxM2NlNzQ5MTE1MTc0NGQzZTYyOTYyN2UxNjk5MWZhYTY2ZTk0NDAwNzRmY2ZiYWVmMGE4ZmM4OCJ9fX0=");
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - ccrown");
        meta.setDisplayName(ChatColor.DARK_BLUE +"Crown Of Resistance");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: No-Velo " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Allows the wearer to take zero velocity");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Head:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        crown = item;

        ShapedRecipe nsr = new ShapedRecipe(NamespacedKey.minecraft("neowstickrec"), item);
        nsr.shape("ABC"
                , "DEF"
                , "GHI");
        nsr.setIngredient('A', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8)); //slot 1
        nsr.setIngredient('B', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 2
        nsr.setIngredient('C', (RecipeChoice) new ItemStack(Material.IRON_BLOCK, 8)); //slot 3
        nsr.setIngredient('D', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 4
        nsr.setIngredient('E', (RecipeChoice) new ItemStack(Material.DIAMOND_HELMET, 1)); //slot 5
        nsr.setIngredient('F', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 6
        nsr.setIngredient('G', (RecipeChoice) new ItemStack(Material.COPPER_BLOCK, 8)); //slot 7
        nsr.setIngredient('H', (RecipeChoice) new ItemStack(Material.AMETHYST_SHARD, 16)); //slot 8
        nsr.setIngredient('I', (RecipeChoice) new ItemStack(Material.COPPER_BLOCK, 8)); //slot 9
        Bukkit.getServer().addRecipe(nsr);
    }

    private static void sccrown() {
        ItemStack item = utils.makeSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjQ1OGFkMTlmMmUyMjJmMjlhNmQyOTIzODY2ZTkzOGM3Y2NmMzgyMWI1NmE4MWFhNzQzNTc4Njk1M2NhMjNmYyJ9fX0=");
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - sccrown");
        meta.setDisplayName(ChatColor.DARK_BLUE +"Crown Of Strength");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: OverCharge " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Deals 125% extra damage on the 5th hit");
        lore.add(ChatColor.RED + "Takes Diamond blocks away");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Head:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        scrown = item;
    }

    private static void ssca() {
        ItemStack item = new ItemStack(Material.FLINT, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - ssca");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Scaffold Totem");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: hAX!11!! " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhen Break Block");
        lore.add(ChatColor.GOLD + "Makes you scaffold");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        sca = item;
    }

    private static void kod() {
        ItemStack item = new ItemStack(Material.FLINT, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - kods");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Knife Of The Scared");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Ground Punch " + ChatColor.BOLD + ChatColor.YELLOW + "§lEntity Damage");
        lore.add(ChatColor.GOLD + "Causes an earthquake dealing area damage");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        kods = item;
    }

    private static void posleg() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromRGB(68, 135, 171));
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - posleg");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Poseidon's Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: 6th Sense " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Attacking a mob while under water will highlight it");
        lore.add(ChatColor.GOLD + "");
        lore.add(ChatColor.DARK_RED + "Full Set Bonus: Grace " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing full set");
        lore.add(ChatColor.GOLD + "Gives the wearer Night Vision and Water Breathing while under the water");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Legs:");
        lore.add(ChatColor.BLUE + "+6 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 6, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 2, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        item.setItemMeta(meta);
        poslegs = item;
    }

    private static void posboot() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromRGB(68, 135, 171));
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - posboots");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Poseidon's Boots");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Wading " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing");
        lore.add(ChatColor.GOLD + "Allows the wearer to move fast through water");
        lore.add(ChatColor.GOLD + "");
        lore.add(ChatColor.DARK_RED + "Full Set Bonus: Grace " + ChatColor.BOLD + ChatColor.YELLOW + "§lWhile Wearing full set");
        lore.add(ChatColor.GOLD + "Gives the wearer Night Vision and Water Breathing while under the water");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Feet:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 2, AttributeModifier.Operation.ADD_NUMBER));
        meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        posboots = item;
    }

    private static void sirenh() {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromRGB(79, 146, 255));
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - sirenh");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Siren Helm");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Sound the alarm " + ChatColor.BOLD + ChatColor.YELLOW + "§lShift + Right Click");
        lore.add(ChatColor.GOLD + "Creates a very loud sound around the wearer, ");
        lore.add(ChatColor.GOLD + "dealing damage to any entity around it");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Head:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 2, AttributeModifier.Operation.ADD_NUMBER));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        sirenhelm = item;
    }

    private static void soulw() {
        ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - soulwhip");
        meta.setDisplayName(ChatColor.GOLD + "Soul Whip");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Slash " + ChatColor.BOLD + ChatColor.YELLOW + "§lRight Click");
        lore.add(ChatColor.GOLD + "Flays the Soul Whip, creating an arc of dark");
        lore.add(ChatColor.GOLD + "particles dealing damage to all entities caught");
        lore.add(ChatColor.GOLD + "within its range");
        lore.add(ChatColor.DARK_RED + "Kind of works");
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("attack dmg", 0, AttributeModifier.Operation.MULTIPLY_SCALAR_1));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        soulwhip = item;
    }

    private static void entityclearer() {
        ItemStack item= new ItemStack(Material.ANDESITE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - entblock");
        meta.setDisplayName(ChatColor.DARK_AQUA + "The Void");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability:  Clearer " + ChatColor.BOLD + ChatColor.YELLOW + "§lOn Right Click");
        lore.add(ChatColor.GOLD + "Clears all entities in a 5 block radius!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        voidblock = item;
    }

    private static void oscargay() {
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - oscargay");
        meta.setDisplayName(ChatColor.BLUE + "Viagra");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: God help me I didnt mean to take it in public " + ChatColor.BOLD + ChatColor.YELLOW + "§lOn Right Click");
        lore.add(ChatColor.GOLD + "Great times call for great power, and you need the great power to hide that bulge");
        lore.add(ChatColor.GOLD + "This item gives you a slight defense boost for 1 minute");
        lore.add(ChatColor.RED + "Eating multiple does not stack!");
        lore.add(ChatColor.BLUE + "Oscars idea because he cant get the substance in real life");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        oscargay = item;
    }






    private static void inventestitemm() {
        ItemStack item = new ItemStack(Material.BEACON, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - vspitems");
        meta.setDisplayName(ChatColor.DARK_AQUA + "VSP Item Guide");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability:  Item Guide " + ChatColor.BOLD + ChatColor.YELLOW + "§lOn Right Click");
        lore.add(ChatColor.GOLD + "Opens an inventory with all the different items in!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inventestitem = item;
    }

    private static void testboot() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        meta.setColor(Color.fromRGB(68, 135, 171));
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - testboot");
        meta.setDisplayName(ChatColor.DARK_AQUA + "Test boots");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "Item Ability: Test Item");
        lore.add("");
        lore.add(ChatColor.GRAY + "When on Feet:");
        lore.add(ChatColor.BLUE + "+3 Armour");
        lore.add(ChatColor.BLUE + "+2 Armour Toughness");
        meta.setLore(lore);
        //meta.addAttributeModifier(Attribute.GENERIC_ARMOR, new AttributeModifier("armour toughness", 3, AttributeModifier.Operation.ADD_NUMBER));
        //meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("armour toughness", 2, AttributeModifier.Operation.ADD_NUMBER));
        meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        testboots = item;
    }

    private static void tmppanes() {
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(" ");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmppane = item;
    }

    private static void tmpbarr() {
        ItemStack item = new ItemStack(Material.BARRIER, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(ChatColor.RED + "Go Back");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmpbar = item;
    }

    private static void tmpswor() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(ChatColor.DARK_RED + "Weapons");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmpsw = item;
    }

    private static void tmpches() {
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(ChatColor.GOLD + "Armour");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmpch = item;
    }

    private static void tmpmisc() {
        ItemStack item = new ItemStack(Material.COBWEB, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Misc");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmpmis = item;
    }

    private static void tmpcra() {
        ItemStack item = new ItemStack(Material.CRAFTING_TABLE, 1);
        ItemMeta meta = item.getItemMeta();
        NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
        meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - noinv");
        meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Items For Crafting");
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        tmpcraf = item;
    }
}