package com.bartboy8.bl;

import com.bartboy8.bl.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class BetterLights {

    @ServerStarting
    public void serverStarting(FMLServerStartingEvent event){
        
    }
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @Init
    public void load(FMLInitializationEvent event){
        
    }
    
    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event){
        
    }
    
}
