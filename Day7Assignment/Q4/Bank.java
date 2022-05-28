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