package com.civious.dungeonmmo.api;

import org.bukkit.inventory.ItemStack;

public interface ItemProvider {
    ItemStack generateItem(String tag);
}
