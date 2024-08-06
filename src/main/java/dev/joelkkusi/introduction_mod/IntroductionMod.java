package dev.joelkkusi.introduction_mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntroductionMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("introduction_mod");
	public static final String MOD_ID = "introduction_mod";

	// Execute command "/give @s introduction_mod:purple_dust"
	public static final Item PURPLE_DUST = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of(IntroductionMod.MOD_ID, "purple_dust"), PURPLE_DUST);

		LOGGER.info("Initializing Introduction Mod!");
	}
}