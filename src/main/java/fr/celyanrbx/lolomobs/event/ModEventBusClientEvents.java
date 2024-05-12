package fr.celyanrbx.lolomobs.event;

import fr.celyanrbx.lolomobs.LoloMobs;
import fr.celyanrbx.lolomobs.block.entity.ModBlockEntities;
import fr.celyanrbx.lolomobs.block.entity.renderer.GemPolishingBlockEntityRenderer;
import fr.celyanrbx.lolomobs.entity.client.ModModelLayers;
import fr.celyanrbx.lolomobs.entity.client.RhinoModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LoloMobs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.GEM_POLISHING_BE.get(), GemPolishingBlockEntityRenderer::new);
    }
}