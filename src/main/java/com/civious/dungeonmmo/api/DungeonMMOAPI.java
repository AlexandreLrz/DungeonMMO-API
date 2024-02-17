package com.civious.dungeonmmo.api;

public class DungeonMMOAPI {
    private static DungeonMMOAPI instance = new DungeonMMOAPI();

    public static DungeonMMOAPI getInstance() {
        return instance;
    }

    public void registerItemProvider(String providerName, ItemProvider provider) {}
}
