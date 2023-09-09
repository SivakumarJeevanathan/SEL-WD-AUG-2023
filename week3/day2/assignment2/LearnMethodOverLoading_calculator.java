package week3.day2.assignment;

public class LearnMethodOverLoading_calculator
{
    public void add(int x,int y) 
    	{
    		System.out.println(x+y);
    	}
    public void add(int x,float y) 
    	{
    		System.out.println(x+y);
    	}
    
    public void add(int x,int y,int z) 
    	{
    		System.out.println(x+y+z);
    	}
    
    public void Multiplication(int x,int y) 
	{
		System.out.println(x*y);
	}
public void Multiplication(int x,float y) 
	{
		System.out.println(x*y);
	}

public void Multiplication(int x,int y,int z) 
	{
		System.out.println(x*y*z);
	}

    public static void main(String[] args) 
    	{
        	LearnMethodOverLoading_calculator cal =new LearnMethodOverLoading_calculator();
        	System.out.println("* * * Addition Results * * *");
        	cal.add("Addition of"+x+ "and" +y+"is" 10, 20);
        	//cal.add(10, 20);
        	cal.add(10, 0.2f);
        	cal.add(10, 20, 30);
        	
        	System.out.println("* * * Multiplication Results * * *");
        	cal.Multiplication(10, 20);
        	cal.Multiplication(10, 0.2f);
        	cal.Multiplication(10, 20, 30);
    	}
}