package me.loremente.stopcountdown;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        BukkitTask task = Bukkit.getScheduler().runTaskLater(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.GREEN + "The cycle is about to begin");
            }
            //200 = delay = seconds
        },200);

        Bukkit.getScheduler().runTaskTimer(this,() -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.GREEN + "They are a cycle that will be spammed endlessly");
            }
            //200 = delay = seconds
        },300, 20);
    }
}
