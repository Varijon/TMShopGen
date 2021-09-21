package com.varijon.tinies.TMShopGen;

import java.util.ArrayList;

public class ShopItemCollection 
{
	ArrayList<ShopItemStore> items;

	public ShopItemCollection(ArrayList<ShopItemStore> items) {
		super();
		this.items = items;
	}

	public ArrayList<ShopItemStore> getItems() {
		return items;
	}

	public void setItems(ArrayList<ShopItemStore> items) {
		this.items = items;
	}
	
}
