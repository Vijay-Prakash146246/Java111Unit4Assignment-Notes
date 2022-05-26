package Day7Assignment.Question1;
class Member 
{
	String Name;
	int Age;
	String Phone_number;
	String Address;
	double Salary;
	void printSalary()
	{
		System.out.println(Salary);
	}

}
class Employee extends Member
{
	String Specialisation ;
	String Department ; 
}
class Manager extends Member
{
	String Specialisation ;
	String Department ; 
}
class Main
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Manager m = new Manager();
		m.Specialisation="DSA";
		System.out.println(m.Specialisation);
				
	}
}
