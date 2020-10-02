package javabasics1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String s="changeme";
		//get the length of string
		int strLength=s.length();
		System.out.println("String Length:"+strLength);
		
		System.out.println("Before changing odd index of string to upper case:"+s);
		// initialize string buffer to hold updated string
		StringBuffer updatedString = new StringBuffer();

		//convert string to character array like {'c','h','a','n','g','e','m','e'}
		char[] arr=s.toCharArray();
		//store the size char array in size variable
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			//to get current character
			char currentIndex=arr[i];
			if(i%2==1)
			{
				//convert to uppercase
				currentIndex=Character.toUpperCase(currentIndex);
				
			}
			//appending to string buffer
			updatedString.append(currentIndex);
			}
		
			String changedOdd=updatedString.toString();
			System.out.println("After changing odd index of string to upper case:"+changedOdd);
		}
		
	}


