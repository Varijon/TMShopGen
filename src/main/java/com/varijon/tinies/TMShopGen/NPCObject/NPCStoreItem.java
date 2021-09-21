package com.varijon.tinies.TMShopGen.NPCObject;

public class NPCStoreItem 
{
	String name;
	boolean variation;
	public NPCStoreItem(String name, boolean variation) {
		super();
		this.name = name;
		this.variation = variation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVariation() {
		return variation;
	}
	public void setVariation(boolean variation) {
		this.variation = variation;
	}
	
	
}
