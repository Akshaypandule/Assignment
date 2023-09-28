package com.Assign1;

public class Watertank {
	
	public static void main(String[] args) {
		int tankcapacity=5000;
		
		float filledtank=(0.45f*tankcapacity);
		
		float requiredwatertofillfulltank=(tankcapacity-filledtank);
		
		System.out.println("Required water to fill full tank "+requiredwatertofillfulltank);
	}

}
