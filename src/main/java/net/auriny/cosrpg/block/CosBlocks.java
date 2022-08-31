package net.auriny.cosrpg.block;

import net.auriny.cosrpg.CoSRPG;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class CosBlocks {
    //Blocks
    public static final Block COSORITE_BLOCK = registerBlock("cosorite_block",
        new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_COSORITE_BLOCK = registerBlock("raw_cosorite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)), ItemGroup.BUILDING_BLOCKS);
    public static final Block COSORITE_ORE = registerBlock("cosorite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(0, 0)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_COSORITE_ORE = registerBlock("deepslate_cosorite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(5.5f).requiresTool(),
                    UniformIntProvider.create(0, 0)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CoSRPG.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CoSRPG.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        CoSRPG.LOGGER.debug("Registering blocks for" + CoSRPG.MOD_ID);
    }
}
