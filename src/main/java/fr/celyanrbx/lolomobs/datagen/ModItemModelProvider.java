package fr.celyanrbx.lolomobs.datagen;

import fr.celyanrbx.lolomobs.LoloMobs;
import fr.celyanrbx.lolomobs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, LoloMobs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(ModItems.SAPPHIRE);
        simpleBlockItem(ModItems.RAW_SAPPHIRE);

        simpleBlockItem(ModItems.METAL_DETECTOR);
        simpleBlockItem(ModItems.PINE_CONE);
        simpleBlockItem(ModItems.STRAWBERRY);
    }


    private ItemModelBuilder simpleBlockItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(LoloMobs.MOD_ID,"item/" + item.getId().getPath()));
    }
}
