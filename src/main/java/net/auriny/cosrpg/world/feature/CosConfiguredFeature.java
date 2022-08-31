package net.auriny.cosrpg.world.feature;

import net.auriny.cosrpg.CoSRPG;
import net.auriny.cosrpg.block.CosBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class CosConfiguredFeature {
    public static final List<OreFeatureConfig.Target> OVERWORLD_COSORITE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, CosBlocks.COSORITE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, CosBlocks.DEEPSLATE_COSORITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> COSORITE_ORE =
            ConfiguredFeatures.register("cosorite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_COSORITE_ORES, 4));

    public static void registerConfigureFeature() {
        CoSRPG.LOGGER.debug("Registering configure feature for" + CoSRPG.MOD_ID);
    }
}
