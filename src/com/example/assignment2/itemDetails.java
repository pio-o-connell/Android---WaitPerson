package com.example.assignment2;

public class itemDetails {

	public itemDetails() {
		
		
	}

	Staples itemExtra;
	int itemQuantity;
	double Subtotal;
	String itemName;
	double itemPrice;
	
	
	public itemDetails(Staples itemExtra, int itemQuantity, double subtotal,String itemName,double itemPrice) {
		this.itemName = itemName;
		this.itemExtra = itemExtra;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.Subtotal = subtotal;
		
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Staples getItemExtra() {
		return itemExtra;
	}
	public void setItemExtra(Staples itemExtra) {
		this.itemExtra = itemExtra;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(double subtotal) {
		Subtotal = subtotal;
	}

}
