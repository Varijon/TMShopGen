package com.varijon.tinies.TMShopGen.NPCObject;

import java.util.ArrayList;

public class NPCStore 
{
	NPCData data;
	ArrayList<NPCTexture> textures;
	ArrayList<NPCName> names;
	ArrayList<NPCChat> chat;
	ArrayList<NPCStoreItem> items;
	public NPCStore(NPCData data, ArrayList<NPCTexture> textures, ArrayList<NPCName> names, ArrayList<NPCChat> chat,
			ArrayList<NPCStoreItem> items) {
		super();
		this.data = data;
		this.textures = textures;
		this.names = names;
		this.chat = chat;
		this.items = items;
	}
		
	public NPCData getData() {
		return data;
	}

	public void setData(NPCData data) {
		this.data = data;
	}

	public ArrayList<NPCTexture> getTextures() {
		return textures;
	}

	public void setTextures(ArrayList<NPCTexture> textures) {
		this.textures = textures;
	}

	public ArrayList<NPCName> getNames() {
		return names;
	}

	public void setNames(ArrayList<NPCName> names) {
		this.names = names;
	}

	public ArrayList<NPCChat> getChat() {
		return chat;
	}

	public void setChat(ArrayList<NPCChat> chat) {
		this.chat = chat;
	}

	public ArrayList<NPCStoreItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<NPCStoreItem> items) {
		this.items = items;
	}
	
	
}
