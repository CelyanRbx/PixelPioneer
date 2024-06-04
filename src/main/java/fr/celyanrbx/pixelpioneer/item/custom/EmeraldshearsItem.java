package fr.celyanrbx.pixelpioneer.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.block.state.BlockState;

public class EmeraldshearsItem extends ShearsItem {
    public EmeraldshearsItem() {
        super(new Item.Properties().durability(100));
    }

    @Override
    public int getEnchantmentValue() {
        return 2;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
        return 4f;
    }
}
