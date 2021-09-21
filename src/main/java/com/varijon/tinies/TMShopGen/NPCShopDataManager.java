package com.varijon.tinies.TMShopGen;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pixelmonmod.pixelmon.config.PixelmonItemsTMs;
import com.pixelmonmod.pixelmon.enums.EnumType;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen1TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen2TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen3TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen4TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen5TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen6TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen7TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen8TechnicalMachines;
import com.pixelmonmod.pixelmon.enums.technicalmoves.Gen8TechnicalRecords;
import com.pixelmonmod.pixelmon.enums.technicalmoves.ITechnicalMove;
import com.varijon.tinies.TMShopGen.NPCObject.NPCChat;
import com.varijon.tinies.TMShopGen.NPCObject.NPCData;
import com.varijon.tinies.TMShopGen.NPCObject.NPCName;
import com.varijon.tinies.TMShopGen.NPCObject.NPCStore;
import com.varijon.tinies.TMShopGen.NPCObject.NPCStoreItem;
import com.varijon.tinies.TMShopGen.NPCObject.NPCTexture;

import net.minecraft.item.ItemStack;

public class NPCShopDataManager 
{
static ArrayList<ShopItemCollection> lstShopItemCollection = new ArrayList<ShopItemCollection>();
	
	public static boolean loadStorage()
	{
		String basefolder = new File("").getAbsolutePath();
        String source = basefolder + "/config/TMShopGen";
		try
		{
			Gson gson = new Gson();
			
			File dir = new File(source);
			if(!dir.exists())
			{
				dir.mkdirs();
			}
			
			lstShopItemCollection.clear();
			writeExampleFile();
			
			for(File file : dir.listFiles())
			{
				FileReader reader = new FileReader(file);
				
				ShopItemCollection shopItemCollection = gson.fromJson(reader, ShopItemCollection.class);
								
				lstShopItemCollection.add(shopItemCollection);
				reader.close();
			}
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	public static void writeExampleFile()
	{
		String basefolder = new File("").getAbsolutePath();
        String source = basefolder + "/config/TMShopGen";
		
		try
		{
			File dir = new File(source);
			if(!dir.exists())
			{
				dir.mkdirs();
			}
			ArrayList<ShopItemStore> lst_AllShopItem = new ArrayList<ShopItemStore>();
			ArrayList<ITechnicalMove> lst_AllMoves = new ArrayList<ITechnicalMove>();


			for(ITechnicalMove move : Gen7TechnicalMachines.values())
			{
				lst_AllMoves.add(move);
			}
			for(ITechnicalMove move : Gen6TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen5TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen4TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen3TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen2TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen1TechnicalMachines.values())
			{
				boolean exists = false;
				for(ITechnicalMove allMove : lst_AllMoves)
				{
					if(allMove.getAttack().getAttackName() == move.getAttack().getAttackName())
					{
						exists = true;
					}
				}
				if(!exists)
				{
					lst_AllMoves.add(move);
				}
			}
			for(ITechnicalMove move : Gen8TechnicalRecords.values())
			{
				lst_AllMoves.add(move);
			}	
			for(ITechnicalMove move : Gen8TechnicalMachines.values())
			{
				lst_AllMoves.add(move);
			}
			for(ITechnicalMove allMove : lst_AllMoves)
			{
				ShopItemStore matchItem = null;
				for(ShopItemStore itemStore : lstShopItemCollection.get(0).getItems())
				{
					if(itemStore.id.contains(allMove.getAttack().getAttackName().replace(" ", "")))
					{
						matchItem = itemStore;
					}
					
				}
				

				ItemStack item = PixelmonItemsTMs.createStackFor(allMove);
				if(matchItem != null)
				{
					lst_AllShopItem.add(new ShopItemStore(item.getDisplayName(),0,item.getItem().getRegistryName().toString(),matchItem.buy,matchItem.sell,item.getTagCompound().toString()));	
				}
				else
				{
					lst_AllShopItem.add(new ShopItemStore(item.getDisplayName(),0,item.getItem().getRegistryName().toString(),50000,0,item.getTagCompound().toString()));	
				}
			}

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			ShopItemCollection shopItemCollection = new ShopItemCollection(lst_AllShopItem);

			FileWriter writer = new FileWriter(source + "/shopItems.json");
			gson.toJson(shopItemCollection, writer);
			writer.close();
			
			String source2 = basefolder + "/config/TMShopGen/shopKeepers";
			File dir2 = new File(source2);
			if(!dir2.exists())
			{
				dir2.mkdirs();
			}

			for(EnumType type : EnumType.values())
			{
				ArrayList<NPCTexture> textures = new ArrayList<>();
				textures.add(new NPCTexture("shopman2.png"));
				textures.add(new NPCTexture("shopman.png"));
				textures.add(new NPCTexture("shopman3.png"));
				textures.add(new NPCTexture("shopman4.png"));
				textures.add(new NPCTexture("shopman5.png"));

				ArrayList<NPCName> names = new ArrayList<>();
				names.add(new NPCName("TM/TR Dealer - " + type.toString()));

				ArrayList<NPCChat> chat = new ArrayList<>();
				chat.add(new NPCChat("Welcome to my "+ type.toString() +" shop!", "Come back soon!"));

				ArrayList<NPCStoreItem> items = new ArrayList<>();
				for(ITechnicalMove move : lst_AllMoves)
				{
					if(move.getAttack().getAttackType() == type)
					{
						ItemStack item = PixelmonItemsTMs.createStackFor(move);
						items.add(new NPCStoreItem(item.getDisplayName(), false));
					}
				}

				gson = new GsonBuilder().setPrettyPrinting().create();

				NPCStore npc = new NPCStore(new NPCData("PokemartMain"),textures, names, chat, items);

				

				FileWriter npcWriter = new FileWriter(source2 + "/tmdealer" + type.toString() + "NPC_en_us.json");
				gson.toJson(npc, npcWriter);
				npcWriter.close();
			}

		}
			
		catch (Exception ex) 
		{
		    ex.printStackTrace();
		}
	}
//	public static void writeUserData(TMTier tmTier)
//	{
//		String basefolder = new File("").getAbsolutePath();
//        String source = basefolder + "/config/TMBossLoot";
//		
//		try
//		{
//			File dir = new File(source);
//			if(!dir.exists())
//			{
//				dir.mkdirs();
//			}
//			Gson gson = new GsonBuilder().setPrettyPrinting().create();
//					
//			FileWriter writer = new FileWriter(source + "/" + tmTier.tierName + ".json");
//			gson.toJson(tmTier, writer);
//			writer.close();
//		}
//			
//		catch (Exception ex) 
//		{
//		    ex.printStackTrace();
//		}
//	}
//	
//	public static TMTier getTierData(String tierName)
//	{
//		for(TMTier tmTierData : lstTMTier)
//		{
//			if(tmTierData.tierName.equals(tierName))
//			{
//				return tmTierData;
//			}
//		}
//		return null;
//	}
	
//	public static void saveChangesToFile()
//	{
//		String basefolder = new File("").getAbsolutePath();
//        String source = basefolder + "/config/CatchEventReport";
//		
//		try
//		{
//			File dir = new File(source);
//			if(!dir.exists())
//			{
//				dir.mkdirs();
//			}
//			if(dir.listFiles().length == 0)
//			{
//				ArrayList<EventPokemon> lstEventPokemon = new ArrayList<EventPokemon>();
//				lstEventPokemon.add(new EventPokemon(EnumSpecies.Salandit, "winter", 10));
//				lstEventPokemon.add(new EventPokemon(EnumSpecies.Cutiefly, "winter", 20));
//				EventConfig event = new EventConfig("Example", "exampleTag", "Welcome to the Example event", lstEventPokemon);
//		
//				Gson gson = new GsonBuilder().setPrettyPrinting().create();
//					
//				FileWriter writer = new FileWriter(source + "/Example.json");
//				gson.toJson(event, writer);
//				writer.close();
//			}
//		}
//			
//		catch (Exception ex) 
//		{
//		    ex.printStackTrace();
//		}
//	}
	
	public static ArrayList<ShopItemCollection> getShopItemCollectionList()
	{
		return lstShopItemCollection;
	}
}
