package net.auriny.cosrpg;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.Perspective;

public class CoSRPGClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinecraftClient client = MinecraftClient.getInstance();
        client.options.setPerspective(Perspective.THIRD_PERSON_BACK);
    }
}
