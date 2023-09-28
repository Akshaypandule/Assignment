package com.Geocery;

import java.util.Scanner;

public class Methodlogic {
	
	Shoppingcart[] item=new Shoppingcart[100];
	int  cartitem=0;
	Product[] products= {new Product("Dish Soap", 10, 30, 5),
			new Product("Sugar bag", 50, 55, 10),
			new Product("Chips", 10, 100, 2.5)
			};
	   Scanner sc=new Scanner(System.in);
	     public void Showitem() {
		for(Product pro:products) {
			System.out.println(pro);
		}
	}
	public void Additemincart() {
		System.out.println("Enter item name");
		String itemname=sc.nextLine();
		Product productss=null;
		for(Product pro:products) {
			if(pro.getName().equalsIgnoreCase(itemname))
			{
				productss=pro;
				break;
			}
		}
		if(productss!=null)
		{
			System.out.println("Enter the quantity");
			int quantity=sc.nextInt();
			if(quantity>0 && quantity<=productss.getStockquantity())
			{
				try
				{
				item[cartitem]=new Shoppingcart(productss, quantity);
				cartitem++;
				System.out.println("product is added ");
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Product is not added");
			}
		}
		  else
		  {
			System.out.println("Product is not avaliable in store");
		  }	
	  }
	public void showcart() {
		if(cartitem!=0) {
			for(int i=0;i<cartitem;i++) {
				Shoppingcart cart=item[i];
				
				Product product=cart.getProduct();
				System.out.println(product.getName()+" "+product.getUnitprice()+" "+cart.getQuantity());
			}
		}
		else
		{
			System.out.println("Cart is empty");
		}
	}
	public void Totalbill() {
		System.out.println("  Sr No. |  Product  | Quantity  |  Unit Price  |  GST  |  Price ");
		System.out.println("==================================================================");
		double totalbill=0.0;
		int serialnumber=1;
		if(cartitem!=0) {
			for(int i=0;i<=cartitem;i++) {
				Shoppingcart cart=item[i];
				if(cart!=null)
				{
				Product product=cart.getProduct();
				double bill=cart.getQuantity()*product.getUnitprice();
				double gstbill=(product.getGstpercentage()/100)*bill;
				double itemtotal= (bill+gstbill);
				 totalbill+=itemtotal;
				System.out.println("    "+ serialnumber +"      "+product.getName()+"       "+cart.getQuantity()+"    "
						+ "        "+product.getUnitprice()+"        "+product.getGstpercentage()+"      "
								+itemtotal);
				}
				serialnumber++;
			}
			System.out.println("===================================================================");
			System.out.println("Total bill ="+totalbill);
		}
		else
		{
			System.out.println("Cart is empty");
		}
		
	}
 
}
