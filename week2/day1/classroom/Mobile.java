//ClassRoom 1:
//Step 1:Create a class Mobile
//Step 2:Create a method  
//1.public  sendSMS()  
//add simple syso statement (Example:System.out.println(“Hello Testleaf”))
//2.protected allowVoiceCall()
//add simple syso statement
//3.private takeVideo()
//add simple syso statement
//Step 3: Create a class Tab
//Step 4:Create main method
//Step 5:Create object for the Mobile class and call all the method
//Step 6:verify its printed  in console
package week2.day1.classroom;

public class Mobile 
{
	public String sendSMS(String SMS) 
		{ 	
			System.out.println("Hi this is from - sendSMS() Method");
			System.out.println("SMS " +SMS+ " sent from Mobile class" );
			return SMS;
		}
	
	protected double allowVoice(double MobileNo)
	{ 	
		System.out.println("Hi this is from - allowVoice() Method");	
		System.out.println("Voice call " +MobileNo+ " from Mobile class" );
		return MobileNo;
	}
	
	private void takeVideo()
	{ 	System.out.println("Hi this is from - takeVideo() Method");	}
	
	public static void main(String[] args) 
	{
		System.out.println("No action is mentioned inside the MOBILE class Main method");
	}

}
