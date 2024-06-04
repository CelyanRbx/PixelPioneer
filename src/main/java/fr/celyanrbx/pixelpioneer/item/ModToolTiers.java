package fr.celyanrbx.pixelpioneer.item;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(PixelPioneer.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(PixelPioneer.MOD_ID, "ruby"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(ModItems.EMERALD.get())),
            new ResourceLocation(PixelPioneer.MOD_ID, "emerald"), List.of(Tiers.NETHERITE), List.of());

}
