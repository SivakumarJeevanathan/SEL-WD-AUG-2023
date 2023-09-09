package week4.day2.Class;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class P4_Learn_Set_RemoveDuplicate 
{
	public static void main(String[] args) 
	{

		String Emp_Name = "SIVaKUMAR JEEVANATHAN";
		char[] EN_charArray = Emp_Name.toCharArray();
		
		Set<Character> Set_Emp_Name = new LinkedHashSet <Character>();
		for (Character character_Emp_Name : EN_charArray) 
			{
			Set_Emp_Name.add(character_Emp_Name); //System.out.println(Set_Emp_Name.add(character_Emp_Name));
			
			}
		System.out.println("The Value in SET: "+Set_Emp_Name);
		System.out.println("The Value in STRING: "+Emp_Name);
		System.out.println("The Value in CharArray: "+EN_charArray);
		for (int i = 0; i < EN_charArray.length; i++) 
			{
			System.out.println(EN_charArray[i]);
			}
	}

}

/*
OUTPUT: PASS
SYNTAX:
	1. FOREACH LOOP: 
		for (DATETYPE VARIABLE_NAME : INPUT) {}  EXAMPLE: for (Integer OUTPUT : set_Name ) {	System.out.println(OUTPUT);	}
PSEUDO CODE:
1. Create STRING value
2. Convert the STRING into CHAR ARRAY using .toCharArray() Method
3. Create a SET using SET<WRAPPER> SET_NAME = new LinkedHashSet<Wrapper>()
4. Use for each
*/