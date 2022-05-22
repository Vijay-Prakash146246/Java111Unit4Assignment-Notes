package Day3Assignment;
//What is the difference between the static and the non-static variables of a class 
//explain it with an example?

/*
* Static Variable :- The variables which are declared inside the class but outside of the 
* methods with static modifier are called static variables.
* 
* non-static variables:- The variables which are declare inside a class but outside 
* of methods are called non-static variables.
* */

public class AssignmentQ1 {
	int z=10;
	static int x =22;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		//o/p 22 so we can directly access static variable in static area 
		AssignmentQ1 obj = new AssignmentQ1();
		System.out.println(obj.z);
		//o/p 10 so we can't directly access non-static variable in static area 
		//we can access it through object

	}

}
