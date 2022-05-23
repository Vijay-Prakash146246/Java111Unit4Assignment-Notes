//Day5: String, StringBuilder,StringBuffer, Scanner
package Day5Notes;
import java.util.Scanner;
public class Day5Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Welcome";
//		String s2 = "Welcome";
//		if(s1 == s2)
//		System.out.println("same");
//		else
//		System.out.println("not same");  //o/p same 
		
//		String s1 = new String("Welcome");
//		String s2 = new String("Welcome");
//		if(s1 == s2)
//		System.out.println("same");
//		else
//		System.out.println("not same");//not same
		
		
//		byte[] bytes = {100,101,102};
//		String str =new String(bytes);
//		System.out.println(str);//o/p def

		
//		char chars[] = {'M', 'a', 's', 'a', 'i'};
//		String s = new String(chars);
//		System.out.println(s);//O/P Masai
		
		
//		StringBuffer sbuffer = new StringBuffer("Masai");
//		String s = new String(sbuffer); //Masai
//		System.out.println(s);//Masai
		
		
//		StringBuilder sbuilder = new StringBuilder("Masai");
//		String s = new String(sbuilder); //Masai
//		System.out.println(s);//Masai
		
		
//		String name = "Java ";
//		System.out.println("Student Name is : " + name);
		
		
//		System.out.println("Hello" + 10 + 20 + "Welcome");//Hello1020Welcome
		
//		String message = "Welcome";
//		message.concat(" user");
//		System.out.println(message);//Welcome
		
		
//		String message = "Welcome";
//		String newMessage = message.concat(" user");
//		System.out.println(message);//Welcome
//		System.out.println(newMessage);//Welcome user
		
		
//		StringBuilder z= new StringBuilder("start");
//		z.append("le");
//		System.out.println(z);//startle
		
		
//		StringBuilder message = new StringBuilder("Welcome");
//		message.append(" to Masai");
//		System.out.println(message);//Welcome to Masai

		
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");
//		System.out.println(s1==s2);//true (because both refer to same instance)\r\n
//		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
		
		
//		String s1="Sachin";
//		String s2="Sachin";
//		String s3="Ratan";
//		System.out.println(s1.compareTo(s2));//0
//		System.out.println(s1.compareTo(s3));//1(because s1>s3)
//		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
		
		
		
//		// creates an object of Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your name: ");
//		// takes input from the keyboard
//		String name = scanner.nextLine();
//		// prints the name
//		System.out.println("My name is " + name);//Enter your name: Vijay
//		//o/pMy name is Vijay

		
		
		// creates a Scanner object
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number 1: ");
//		int num1 = scanner.nextInt();
//		System.out.println("Enter number 2: ");
//		int num2 = scanner.nextInt();
//		System.out.println("Result is : " + (num1+num2));
		
		/*
		 * Enter number 1: 
           12
          Enter number 2: 
          13
          Result is : 25
		 * */
		
		
		
//		// creates an object of Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your name: ");
//		// reads the entire word
//		String value = scanner.next();
//		System.out.println("Using next(): " + value);//Enter your name: Vijay Prakash
//		//Using next(): Vijay
//		scanner.close();
		
		
		// creates an object of Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		// reads the entire word
		String value = scanner.nextLine();
		System.out.println("Using next(): " + value);//Enter your name: Vijay Prakash
		//Using next(): Vijay Prakash
		scanner.close();
		
	}

}
