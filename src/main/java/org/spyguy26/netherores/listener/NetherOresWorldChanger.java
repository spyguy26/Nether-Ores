package org.spyguy26.netherores.listener;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import org.dimdev.rift.listener.WorldChanger;

import static net.minecraft.world.biome.Biome.COUNT_RANGE;

public class NetherOresWorldChanger implements WorldChanger {
    @Override
    public void modifyBiome(int biomeId, String biomeName, Biome biome) {
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_COAL_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(20,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_IRON_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(20,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_GOLD_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(2,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_DIAMOND_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(1,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_LAPIS_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(16,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_EMERALD_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(1,
                                0,
                                0,
                                128)
                )
        );
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Biome.createCompositeFeature(
                        Feature.MINABLE,
                        new MinableConfig(
                                (state) -> {
                                    Block block = state.getBlock();
                                    return block == Blocks.NETHERRACK;
                                },
                                NetherOresRegistry.NETHER_REDSTONE_ORE.getDefaultState(),
                                8
                        ),
                        COUNT_RANGE,
                        new CountRangeConfig(8,
                                0,
                                0,
                                128)
                )
        );
    }
}
