package me.tyler.pewpew.events;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class BowPew implements Listener {

    private final String onBowPew; // Don't store direct plugin references as this can cause issues when the server reloads

    public BowPew(String onBowPew) { // Only constructors can start with a capital letter as that is naming convention for Java classes
        this.onBowPew = onBowPew;
    }

    @EventHandler
    public void onBowUsed(ProjectileLaunchEvent event) { // Function names should start with a lowercase letter
        if (event.getEntity() instanceof Arrow) {
            if (event.getEntity().getShooter() instanceof Player) { // Don't just blindly cast; other mobs and dispensers can also shoot arrows
                Player player = (Player) event.getEntity().getShooter();
                Location location = player.getLocation();
                player.sendTitle(this.onBowPew, " ", 2, 3, 2);
                player.playSound(location, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10, 5); // Changed sound name due to changes in 1.14
            }
        }
    }
}
