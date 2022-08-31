package net.auriny.cosrpg.world.gen;

import net.auriny.cosrpg.world.feature.CosPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class CosOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, CosPlacedFeatures.COSORITE_ORE_PLACED.getKey().get());
    }
}
