package com.opaqueyardinfinity.thelostfrontiers.tags;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
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
}
