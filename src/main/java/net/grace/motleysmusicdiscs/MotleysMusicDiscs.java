package net.grace.motleysmusicdiscs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotleysMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "motleysmusicdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger("motleysmusicdiscs");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}