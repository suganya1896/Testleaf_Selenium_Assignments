package javabasics1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int first=0;
		int sec=1;
		for(int i=1; i<=a;i++) {
			
		
			System.out.println(first);
			int sum=first+sec;
			first =sec;
			sec=sum;
			
		}

	}

}
