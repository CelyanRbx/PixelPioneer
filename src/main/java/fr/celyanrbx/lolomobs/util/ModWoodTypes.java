package fr.celyanrbx.lolomobs.util;

import fr.celyanrbx.lolomobs.LoloMobs;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(LoloMobs.MOD_ID + ":pine", BlockSetType.OAK));
}
