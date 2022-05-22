package Day4Assignment;
public class Question1 {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Question1()
	{
		//the valid range,18<age<60, 0<marks<500
		
			this.roll=1;
			this.name="Vijay";
			this.age=26;
			this.marks=385;
	}
	
	public Question1(int roll,String name,int age,int marks)
	{
		//the valid range,18<age<60, 0<marks<500
		if((age>18&&age<60) && (marks>0&&marks<500))
		{
			this.roll=roll;
			this.name=name;
			this.age=age;
			this.marks=marks;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Question1 obj = new Question1();
		System.out.println(obj.roll);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.marks);
		Question1 obj1 = new Question1(2,"Vijay-Prakash",45,465);
		System.out.println(obj1.roll);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.marks);

	}

}
