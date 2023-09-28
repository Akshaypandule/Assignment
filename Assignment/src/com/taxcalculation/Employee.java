package com.taxcalculation;
public class Employee {
	private int id;
	private String name;
	private String city;
	private double totalCTC;
	private double invested;
	public Employee(int id,String name,String city,double totalCTC,double investe) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.totalCTC=totalCTC;
		this.invested=investe;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity()
	{
		return this.city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public double gettotalCTC() {
		return this.totalCTC;
	}
	public void setTotalCTC (double totalCTC){
		this.totalCTC=totalCTC;
	}
	public double getInvested() {
		return invested;
	}
	public void setInvested(double invested) {
		this.invested=invested;
	}
	 public String toString()
	 {
		 return this.id+" "+this.name+" "+this.city+" "+this.totalCTC+" "+this.invested;
	 }

}