package com.opaqueyardinfinity.thelostfrontiers.tags;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, name));
        }
    }


    public static class Items {
        public static final TagKey<Item> SILVER_REPAIRABLE = createTag("silver_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, name));
        }

    }

    /* Biome Levels */

    //The Overworld
    public static final TagKey<Biome> BIOME_LEVEL_1 = createTag("biome_level_1");
    public static final TagKey<Biome> BIOME_LEVEL_2 = createTag("biome_level_2");
    public static final TagKey<Biome> BIOME_LEVEL_3 = createTag("biome_level_3");
    public static final TagKey<Biome> BIOME_LEVEL_4 = createTag("biome_level_4");
    public static final TagKey<Biome> BIOME_LEVEL_5 = createTag("biome_level_5");
    public static final TagKey<Biome> BIOME_LEVEL_6 = createTag("biome_level_6");
    public static final TagKey<Biome> BIOME_LEVEL_7 = createTag("biome_level_7");
    public static final TagKey<Biome> BIOME_LEVEL_8 = createTag("biome_level_8");
    public static final TagKey<Biome> BIOME_LEVEL_9 = createTag("biome_level_9");

    //The Nether
    public static final TagKey<Biome> BIOME_LEVEL_11 = createTag("biome_level_11");
    public static final TagKey<Biome> BIOME_LEVEL_12 = createTag("biome_level_12");
    public static final TagKey<Biome> BIOME_LEVEL_13 = createTag("biome_level_13");
    public static final TagKey<Biome> BIOME_LEVEL_14 = createTag("biome_level_14");
    public static final TagKey<Biome> BIOME_LEVEL_15 = createTag("biome_level_15");

    //The End
    public static final TagKey<Biome> BIOME_LEVEL_21 = createTag("biome_level_21");

    //The Whisperdeep


    private static TagKey<Biome> createTag(String name) {
        return TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(TheLostFrontiers.MOD_ID, name));
    }
}
