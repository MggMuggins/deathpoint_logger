package com.mggmuggins.deathpointlogger;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new DeathpointEventHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
