package dev.joelkkusi.introduction_mod.ModItems;

import dev.joelkkusi.introduction_mod.IntroductionMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class Items {

    private Items() {
    }

    public static final Item PURPLE_DUST = register(new Item(new Item.Settings().maxCount(16)), "purple_dust");

    public static Item register(Item item, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(IntroductionMod.MOD_ID, name), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(Items.PURPLE_DUST));
    }
}
