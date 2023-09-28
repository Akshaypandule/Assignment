package com.cloth;

public class Cloth_business {
	
	int[]purchesamount= {514310,783600,923550,116660,887930,929540,441380,210950,247190,675300,473010,994850};
	String[] month= {"january","february","March","April","May","June","July","Augest",
			        "Septembr","october","november","December"};
	
	
	public double calculateprofit(int purchesamount) {
		
	    double trasportaion=purchesamount*0.02;
	    double sellingamount=purchesamount+(purchesamount*0.015);
	    double profit=sellingamount-trasportaion;
		return profit;
	}
	// Calculate highest profit months
	public String higestprofit()
	{
		double higestprofit=Integer.MIN_VALUE;
		String higestprofitmonth=null;
		for(int i=0;i<month.length;i++)
		{
			double profit=calculateprofit(purchesamount[i]);
			if(profit>higestprofit)
			{
				higestprofit=profit;
				higestprofitmonth=month[i];
			}
		}
		return higestprofitmonth+" month made higest profit";
	}
	// Calculate lowest profit Month.
	public String lowestprofit() {
		double lowestprofit=Integer.MAX_VALUE;
		String lowestprofitmonth=null;
		
		for(int i=0;i<month.length;i++) {
			double profit=calculateprofit(purchesamount[i]);
			if(profit<lowestprofit) {
				lowestprofit=profit;
				lowestprofitmonth=month[i];
			}	
		}
		return lowestprofitmonth+" this month made lowest profit";
	}
	// Calculate total profit throughout year.
	public double Totalprofit() {
		
		double totalprofit=0.0;
		for(int i=0;i<purchesamount.length;i++) {
			double profit=calculateprofit(purchesamount[i]);
			totalprofit+=profit;
		}
		return totalprofit;
	}
	
	public void lowestprofitthanprivousmonth() {
		String lowestmonth = null;
		double[] profitAmount = new double[purchesamount.length];
		for(int j=0;j<profitAmount.length;j++)
		{
			profitAmount[j]=calculateprofit(purchesamount[j]);
			
			for(int i=1;i<month.length;i++) {
				if(profitAmount[i-1]>profitAmount[i])
				{
					lowestmonth=month[i];
					
				}System.out.println(lowestmonth);
				
			}
		}
	}

}
