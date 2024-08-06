package dev.joelkkusi.introduction_mod;

import dev.joelkkusi.introduction_mod.ModItems.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntroductionMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("introduction_mod");
	public static final String MOD_ID = "introduction_mod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Introduction Mod!");
		Items.initialize();
	}
}