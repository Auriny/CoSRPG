package net.auriny.cosrpg;

import net.auriny.cosrpg.block.CosBlocks;
import net.auriny.cosrpg.item.CosItems;
import net.auriny.cosrpg.world.feature.CosConfiguredFeature;
import net.auriny.cosrpg.world.gen.CosOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoSRPG implements ModInitializer {
	public static final String MOD_ID = "cosrpg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting...");
		CosItems.registerModItems();
		CosBlocks.registerModBlocks();
		CosConfiguredFeature.registerConfigureFeature();
		CosOreGeneration.generateOres();
	}


}
