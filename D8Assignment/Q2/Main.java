package D8Assignment.Q2;
//Q2) Explain ClassCastException with the help of the example.

/* Ans :- class cast exception occur when we try to convert one class type object into another 
 * class object 
 *       In other words we can say that when we try to cast an object of parent class 
 *              to the child class object then this exception will occur
 *              
 * */
class Animal
{
	String color;
	Animal()
	{
		
	}
	Animal(String color)
	{
		this.color=color;
	}
	void eat(String name)
	{
		System.out.println(name+" is eating ");
	}
	void show(String name)
	{
		System.out.println(name+" is of "+color+" Color");
	}
}
public class Main extends Animal
{

	Main(String color)
	{
		super(color);
	}
	void eat(String name)
	{
		System.out.println(name+" is eating");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Animal a1 = new Animal("white");
		Main m = (Main)a1; //we got class cast exception 
	}

}
