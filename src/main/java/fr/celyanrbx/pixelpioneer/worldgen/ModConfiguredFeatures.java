package fr.celyanrbx.pixelpioneer.worldgen;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RAW_SAPPHIRE_BLOCK_KEY = registerKey("raw_sapphire_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RAW_RUBY_BLOCK_KEY = registerKey("raw_ruby_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMERALD_ORE_KEY = registerKey("emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RAW_EMERALD_BLOCK_KEY = registerKey("raw_emerald_block");


    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        RuleTest rawReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEmeraldOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_EMERALD_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 9));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 9));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_STONE_SAPPHIRE_ORE.get().defaultBlockState(), 9));
        register(context, RAW_SAPPHIRE_BLOCK_KEY, Feature.ORE, new OreConfiguration(rawReplaceables,
                ModBlocks.RAW_SAPPHIRE_BLOCK.get().defaultBlockState(), 9));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 9));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState(), 9));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_STONE_RUBY_ORE.get().defaultBlockState(), 9));
        register(context, RAW_RUBY_BLOCK_KEY, Feature.ORE, new OreConfiguration(rawReplaceables,
                ModBlocks.RAW_RUBY_BLOCK.get().defaultBlockState(), 9));

        register(context, OVERWORLD_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEmeraldOres, 9));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(), 9));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_STONE_EMERALD_ORE.get().defaultBlockState(), 9));
        register(context, RAW_EMERALD_BLOCK_KEY, Feature.ORE, new OreConfiguration(rawReplaceables,
                ModBlocks.RAW_EMERALD_BLOCK.get().defaultBlockState(), 9));

        register(context, PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PINE_LOG.get()),
                new StraightTrunkPlacer(5, 4, 3),

                BlockStateProvider.simple(ModBlocks.PINE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PixelPioneer.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}