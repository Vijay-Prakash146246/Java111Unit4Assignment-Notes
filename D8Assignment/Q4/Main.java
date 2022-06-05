package D8Assignment.Q4;
class Animal 
{
	public void makeNoise()
	{
		System.out.println("Animal making Noise");
	}
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void walk()
	{
		System.out.println("Animal is walking");
	}
}

/*Create 3 child classes for the above Animal class
1. Dog
2. Cat
3. Tiger
Override makeNoise method in all these child classes as follows:
 * */
class Dog extends Animal
{
	public void makeNoise()
	{
		System.out.println("Barking...");
	}
}

class Cat extends Animal
{
	public void makeNoise()
	{
		System.out.println("Meaw...");
	}
}

class Tiger extends Animal
{
	public void makeNoise()
	{
		System.out.println("Raoring...");
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array of Animal class with size 3
		Animal[] ani1 = new Animal[3];
		//initialize all 3 elements of this Animal class
		//with Dog, Cat and Tiger class object.
		ani1[0]=new Dog();
		ani1[1]=new Cat();
		ani1[2]=new Tiger();
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		ani1[0].makeNoise();
		ani1[0].eat();
		ani1[0].walk();
		
		ani1[1].makeNoise();
		ani1[1].eat();
		ani1[1].walk();
		
		ani1[2].makeNoise();
		ani1[2].eat();
		ani1[2].walk();

	}

}
