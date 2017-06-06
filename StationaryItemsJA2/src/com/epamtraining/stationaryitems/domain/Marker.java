package com.epamtraining.stationaryitems.domain;

public class Marker extends StationaryItems{

	private int price;
	
	public Marker(String itemName,int quantity,int price) {
		super(itemName, quantity);
		this.setPrice(price);
		// TODO Auto-generated constructor stub
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		return this.getItemName()+"  "+price+"\n";
	}
}
