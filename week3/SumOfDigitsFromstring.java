package javabasics1;

public class SumOfDigitsFromstring {

	public static void main(String[] args) {
		
		
		String text = "Tes12Le79af65sd34cf79";
		int sum=0;
		
		char[] arr=text.toCharArray();
		
		for (char c : arr) {
			System.out.println(c);
		
		if(Character.isDigit(c))
		{
			int number=Character.getNumericValue(c);
			sum=sum+number;
		}}
		System.out.println("sum  of digits in a given string:"+sum);
		
		
		
	}

}
