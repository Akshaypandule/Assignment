package com.cloth;

public class Main {
	
	public static void main(String[] args) {
		Cloth_business cloth=new Cloth_business();
		
		System.out.println(cloth.higestprofit());
		System.out.println(cloth.lowestprofit());
		System.out.println(cloth.Totalprofit());
		cloth.lowestprofitthanprivousmonth();
		
	}
}
