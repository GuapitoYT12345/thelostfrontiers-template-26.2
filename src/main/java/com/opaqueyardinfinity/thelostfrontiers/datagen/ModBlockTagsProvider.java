package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.block.ModBlocks;
import com.opaqueyardinfinity.thelostfrontiers.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockItemIds;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, TheLostFrontiers.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.SILVER_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.RAW_SILVER_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.SILVER_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SILVER_ORE.get()));


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.SILVER_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.RAW_SILVER_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.SILVER_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SILVER_ORE.get()));

        tag(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL)
                .add(BlockItemIds.ANCIENT_DEBRIS.block());

        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(BlockItemIds.IRON_ORE.block())
                .add(BlockItemIds.DEEPSLATE_IRON_ORE.block())
                .add(BlockItemIds.DIAMOND_ORE.block())
                .add(BlockItemIds.DEEPSLATE_DIAMOND_ORE.block())
                .add(BlockItemIds.ANCIENT_DEBRIS.block())
                .add(ModBlocks.getRK(ModBlocks.SILVER_BLOCK.get()));

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(BlockItemIds.DIAMOND_ORE.block())
                .add(BlockItemIds.DEEPSLATE_DIAMOND_ORE.block());

        tag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .add(BlockItemIds.DIAMOND_ORE.block())
                .add(BlockItemIds.DEEPSLATE_DIAMOND_ORE.block());

    }
}