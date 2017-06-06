package com.epamtraining.stationaryitems.domain;

public class StickyNotes extends StationaryItems{

	private int price;
	private String message;
	
	public StickyNotes(String itemName, int quantity, int price) {
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString(){
		return this.getItemName()+"  "+price+"\n";
	}

}
