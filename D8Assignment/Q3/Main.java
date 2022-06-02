//Q3) Explain dynamic polymorphism ?

/*Ans :- It is the process of calling the overridden method at run time 
 * 
 * 
 * */
package D8Assignment.Q3;
class Demo
{
	public void display()
	{
		System.out.println("Demo (Parent) Method");
	}
}
public class Main extends Demo
{
	@Override
	public void display()
	{
		System.out.println("Main (Child) Method");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Demo d = new Main();
		d.display();
	}

}
