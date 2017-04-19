package com.mggmuggins.deathpointlogger;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import com.mggmuggins.deathpointlogger.commands.CommandDeathpoint;

@Mod(modid = DeathpointLogger.MODID, name = DeathpointLogger.MODNAME, version = DeathpointLogger.VERSION)
public class DeathpointLogger
{
    public static final String MODID = "deathpointlogger";
    public static final String MODNAME = "Deathpoint Logger";
    public static final String VERSION = "1.0";

    @Instance
    public static DeathpointLogger instance;

    @SidedProxy(clientSide = "com.mggmuggins.deathpointlogger.ClientProxy", serverSide = "com.mggmuggins.deathpointlogger.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandDeathpoint());
    }
}
