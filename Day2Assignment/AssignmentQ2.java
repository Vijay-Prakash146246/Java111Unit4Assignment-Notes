package Day2Assignment;

public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(34);

	}
	static void m1(int num)
	{
		if(num>=2&&num<=100)
		{	
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					System.out.println(i);
			}
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
