package Day4Notes;

public class Employee {
//	String empId;
//	String empName;
//	double salary;
	//Employee has Address
//	Address address;
	
	//defining Address class as a static member
//	static Address address;
	
	
	
//	String empId;
//	String empName;
//	double salary;
//	Address address = new Address();
//	public void showDetails()
//	{
//		System.out.println("Employee Id :"+empId);
//		System.out.println("Employee Name :"+empName);
//		System.out.println("Employee Salary :"+salary);
//		System.out.println("Employee Address :");
//		address.printAddress();
//	}
	
	
	
	String empId;
	String name;
	double salary;
	//zero argument constructor
	public Employee() {
	empId="Emp-01";
	name= "Ramesh";
	salary = 50000.00;
	}
	//overloaded parameterized constructor
	public Employee(String empId, String name, double salary) {
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	}
	public void showDetails() 
	{
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+name);
		System.out.println("Salary is :"+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp1 = new Employee();
//		System.out.println(emp1); //Employee object hashcode i.e Employee@323232
//		System.out.println(emp1.empId); // null
//		System.out.println(emp1.empName); // null
//		System.out.println(emp1.salary); // 0.0
//		System.out.println(emp1.address); // null
//		Employee emp2 = new Employee();
//		emp2.empId = "Emp-01";
//		emp2.empName = "Ram";
//		emp2.salary = 60000.00;
//		emp2.address = new Address();
//		emp2.address.city = "Coimbator";
//		emp2.address.state = "Tamilnadu";
//		emp2.address.pincode = "434322";
//		System.out.println(emp2.empId); // Emp-01
//		System.out.println(emp2.empName); // Ram
//		System.out.println(emp2.salary); // 60000.00
//		System.out.println(emp2.address); //Address object hashcode i.e Address@232423
//		System.out.println(emp2.address.city); //Coimbator
//		System.out.println(emp2.address.state); //Tamilnadu
//		System.out.println(emp2.address.pincode); //434322
		
		
		
//		Employee emp1 = new Employee();
//		System.out.println(emp1); //Employee object hashcode i.e Employee@323232
//		System.out.println(emp1.empId); // null
//		System.out.println(emp1.empName); // null
//		System.out.println(emp1.salary); // 0.0
//		System.out.println(Employee.address); // null
//		Employee emp2 = new Employee();
//		emp2.empId = "Emp-01";
//		emp2.empName = "Ram";
//		emp2.salary = 60000.00;
//		Employee.address = new Address();
//		//address = new Address(); //within the same class we can access the static members directly
//		//emp2.address=new Address(); we can access the static members with the help of object also
//		Employee.address.city = "Coimbator";
//		Employee.address.state = "Tamilnadu";
//		Employee.address.pincode = "434322";
//		System.out.println(emp2.empId); // Emp-01
//		System.out.println(emp2.empName); // Ram
//		System.out.println(emp2.salary); // 60000.00
//		System.out.println(emp2.address); //Address object hashcode i.e Address@232423
//		System.out.println(emp2.address.city); //Coimbator
//		System.out.println(emp2.address.state); //Tamilnadu
//		System.out.println(emp2.address.pincode); //434322
		
		
		
//		Employee emp1 = new Employee();
//		emp1.showDetails();
//		Employee emp2 = new Employee();
//		emp2.empId = "Emp-01";
//		emp2.empName = "Ramesh";
//		emp2.salary = 50000;
//		emp2.address.city = "Coimbator";
//		emp2.address.state = "Tamilnadu";
//		emp2.address.pincode = "434322";
//		emp2.showDetails();
		
		
		Employee emp1=new Employee();
		emp1.showDetails();
		Employee emp2=new Employee("Emp-02", "Dinesh", 40000.00);
		emp2.showDetails();
	}

}
