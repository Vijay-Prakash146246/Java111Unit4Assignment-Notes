package Day6Assignment.Question3;

public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray)
	{
		int len = inputArray.length;
		int ind=0;
		int [] arr1 = new int[len];
		for(int i=0;i<len;i++)
		{
			int count=0;
			double x=Math.sqrt(inputArray[i]);
			for(int j=2;j<=x;j++)
			{
				if(inputArray[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				arr1[ind]=inputArray[i];
				ind++;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m1= new Main();
		int[] arr = {10,12,5,50,11,14,15};
		int [] arr3=m1.findAndReturnPrimeNumbers(arr);
		if(arr3.length==0)
		{
			System.out.println("Prime number not found in the supplied Array");
		}
		else
		{
			for(int j=0;j<arr3.length;j++)
			{
				if(arr3[j]!=0)
				System.out.println(arr3[j]);
			}
		}
		
	}

}
