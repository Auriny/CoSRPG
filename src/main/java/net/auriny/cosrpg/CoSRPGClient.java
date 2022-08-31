package net.auriny.cosrpg;

import net.auriny.cosrpg.networking.CosMessages;
import net.fabricmc.api.ClientModInitializer;

public class CoSRPGClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println();

        CosMessages.registerS2CPackets();
    }
}
