package com.besson.tutorialmod.item;

import com.besson.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item SUPER_WHITE_DIAMOND = registerItems("super_white_diamond", new Item(new Item.Settings()));
//    简单的物品，超级白钻
    private static Item registerItems(String id,Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id), item);
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Items");
    }
}





























