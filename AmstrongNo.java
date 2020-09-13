package javabasics1;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=371;
		int org =n;
		int sum =0;
		int a;
		
		while (n>0)
		{
			a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
			
		}
		if(sum==org)
		{
			System.out.println("amstrong no: "+sum);
		}
			else
			{
				System.out.println("not an amstrong no");
			}			
			}
		
		
	}
	

