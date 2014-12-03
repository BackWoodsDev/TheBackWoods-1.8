package com.chaka.thebackwoods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.chaka.thebackwoods.init.InventoryRender;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.init.Recipes;
import com.chaka.thebackwoods.util.LogHelper;
import com.chaka.thebackwoods.util.MFRHandler;
import com.chaka.thebackwoods.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TheBackWoods {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        
        MinecraftForge.EVENT_BUS.register((Object)new MFRHandler());

        ModBlocks.init();
        ModItems.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();
        InventoryRender.init();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }

}
