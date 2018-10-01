package org.spyguy26.netherores.listener;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;


import static org.spyguy26.netherores.listener.NetherOresRegistry.*;
import static org.spyguy26.netherores.utils.Reference.MOD_ID;

public class NetherOresBlocks implements BlockAdder {

    @Override
    public void registerBlocks() {
        Block.register(new ResourceLocation(MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_iron_ore"), NETHER_IRON_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_gold_ore"), NETHER_GOLD_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_diamond_ore"), NETHER_DIAMOND_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_lapis_ore"), NETHER_LAPIS_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_emerald_ore"), NETHER_EMERALD_ORE);
        Block.register(new ResourceLocation(MOD_ID, "nether_redstone_ore"), NETHER_REDSTONE_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_coal_ore"), END_COAL_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_iron_ore"), END_IRON_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_gold_ore"), END_GOLD_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_diamond_ore"), END_DIAMOND_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_lapis_ore"), END_LAPIS_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_emerald_ore"), END_EMERALD_ORE);
        Block.register(new ResourceLocation(MOD_ID, "end_redstone_ore"), END_REDSTONE_ORE);
    }
}
