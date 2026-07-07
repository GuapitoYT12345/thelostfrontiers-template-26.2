package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.world.level.biome.Biomes;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagsProvider extends BiomeTagsProvider {
    public ModBiomeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, TheLostFrontiers.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        this.tag(ModTags.BIOME_LEVEL_1)
                .add(Biomes.FOREST)
                .add(Biomes.FLOWER_FOREST)
                .add(Biomes.BIRCH_FOREST)
                .add(Biomes.OLD_GROWTH_BIRCH_FOREST)
                .add(Biomes.PLAINS)
                .add(Biomes.SUNFLOWER_PLAINS)
                .add(Biomes.CHERRY_GROVE)
                .add(Biomes.MEADOW)
                .add(Biomes.WINDSWEPT_HILLS);

        this.tag(ModTags.BIOME_LEVEL_2)
                .add(Biomes.SAVANNA)
                .add(Biomes.SAVANNA_PLATEAU)
                .add(Biomes.WINDSWEPT_SAVANNA);

        this.tag(ModTags.BIOME_LEVEL_3)
                .add(Biomes.TAIGA)
                .add(Biomes.OLD_GROWTH_PINE_TAIGA)
                .add(Biomes.OLD_GROWTH_SPRUCE_TAIGA)
                .add(Biomes.WINDSWEPT_GRAVELLY_HILLS)
                .add(Biomes.WINDSWEPT_FOREST)
                .add(Biomes.DARK_FOREST)
                .add(Biomes.PALE_GARDEN);

        this.tag(ModTags.BIOME_LEVEL_4)
                .add(Biomes.SWAMP)
                .add(Biomes.MANGROVE_SWAMP);

        this.tag(ModTags.BIOME_LEVEL_5)
                .add(Biomes.DESERT);

        this.tag(ModTags.BIOME_LEVEL_6)
                .add(Biomes.JUNGLE)
                .add(Biomes.BAMBOO_JUNGLE)
                .add(Biomes.SPARSE_JUNGLE);

        this.tag(ModTags.BIOME_LEVEL_7)
                .add(Biomes.BADLANDS)
                .add(Biomes.WOODED_BADLANDS)
                .add(Biomes.ERODED_BADLANDS);

        this.tag(ModTags.BIOME_LEVEL_8)
                .add(Biomes.FROZEN_PEAKS)
                .add(Biomes.FROZEN_RIVER)
                .add(Biomes.SNOWY_BEACH)
                .add(Biomes.SNOWY_PLAINS)
                .add(Biomes.SNOWY_SLOPES)
                .add(Biomes.SNOWY_TAIGA)
                .add(Biomes.ICE_SPIKES)
                .add(Biomes.JAGGED_PEAKS)
                .add(Biomes.STONY_PEAKS)
                .add(Biomes.GROVE);

        this.tag(ModTags.BIOME_LEVEL_9)
                .add(Biomes.OCEAN)
                .add(Biomes.DEEP_FROZEN_OCEAN)
                .add(Biomes.FROZEN_OCEAN)
                .add(Biomes.COLD_OCEAN)
                .add(Biomes.DEEP_OCEAN)
                .add(Biomes.DEEP_COLD_OCEAN)
                .add(Biomes.DEEP_LUKEWARM_OCEAN)
                .add(Biomes.LUKEWARM_OCEAN)
                .add(Biomes.WARM_OCEAN);
    }
}