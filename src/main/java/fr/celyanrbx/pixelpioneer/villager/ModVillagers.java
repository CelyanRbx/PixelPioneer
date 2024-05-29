package fr.celyanrbx.pixelpioneer.villager;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModVillagers {
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, PixelPioneer.MOD_ID);




    public static void register(IEventBus eventBus) {
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
