package com.Geocery;

public class Product {
	
	private String name;
	private double unitprice;
	private int stockquantity;
	private double gstpercetage;
	
	public Product(String name,double unitprice,int stockquantity,double gstpercentage) {
		this.name=name;
		this.unitprice=unitprice;
		this.stockquantity=stockquantity;
		this.gstpercetage=gstpercentage;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getUnitprice() {
		return this.unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice=unitprice;
	}
	public int getStockquantity() {
		return this.stockquantity;
	}
	public void setStockquantity(int stockquantity) {
		this.stockquantity=stockquantity;
	}
	public double getGstpercentage() {
		return this.gstpercetage;
	}
	public void setGstpercentage(double gstpercentage) {
		this.gstpercetage=gstpercentage;
	}
	public String toString() {
		return this.name+" "+this.unitprice+" "+this.stockquantity+" "+this.gstpercetage;
	}

}
