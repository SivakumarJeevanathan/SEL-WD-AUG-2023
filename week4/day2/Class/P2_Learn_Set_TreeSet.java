package week4.day2.Class;

import java.util.Set;
import java.util.TreeSet;

public class P2_Learn_Set_TreeSet
{
	public static void main(String[] args) 
	{
		System.out.println("\n* * *  Script for SET using TreeSet<>()* * * \n");
		Set<Integer> set_Name = new TreeSet<Integer>();  // Step 1. Instantiate the SET 
		//adding elements into set
		set_Name.add(10);
		set_Name.add(1);
		set_Name.add(10);
		set_Name.add(3);
		set_Name.add(11);
		// set_Name.add(null); // adding null values
		set_Name.add(24);
		set_Name.add(13);
		set_Name.add(29);
		set_Name.add(30);
		set_Name.add(13);
		// set_Name.add(null); // adding null values
		System.out.println("The values in the Set are: "+set_Name); //Printing the values
		System.out.println("NOTE here:\n\t(1) the values in SET are sorted first and then it is printed ,\n\t(2) doesnt print as per intersetion (Add Method),\n\t(3) Removes the duplicates and,\n\t(4) Null values are NOT allowed");
		System.out.println("The result for adding an duplicate value during compile time: "+set_Name.add(3)); // trying to add a duplicate element during compile time
		System.out.println("The result for adding an new value during compile time: "+set_Name.add(45)); // trying to add a new element during compile time
		System.out.println("The values in the new Set are: "+set_Name); //Printing the values
	}

}
