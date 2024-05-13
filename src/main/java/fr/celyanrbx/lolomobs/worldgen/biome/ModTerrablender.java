package fr.celyanrbx.lolomobs.worldgen.biome;


import fr.celyanrbx.lolomobs.LoloMobs;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(LoloMobs.MOD_ID, "overworld"), 5));
    }
}
