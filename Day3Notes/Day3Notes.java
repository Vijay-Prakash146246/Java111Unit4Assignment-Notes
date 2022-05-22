package Day3Notes;

public class Day3Notes {
//	int x=100; //instance variable
//	int x=10;
	
	
	
//	String artist;
//	String title;
//	void play()
//	{
//	    System.out.println(artist+" is singing "+title);
//	}
	
//	static int x;
//	int y;

	
//	static int i=10;
//	public static void fun1()
//	{
//		System.out.println("inside fun1 of Demo");
//	}
	
	
	static String bankName;
	long accountNumber;
	String accountHolderName;
	double balance;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int y=10; //local variable of Day3Notes mehtod
//		
//		System.out.println(y); // 10
//		//System.out.println(x);//error
//		Day3Notes obj=new Day3Notes();
//		System.out.println(obj.x);
		
//		
//		Day3Notes obj1=new Day3Notes();
//		obj1.x=50;
//		System.out.println(obj1.x); //50
//		
////		Day3Notes obj2=new Day3Notes();
////		System.out.println(obj2.x); //10
//		
//		
//		Day3Notes obj2=obj1;
//		System.out.println(obj2.x);//50
//		
//		obj2=null; //here garbage collector will destroy the Demo object
//		System.out.println(obj2.x); //NullPointerException
		
		
//		Day3Notes track1=new Day3Notes();
//		track1.artist="Lata";
//		track1.title="wande matram";
//		track1.play();
//		Day3Notes track2=new Day3Notes();
//		track2.artist="Sukhwindar";
//		track2.title="Jai Ho";
//		track2.play();
		
//		
//		Day3Notes obj1 = new Day3Notes();
//		obj1.x=10;
//		obj1.y=20;
//		Day3Notes obj2 = new Day3Notes();
//		obj2.x=50;
//		obj2.y=80;
//		System.out.println(obj1.x); //50
//		System.out.println(obj1.y); //20
//		System.out.println(obj2.x); //50
//		System.out.println(obj2.y); //80
		
		
		//using directly
//		System.out.println(i);
//		fun1();
//		//by using class name
//		System.out.println(Day3Notes.i);
//		Day3Notes.fun1();
//		//using by an object
//		Day3Notes obj=new Day3Notes();
//		System.out.println(obj.i);
//		obj.fun1();
		
		
		Day3Notes.bankName="SBI";
		Day3Notes ac1=new Day3Notes();
		ac1.accountHolderName="Ramesh";
		ac1.accountNumber=13422323432L;
		ac1.balance=5000;
		Day3Notes ac2=new Day3Notes();
		ac2.accountHolderName="Amit";
		ac2.accountNumber=25422323432L;
		ac2.balance=6000;
		System.out.println("Day3Notes1 details");
		System.out.println(ac1.bankName);
		System.out.println(ac1.accountHolderName);
		System.out.println(ac1.balance);
		System.out.println("======================");
		System.out.println("Day3Notes2 details");
		System.out.println(ac2.bankName);
		System.out.println(ac2.accountHolderName);
		System.out.println(ac2.balance);

	}

}
