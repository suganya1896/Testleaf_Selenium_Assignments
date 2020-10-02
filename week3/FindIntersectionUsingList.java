package javabasics1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		// create a empty list & store array a[] into it
		List<Integer> L1=new ArrayList<Integer>();
		//Iterating throught each value to add it into list L1
		for (Integer integer : a) {
			L1.add(integer);
		}
		System.out.println("List Array1 :"+L1);
		
		
		// create a empty list & store array b[] into it
				List<Integer> L2=new ArrayList<Integer>();
				//Iterating throught each value to add it into list L1
				for (Integer integer : b) {
					L2.add(integer);
				}
				System.out.println("List Array2 :"+L2);
				//sorting the list arrays in ascending order
			    Collections.sort(L1);
				Collections.sort(L2);
			//Retain() method will keep only matching elements between two lists 	
			L1.retainAll(L2);
			
			System.out.println("Matching Elements:"+L1);	
	}

}
