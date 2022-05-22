package Day3Assignment;

public class AssignmentQ4 {
	int roll;
	String name;
	int marks;
	void displayAssignmentQ4Details()
	{
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentQ4 s1 = new AssignmentQ4();
		s1.roll=1;
		s1.name="Vijay";
		s1.marks=95;
		s1.displayAssignmentQ4Details();
		AssignmentQ4 s2 = new AssignmentQ4();
		s2.roll=2;
		s2.name="Vijay Prakash";
		s2.marks=90;
		s2.displayAssignmentQ4Details();
		s1=null;
		s2=null;

	}

}
