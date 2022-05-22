package Day2Notes;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=10;
//		if( (a++ == 10) | (b++ == 10) )
//		{
//		System.out.println(a+" "+b);//OUTPUT: 11 11
//		}
//		int c=10;
//		int d=10;
//		if( (c++ == 10) || (d++ == 10) ) //here 2nd condition does not get evaluated
//		{
//		System.out.println(c+" "+d);//OUTPUT: 11 10
//		}
		
//		int a=10;
//		int b=10;
//		if( (a++ != 10) & (b++ != 10) )
//		{ }
//		System.out.println(a+" "+b);//OUTPUT: 11 11
//		int c=10;
//		int d=10;
//		if( (c++ != 10) && (d++ != 10) )
//		{ 
//		    System.out.println(c+" "+d);//OUTPUT: 11 10
//		}
		
		
//		System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE+"----->"+Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE+"----->"+Long.MAX_VALUE);
//		System.out.println(Float.MIN_VALUE+"----->"+Float.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE+"----->"+Double.MAX_VALUE);
//		System.out.println(Character.MIN_VALUE+"----->"+Character.MAX_VALUE);
		//System.out.println(Boolean.MIN_VALUE+"----->"+Boolean.MAX_VALUE); //Error
		
//		byte b=10;
//		int i = b;
//		System.out.println(b+" "+i);
//		
		
//		int i=10;
//		byte b=i;
//		System.out.println(i+" "+b);//Compilation Error 
		
//		byte b=65;
//		char c=b;
//		System.out.println(b+" "+c);//Compilation Error 
		
//		char c='A';
//		int i=c;
//		System.out.println(c+" "+i);
//		//A 65
		
//		byte b1=60;
//		byte b2=70;
//		byte b=b1+b2;
//		System.out.println(b);//Compilation Error
		
//		int i = 10;
//		byte b = (byte)i;
//		System.out.println(i+" "+b);//10 10
		
//		byte b1=30;
//		byte b2=30;
//		byte b=(byte)(b1+b2);
//		System.out.println(b);//60

		
//		int i=130;
//		byte b=(byte)i;
//		System.out.println(b);//-126
		
//		float f= 10.55;
//	System.out.println(f);//Error
		
//		float f= 10.55f;
//	System.out.println(f); //10.55
		
//		float f= (float)10.55;
//    	System.out.println(f);//10.55
		
		
//		int i=10;
//		int j;
//		if(i==10)
//		{
//		j=20;
//		}
//		System.out.println(j);
//		}
	//Compilation Error, Variable j might not have been initialized.
		
		
//		int i=10;
//		int j;
//		if(i==10)
//		{
//		j=20;
//		}
//		else
//		{
//		j=30;
//		}
//		System.out.println(j);//20
		
		
//		int i=10;
//		int j;
//		if(i==10)
//		{
//		j=20;
//		}
//		else if(i==20)
//		{
//		j=30;
//		}
//		else
//		{
//		j=40;
//		}
//		System.out.println(j);//20
		
		
//		int i=10;
//		switch(i)
//		{
//		case 5:
//		System.out.println("Five");
//		break;
//		case 10:
//		System.out.println("Ten");
//		break;
//		case 15:
//		System.out.println("Fifteen");
//		break;
//		case 20:
//		System.out.println("Twenty");
//		break;
//		default:
//		System.out.println("Default");
//		break;
//		}
//		//Ten
		
		
//		for(int i=0;i<10;i++) 
//		{
//			System.out.println(i);
//		}
		
//		System.out.println("Before Loop");
//		for(int i=0; true ;i++){//infinite loop
//		System.out.println("Inside Loop");
//		}
		//System.out.println("After Loop");//Compilation Error, Unreachable Statement

//		int i=0;
//		while(i<10)
//		{
//		System.out.println(i);
//		i=i+1;
//		}
		
//		System.out.println("Before Loop");
//		while(true)
//		{
//		System.out.println("Inside Loop");
//		}
//		System.out.println("After Loop");//Error Unreachable code
		
//		int i=0;
//		do
//		{
//		System.out.println(i);
//		i=i+1;
//		}
//		while (i<10);
//		
		
//		System.out.println("Before Loop");
//		do
//		{
//		System.out.println("Inside Loop");
//		}
//		while (true);
//		System.out.println("After Loop");
		//Unreachable code
		
//		for(int i=0;i<10;i++)
//		{
//			if(i==5)
//			break;
//			System.out.println(i);
//		}
		
		
//		for(int i=0; i<10; i++)// Outer loop
//		{
//			for(int j=0; j<10; j++)// Nested Loop
//			{
//			if(j==5)
//			break;
//			System.out.println(i+" "+j);
//			} // end of nested loop
//		}
		
		
		
//		for(int i=0;i<10;i++)
//		{
//			if(i==5)
//			continue;
//			System.out.println(i);
//		}
		
//		for(int i=0;i<10;i++)
//		{
//			if(i %2 == 0)
//			continue;
//			System.out.println(i);
//		}
		
		
//		System.out.println("before Loop");
//		for(int i=0;i<10;i++)
//		{
//		if(i == 5)
//		{
//		System.out.println("Inside Loop, before continue");
//		continue;
//		//System.out.println("Inside Loop, After continue");//Unreachable code
//		}
//		}
//		System.out.println("After loop");
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==2)
				continue;
				System.out.println(i+" "+j);
			}
		}
		
		
		
	}

}
