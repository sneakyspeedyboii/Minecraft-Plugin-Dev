package com.sneakyspeedyboii.veryswagplugin.cmds;

import com.sneakyspeedyboii.veryswagplugin.iteminven.inven;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import static com.sneakyspeedyboii.veryswagplugin.events.events.dmgtoggleval;


public class commands implements CommandExecutor {

    @Override
    public  boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;



        if (player.hasPermission("veryswagplugin.commands") || player.hasPermission("veryswagplugin.opcommands")  || player.isOp()) {
            if (cmd.getName().equalsIgnoreCase("getuuid")) {
                player.sendMessage(player.getUniqueId());
                System.out.println(player.getUniqueId());
                return true;
            }

            if (cmd.getName().equalsIgnoreCase("toggledmg")) {
                if (dmgtoggleval.containsKey(player.getUniqueId())) {
                    dmgtoggleval.put(player.getUniqueId(), dmgtoggleval.get(player.getUniqueId()) + 1d);
                } else {
                    dmgtoggleval.put(player.getUniqueId(), 2d);
                }
                player.sendMessage(ChatColor.GREEN + "Damage Toggled");
                return true;
            }
        }

        if (player.hasPermission("veryswagplugin.opcommands")  || player.isOp()) {
            if (cmd.getName().equalsIgnoreCase("vspgui")) {
                inven gui = new inven();
                player.openInventory(gui.getInventory());
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("gmc")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + "Set Gamemode To Creative!");
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("gms")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GREEN + "Set Gamemode To Survival!");
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("removedatacnt")) {
                ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
                NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
                meta.getPersistentDataContainer().set(key, PersistentDataType.STRING, "Veryswagplugin - pain");
                ItemStack stack = new ItemStack(player.getInventory().getItemInMainHand().getType());
                stack.setItemMeta(meta);
                player.getInventory().addItem(stack);
                player.sendMessage(ChatColor.RED + "Removed!");
                return true;
            }

            if (cmd.getName().equalsIgnoreCase("getdata")) {
                ItemStack item = player.getInventory().getItemInMainHand();
                NamespacedKey key = new NamespacedKey(Bukkit.getPluginManager().getPlugin("veryswagplugin"), "verynicekey");
                player.sendMessage(item.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING));
                return true;
            }


            if (cmd.getName().equalsIgnoreCase("heal")) {
                player.sendMessage(ChatColor.GREEN + "Healed!");
                player.setHealth(20);
                player.setSaturation(20);
                return true;
            } else {
                player.sendMessage(ChatColor.RED + "You do not have the permissions to do this");
            }
        }
        return true;
    }
}
