package com.taxcalculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxCalculationApp {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employee");
		int n=sc.nextInt();
		TaxCalculations tax=new TaxCalculations();
		
		List<Employee>employees=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
		   System.out.println("Enter Employee id");
		   int id=sc.nextInt();
		   sc.nextLine();
		   
		   System.out.println("Enter Employee Name");
		   String Name=sc.nextLine();
		   
		   System.out.println("Enter employee city");
		   String city=sc.next();
		   
		   System.err.println("Enter total ctc");
		   double totalCTC=sc.nextDouble();
		   sc.nextLine();
		   
		   System.out.println("Enter total investment");
		   double investment=sc.nextDouble();
		   
		   Employee employee=new Employee(id, Name, city, totalCTC, investment);
		   
	       employees.add(employee);
		}
		System.out.printf("%-10s | %-10s | %-12s | %-16s%n", "Name", "CTC", "Yearly Tax", "Monthly In Hand");
		System.out.println("=====================================================");
		for(Employee employee:employees)
		{
			tax.displayemployeeditals(employee);
		}
		
	}

}
