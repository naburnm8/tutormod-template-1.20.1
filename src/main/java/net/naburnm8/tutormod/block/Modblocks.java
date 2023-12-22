package net.naburnm8.tutormod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.naburnm8.tutormod.TutorMod;

public class Modblocks {
    public static final Block ROUBLE_BLOCK = registerBlock("rouble_block", new Block(FabricBlockSettings.copyOf(Blocks.DRIED_KELP_BLOCK).sounds(BlockSoundGroup.BAMBOO)));
    public static final Block ROUBLE_5_BLOCK = registerBlock("rouble_5_block", new Block(FabricBlockSettings.copyOf(Blocks.DRIED_KELP_BLOCK).sounds(BlockSoundGroup.WOOD)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TutorMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        TutorMod.LOGGER.info("Registering blocks for: " + TutorMod.MOD_ID);
    }
}
