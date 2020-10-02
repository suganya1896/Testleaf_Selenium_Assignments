package javabasics1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count=0;
		
		System.out.println("Original String before removing duplicates:"+text);
		
		String[] splitWords=text.split(" ");
		
		int length=splitWords.length;
		
		System.out.println("length of string array:"+length);
		for (String string : splitWords) {
			
		
		System.out.println(string);
		}
		//creating empty set to add values of "splitWords" array values to this set
		LinkedHashSet<String> setArr=new LinkedHashSet<String>();
		
		for (String eachvalue : splitWords) {
			
			setArr.add(eachvalue);
			
		}
		System.out.println("After removing duplicates using set:"+setArr);
	//convert set to array
	Object[] c=setArr.toArray();
	//create empty string  buffer to append array values
	StringBuffer sb = new StringBuffer();
    for(int i = 0; i < c.length; i++) {
       sb.append(" "+c[i]+" ");
    }
    
    //converting values stored in string buffer to string
    String str = sb.toString();
    System.out.println("after converting set to string without duplicates:"+str);
	
	
	
}
}
