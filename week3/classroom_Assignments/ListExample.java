package oopsconceptsweek3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {
		
		String[] companies = {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};
		//to print ascending order & remove duplicate
		
		Set<String> values=new TreeSet<String>();
		for (String eachvalue : companies) {
			
			values.add(eachvalue);
			
			}
		System.out.println(values);
		//to sort
		String[] companies1 = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> values1=new ArrayList<String>();
		
		for (String sort : companies1) {
			values1.add(sort);
			
		}
		
		System.out.println(values1);
		Collections.sort(values1);
		for (String printsort : values1) {
			
			System.out.println(printsort);
			
		}
		
		
	}
	
	
}
