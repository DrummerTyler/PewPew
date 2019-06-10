package me.tyler.pewpew;

import me.tyler.pewpew.Events.BowPew;
import org.bukkit.plugin.java.JavaPlugin;

public final class PewPew extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new BowPew(), this);
        System.out.println("\u001B[2;29;93m[\u001B[m\u001B[2;49;34mPewPew\u001B[m\u001B[2;29;93m]\u001B[m \u001B[2;29;93m-\u001B[m \u001B[2;49;92mEnabled\u001B[m");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\u001B[2;29;93m[\u001B[m\u001B[2;49;34mPewPew\u001B[m\u001B[2;29;93m]\u001B[m \u001B[2;29;93m-\u001B[m \u001B[2;49;91mDisabled\u001B[m");
    }
}
