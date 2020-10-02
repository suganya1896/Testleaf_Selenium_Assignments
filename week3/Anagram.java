package javabasics1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "ASTRONOMERS ";
		String text2 = "NO MORE STARS";
		
		String s1=text1.replaceAll("\\s", "").toLowerCase();
		//length of string 1
		
		int s1length=text1.length();
		
		String s2=text2.replaceAll("\\s", "").toLowerCase();
		//length of string 2
		
		int s2length=text2.length();
		
		if(s1length==s2length)
		{
			System.out.println("length is same:"+s1);
		}
		else
		{
			System.out.println("Length is different"+s2);
		}
		//convert string without whites to char array
		
		char[] arr1=s1.toCharArray();
		for (char c1Arr : arr1) {
			System.out.println(c1Arr);
		}
		System.out.println();
		char[] arr2=s2.toCharArray();
		
		for (char c2Arr : arr2) {
			System.out.println(c2Arr);
	
		}
		
		System.out.println("sorted values of first array:");
		Arrays.sort(arr1);
		  String sorted1=arr1.toString();
		System.out.println(sorted1);

		System.out.println("sorted values of second array:");
		Arrays.sort(arr2);
		
			String sorted2=arr2.toString();
			System.out.println(sorted2);
		
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Both Arrays have same values");
		}
		else
		{
			System.out.println("Arrays have different values");
		}
		
		
		}
		
	

}
