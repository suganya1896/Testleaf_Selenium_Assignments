package javabasics1;

public class CharOccurance {

	public static void main(String[] args) {
		
		
		String str = "welcome to chennai";
		
		int count=0;
		
		char[] arr=str.toCharArray();
	    int length=arr.length;
	    System.out.println("length of an given arrary:"+length);
	    
	   for(int i=0;i<arr.length-1;i++)
	   {
		  if(arr[i]== 'e')
				   {
			   count++;
				   }
		   
	   }
	    System.out.println("occurrence of character e:"+count);
		

	}

}
