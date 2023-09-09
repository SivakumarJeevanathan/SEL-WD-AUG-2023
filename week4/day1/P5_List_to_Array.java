package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P5_List_to_Array 
{
	public static void main(String[] args) 
	{
		System.out.println("\n* * *  Automation Script for List * * * ");
		
		Integer[] Emp_NO = {13,11,10,16,12,14,15,17};
		List <Integer> List_Emp_No = new ArrayList<Integer> (Arrays.asList(Emp_NO)); //--> Using Arrays.asList() Method
		System.out.println("The Employee numbers before sorting are: "+List_Emp_No);
		Collections.sort(List_Emp_No);
		System.out.println("The Employee numbers after sorting are: "+List_Emp_No);
		
		System.out.println("\n\n * * *  Automation Script for Arrays* * * ");
		int[] Employee_Number = {23,21,20,26,22,24,25,27};
		List <Integer> List_Employee_Number = new ArrayList<Integer>();
		for (int i=0;i<Employee_Number.length;i++)
			{	
				List_Employee_Number.add(Employee_Number[i]);
			}
		System.out.println("The Employee numbers are: ");
		Object[] array = List_Employee_Number.toArray();
		for (int i=0;i<array.length;i++)
		{	
			System.out.println(array[i]);
		}
		
		System.out.println("The Employee numbers before sorting are: "+List_Employee_Number);
		Collections.sort(List_Employee_Number);
		System.out.println("The Employee numbers after sorting are: "+List_Employee_Number);
		
	}

}



