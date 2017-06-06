package com.epamtraining.stationaryitems.domain;

public abstract class StationaryItems {

	private String itemName;
	private int quantity;
	
	public StationaryItems(String itemName, int quantity) {
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.quantity = quantity;
	}
	
	public abstract Integer getPrice();
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
