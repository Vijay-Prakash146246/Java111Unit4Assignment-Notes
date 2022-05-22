package Day4Assignment;
public class Student {
	int roll;
	String name;
	String address;
	String collageName;
   public Student(int roll,String name,String address)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName="NIT";
		
		System.out.println(this.roll);
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.collageName);
	}
	public Student(int roll,String name,String address,String collageName)
	{
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
		System.out.println(this.roll);
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.collageName);
	}
	public static Student getStudent(boolean isFromNIT)
	{
		if(isFromNIT)
		{
			Student s1 = new Student(1,"Vijay","Patna Bihar");
		}
		else
		{
			Student s2 = new Student(2,"Vijay-Praksh","Patna Bihar","SRM");
		}
		
		return null ;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		getStudent(true);
		getStudent(false);

	}

}
