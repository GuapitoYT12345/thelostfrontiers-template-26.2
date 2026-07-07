package com.opaqueyardinfinity.thelostfrontiers.worldgen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ModConfiguredFeatures {

    // FIXED: This now creates a real ResourceKey instead of returning null
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORES_KEY =
            registerKey("silver_ores");

    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(
                Registries.CONFIGURED_FEATURE,
                Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, name)
        );
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        List<OreConfiguration.TargetBlockState> silverTargets = List.of(
                OreConfiguration.target(
                        new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.SILVER_ORE.get().defaultBlockState()
                ),
                OreConfiguration.target(
                        new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES),
                        ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()
                )
        );

        register(context, SILVER_ORES_KEY, Feature.ORE, new OreConfiguration(silverTargets, 8, 0.7f)
        );
    }
}

