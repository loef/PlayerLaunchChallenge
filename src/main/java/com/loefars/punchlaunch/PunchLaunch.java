package com.loefars.punchlaunch;

import org.bukkit.Bukkit;
import org.bukkit.block.data.type.Light;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.Random;

public final class PunchLaunch extends JavaPlugin {
    public static PunchLaunch plugin;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new entDmg(), this);
        plugin = this;
        Bukkit.broadcastMessage("§7This plugin was created by §dLoef!");
        Bukkit.broadcastMessage("§fCheck her out at §a§nloefars.com !");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public class entDmg implements Listener {
        @EventHandler
        public void entDmg(EntityDamageByEntityEvent event) {
            if (event.getDamager() instanceof Player) {
                int min1 = -400; // Minimum value of range
                int max1 = 400; // Maximum value of range
                int min2 = 10; // Minimum value of range
                int max2 = 1000; // Maximum value of range
                int min3 = -400; // Minimum value of range
                int max3 = 400; // Maximum value of range

                Player p = (Player) event.getDamager();
                int randomInt1 = (int) Math.floor(Math.random() *(max1 - min1 + 1) + min1);
                int randomInt2 = (int) Math.floor(Math.random() *(max2 - min2 + 1) + min2);
                int randomInt3 = (int) Math.floor(Math.random() *(max3 - min3 + 1) + min3);
                p.setVelocity(new Vector(randomInt1, randomInt2, randomInt3));
            }
            if (event.getEntity() instanceof Player) {
                int min1 = -400; // Minimum value of range
                int max1 = 400; // Maximum value of range
                int min2 = 10; // Minimum value of range
                int max2 = 1000; // Maximum value of range
                int min3 = -400; // Minimum value of range
                int max3 = 400; // Maximum value of range
                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                    @Override
                    public void run() {
                        Player p = (Player) event.getEntity();
                        int randomInt1 = (int) Math.floor(Math.random() *(max1 - min1 + 1) + min1);
                        int randomInt2 = (int) Math.floor(Math.random() *(max2 - min2 + 1) + min2);
                        int randomInt3 = (int) Math.floor(Math.random() *(max3 - min3 + 1) + min3);
                        p.setVelocity(new Vector(randomInt1, randomInt2, randomInt3));
                    }
                }, 1L);
            }
        }
    }
    public static PunchLaunch getPlugin() {
        return plugin;
    }
}

//MADE BY LOEFARS