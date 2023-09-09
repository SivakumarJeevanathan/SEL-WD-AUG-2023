package week4.day2.Class;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class P3_Learn_Set_LinkedHashSet
{
	public static void main(String[] args) 
	{
		System.out.println("\n* * *  Script for SET using LinkedHashSet<>()* * * \n");
		Set<Integer> set_Name = new LinkedHashSet<Integer>();  // Step 1. Instantiate the SET 
		//adding elements into set
		set_Name.add(10);
		set_Name.add(1);
		set_Name.add(10);
		set_Name.add(3);
		set_Name.add(11);
		set_Name.add(null); // adding null values
		set_Name.add(24);
		set_Name.add(13);
		set_Name.add(29);
		set_Name.add(30);
		set_Name.add(13);
		set_Name.add(null); // adding null values
		System.out.println("The values in the Set are: "+set_Name); //Printing the values
		System.out.println("NOTE here:\n\t(1) the values in SET are printed are per the intersetion (Add Method),\n\t(2) Duplicates are removed and,\n\t(3) Null values are allowed here");
		System.out.println("\n* * *  Using add() Method* * *");
		System.out.println("The result for adding an duplicate value during compile time: "+set_Name.add(3)); // trying to add a duplicate element during compile time
		System.out.println("The result for adding an new value during compile time: "+set_Name.add(45)); // trying to add a new element during compile time
		System.out.println("The values in the new Set are: "+set_Name); //Printing the values
		
		System.out.println("\n* * *  Using Size() Method* * *");
		System.out.println("The Size of Set is: "+set_Name.size()); //Printing the size of set
		
		System.out.println("\n* * *  Using Remove() Method* * *");
		System.out.println("After Removing a value from Set : "+set_Name.remove(45)); //Printing TRUE or FALSE
		System.out.println("The Size of Set is: "+set_Name.size()); //Printing the size of set
		System.out.println("The values in the new Set are: "+set_Name); //Printing the values
		
		System.out.println("\n* * *  Using Contains() Method* * *");
		System.out.println("Checking a element in Set : "+set_Name.contains(10)); //Printing TRUE or FALSE
		System.out.println("The Size of Set is: "+set_Name.size()); //Printing the size of set
		System.out.println("The values in the new Set are: "+set_Name); //Printing the values

		System.out.println("\n* * *  Using FOREACH* * *");
		System.out.println("The values in the SET are:");
		for (Integer OUTPUT : set_Name )
			{
				System.out.println(OUTPUT);
			}
		
		System.out.println("\n* * *  Converting SET into LIST* * *");
		List <Integer> List_Name = new ArrayList<Integer>(set_Name);
		System.out.println("The values copied into new list are: "+List_Name);
		
		
		System.out.println("\n* * *  Using Clear() Method* * *");
		set_Name.clear();
		System.out.println("The Size of Set is: "+set_Name.size()); //Printing the size of set
		System.out.println("The values in the new Set are: "+set_Name); //Printing the values
		System.out.println("Checking a particular element value in Set : "+set_Name.contains(10));
		System.out.println("Checking the Set is EMPTY OR NOT: "+set_Name.isEmpty()); // checking the set values as EMPTY OR NOT
		
		
	}

}


/*
OUTPUT: PASS
SYNTAX:
	1. FOREACH LOOP: 
		for (DATETYPE VARIABLE_NAME : INPUT) {}  EXAMPLE: for (Integer OUTPUT : set_Name ) {	System.out.println(OUTPUT);	}
*/
