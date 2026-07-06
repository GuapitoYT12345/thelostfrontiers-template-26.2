package com.opaqueyardinfinity.thelostfrontiers.datagen;

import com.opaqueyardinfinity.thelostfrontiers.TheLostFrontiers;
import com.opaqueyardinfinity.thelostfrontiers.item.ModItems;
import com.opaqueyardinfinity.thelostfrontiers.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, TheLostFrontiers.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        tag(ModTags.Items.SILVER_REPAIRABLE)
                .add(ModItems.getRK(ModItems.SILVER_INGOT.get()));


        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.SILVER_SWORD.get()));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.SILVER_PICKAXE.get()));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.SILVER_SHOVEL.get()));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.SILVER_AXE.get()));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.SILVER_HOE.get()));
        tag(ItemTags.SPEARS).add(ModItems.getRK(ModItems.SILVER_SPEAR.get()));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.SILVER_HELMET.get()));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SILVER_CHESTPLATE.get()));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SILVER_LEGGINGS.get()));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SILVER_BOOTS.get()));

    }
}