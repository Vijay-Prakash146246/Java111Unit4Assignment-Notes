package Day16Assignment.Q2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Day16Assignment.Q1.Product;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Set<Employee> h1 = new HashSet<>();
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter The Details of Student "+(i+1));
			System.out.println("Enter product id");
			int id = s.nextInt();
			
			System.out.println("Enter product Name");
			String name = s.next();
			
			System.out.println("Enter product Price");
			double price = s.nextDouble();
			
			Employee p = new Employee(id,name,price);
			h1.add(p);
		}
		for(Employee e : h1)
		{
			System.out.println(e);
		}
	}

}
