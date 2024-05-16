package fr.celyanrbx.pixelpioneer.util;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(PixelPioneer.MOD_ID + ":pine", BlockSetType.OAK));
}
