package net.naburnm8.tutormod;

import net.fabricmc.api.ModInitializer;

import net.naburnm8.tutormod.block.Modblocks;
import net.naburnm8.tutormod.item.ModItemGroup;
import net.naburnm8.tutormod.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorMod implements ModInitializer {
	public static final String MOD_ID = "tutormod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world! Faggot");
		ModItemGroup.registerItemGroups();
		Moditems.registerModItems();
		Modblocks.registerModBlocks();
	}
}