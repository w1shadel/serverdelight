package com.maxwell.serverdelight;

import com.maxwell.registori.Moditemregister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Serverdelight.MODID)
public class Serverdelight
{
    // Define mod id in server.json common place for everything to reference
    public static final String MODID = "serverdelight";
    public Serverdelight(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        Moditemregister.ITEMS.register(modEventBus);
    }

}
