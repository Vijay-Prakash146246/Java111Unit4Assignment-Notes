package D8Assignment.Q1;
class Bird
{
	public void fly()
	{
		System.out. println("Bird is flying");
	}
}

class Parrot extends Bird 
{
	public void fly()
	{
		System.out.println("I am Flying");
	}
	
	public void sing()
	{
		System.out.println("I am Singing");
	}
}


/*Bird b1 = new Parrot();
//with this b1 reference call the fly method of
Parrot
//and after downcasting this b1 reference to the
Parrot class object, call the sing method also
 * */
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bird b1 = new Parrot();
		b1.fly();
		Parrot p1 = (Parrot)b1;
		p1.sing();

	}
}
