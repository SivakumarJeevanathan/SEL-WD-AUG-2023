package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1_LearnList 
{
	public static void main(String[] args) 
	{
		List <String> companyName =new ArrayList<String>(); //syntax
		companyName.add("Hewlett-Packard");
		companyName.add("AMAZON");
		companyName.add("TATA Consultancy SeRvIcE");
		companyName.add("CTS");
		companyName.add("Testleaf");
		companyName.add("Qeagle");
		companyName.add("Qeagle");
		companyName.add("google");
		companyName.add("google");
		companyName.add("GOOGLE");
		companyName.add("Accel Frontline Ltd");
		companyName.add("Accenture");
		companyName.add("Adrenalin eSystems");
		companyName.add("The Advisory Board Company");
		companyName.add("	BirlaSoft");
		companyName.add("Capgemini");
		companyName.add("Computer Sciences Corporation(CSC)");
		companyName.add("HCL Technologies");
		companyName.add("Larsen & Toubro Infotech		");
		companyName.add("Tech Mahindra ");
		companyName.add("Oracle");
		companyName.add("ThoughtWorks");
		companyName.add("Verizon Data Services");
		companyName.add("UST Global");
		companyName.add("ZOHO Corporation");
		companyName.add("Polaris – Virtusa");
		companyName.add("Freshworks");
		companyName.add("Athenahealth");
		companyName.add("BNP Paribas");
		
		System.out.println("The values created in the list are:"+"\n\t"+companyName); //print my list
		
		Collections.sort(companyName); //arrange the list on sorting order as per ASCII
		System.out.println("The values of list after sorting:"+"\n"+companyName); //after sort print list
		
		System.out.println("Size of the list: "+companyName.size());//size of list
		System.out.println("Printing an particular element (5th) value from the list:"+companyName.get(5)); //particular element
		System.out.println("Removed the particular element (5th) value in the list: "+companyName.remove(5));//remove element
		
		System.out.println("TO find any particular item in list: "+companyName.contains("TATA")); //To find any particular item in list
		System.out.println("TO find any particular item in list: "+companyName.contains("TATA Consultancy SeRvIcE")); //To find any particular item in list
		
		//what should I do to remove the space in front and rear of item????
		
		List <String> companyName1 =new ArrayList<String>();
		companyName1.add("WIPRO");
		companyName1.add("The Advisory Board Company");
		companyName1.add("	BirlaSoft");
		companyName1.add("Larsen & Toubro Infotech		");
		companyName1.add("Tech Mahindra ");
		companyName1.add("Oracle");
		companyName1.add("ThoughtWorks");
		companyName1.add("Verizon Data Services");
		companyName1.add("UST Global");
		companyName1.add("ZOHO Corporation");
		companyName1.add("Polaris – Virtusa");
		companyName1.add("Freshworks");
		companyName1.add("Athenahealth");
		companyName1.add("BNP Paribas");
		companyName1.add("Accel Frontline Ltd");
		companyName1.add("Accenture");
		companyName1.add("Adrenalin eSystems");
		
		companyName1.addAll(companyName);
		System.out.println("The values in list2 are:"+"\n\t"+companyName1);
		 
		companyName1.removeAll(companyName);
		System.out.println("The values in List1_Company_Name after removeall () are:"+"\n\t"+companyName);
		System.out.println("The values in List2_Company_Name are:"+"\n\t"+companyName1);
		
		companyName.removeAll(companyName1);
		System.out.println("The values in List1_Company_Name are:"+"\n\t"+companyName);
		System.out.println("The values in List2_Company_Name are:"+"\n\t"+companyName1);
		
		boolean RemovedAll = companyName1.removeAll(companyName);
		System.out.println(RemovedAll);
		System.out.println(companyName1.removeAll(companyName1));

		companyName.clear(); //clear
		System.out.println("To verify whether the list is empty or not: "+companyName.isEmpty()); //isEmpty
		System.out.println("The values in created list are: "+companyName); //print my list
		
	}
}

/*
NOTES:

	//System.out.println(companyName.contains("TCS").remove(8));  --> NOT POSSIBLE

*/