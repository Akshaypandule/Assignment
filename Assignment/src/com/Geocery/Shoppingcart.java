package com.Geocery;

public class Shoppingcart {
	
	private Product product;
	private int quantity;
	
	public Shoppingcart(Product product,int quantity) {
		this.product=product;
		this.quantity=quantity;
	}
	public Product getProduct() {
		return this.product;
	}
	public int getQuantity() {
		return quantity;
	}
	
}
