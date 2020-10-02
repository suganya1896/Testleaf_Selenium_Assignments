package javabasics1;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		//to find string length
		int Strlength=test.length();
		System.out.println("String length:"+Strlength);
		
		//converting string into char array like {'$,'$','','W'...etc}
		char[] arr=test.toCharArray();
		//to print charArray length
		int s=arr.length;
		System.out.println("char array length:"+s);
		
		for (char eachvalue : arr) {
			
		if(Character.isLetter(eachvalue))
		{
			letter++;
			
		}
		
		else if(Character.isDigit(eachvalue))
		
		{
			num++;
		}
		else if(Character.isSpaceChar(eachvalue))
		{
			space++;
		}
		else
		{
			specialChar++;
		}
		}
		    System.out.println("Letter count: "+letter);
			System.out.println("Number count: "+num);
			
			System.out.println("Special Character count: "+specialChar);
			System.out.println("Spaces count: "+space);
			
			
			
		}
		
			
		

}
