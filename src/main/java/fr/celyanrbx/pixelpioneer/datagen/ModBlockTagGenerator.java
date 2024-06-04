package fr.celyanrbx.pixelpioneer.datagen;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import fr.celyanrbx.pixelpioneer.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PixelPioneer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES)
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES)
                .add(ModBlocks.EMERALD_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RAW_RUBY_BLOCK.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_DOOR.get(),
                        ModBlocks.SAPPHIRE_TRAPDOOR.get(),
                        ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(),
                        ModBlocks.SAPPHIRE_STAIRS.get(),
                        ModBlocks.SAPPHIRE_SLAB.get(),
                        ModBlocks.SAPPHIRE_BUTTON.get(),
                        ModBlocks.SAPPHIRE_FENCE.get(),
                        ModBlocks.SAPPHIRE_FENCE_GATE.get(),
                        ModBlocks.RUBY_DOOR.get(),
                        ModBlocks.RUBY_TRAPDOOR.get(),
                        ModBlocks.RUBY_PRESSURE_PLATE.get(),
                        ModBlocks.RUBY_STAIRS.get(),
                        ModBlocks.RUBY_SLAB.get(),
                        ModBlocks.RUBY_BUTTON.get(),
                        ModBlocks.RUBY_FENCE.get(),
                        ModBlocks.RUBY_FENCE_GATE.get(),
                        ModBlocks.EMERALD_ORE.get(),
                        ModBlocks.DEEPSLATE_EMERALD_ORE.get(),
                        ModBlocks.NETHER_EMERALD_ORE.get(),
                        ModBlocks.END_STONE_EMERALD_ORE.get(),
                        ModBlocks.EMERALD_BLOCK.get(),
                        ModBlocks.RAW_EMERALD_BLOCK.get(),
                        ModBlocks.EMERALD_ORE.get(),
                        ModBlocks.DEEPSLATE_EMERALD_ORE.get(),
                        ModBlocks.NETHER_EMERALD_ORE.get(),
                        ModBlocks.END_STONE_EMERALD_ORE.get());



        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get());
                     ModBlocks.RUBY_BLOCK.get();
                     ModBlocks.EMERALD_BLOCK.get();

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                     ModBlocks.RAW_RUBY_BLOCK.get();
                     ModBlocks.RAW_EMERALD_BLOCK.get();

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                     ModBlocks.NETHER_RUBY_ORE.get();
                     ModBlocks.NETHER_EMERALD_ORE.get();

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                     ModBlocks.END_STONE_RUBY_ORE.get();

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_EMERALD_TOOL)
                .add(ModBlocks.EMERALD_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.RUBY_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.RUBY_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get());
    }
}
