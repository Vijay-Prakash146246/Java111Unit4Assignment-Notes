package Day7Assignment.Q4;

/*Create a Class Bank with the following fields:
branchName: String
IfscCode: String
and a non-static method:

displayDetails(): void
The above method will display the details of the bank(branchName,
ifscCode)
 * */
class Bank
{
	String branchName;
	String ifscCode;
	void displayDetails()
	{
		System.out.println("Branch Name :"+branchName);
		System.out.println("IfscCode :"+ifscCode);
	}
}
/*Create 2 child classes of the above Bank class: AxisBank, ICICIBank
with the following fields
rateOfInterest: double 
In both the classes override the displayDetails() method to display their
details(branchName, ifscCode, rateOfInterest )

Inside the Axis Bank define another method :
getCreditCard(): void
This method will simply print “Get the Credit Card from the Axis bank”
 */
class AxisBank extends Bank
{
	double rateOfInterest;
	@Override
	void displayDetails()
	{
		System.out.println("Branch Name :"+branchName);
		System.out.println("IfscCode :"+ifscCode);
		System.out.println("RateOfInterest :"+rateOfInterest);
	}
	void getCreditCard()
	{
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
class ICICIBank extends Bank
{
	double rateOfInterest;
	@Override
	void displayDetails()
	{
		System.out.println("Branch Name :"+branchName);
		System.out.println("IfscCode :"+ifscCode);
		System.out.println("RateOfInterest :"+rateOfInterest);
	}
}


/*Create a Demo class and define the following method:
public static Bank getBank(String bank);

implement the above method such as if we supply “axis” then it should return
Axis bank object and if supply “icici” then it should return ICICI bank object
and if we supply any invalid value then it should return null.


Note: returned bank object should have all the details.Call the above method
from the main method of Demo class by taking input from the user and
print the Bank details by calling displayDetails() method. If the returned bank
object is Axis bank then call the getCreditCard() method.
 * */
 class Demo
 {
	 public static Bank getBank(String bank)
	 {
		 if(bank=="axis")
		 {
			 AxisBank a1 = new AxisBank();
			 return a1;
		 }
		 else if(bank=="icici")
		 {
			 ICICIBank i1 = new ICICIBank();
			 return i1;
		 }
		 else
		 {
			 return null;
		 }
		 
	 }
 }