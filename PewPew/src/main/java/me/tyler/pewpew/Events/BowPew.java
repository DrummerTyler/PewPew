package me.tyler.pewpew.Events;

import me.tyler.pewpew.PewPew;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.Plugin;

public class BowPew implements Listener {

    Plugin plugin = PewPew.getPlugin(PewPew.class);

    @EventHandler
    public void BowUsed(ProjectileLaunchEvent event) {
        if (event.getEntity() instanceof Arrow) {
            Player player = (Player) event.getEntity().getShooter();
            Location location = player.getLocation();
            player.sendTitle(plugin.getConfig().getString("Bow-Used"), " ", 2, 3, 2);
            player.playSound(location, Sound.BLOCK_NOTE_GUITAR, 10, 5);
        }


    }
}