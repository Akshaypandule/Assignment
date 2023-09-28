package com.loopandmatrix;
import java.util.Scanner;
public class Matrixdeterminant {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter the elements of the 2x2 matrix:");
	        System.out.print("Enter element a: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter element b: ");
	        int b = scanner.nextInt();
	        System.out.print("Enter element c: ");
	        int c = scanner.nextInt();
	        System.out.print("Enter element d: ");
	        int d = scanner.nextInt();

	        
	        int determinant = (a * d) - (b * c);

	        
	        System.out.println("Determinant of the matrix: " + determinant);

	        scanner.close();
	    }
	


}
