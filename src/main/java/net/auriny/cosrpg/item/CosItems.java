package net.auriny.cosrpg.item;

import net.auriny.cosrpg.CoSRPG;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CosItems {

    //Items Registry
    public static final Item RAW_COSORITE = registerItem("raw_cosorite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item COSORITE = registerItem("cosorite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CoSRPG.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CoSRPG.LOGGER.debug("Registered Items for" + CoSRPG.MOD_ID);
    }
}
