package Day3Assignment;

public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assume these can have any value:
				boolean isSnowing = false;
				boolean isRaining = true;
				double temperature = 60.0;
				//print "Let�s stay home." if its raining, snowing or
				//below 50 degrees and print "Let�s go out!" otherwise.
				if(isSnowing==true || isRaining==true || temperature<50)
				{
					System.out.println("Let's stay home.");
				}
				else
				{
					System.out.println("Let's go out!");
				}

	}

}