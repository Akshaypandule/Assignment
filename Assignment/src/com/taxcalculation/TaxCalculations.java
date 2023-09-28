package com.taxcalculation;

public class TaxCalculations {
	
	public double YearTax(Employee employee) {
		double taxable;
		double yearctc=employee.gettotalCTC();
		double investment=employee.getInvested();
		taxable=yearctc-investment;
		double yeartax=taxable*0.20;
		return yeartax;
	}
	public double monthlyinhand(Employee employee) {
		
		double yearinhand=employee.gettotalCTC()-employee.getInvested()-YearTax(employee);
		double monthlyinhand=yearinhand/12;
		return monthlyinhand;
	}
	public void displayemployeeditals(Employee employee) {
	    System.out.printf("%-10s | %-10.2f | %-12.2f | %-16.2f%n",employee.getName(),+employee.gettotalCTC(),YearTax(employee),monthlyinhand(employee));
		System.out.println("=====================================================");
		
	}
}
