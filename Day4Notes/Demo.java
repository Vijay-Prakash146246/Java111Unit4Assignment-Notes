package Day4Notes;

public class Demo {
	
	//method defination
//	void fun1(int i)
//	{ 
//		//int type parameter, here i variable will act as local variable
//		System.out.println("inside fun1 of Demo");
//		System.out.println("the value of i is : "+i);
//	}
	
	
	//method with class as parameter
//	void fun1(A a1)
//	{ 
//	// here to call this method we can pass 3 possible values
//	// 1.same class obj, 2 .child class obj, 3. null
//		System.out.println("inside fun1 of Demo");
//		System.out.println("the value of a1 is : "+a1);
//		a1.funA();
//	}
	
	
	
//			void fun1(A a1){ //never use such identifiers
//			if(a1 != null){
//			System.out.println("inside fun1 of Demo");
//			System.out.println("the value of a1 is : "+a1);
//			a1.funA();
//			}else
//			System.out.println("supplied value is null");
//			}
	
//	
//	int fun1()
//	{
//		System.out.println("inside fun1 of Demo");
//		//return 100;
//		//int x=200;
//		//return x;
//		//we can return any value which is compatible with the int type(smaller than int)
//		byte b=10;
//		return b;
//		//long x=20;
//		//return x; //Error
//		//return (int)x; //OK
//	}
	
	
	
//	public A fun1()
//	{ 
//		//return type as class A type
//		System.out.println("inside fun1 of Demo");
//		//A a1=new A();
//		//return a1;
//		return new A();
//	}

	
//	void fun1(byte b)
//	{
//		System.out.println("inside fun1(byte) of Demo");
//		//500 line of code
//		
//	}
//			
//	void fun1(int i)
//	{
//		System.out.println("inside fun1(int) of Demo");
//		//10000 line of code
//	}
	
	
//	Demo()
//	{
//		System.out.println("Inside constructor of Demo");
//	}
	
	
	//instance variable
//	int x=100;
//	void fun1()
//	{
//	//local variable
//		int x=500;
//		System.out.println("inside fun1() of Demo");
//		System.out.println(this); //Demo@232323 current class obj
//		System.out.println(this.x); // 100
//		System.out.println(x); //500
//	}
	
	
//	public Demo()
//	{
//		this(10);
//		System.out.println("inside zero argument constructor Demo()");
//	}
//	public Demo(int x)
//	{
//		this(100, 200);
//		System.out.println("inside one argument constructor Demo(int x)");
//	}
//		public Demo(int x,int y)
//		{
//		this("Hello");
//		System.out.println("inside two argument constructor Demo(int x,int y)");
//		}
//		public Demo(String s)
//		{
//		//this(); //it will become recursive call
//		System.out.println("inside one(String) argument constructor Demo(String s)");
//		}
//		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo d1=new Demo();
//		byte x=20;
//		//method call
//		d1.fun1(x); // any compatible to int we can pass as an argument.(implicit typecasting)
//		//d1.fun1(10);
//		double n1=100.00;
//		//d1.fun1(n1); //Error
//		d1.fun1((int)n1); //valid
		
		
//		Demo d1=new Demo();
//		A a5=new A();
//		d1.fun1(a5);
//		d1.fun1(new A());
		
		
//		Demo d1=new Demo();
//		d1.fun1(new A());
//		d1.fun1(null);
		
		
//		Demo d1=new Demo();
//		d1.fun1(); //here method will be called but returned value will be unreferenced
//		// hence, it will reaches to the garbage collector
//		//to utilize the returned value, we need to hold that value inside a variable
//		//the variable on which we hold that value should be either of the same type or bigger
//		// than the specified type.
//		int x=d1.fun1();
//		System.out.println("Returned value is "+x);
//		long y=d1.fun1(); //implicit typecasting
//		System.out.println("Returned value is "+x);
//		//byte b= d1.fun1(); // Error
//		byte b = (byte)d1.fun1(); //explicit type casting
		
		
//		Demo d1=new Demo();
//		d1.fun1(); //here returned A class object will reaches to the GC.
//		//to hold the returned value we have 2 options:
//		//1.to the same class variable
//		//2.to the parent class variable
//		A a1= d1.fun1(); //to the same class variable
//		a1.funA();
//		Object obj = d1.fun1(); //to the parent class variable
		
//		Demo d1=new Demo();
//		byte x=20;
//		d1.fun1(x); // it will give the priority to the nearest one.
		
		
//		Demo d1=new Demo();
		
		
//		Demo d1=new Demo();
//		System.out.println(d1); // Demo@232323
//		d1.fun1();
		//System.out.println(this); //Compilation Error
		
		
//		Demo d1=new Demo();
		
		
		//using zero argument constructor
		Student student1 = new Student();
		student1.setRoll(100);
		student1.setName("Ram");
		student1.setMarks(800);
		//using parameterized constructor
		Student student2 = new Student(101, "Ramesh", 850);
		System.out.println("Student1 details: ");
		student1.showDetails();
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Marks is :"+student2.getMarks());
		
	}

}
