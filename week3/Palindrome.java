package javabasics1;

public class Palindrome {

	public static void main(String[] args) {
		
		String s="Madam";
		
		System.out.println("length of given string:"+s.length());
		
		// create a string buffer class to reverse & hold a string  
		StringBuffer b=new StringBuffer(s);
		
		StringBuffer rev=b.reverse();
		String b1=rev.toString();
		
		System.out.println("Reversed String by using string buffer class reverse method:"+rev);
		
		if(s.equalsIgnoreCase(b1))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
		
		//approach 2
		
		String reverse="";
		char[] arr=s.toCharArray();
		int size=arr.length;
		for(int i=size-1;i>=0;i--)
		{
			reverse=reverse+arr[i];
			
		}
		System.out.println("Reverse String by approach2:"+reverse);	
	String s1=reverse.toString();
	if(s.equalsIgnoreCase(s1))
	{
		System.out.println("it is palindrome by approch2");
	}
	else
	{
		System.out.println("it is not a palindrome by approach2");
	}
	
	
	}

}
