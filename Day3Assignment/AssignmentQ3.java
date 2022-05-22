package Day3Assignment;

public class AssignmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				AssignmentQ3 obj = new AssignmentQ3();
				obj.m1('A');
				obj.m1('d');
				obj.m1('@');

	}
	
	void m1(char ch)
	{
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("vowel");
			break;
		case 'b':
		case 'B':
		case 'c':
		case 'C':
		case 'd':
		case 'D':
		case 'f':
		case 'F':
		case 'g':
		case 'G':
		case 'h':
		case 'H':
		case 'j':
		case 'J':
		case 'k':
		case 'K':
		case 'l':
		case 'L':
		case 'm':
		case 'M':
		case 'n':
		case 'N':
		case 'p':
		case 'P':
		case 'q':
		case 'Q':
		case 'r':
		case 'R':
		case 's':
		case 'S':
		case 't':
		case 'T':
		case 'v':
		case 'V':
		case 'w':
		case 'W':
		case 'x':
		case 'X':
		case 'y':
		case 'Y':
		case 'z':
		case 'Z':
			System.out.println("consonant");
			break;

		default:
			System.out.println("error message.");
			break;
		}
	}


}
