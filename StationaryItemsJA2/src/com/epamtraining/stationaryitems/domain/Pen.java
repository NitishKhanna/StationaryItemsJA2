package com.epamtraining.stationaryitems.domain;

public class Pen extends StationaryItems {

	private int price;
	
	public Pen(String itemName, int quantity,int price) {
		super(itemName, quantity);
		this.price = price;
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
