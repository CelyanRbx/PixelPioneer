package fr.celyanrbx.pixelpioneer.worldgen.biome;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(PixelPioneer.MOD_ID, "overworld"), 5));
    }
}
