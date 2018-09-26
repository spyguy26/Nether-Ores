package org.spyguy26.netherores.listener;


import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.ItemAdder;

import static org.spyguy26.netherores.listener.NetherOresRegistry.*;
import static org.spyguy26.netherores.utils.Reference.MOD_ID;

public class NetherOresItems implements ItemAdder {

    @Override
    public void registerItems(){

        /*Item Blocks */
        Item.register(NETHER_COAL_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_IRON_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_LAPIS_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_EMERALD_ORE, ItemGroup.BUILDING_BLOCKS);
        Item.register(NETHER_REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);

    }
}
