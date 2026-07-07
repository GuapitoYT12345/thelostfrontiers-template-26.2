package com.opaqueyardinfinity.thelostfrontiers.worldgen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.PlacementUtils.register;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> SILVER_ORES_PLACED_KEY =
            registerKey("silver_ores_placed");

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(
                Registries.PLACED_FEATURE,
                Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, name)
        );
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {

        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(
                context,
                SILVER_ORES_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORES_KEY),
                ModOrePlacements.commonOrePlacement(
                        6,
                        HeightRangePlacement.triangle(
                                VerticalAnchor.absolute(-64),
                                VerticalAnchor.absolute(36)
                        )
                )
        );
    }
}
