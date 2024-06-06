package fr.celyanrbx.pixelpioneer.datagen.loot;

import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import fr.celyanrbx.pixelpioneer.block.custom.CornCropBlock;
import fr.celyanrbx.pixelpioneer.block.custom.StrawberryCropBlock;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition.hasBlockStateProperties;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        this.dropSelf(ModBlocks.RUBY_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RUBY_BLOCK.get());

        this.dropSelf(ModBlocks.EMERALD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_EMERALD_BLOCK.get());

        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));

        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
    this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.NETHER_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.END_STONE_RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));

        this.add(ModBlocks.EMERALD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
        this.add(ModBlocks.DEEPSLATE_EMERALD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
        this.add(ModBlocks.NETHER_EMERALD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
        this.add(ModBlocks.END_STONE_EMERALD_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));

        this.dropSelf(ModBlocks.SAPPHIRE_STAIRS.get());
        this.dropSelf(ModBlocks.SAPPHIRE_BUTTON.get());
        this.dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SAPPHIRE_WALL.get());

        this.add(ModBlocks.SAPPHIRE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SAPPHIRE_SLAB.get()));
        this.add(ModBlocks.SAPPHIRE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SAPPHIRE_DOOR.get()));

        this.dropSelf(ModBlocks.RUBY_STAIRS.get());
        this.dropSelf(ModBlocks.RUBY_BUTTON.get());
        this.dropSelf(ModBlocks.RUBY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RUBY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.RUBY_FENCE.get());
        this.dropSelf(ModBlocks.RUBY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RUBY_WALL.get());

        this.add(ModBlocks.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_SLAB.get()));
        this.add(ModBlocks.RUBY_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBY_DOOR.get()));

        this.dropSelf(ModBlocks.EMERALD_STAIRS.get());
        this.dropSelf(ModBlocks.EMERALD_BUTTON.get());
        this.dropSelf(ModBlocks.EMERALD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.EMERALD_TRAPDOOR.get());
        this.dropSelf(ModBlocks.EMERALD_FENCE.get());
        this.dropSelf(ModBlocks.EMERALD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.EMERALD_WALL.get());

        this.add(ModBlocks.EMERALD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EMERALD_SLAB.get()));
        this.add(ModBlocks.EMERALD_DOOR.get(),
                block -> createDoorTable(ModBlocks.EMERALD_DOOR.get()));

        LootItemCondition.Builder lootitemcondition$builder = hasBlockStateProperties(ModBlocks.STRAWBERRY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 5));

        this.add(ModBlocks.STRAWBERRY_CROP.get(), createCropDrops(ModBlocks.STRAWBERRY_CROP.get(), ModItems.STRAWBERRY.get(),
                ModItems.STRAWBERRY_SEEDS.get(), lootitemcondition$builder));


        LootItemCondition.Builder lootitemcondition$builder2 = hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 7))
                .or(hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8)));

        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8));

        this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(),
                ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));

        this.dropSelf(ModBlocks.CATMINT.get());
        this.add(ModBlocks.POTTED_CATMINT.get(), createPotFlowerItemTable(ModBlocks.CATMINT.get()));

        this.dropSelf(ModBlocks.GEM_POLISHING_STATION.get());

        this.dropSelf(ModBlocks.PINE_LOG.get());
        this.dropSelf(ModBlocks.PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(ModBlocks.PINE_PLANKS.get());

        this.add(ModBlocks.PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));// TODO: Change to Sapling!

        this.add(ModBlocks.PINE_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));

        this.dropSelf(ModBlocks.PINE_SAPLING.get());

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
