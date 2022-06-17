package Day16Assignment.Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			List<Product> prod = new ArrayList<>();
		try 
		{
			for(int i=0;i<4;i++)
			{
				System.out.println("Enter The Details of Student "+(i+1));
				
				System.out.println("Enter product id");
				int id = s.nextInt();
				
				System.out.println("Enter product Name");
				String name = s.next();
				
				System.out.println("Enter product Price");
				double price = s.nextDouble();
				
				Product p = new Product(id,name,price);
				prod.add(p);
			}
			System.out.println("Enter 1 for sorting the product according to the productPrice");
			System.out.println("Enter 2 for sorting the product according to the productName ");
			System.out.println("Enter 3 for sorting the product according to the productId");
			int choice1 = s.nextInt();
			ProductComp p = new ProductComp();
			p.choice=choice1;
			Collections.sort(prod,new ProductComp());
			for(Product p1 : prod)
			{
				System.out.println(p1);
			}
		}
			catch(Exception e)
			{
				System.out.println("Enter Data in valid format");
			}
      
    	
	}

}
