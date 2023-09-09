package week2.day3;

public class LearnXpath 
{
	public static void main(String[] args) 
	{
		/*
		1. Attribute based Xpath --> Syntax: //tagName[@attributeName='attributeValue']
		https://www.nykaa.com/ ---->Search box  using (name) attribute
		
	
		2. Partial Attribute based Xpath --> Syntax: //tagName[contains(@attributeName,'partialAttributeValue')] 
		https://buythevalue.in/ ->click on UPCOMING TENDERS 
			
		
		3.Text Based xpath --> Syntax: //tagName[text()='textValue']
		
		4.Partial text based xPath:
		Syntax:  //tagName[contains(text(),'textValue')] 
		https://www.amazon.in/-----> Click on Today's Deals Text based
		
		Find the xpath 
		https://www.nykaa.com/  ---->Search box  using (name) attribute
		https://www.irctc.co.in/nget/train-search---> from station ->Partial attribute based xpath
		https://www.amazon.in/  --->Today's Deals using Text based
		https://www.zoomcar.com/in/chennai --->GET CAR using partial Text based 
		https://buythevalue.in/ --->URBAN FIT X SMART WATCH using partial Text based
		
Advanced xPath(8):

1)Parent to Child:
  Syntax: BasicXpathforParent/childtagName
  Ex:  //form[@id='login']/p
(//form[@id='login']/p)[3] ---->index 

2)Child to parent:
  Syntax:  BasicXpathforChild/parent::parenttagName 
  Ex:    //p[@class='top']/parent::form 

3)GrandParent to GrandChild:
  Syntax:  BasicXpathforGrandParent//grandChildtagName  
  Ex://form[@id='login']//input

4)GrandChild to GrandParent:
  Syntax:  BasicXpathforGrandChild/ancestor::grandParenttagName      
  Ex:      //input[@id='username']/ancestor::form

5)ElderCousin to YoungerCousin:
  Syntax: Xpath_ElderCousin/following::youngerCousinTagName    
  Ex:  //label[text()='Username']/following::label   

6)YoungerCousin to ElderCousin:
  Syntax:  youngercousinXpath/preceding::elderCousinTagName
  Ex:     //input[@name='PASSWORD']/preceding::label

7)ElderSibling to YoungerSibling:
   Syntax:  ElderSiblingXpath/following-sibling::youngerSiblingTagName
   Ex:     //label[text()='Username']/following-sibling::input

8)YoungerSibling to ElderSibling:
   Syntax:  youngerSiblingXpath/preceding-sibling::elderSiblingTagName
   Ex:     //input[@name='PASSWORD']/preceding-sibling::label
   
 
 ClassRoom 1:
1.   Leaftaps- Find the XPath of 1st resulting result of find leads  
		--> (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]
		--> //div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'10040')]
2.    Myntra -> mens jeans : Xpath to click on flying machine checkbox
		P to C	-->	BasicXpathforParent/childtagName
				Example: (//label[@class='vertical-filters-label common-customCheckbox']/input)[1]
		C to P	-->	BasicXpathforChild/parent::parenttagName
			Example://input[@type='checkbox' and @value='Flying Machine']/parent::label --wrong
		GP to GC	--->	BasicXpathforGrandParent//grandChildtagName	
			Example: 
		GC to GP 	--->	BasicXpathforGrandChild/ancestor::grandParenttagName
		 	 Example: 
3.   https://pizzaonline.dominos.co.in/menu : xpath for Farmhouse Add to cart
				---> (//div[@class='injectStyles-sc-1jy9bcf-0 jrxrSi']/button)[6]
				
CR 2:
https://login.salesforce.com/
username:hari.radhakrishnan@qeagle.com
Password:Leaf$1234
Task - new task

 REdbus location chennai 
 

			*/
			
	}

}
