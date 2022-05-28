package Day7Assignment.Q2;
/*Q2)Create a class Student and the subclasses DayScholar and Hosteller,
 * 
Class Student:

Instance Variables:
studId : integer,
studName :String,
examFee:double

Methods:
displayDetails(): void,
payFee() :double
Provide suitable constructors
 * */
class Student
{
	int studId ;
	String studName;
	double examFee;
	
	public Student(int studId, String studName, double examFee) 
	{
		//super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
	
	public Student() {
		super();
	}


	void displayDetails()
	{
		
	}
	double payFee(int amount)
	{
		return (examFee-amount);
	}

}

/*Class DayScholar :
Instance Variables :
transportFee: double:
hostelFee: double
Provide suitable constructors
 * */
class DayScholar extends Student
{
	double transportFee;
	double hostelFee;
	public DayScholar(int studId, String studName, double examFee, double transportFee, double hostelFee) 
	{
		super(studId, studName, examFee);
		this.transportFee = transportFee;
		this.hostelFee = hostelFee;
	}
	
}
class Hosteller extends Student
{
}

/*
 * Create a “Main Class”. In this create two objects for each DayScholar and
Hosteler classes. Invoke payFee() method with suitable amount and obtain the
remaining amount to be paid.
 * */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar d1 = new DayScholar(123, "Vijay", 6000, 5000, 30000);
		Hosteller h1 = new Hosteller();
		double res=d1.payFee(2000);
		System.out.println("The Remaining Amount is: "+res);
		      

	}

}
