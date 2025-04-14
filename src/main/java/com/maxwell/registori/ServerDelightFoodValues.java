package com.maxwell.registori;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ServerDelightFoodValues {
    public static final FoodProperties server = (new FoodProperties.Builder()).nutrition(40).saturationMod(0.4F).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 1000000, 2), 1.0F).build();
    public static final FoodProperties latest = (new FoodProperties.Builder()).nutrition(5).saturationMod(1.2F).effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 2), 1.0F).build();
    public static final FoodProperties crashr = (new FoodProperties.Builder()).nutrition(-9999999).saturationMod(0.0000000000000001F).effect(() -> new MobEffectInstance(MobEffects.WITHER, 999999999, 999999999), 100.0F).build();
}
