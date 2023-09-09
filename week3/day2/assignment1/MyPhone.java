package week3.day2.assignment;

public class MyPhone 
{

	public static void main(String[] args) 
	{
		// Create Object for iPhone
		Iphone obj_Iphone = new Iphone();
		System.out.println("Object created for Iphone Class");
		//Confirm you can access 5 methods !!
		obj_Iphone.startApp();
		obj_Iphone.sendSMS();
		obj_Iphone.increaseVolume();
		obj_Iphone.makeCall();
		obj_Iphone.shutdown();

		// Confirm you cannot access iPad methods.
		//obj_Iphone.watchMovie(); --> cant access method from ipad unles an object is created
		
		IPad obj_IPad = new IPad();
		System.out.println("Object created for Ipad Class");
		
		obj_IPad.watchMovie();
		
	}

}
