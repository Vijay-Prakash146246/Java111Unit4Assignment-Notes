package Day7Assignment.Q1;
/*Create a class named 'Member' having the following members:
Name : String
Age : int
Phone number : String
Address : String
Salary : double
It also has a method named 'printSalary' which prints the salary of the members.
 * */
class Member
{
	String name;
	int age;
	String phoneNumber;
	String Address;
	double Salary;
	void printSalary()
	{
		System.out.println("Salary is : "+Salary);
	}
}

/*Create two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members such as. :
Specialisation : String
Department : String
 * 
 * */
class Employee extends Member
{
	String specialisation;
	String department;
}
class Manager extends Member
{
	String specialisation;
	String department;
}
/*
 * Now, create a Main class which has the main method in it and assign name, age, phone
number, address and salary to an employee and a manager by making an object of both
of these classes and print the same.
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name="Vijay";
		e1.age=23;
		e1.phoneNumber="12345";
		e1.Address="Patna Bihar";
		e1.Salary=20000;
		System.out.println("Employee Details.......\n");
		System.out.println("Name : "+e1.name);
		System.out.println("Age : "+e1.age);
		System.out.println("phoneNumber : "+e1.phoneNumber);
		System.out.println("Address : "+e1.Address);
		System.out.println("Salary : "+e1.Salary);
		
		System.out.println("\n===================================\n");
		System.out.println("Manager Details.......\n");
		
		Manager m1 = new Manager();
		m1.name="Vijay-Prakash";
		m1.age=43;
		m1.phoneNumber="78654";
		m1.Address="Nawada Bihar";
		m1.Salary=50000;
		System.out.println("Name : "+m1.name);
		System.out.println("Age : "+m1.age);
		System.out.println("phoneNumber : "+m1.phoneNumber);
		System.out.println("Address : "+m1.Address);
		System.out.println("Salary : "+m1.Salary);

	}

}
