package com.Assign1;

public class GlassTank {
	
	public static void main(String[] args) {
		int totaltankcapacity=5000;
		float  oneGlassCapToFillTank=0.0025f;
		
		float totalGlassrequired=(totaltankcapacity/oneGlassCapToFillTank);
		
		System.out.println("Total Glass required "+totalGlassrequired);
	}

}
