package com.varijon.tinies.TMShopGen;

import com.pixelmonmod.pixelmon.Pixelmon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid="tmshopgen", version="1.0", acceptableRemoteVersions="*")
public class TMShopGen
{
	public static String MODID = "modid";
	public static String VERSION = "version";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		NPCShopDataManager.loadStorage();	
		NPCShopDataManager.writeExampleFile();
	}

	 @EventHandler
	 public void serverLoad(FMLServerStartingEvent event)
	 {
	 }
}