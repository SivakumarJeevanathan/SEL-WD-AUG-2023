package week3.day3.ClassRoom1;

// public abstract class HDFCBANK implements AXISBANK --> here the type cant be superinterface 

public abstract class BANK implements RBI
{
	public void Deposit()
	{	System.out.println("Credit Card details of bank"); }
	
	public abstract void Credit();
		
	
	public void HousingLoan()
	{	System.out.println("Housing loan details of bank"); }
}
