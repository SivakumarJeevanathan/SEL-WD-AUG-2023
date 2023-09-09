package week4.day1.Assignment;

import java.util.ArrayList;
import java.util.List;

public class P1_FindIntersection 
{
	public static void main(String[] args) 
	{
		int[] Array_1 = {3,2,11,4,6,7,8};  // Declare An Array for {3,2,11,4,6,7};
		int[] Array_2 = {1,2,8,4,9,7};	// Declare another Array for {1,2,8,4,9,7};
		
		List <Integer> List_Array_1 = new ArrayList<Integer> (); //create a empty List 1
		System.out.println("The values in List1 are: ");
		for (int i = 0; i < Array_1.length; i++) 	// Declare for loop iterator from 0 to array a.length and add into list1
			{	List_Array_1.add(Array_1[i]);	}
		
		Object[] obj_List_Array_1 = List_Array_1.toArray();
		for (int i=0;i<obj_List_Array_1.length;i++)
		{	
			System.out.println(obj_List_Array_1[i]);
		}
		
		List <Integer> List_Array_2 = new ArrayList<Integer> (); //create a empty List 2
		System.out.println("The values in List2 are: ");
		for (int i = 0; i < Array_2.length; i++) 	// Declare for loop iterator from 0 to array a.length and add into list1
			{	List_Array_2.add(Array_2[i]);	}
		
		Object[] obj_List_Array_2 = List_Array_2.toArray();
		for (int i=0;i<obj_List_Array_2.length;i++)
		{	
			System.out.println(obj_List_Array_2[i]);
		}
		
		System.out.println("The Matching Values are: ");
		for (int i = 0; i < List_Array_1.size(); i++)	// Compare Both list1 & list2 using a nested for loop
			{	
				int Actual_No = List_Array_1.get(i);
				for (int j = 0; j < List_Array_2.size(); j++)
					{
						int Exp_No = List_Array_2.get(j);
						if(Exp_No == Actual_No)
							{	System.out.println(+Actual_No); //Print the matching number	}
					}
			}
	}
}
}

/*
OUTPUT: PASS
PROGRAM: 
	int[] a={3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
output:2,4,7
Pseudo Code / STEPS: 
(1) Declare An Array for {3,2,11,4,6,7};	 
(2) Declare another Array for {1,2,8,4,9,7};
(3) Create a two empty Lists - list1 & list2
(4) Declare for loop iterator from 0 to array a.length and add into list1
(5) Declare for loop iterator from 0 to array b.length and add into another list2
(6) Compare Both list1 & list2 using a nested for loop
(7) Print the matching number
--> interface and abstract class in Automation class
 */