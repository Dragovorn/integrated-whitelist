package com.dragovorn.integratedwhitelist;

import com.dragovorn.integratedwhitelist.data.IDataManager;
import org.bukkit.plugin.java.JavaPlugin;

public class IntegratedWhitelist extends JavaPlugin {

    private static IDataManager dataManager;

    private static IntegratedWhitelist instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        // TODO: Load configuration and perform magik
    }
}
