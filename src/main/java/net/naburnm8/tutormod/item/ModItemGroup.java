package net.naburnm8.tutormod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.naburnm8.tutormod.TutorMod;
import net.naburnm8.tutormod.block.Modblocks;

public class ModItemGroup {
    public static final ItemGroup MyMod_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorMod.MOD_ID, "rouble"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rouble"))
            .icon(() -> new ItemStack(Moditems.ROUBLE)).entries((displayContext, entries) -> {
                    entries.add(Moditems.ROUBLE);
                    entries.add(Moditems.ROUBLE_5);
                    entries.add(Modblocks.ROUBLE_BLOCK);
                    entries.add(Modblocks.ROUBLE_5_BLOCK);
            }).build());
    public static void registerItemGroups(){
        TutorMod.LOGGER.info("Registering item groups for: " + TutorMod.MOD_ID);
    }
}
