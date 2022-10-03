package com.sneakyspeedyboii.veryswagplugin.events;

import com.sneakyspeedyboii.veryswagplugin.iteminven.*;
import com.sneakyspeedyboii.veryswagplugin.iteminven.craftables.*;
import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;
import com.sneakyspeedyboii.veryswagplugin.utils.utils;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static java.lang.Math.random;
import static java.lang.Math.sin;

public class events implements Listener {

    public static BlockData bld;
    private static HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();
    private static HashMap<UUID, Long> cooldownneow = new HashMap<UUID, Long>();
    private static HashMap<UUID, Long> cooldownsirenhelm = new HashMap<UUID, Long>();
    private static HashMap<UUID, Long> cooldowngolem = new HashMap<UUID, Long>();
    private static HashMap<UUID, Long> cooldownthor = new HashMap<UUID, Long>();
    private static HashMap<UUID, Double> tchestdura = new HashMap<UUID, Double>();
    private static HashMap<UUID, Double> tleggdura = new HashMap<UUID, Double>();
    private static HashMap<UUID, Double> tbootdura = new HashMap<UUID, Double>();
    private static HashMap<UUID, Double> crownhits = new HashMap<UUID, Double>();
    public static HashMap<UUID, Double> dmgtoggleval = new HashMap<>();
    public static HashMap<String, ItemStack[]> maginvitems = new HashMap<String, ItemStack[]>();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory() == null) {
            return;
        }
        if (event.getClickedInventory().getHolder() instanceof inven) {
            event.setCancelled(true);

            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.explody.getItemMeta())) {
                player.getInventory().addItem(itemmanager.explody);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.neow.getItemMeta())) {
                player.getInventory().addItem(itemmanager.neow);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.boop.getItemMeta())) {
                player.getInventory().addItem(itemmanager.boop);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.modular.getItemMeta())) {
                player.getInventory().addItem(itemmanager.modular);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.magnet.getItemMeta())) {
                player.getInventory().addItem(itemmanager.magnet);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.reaper.getItemMeta())) {
                player.getInventory().addItem(itemmanager.reaper);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.golem.getItemMeta())) {
                player.getInventory().addItem(itemmanager.golem);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.golemitemm.getItemMeta())) {
                player.getInventory().addItem(itemmanager.golemitemm);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.bbb.getItemMeta())) {
                player.getInventory().addItem(itemmanager.bbb);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.anduril.getItemMeta())) {
                player.getInventory().addItem(itemmanager.anduril);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.emans.getItemMeta())) {
                player.getInventory().addItem(itemmanager.emans);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.emansp.getItemMeta())) {
                player.getInventory().addItem(itemmanager.emansp);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.pekkaschestplatei.getItemMeta())) {
                player.getInventory().addItem(itemmanager.pekkaschestplatei);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.tchest.getItemMeta())) {
                player.getInventory().addItem(itemmanager.tchest);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.tlegg.getItemMeta())) {
                player.getInventory().addItem(itemmanager.tlegg);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.tboot.getItemMeta())) {
                player.getInventory().addItem(itemmanager.tboot);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.stocking.getItemMeta())) {
                player.getInventory().addItem(itemmanager.stocking);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.thoraxe.getItemMeta())) {
                player.getInventory().addItem(itemmanager.thoraxe);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.atomphaser.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.atomphaser);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.spic.getItemMeta())) {
                player.getInventory().addItem(itemmanager.spic);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.tenacity.getItemMeta())) {
                player.getInventory().addItem(itemmanager.tenacity);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.fcortex.getItemMeta())) {
                player.getInventory().addItem(itemmanager.fcortex);
            }
            if (event.getCurrentItem().getItemMeta().equals(itemmanager.invsring.getItemMeta())) {
                player.getInventory().addItem(itemmanager.invsring);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.crown.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.crown);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.scrown.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.scrown);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.sca.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.sca);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.poslegs.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.poslegs);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.posboots.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.posboots);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.sirenhelm.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.sirenhelm);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.inventestitem.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.inventestitem);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.kods.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.kods);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.soulwhip.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.soulwhip);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.voidblock.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.voidblock);
            }
            if (event.getCurrentItem().getItemMeta().getLore().equals(itemmanager.oscargay.getItemMeta().getLore())) {
                player.getInventory().addItem(itemmanager.oscargay);
            }
         }

        if (event.getClickedInventory().getHolder() instanceof itemmenu) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
            if (event.getCurrentItem().getType().equals(Material.GOLDEN_CHESTPLATE)) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
            if (event.getCurrentItem().getType().equals(Material.COBWEB)) {
                miscgui gui = new miscgui();
                player.openInventory(gui.getInventory());
            }
            if (event.getCurrentItem().getType().equals(Material.CRAFTING_TABLE)) {
                craftgui gui = new craftgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof weapongui) {
            if (event.isShiftClick()) {
                event.setCancelled(true);
            }
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.neow.getItemMeta().getDisplayName())) {
                neowstickrec gui = new neowstickrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.modular.getItemMeta().getDisplayName())) {
                modularbowrec gui = new modularbowrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.reaper.getItemMeta().getDisplayName())) {
                reaperrec gui = new reaperrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.golem.getItemMeta().getDisplayName())) {
                golemkniferec gui = new golemkniferec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.anduril.getItemMeta().getDisplayName())) {
                andurilrec gui = new andurilrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.emans.getItemMeta().getDisplayName())) {
                emanrec gui = new emanrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.thoraxe.getItemMeta().getDisplayName())) {
                thoraxerec gui = new thoraxerec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.tenacity.getItemMeta().getDisplayName())) {
                tenacityrec gui = new tenacityrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.kods.getItemMeta().getDisplayName())) {
                kodsrec gui = new kodsrec();
                player.openInventory(gui.getInventory());
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                itemmenu gui = new itemmenu();
                player.openInventory(gui.getInventory());
            }
        }

        if (event.getClickedInventory().getHolder() instanceof armourgui) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.isShiftClick()) {
                event.setCancelled(true);
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.bbb.getItemMeta().getDisplayName())) {
                springbootsrec gui = new springbootsrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.pekkaschestplatei.getItemMeta().getDisplayName())) {
                pekkaschestrec gui = new pekkaschestrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.tchest.getItemMeta().getDisplayName())) {
                tchestrec gui = new tchestrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.tlegg.getItemMeta().getDisplayName())) {
                tlegrec gui = new tlegrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.tboot.getItemMeta().getDisplayName())) {
                tbootrec gui = new tbootrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.stocking.getItemMeta().getDisplayName())) {
                stockingrec gui = new stockingrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.atomphaser.getItemMeta().getDisplayName())) {
                aphaserrec gui = new aphaserrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.crown.getItemMeta().getDisplayName())) {
                correc gui = new correc();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.scrown.getItemMeta().getDisplayName())) {
                cosrec gui = new cosrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.poslegs.getItemMeta().getDisplayName())) {
                poslegrec gui = new poslegrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.posboots.getItemMeta().getDisplayName())) {
                posbootrec gui = new posbootrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.sirenhelm.getItemMeta().getDisplayName())) {
                sirenhelmrec gui = new sirenhelmrec();
                player.openInventory(gui.getInventory());
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                itemmenu gui = new itemmenu();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof miscgui) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.isShiftClick()) {
                event.setCancelled(true);
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.magnet.getItemMeta().getDisplayName())) {
                itemmagrec gui = new itemmagrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.sca.getItemMeta().getDisplayName())) {
                scaffoldtotemrec gui = new scaffoldtotemrec();
                player.openInventory(gui.getInventory());
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(itemmanager.spic.getItemMeta().getDisplayName())) {
                superpicaxerec gui = new superpicaxerec();
                player.openInventory(gui.getInventory());
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                itemmenu gui = new itemmenu();
                player.openInventory(gui.getInventory());
            }
        }

        if (event.getClickedInventory().getHolder() instanceof craftgui) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                itemmenu gui = new itemmenu();
                player.openInventory(gui.getInventory());
            }
        }

        if (event.getClickedInventory().getHolder() instanceof neowstickrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof modularbowrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof reaperrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof golemkniferec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof andurilrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof emanrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof thoraxerec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof tenacityrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof kodsrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                weapongui gui = new weapongui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof springbootsrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof pekkaschestrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof tchestrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof tlegrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof tbootrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof stockingrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof aphaserrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof correc) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof cosrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof poslegrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof posbootrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof sirenhelmrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                armourgui gui = new armourgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof itemmagrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if(event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                miscgui gui = new miscgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof scaffoldtotemrec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                miscgui gui = new miscgui();
                player.openInventory(gui.getInventory());
            }
        }
        if (event.getClickedInventory().getHolder() instanceof superpicaxerec) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "Go Back")) {
                miscgui gui = new miscgui();
                player.openInventory(gui.getInventory());
            }
        }
    }

    @EventHandler
    public static void itemdurchange(PlayerItemDamageEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getChestplate() != null) {
            if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                String foundValue = event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                if (foundValue.equals("Veryswagplugin - tuxchest")) {
                    if (tchestdura.containsKey(player.getUniqueId())) {
                        if (tchestdura.get(player.getUniqueId()) % 8 == 0) {
                            tchestdura.put(player.getUniqueId(), tchestdura.get(player.getUniqueId()) + 1d);
                        } else {
                            tchestdura.put(player.getUniqueId(), tchestdura.get(player.getUniqueId()) + 1d);
                            event.setCancelled(true);
                        }
                    } else {
                        tchestdura.put(player.getUniqueId(), 1d);
                    }
                }
            }
        }
        if (player.getInventory().getLeggings() != null) {
            if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                String foundValue = event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                if (foundValue.equals("Veryswagplugin - tuxleg")) {
                    if (tleggdura.containsKey(player.getUniqueId())) {
                        if (tleggdura.get(player.getUniqueId()) % 8 == 0) {
                            tleggdura.put(player.getUniqueId(), tleggdura.get(player.getUniqueId()) + 1d);
                        } else {
                            tleggdura.put(player.getUniqueId(), tleggdura.get(player.getUniqueId()) + 1d);
                            event.setCancelled(true);
                        }
                    } else {
                        tleggdura.put(player.getUniqueId(), 1d);
                    }
                }
            }
        }
        if (player.getInventory().getBoots() != null) {
            if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                String foundValue = event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                if (foundValue.equals("Veryswagplugin - tuxboot")) {
                    if (tbootdura.containsKey(player.getUniqueId())) {
                        if (tbootdura.get(player.getUniqueId()) % 8 == 0) {
                            tbootdura.put(player.getUniqueId(), tbootdura.get(player.getUniqueId()) + 1d);
                        } else {
                            tbootdura.put(player.getUniqueId(), tbootdura.get(player.getUniqueId()) + 1d);
                            event.setCancelled(true);
                        }
                    } else {
                        tbootdura.put(player.getUniqueId(), 1d);
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if (player.hasPermission("veryswagplugin.itemsuse") || ((Player) event.getEntity()).getPlayer().isOp()) {
                if (player.getInventory().getBoots() != null) {
                    if (player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = player.getInventory().getBoots().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - tuxboot")) {
                            if (player.getInventory().getBoots().getItemMeta().getLore().equals(itemmanager.tboot.getItemMeta().getLore())) {
                                event.setCancelled(event.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK || event.getCause() == EntityDamageEvent.DamageCause.FIRE);
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onEntityDamageAnother(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = ((Player) event.getDamager()).getPlayer();
            if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                if (player.getInventory().getHelmet() != null) {
                    if (player.getInventory().getHelmet().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = player.getInventory().getHelmet().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - aphaser")) {
                            Entity entity = event.getEntity();
                            if (player.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND), 1)) {
                                player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 1));
                                double dmg = event.getDamage();
                                double ndmg = dmg + dmg / 4;
                                event.setDamage(ndmg);
                            } else {
                                player.sendMessage(ChatColor.RED + "No Diamonds!");
                            }
                        }

                        if (foundValue.equals("Veryswagplugin - sccrown")) {
                            Entity entity = event.getEntity();
                            if (crownhits.containsKey(player.getUniqueId())) {
                                if (crownhits.get(player.getUniqueId()) % 5 == 0) {
                                    crownhits.put(player.getUniqueId(), crownhits.get(player.getUniqueId()) + 1d);
                                    if (player.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND_BLOCK), 1)) {
                                        player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BLOCK, 1));
                                        double dmg = event.getDamage();
                                        double ndmg = dmg * 2.5;
                                        event.setDamage(ndmg);
                                    } else {
                                        player.sendMessage(ChatColor.RED + "No Diamond Blocks");
                                    }
                                } else {
                                    crownhits.put(player.getUniqueId(), crownhits.get(player.getUniqueId()) + 1d);
                                }
                            } else {
                                crownhits.put(player.getUniqueId(), 2d);
                            }
                        }
                    }
                }

                if (player.getInventory().getLeggings() != null) {
                    if (player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = player.getInventory().getLeggings().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - tuxleg")) {
                            double phealth = player.getHealth();
                            double pmhealth = player.getMaxHealth();
                            if (player.getHealth() < pmhealth - 1) {
                                player.setHealth(phealth + 1);

                            }
                        }
                        if (foundValue.equals("Veryswagplugin - posleg")) {
                            if (player.getLocation().getBlock().isLiquid()) {
                                if (event.getEntity() instanceof LivingEntity) {
                                    ((LivingEntity) event.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 1));
                                }
                            }
                        }
                    }
                }

                if (player.getInventory().getItemInMainHand() != null) {
                    if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
                        if (player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                            String foundValue = player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                            if (foundValue.equals("Veryswagplugin - stormbreaker")) {
                                if (cooldownthor.containsKey(player.getUniqueId()) && cooldownthor.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                    player.sendMessage(ChatColor.RED + "Wait a little");
                                } else {
                                    cooldownthor.put(player.getUniqueId(), System.currentTimeMillis() + (10 * 1000));
                                    Entity entity = event.getEntity();
                                    entity.getWorld().strikeLightning(entity.getLocation());
                                    if (event.getEntity() instanceof Player) {
                                        Player dmgplayer = ((Player) event.getEntity()).getPlayer();
                                        double health = dmgplayer.getHealth();
                                        dmgplayer.setHealth(health - 4);
                                    }
                                }
                            }
                            if (foundValue.equals("Veryswagplugin - reaper scythe")) {
                                if (event.getEntityType().equals(EntityType.PLAYER)) {
                                    Player dmgplayer = ((Player) event.getEntity()).getPlayer();
                                    if (dmgplayer.getHealth() >= 8) {
                                        double dmgplayerhealth = dmgplayer.getHealth();
                                        player.sendMessage(String.valueOf(dmgplayerhealth));
                                        dmgplayer.setHealth(dmgplayerhealth * 0.65);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (dmgtoggleval.containsKey(player.getUniqueId())) {
                if (dmgtoggleval.get(player.getUniqueId()) % 2 == 0) {
                    player.sendMessage(ChatColor.RED + "You dealed " + ChatColor.DARK_RED + event.getDamage() + ChatColor.RED + " damage!");
                }
            }
        }
    }

    @EventHandler
    public static void onmobdeath(EntityDeathEvent event) {
        if (event.getEntity().getType().equals(EntityType.ZOMBIE)) {
            int random = (int) (random() * 100 + 1);
            if (random == 1) {
                event.getDrops().add(itemmanager.golemitemm);
                if (event.getEntity().getKiller() instanceof Player) {
                    event.getEntity().getKiller().sendMessage(ChatColor.GOLD + "Rare Drop! - " + "Golem Item!");
                }
            }
        }
        if (event.getEntity().getType().equals(EntityType.ENDERMAN)) {
            int random = (int) (random() * 6 + 1);
            if (random == 1) {
                event.getDrops().add(itemmanager.emansp);
                if (event.getEntity().getKiller() instanceof Player) {
                    event.getEntity().getKiller().sendMessage(ChatColor.GOLD + "Rare Drop! - " + "Orb of Power!");
                }

            }
        }
    }

    @EventHandler
    public static void onblockbroken(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
                if (player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                    String foundValue = player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                    if (foundValue.equals("Veryswagplugin - spicaxe")) {
                        int plx = event.getBlock().getX();
                        int ply = event.getBlock().getY();
                        int plz = event.getBlock().getZ();
                        if (player.getFacing().toString() == "SOUTH") {
                            for (int x = plx - 4; x < plx + 5; x++) {
                                for (int z = plz; z < plz + 5; z++) {
                                    Location bl = new Location(player.getWorld(), x, ply, z);
                                    Material m = player.getWorld().getBlockAt(bl).getType();
                                    if (!m.equals(Material.BEDROCK) && !m.equals(Material.AIR) && !m.equals(Material.CHEST) && !m.equals(Material.ENDER_CHEST) && !m.equals(Material.SPAWNER)) {
                                        player.getWorld().setType(bl, Material.AIR);
                                        if (m.isSolid()) {
                                            player.getWorld().dropItem(bl, new ItemStack(m, 1));
                                        }
                                    }
                                }
                            }
                        }
                        if (player.getFacing().toString() == "NORTH") {
                            for (int x = plx - 4; x < plx + 5; x++) {
                                for (int z = plz - 4; z < plz + 1; z++) {
                                    Location bl = new Location(player.getWorld(), x, ply, z);
                                    Material m = player.getWorld().getBlockAt(bl).getType();
                                    if (!m.equals(Material.BEDROCK) && !m.equals(Material.AIR) && !m.equals(Material.CHEST) && !m.equals(Material.ENDER_CHEST) && !m.equals(Material.SPAWNER)) {
                                        player.getWorld().setType(bl, Material.AIR);
                                        if (m.isSolid()) {
                                            player.getWorld().dropItem(bl, new ItemStack(m, 1));
                                        }
                                    }
                                }
                            }
                        }
                        if (player.getFacing().toString() == "EAST") {
                            for (int z = plz - 4; z < plz + 5; z++) {
                                for (int x = plx; x < plx + 5; x++) {
                                    Location bl = new Location(player.getWorld(), x, ply, z);
                                    Material m = player.getWorld().getBlockAt(bl).getType();
                                    if (!m.equals(Material.BEDROCK) && !m.equals(Material.AIR) && !m.equals(Material.CHEST) && !m.equals(Material.ENDER_CHEST) && !m.equals(Material.SPAWNER)) {
                                        player.getWorld().setType(bl, Material.AIR);
                                        if (m.isSolid()) {
                                            player.getWorld().dropItem(bl, new ItemStack(m, 1));
                                        }
                                    }
                                }
                            }
                        }
                        if (player.getFacing().toString() == "WEST") {
                            for (int z = plz - 4; z < plz + 5; z++) {
                                for (int x = plx - 4; x < plx + 1; x++) {
                                    Location bl = new Location(player.getWorld(), x, ply, z);
                                    Material m = player.getWorld().getBlockAt(bl).getType();
                                    if (!m.equals(Material.BEDROCK) && !m.equals(Material.AIR) && !m.equals(Material.CHEST) && !m.equals(Material.ENDER_CHEST) && !m.equals(Material.SPAWNER)) {
                                        player.getWorld().setType(bl, Material.AIR);
                                        if (m.isSolid()) {
                                            player.getWorld().dropItem(bl, new ItemStack(m, 1));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().getLore() != null) {
                    if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (event.getAction() == Action.LEFT_CLICK_AIR) {
                            if (foundValue.equals("Veryswagplugin - ten")) {
                                int range = 500;
                                Location loc = player.getTargetBlock(null, range).getLocation();
                                Location peye = player.getEyeLocation();
                                Vector dir = player.getLocation().getDirection();

                                for (double i = 1; i <= range; i++) {
                                    peye.add(dir.getX() * i, dir.getY() * i, dir.getZ() * i);
                                    for (Player p : Bukkit.getOnlinePlayers()) {
                                        p.spawnParticle(Particle.REDSTONE, peye.getX(), peye.getY(), peye.getZ(), 1, 0.001, 0.001, 0.001, 1, new Particle.DustOptions(Color.RED, 10));
                                    }
                                    List<Entity> nearby = (List<Entity>) peye.getWorld().getNearbyEntities(peye, 2, 2, 2);
                                    if (nearby == null) {
                                        return;
                                    }
                                    for (Entity en : nearby) {
                                        if (en instanceof Damageable) {
                                            if (en.equals(player)) {

                                            } else {
                                                ((Damageable) en).damage(1);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                            if (foundValue.equals("Veryswagplugin - entblock")) {
                                event.setCancelled(true);
                                ArmorStand arm = (ArmorStand) player.getWorld().spawnEntity(event.getClickedBlock().getLocation().add(0, 1, 0), EntityType.ARMOR_STAND);
                                arm.setCustomName("Veryswagplugin - entblock");
                            }
                            if (foundValue.equals("Veryswagplugin - gitem")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - vspitems")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - ringofinv")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - aphaser")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - sccrown")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - ccrown")) {
                                event.setCancelled(true);
                            }
                            if (foundValue.equals("Veryswagplugin - booper")) {
                                event.setCancelled(true);
                            }

                            if (foundValue.equals("Veryswagplugin - vspitems")) {
                                event.setCancelled(true);
                                itemmenu item = new itemmenu();
                                player.openInventory(item.getInventory());
                            }

                            if (foundValue.equals("Veryswagplugin - oscargay")) {
                                event.setCancelled(true);
                                player.getInventory().removeItem(itemmanager.oscargay);
                                player.sendMessage(ChatColor.RED + "BIG MISTAKE");
                                player.playSound(player.getLocation(), Sound.BLOCK_SLIME_BLOCK_PLACE, 10, 1);
                                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 5));
                            }

                            if (foundValue.equals("Veryswagplugin - explodystick")) {
                                player.getWorld().strikeLightning(player.getTargetBlock(null, 50).getLocation());
                                player.getWorld().createExplosion(player.getTargetBlock(null, 50).getLocation(), 10);
                            }

                            if (foundValue.equals("Veryswagplugin - movementstick")) {
                                player.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, player.getTargetBlock(null, 50).getLocation(), 2);
                                player.playSound(player.getTargetBlock(null, 50).getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
                                player.setVelocity(player.getLocation().getDirection().multiply(-4));
                            }


                            if (foundValue.equals("Veryswagplugin - item magnet")) {
                                Location targblock = player.getTargetBlock(null, 200).getLocation();
                                List<Entity> nearby = (List<Entity>) targblock.getWorld().getNearbyEntities(targblock, 5, 5, 5);
                                if (nearby == null) {
                                    return;
                                }
                                for (Entity tmp : nearby) {
                                    if (tmp.getType().equals(EntityType.DROPPED_ITEM)) {
                                        tmp.teleport(player.getLocation());

                                    }
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - golem knife")) {
                                if (cooldowngolem.containsKey(player.getUniqueId()) && cooldowngolem.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                    player.sendMessage(ChatColor.RED + "Wait many seconds");
                                } else {
                                    cooldowngolem.put(player.getUniqueId(), System.currentTimeMillis() + (15 * 1000));
                                    int points = 200;
                                    double radius = 7.0d;
                                    Location origin = player.getLocation();

                                    for (int i = 0; i < points; i++) {
                                        double angle = 2 * Math.PI * i / points;
                                        Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                                        player.getWorld().spawnParticle(Particle.FLAME, point, 1, 0, 0, 0, 0.1);
                                    }

                                    int hpoints = 6;
                                    for (int i = 0; i < hpoints; i++) {
                                        double angle = 2 * Math.PI * i / hpoints;
                                        Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                                        FallingBlock bl = (FallingBlock) player.getWorld().spawnFallingBlock(point.add(0, 3, 0), Material.IRON_BLOCK, (byte) 0);
                                        bl.setDropItem(false);
                                        bld = bl.getBlockData();

                                    }
                                    List<Entity> nearby = player.getNearbyEntities(5, 5, 5);
                                    if (nearby == null) {
                                        return;
                                    }
                                    for (Entity tmp : nearby) {
                                        if (tmp instanceof LivingEntity) {
                                            ((Damageable) tmp).damage(10);
                                        }
                                    }
                                }
                            }

                        }

                        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
                            if (foundValue.equals("Veryswagplugin - explodystick")) {
                                player.getWorld().strikeLightning(player.getTargetBlock(null, 50).getLocation());
                                player.getWorld().createExplosion(player.getTargetBlock(null, 50).getLocation(), 10);
                            }

                            if (foundValue.equals("Veryswagplugin - oscargay")) {
                                event.setCancelled(true);
                                player.getInventory().removeItem(itemmanager.oscargay);
                                player.sendMessage(ChatColor.RED + "BIG MISTAKE");
                                player.playSound(player.getLocation(), Sound.BLOCK_SLIME_BLOCK_PLACE, 10, 1);
                                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 5));
                            }

                            if (foundValue.equals("Veryswagplugin - kods")) {
                                Block b = player.getLocation().add(0,-1,0).getBlock();
                                ArmorStand arm = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0,-2,0), EntityType.ARMOR_STAND);
                                arm.getEquipment().setHelmet(new ItemStack(b.getType()));
                            }

                            if (foundValue.equals("Veryswagplugin - vspitems")) {

                                event.setCancelled(true);
                                itemmenu item = new itemmenu();
                                player.openInventory(item.getInventory());
                            }

                            if (foundValue.equals("Veryswagplugin - soulwhip")) {
                                event.setCancelled(true);
                                List<Entity> entities = player.getNearbyEntities(5,5,5);
                                for (Entity dave : entities) {
                                    if (player.hasLineOfSight(dave)) {
                                        if (dave instanceof Damageable) {
                                            player.sendMessage("Entity Found: " + dave.toString());

                                        }
                                    }
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - endermandagger")) {
                                if (player.getInventory().containsAtLeast(itemmanager.emansp, 1)) {
                                    player.getInventory().removeItem(itemmanager.emansp);
                                    Location targ = player.getTargetBlock(null, 8).getLocation();
                                    float x = (float) targ.getX();
                                    float y = (float) targ.getY();
                                    float z = (float) targ.getZ();
                                    float p = player.getLocation().getPitch();
                                    float ya = player.getLocation().getYaw();
                                    player.teleport(new Location(player.getWorld(), x, y, z, ya, p));
                                    player.playSound(new Location(player.getWorld(), x, y, z, ya, p), Sound.ENTITY_SHULKER_TELEPORT, 100f, 1f);
                                } else {
                                    player.sendMessage(ChatColor.RED + "You do not have any orbs of power on you");
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - movementstick")) {
                                if (cooldown.containsKey(player.getUniqueId()) && cooldown.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                    player.sendMessage(ChatColor.RED + "Wait a few secs");
                                } else {
                                    cooldown.put(player.getUniqueId(), System.currentTimeMillis() + (5000));
                                    player.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, player.getTargetBlock(null, 2).getLocation(), 2);
                                    player.playSound(player.getTargetBlock(null, 2).getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
                                    player.setVelocity(player.getLocation().getDirection().multiply(-4));
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - booper")) {
                                if (cooldown.containsKey(player.getUniqueId()) && cooldown.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                } else {
                                    cooldown.put(player.getUniqueId(), System.currentTimeMillis() + (10000));
                                    TNTPrimed tnt = (TNTPrimed) player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                                    tnt.setCustomName("BIG BOOM");
                                    tnt.setYield(100);
                                    tnt.setFuseTicks(50);
                                    tnt.setCustomNameVisible(true);
                                    tnt.setVelocity(player.getEyeLocation().getDirection().multiply(3));
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - item magnet")) {
                                Location targblock = player.getTargetBlock(null, 200).getLocation();
                                List<Entity> nearby = (List<Entity>) targblock.getWorld().getNearbyEntities(targblock, 5, 5, 5);
                                if (nearby == null) {
                                    return;
                                }
                                for (Entity tmp : nearby) {
                                    if (tmp.getType().equals(EntityType.DROPPED_ITEM)) {
                                        tmp.teleport(player.getLocation());

                                    }
                                }
                            }

                            if (foundValue.equals("Veryswagplugin - golem knife")) {
                                if (cooldowngolem.containsKey(player.getUniqueId()) && cooldowngolem.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                    player.sendMessage(ChatColor.RED + "Wait many seconds");
                                } else {
                                    cooldowngolem.put(player.getUniqueId(), System.currentTimeMillis() + (15 * 1000));
                                    int points = 200;
                                    double radius = 7.0d;
                                    Location origin = player.getLocation();

                                    for (int i = 0; i < points; i++) {
                                        double angle = 2 * Math.PI * i / points;
                                        Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                                        player.getWorld().spawnParticle(Particle.FLAME, point, 1, 0, 0, 0, 0.1);
                                    }

                                    int hpoints = 6;
                                    for (int i = 0; i < hpoints; i++) {
                                        double angle = 2 * Math.PI * i / hpoints;
                                        Location point = origin.clone().add(radius * sin(angle), 1.0d, radius * Math.cos(angle));
                                        FallingBlock bl = (FallingBlock) player.getWorld().spawnFallingBlock(point.add(0, 3, 0), Material.IRON_BLOCK, (byte) 0);
                                        bl.setDropItem(false);
                                        bld = bl.getBlockData();

                                    }
                                    List<Entity> nearby = player.getNearbyEntities(5, 5, 5);
                                    if (nearby == null) {
                                        return;
                                    }
                                    for (Entity tmp : nearby) {
                                        if (tmp instanceof LivingEntity) {
                                            ((Damageable) tmp).damage(10);
                                        }
                                    }
                                }
                            }


                            if (foundValue.equals("Veryswagplugin - ringofinv")) {
                                event.setCancelled(true);
                            }
                        }
                    }
                }
            }
            if (event.getPlayer().getInventory().getHelmet() != null) {
                if (event.getPlayer().getInventory().getHelmet() != null) {
                    if (event.getPlayer().getInventory().getHelmet().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = event.getPlayer().getInventory().getHelmet().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
                            if (foundValue.equals("Veryswagplugin - sirenh")) {
                                if (player.isSneaking()) {
                                    if (cooldownsirenhelm.containsKey(player.getUniqueId()) && cooldownsirenhelm.get(player.getUniqueId()) > System.currentTimeMillis()) {
                                        player.sendMessage(ChatColor.RED + "Wait " + String.valueOf(((cooldownsirenhelm.get(player.getUniqueId()) - System.currentTimeMillis()) / 1000) + 1) + " Seconds");
                                    } else {
                                        cooldownsirenhelm.put(player.getUniqueId(), System.currentTimeMillis() + (10 * 1000));

                                        runnables r = new runnables();
                                        r.grabloc(player);
                                        r.sirenhparticle.runTaskAsynchronously(Bukkit.getPluginManager().getPlugin("veryswagplugin"));

                                        List<Entity> nearby = player.getNearbyEntities(7, 7, 7);
                                        if (nearby == null) {
                                            return;
                                        }
                                        for (Entity tmp : nearby) {
                                            if (tmp instanceof LivingEntity) {
                                                ((Damageable) tmp).damage(5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void EntityChangeBlock(EntityChangeBlockEvent event) {
        if (event.getEntityType() == EntityType.FALLING_BLOCK) {
            if (event.getBlockData().equals(bld)) {
                event.setCancelled(true);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.playSound(event.getBlock().getLocation(), Sound.BLOCK_ANVIL_LAND, 100f, 1f);
                    player.playSound(event.getBlock().getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100f, 1f);
                    player.spawnParticle(Particle.EXPLOSION_HUGE, event.getEntity().getLocation(), 1);
                }
            }
        }
    }

    @EventHandler
    public static void onshootbow(EntityShootBowEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                if (player.getInventory().getItemInMainHand().getItemMeta().getLore() != null) {
                    if (((Player) event.getEntity()).getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = ((Player) event.getEntity()).getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - ten")) {
                            event.setCancelled(true);
                            Location loc = player.getTargetBlock(null, 500).getLocation();
                            int range = 500;
                            Location peye = player.getEyeLocation();
                            Vector dir = player.getLocation().getDirection();
                            utils use = new utils();

                            for (double i = 1; i <= range; i++) {
                                peye.add(dir.getX() * i, dir.getY() * i, dir.getZ() * i);
                                for (Player p : Bukkit.getOnlinePlayers()) {
                                    p.spawnParticle(Particle.REDSTONE, peye.getX(), peye.getY(), peye.getZ(), 1, 0.001, 0.001, 0.001, 1, new Particle.DustOptions(Color.RED, 10));
                                }
                                List<Entity> nearby = (List<Entity>) peye.getWorld().getNearbyEntities(peye, 2, 2, 2);
                                if (nearby == null) {
                                    return;
                                }
                                for (Entity tmp : nearby) {
                                    if (tmp instanceof Damageable) {
                                        if (tmp.equals(player)) {

                                        } else {
                                            ((Damageable) tmp).damage(1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onbowarrowland(ProjectileHitEvent event) {
        if (event.getEntity().getShooter() instanceof Player) {
            Player player = (Player) event.getEntity().getShooter();
            if (player.getInventory().getItemInMainHand().getItemMeta().getLore().equals(null)) {
                return;
            }
            if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
                if (player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                    String foundValue = (player.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING));
                    if (foundValue.equals("Veryswagplugin - modularbow")) {
                        float x = (float) event.getEntity().getLocation().getX();
                        float y = (float) event.getEntity().getLocation().getY();
                        float z = (float) event.getEntity().getLocation().getZ();
                        float p = player.getLocation().getPitch();
                        float ya = player.getLocation().getYaw();
                        event.getEntity().remove();
                        player.teleport(new Location(player.getWorld(), x, y, z, ya, p));
                        player.playSound(new Location(player.getWorld(), x, y, z, ya, p), Sound.ENTITY_SHULKER_TELEPORT, 100f, 10f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta() == null) {
            return;
        }
        if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
            if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                String foundValue = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                if (foundValue.equals("Veryswagplugin - movementstick")) {
                    player.setFallDistance(0);
                }
            }
        }
    }

    @EventHandler
    public static void onplayerjoin(PlayerJoinEvent event) {
    }

    @EventHandler
    public static void onplayervelo(PlayerVelocityEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("veryswagplugin.itemsuse") || player.isOp()) {
            if (player.getInventory().getHelmet() != null) {
                if (player.getInventory().getHelmet().getItemMeta().getLore() != null) {
                    if (event.getPlayer().getInventory().getHelmet().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING)) {
                        String foundValue = event.getPlayer().getInventory().getHelmet().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.STRING);
                        if (foundValue.equals("Veryswagplugin - ccrown")) {
                            event.setCancelled(true);
                        }
                    }
                }
            }
        }
    }
}



/*        code to detect whether the item has the persistent data container in it ( the verynicekey container with the value of pi in it)
if (event.getItem().getItemMeta().getPersistentDataContainer().has(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.DOUBLE)) {
                        double foundValue = event.getItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey"), PersistentDataType.DOUBLE);
                        if (foundValue == Math.PI) {


                        }
                    }


 */

