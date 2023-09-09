package week3.day2.assignment;

public class SmartPhone extends AndroidPhone
{
	public void takeVideo()
	{	System.out.println(" TakeVideo Method from SmartPhone class");	}
	
	public static void main(String[] args) 
	{
		//Execute the method using child class object
		SmartPhone obj_SmartPhone = new SmartPhone();
		obj_SmartPhone.takeVideo();
	}
}
