package org.spyguy26.netherores.listener;

import net.minecraft.block.BlockOre;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
//import org.spyguy26.netherores.block.*;
//import org.spyguy26.netherores.block.base.*;

import static net.minecraft.block.material.Material.IRON;
import static net.minecraft.init.Blocks.COAL_ORE;
import static net.minecraft.init.Blocks.IRON_ORE;
import static net.minecraft.init.Blocks.GOLD_ORE;
import static net.minecraft.init.Blocks.DIAMOND_ORE;
import static net.minecraft.init.Blocks.LAPIS_ORE;
import static net.minecraft.init.Blocks.EMERALD_ORE;
import static net.minecraft.init.Blocks.REDSTONE_ORE;

public class NetherOresRegistry {
    public final static Block NETHER_COAL_ORE = new BlockOre(Block.Builder.from(COAL_ORE));
    public final static Block NETHER_IRON_ORE = new BlockOre(Block.Builder.from(IRON_ORE));
    public final static Block NETHER_GOLD_ORE = new BlockOre(Block.Builder.from(GOLD_ORE));
    public final static Block NETHER_DIAMOND_ORE = new BlockOre(Block.Builder.from(DIAMOND_ORE));
    public final static Block NETHER_LAPIS_ORE = new BlockOre(Block.Builder.from(LAPIS_ORE));
    public final static Block NETHER_EMERALD_ORE = new BlockOre(Block.Builder.from(EMERALD_ORE));
    public final static Block NETHER_REDSTONE_ORE = new BlockOre(Block.Builder.from(REDSTONE_ORE));
}