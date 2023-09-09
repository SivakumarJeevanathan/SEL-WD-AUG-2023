package week3.day3.ClassRoom1;

public class AXISBANK implements RBI 
{
	public void KYC() 
		{
		System.out.println("KYC() Method called where the Method definiton is implemented in AXISBANK Class ");
		}

	public void WithDraw() 
		{
		System.out.println("WithDraw() Method called where the Method definiton is implemented AXISBANK Class ");
		}

	public void REPORTER() 
		{
		System.out.println("REPORTER() Method called where the Method definiton is implemented AXISBANK Class ");
		}

	public void LOAN() 
		{
		
		}

	//own method of AxisBank class
    public void Axis_Personal_Loan() 
    	{	System.out.println("Axis Personal Loan() Method which is own method of AXISBANK Class");	}
    
    int AXIS_HOUSING_Loan_amount = 2300000;	// Variable declared with in AXISBANK CLASS

    public static void main(String[] args) 
	{
    	AXISBANK Obj_AXISBANK = new AXISBANK();
    	Obj_AXISBANK.KYC();
    	Obj_AXISBANK.WithDraw();
    	Obj_AXISBANK.REPORTER();
    	Obj_AXISBANK.LOAN();
    	Obj_AXISBANK.Axis_Personal_Loan();
    	System.out.println("The Housing Loan amount taken in AXIS bank is: Rs " +Obj_AXISBANK.AXIS_HOUSING_Loan_amount);
    	System.out.println("The interest rate of Loan from RBI is: " +Percentage+ "%");
    	
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
    	// RBI obj_RBI = new RBI(); // cant instantiate the type RBI.
    	RBI Obj_RBI =  new AXISBANK(); //Created an object for RBI in current class
    	Obj_RBI.KYC();
    	Obj_RBI.WithDraw();
    	Obj_RBI.REPORTER();
    	Obj_RBI.LOAN();
    	// Obj_RBI.Axis_Personal_Loan(); // AXIS BANK own method hence can't be used by RBI
    	System.out.println("The Housing Loan amount taken in AXIS bank is: Rs " +Obj_AXISBANK.AXIS_HOUSING_Loan_amount);
    	System.out.println("The interest rate of Loan from RBI is: " +Percentage+ "%");
    	System.out.println(Obj_RBI.Percentage);
    	
	}

}
