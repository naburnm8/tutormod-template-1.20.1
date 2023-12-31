package net.naburnm8.tutormod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.naburnm8.tutormod.TutorMod;

public class Moditems {

    public static final Item ROUBLE = registerItem("rouble", new Item(new FabricItemSettings()));
    public static final Item ROUBLE_5 = registerItem("rouble_5", new Item(new FabricItemSettings()));

    /*private static void addItemsToINGREDIENTSTabItemGroup(FabricItemGroupEntries entries){
        entries.add(ROUBLE);
    }*/
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorMod.LOGGER.info("Items registration for " + TutorMod.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToINGREDIENTSTabItemGroup);
    }
}
