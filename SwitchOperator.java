package javabasics1;

public class SwitchOperator {
	

	public static void main(String[] args) {
	
		int a=2;
		int b=3;
		String n= "operations2";
		switch (n) {
		case "operations":
			
			System.out.println(a+b);		
			break;
		case "operations2":
			System.out.println(a-b);
			break;
		case "operations3" :
			System.out.println(a*b);
			break;
		case "operations4" :
			System.out.println(a/b);
			break;

		default:
			System.out.println(a%b);
			break;
		}
	}

}
