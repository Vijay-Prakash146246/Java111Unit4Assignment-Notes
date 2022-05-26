package Day6Assignment.Question4;
import java.util.*;
public class CmdArgument {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		if(args.length==1)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = s.nextInt();
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+num+" = "+fact);
		}
		else if(args.length==2)
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter first number");
			int num1 = s1.nextInt();
			System.out.println("Enter 2nd number");
			int num2 = s1.nextInt();
			int absValue = num1-num2;
			absValue=Math.abs(absValue);
			int fact=1;
			for(int i=1;i<=absValue;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+num1+"-"+num2+" = "+fact);
		}
		else if(args.length>=3)
		{
			System.out.println("Error");
		}
		
	}

}
