package me.tyler.pewpew;

import me.tyler.pewpew.events.BowPew;
import org.bukkit.plugin.java.JavaPlugin;

public final class PewPew extends JavaPlugin {

    private String bowPewTitle;

    public String getBowPewTitle() {
        return this.bowPewTitle;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        
        // Fixed an issue where the plugin would proboably crash if the config file was empty.
        
        getConfig().addDefault("Bow-Used", "§1Pew");
        
        // End fix section
        
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        this.bowPewTitle = this.getConfig().getString("Bow-Used");

        getServer().getPluginManager().registerEvents(new BowPew(this.bowPewTitle), this);

        System.out.println("\u001B[2;29;93m[\u001B[m\u001B[2;49;34mPewPew\u001B[m\u001B[2;29;93m]\u001B[m \u001B[2;29;93m-\u001B[m \u001B[2;49;92mEnabled\u001B[m");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\u001B[2;29;93m[\u001B[m\u001B[2;49;34mPewPew\u001B[m\u001B[2;29;93m]\u001B[m \u001B[2;29;93m-\u001B[m \u001B[2;49;91mDisabled\u001B[m");
    }
}
