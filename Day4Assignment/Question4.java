package Day4Assignment;
public class Question4 {
	void fun1(int num)
	{
		if(num%2==1)
		{
			System.out.println(num);
		}
		else if(num%2==0)
		{
			for(int i=0;i<10;i++)
			{
				num++;
				if(num%10==0)
				{
					System.out.println(num);
					break;
				}
			}
		}
		else if(num<0)
		{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 obj = new Question4();
		obj.fun1(-5);

	}

}
