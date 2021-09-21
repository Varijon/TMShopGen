package com.varijon.tinies.TMShopGen;

public class ShopItemStore 
{
	String id;
	int itemData;
	String nbtData;
	String name;
	int buy;
	int sell;
	public ShopItemStore(String id, int itemData, String name, int buy, int sell, String nbtData) {
		super();
		this.id = id;
		this.itemData = itemData;
		this.name = name;
		this.buy = buy;
		this.sell = sell;
		this.nbtData = nbtData;
	}
	public ShopItemStore(String id, int itemData, String name, int buy, int sell) {
		super();
		this.id = id;
		this.itemData = itemData;
		this.name = name;
		this.buy = buy;
		this.sell = sell;
		this.nbtData = "";
	}
	public ShopItemStore(String id, String name, int buy, int sell) {
		super();
		this.id = id;
		this.itemData = 0;
		this.name = name;
		this.buy = buy;
		this.sell = sell;
		this.nbtData = "";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getItemData() {
		return itemData;
	}
	public void setItemData(int itemData) {
		this.itemData = itemData;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBuy() {
		return buy;
	}
	public void setBuy(int buy) {
		this.buy = buy;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public String getNbtData() {
		return nbtData;
	}
	public void setNbtData(String nbtData) {
		this.nbtData = nbtData;
	}
	
	
}
