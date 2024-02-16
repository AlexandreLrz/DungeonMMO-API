package com.civious.dungeonmmo.api;

import com.civious.dungeonmmo.DungeonMMO;

public class DungeonMMOAPI {
    private static DungeonMMOAPI instance = new DungeonMMOAPI();

    public static DungeonMMOAPI getInstance() {
        return instance;
    }

    public void registerItemProvider(String providerName, ItemProvider provider) {
        DungeonMMO.getInstance().getItemProviderManager().registerProvider(providerName, provider);
    }
}
