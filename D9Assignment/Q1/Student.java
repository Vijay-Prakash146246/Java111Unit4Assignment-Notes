package D9Assignment.Q1;
/*Q1) Create a Student bean class having the following properties
Instance variables:
private roll: int
private String name
private int marks
private char grade
 * */
public class Student 
{
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public int getRoll() 
	{
		return roll;
	}
	
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getMarks() 
	{
		return marks;
	}
	
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	
	public char getGrade() 
	{
		return grade;
	}
	
	public void setGrade(char grade) 
	{
		this.grade = grade;
	}

	public Student() 
	{
		super();
	}
	
	
	
	
	
}
