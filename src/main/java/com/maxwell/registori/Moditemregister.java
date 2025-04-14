package com.maxwell.registori;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.FoodValues;

import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;
import static vectorwing.farmersdelight.common.registry.ModItems.registerWithTab;

public class Moditemregister {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> SERVER;
    public static final RegistryObject<Item> LATESTLOG;
    public static final RegistryObject<Item> CRASHREPORTLOG;
    static
    {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "farmersdelight");
        SERVER = registerWithTab("server", () -> new Item(foodItem(ServerDelightFoodValues.server)));
        LATESTLOG = registerWithTab("latest", () -> new Item(foodItem(ServerDelightFoodValues.latest)));
        CRASHREPORTLOG = registerWithTab("crashr", () -> new Item(foodItem(ServerDelightFoodValues.crashr)));
    }
}
