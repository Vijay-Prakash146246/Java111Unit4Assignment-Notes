package Day4Assignment;

public class Demo {
	Demo()
	{
		this("Vijay");
		System.out.println("Constructor without argument");
	}
	Demo(String s)
	{
		this(12);
		System.out.println("Constructor with String argument");
	}
	Demo(int i)
	{
		this(12.45f);
		System.out.println("Constructor with Integer argument");
	}
	Demo(float f)
	{
		System.out.println("Constructor with float argument");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();

	}

}
