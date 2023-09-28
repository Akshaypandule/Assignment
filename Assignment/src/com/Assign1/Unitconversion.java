package com.Assign1;

public class Unitconversion {
	
	public static void main(String [] args)
	{
		int num = 7;
		float gmToKg = (num*0.001f);
		
		System.out.println(num+" gram = "+gmToKg+" Kilo-gram");
		
		float kgToGm = (num*1000);
		
		System.out.println(num+" Kilo-gram = "+kgToGm+" gram");
		float cmToKm = (num*0.00001f);
		
		System.out.println(num+" centi-meter = "+cmToKm+" kilo-meter");
		float kmToCm = (num*100000);
		System.out.println(num+" kilo-meter = "+kmToCm+" centi-meter");
		float kgToLb = (num*2.2f);
		System.out.println(num+" kilo-gram = "+kgToLb+" pounds");
		float sqMtrToHect = (num*0.0001f);
		System.out.println(num+" square-meter = "+sqMtrToHect+" hectar");
		}
	

}
