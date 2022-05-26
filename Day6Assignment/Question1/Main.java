package Day6Assignment.Question1;
import java.util.*;

public class Main {
	
	public static String reversString(String input)
	{
		//write the logic
		int len=input.length();
		String str="";
		for(int i=len-1;i>=0;i--)
		{
			char x = input.charAt(i);
			str+=x;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}

}
