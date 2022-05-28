package Day7Assignment.Q3;

//Q3)What is the use of ‘this’ and ‘super’ keyword in java explain with example.


/*This Keyword :- It is basically  use to access current class Object as well as 
 * static members,
 * it is also used to invoke current class constructor
 * */
public class Main {
	int a =10;
	static int b=20;
	void fun1()
	{
		this.a = 200;
		System.out.println(a);
		this.b = 600;
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Main m1 = new Main();
		m1.fun1();

	}

}

/*super Keyword :- super keyword is used to accesses superclass object 
 * as well as static member and also it is used to invoked super class method 
 * and constructor also
 * 

 class Main3
 {
	int x = 10;
	static int y = 20;
 }
 
 class Main extends Main3
 {
			void fun()
			{
				System.out.println(super.x);
				System.out.println(super.y);
			}

			public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				Main m2 = new Main();
				m2.fun();

			}

  }
	*/

