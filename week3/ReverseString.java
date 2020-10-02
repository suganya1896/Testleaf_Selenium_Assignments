package javabasics1;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		
		System.out.println("Original String:"+test);
		//using string buffer class 
		
		StringBuffer s=new StringBuffer(test);
		System.out.println("Reversed String using buffer class:"+s.reverse());
		
		//approach2
		
		char[] arr=test.toCharArray();
		int length=arr.length;
		System.out.println("length:"+length);
		
		System.out.print("reversed String using for loop:");
	      for(int i=length-1;i>=0;i--)
	      {
	    	  System.out.print(arr[i]);
	      }
		
	}

}
