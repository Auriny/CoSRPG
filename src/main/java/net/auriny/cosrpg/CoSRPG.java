package net.auriny.cosrpg;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoSRPG implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("cosrpg");

	@Override
	public void onInitialize() {
		LOGGER.info("Starting...");
	}


}
