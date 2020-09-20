package javabasics1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {3,2,11,4,6,7};
	
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
				
		System.out.println(a[i]);
	}
System.out.println("second element from last:"+a[4]);
}
}