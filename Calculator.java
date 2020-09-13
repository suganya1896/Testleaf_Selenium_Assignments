package javabasics1;

public class Calculator {
	
	public void add(int a,int b) {
		
System.out.println(a+b);
	}
	
  public void mul(double a,double b)
  {
	  System.out.println(a*b);
  }
  public void sub(int a,int b)
  {
	  System.out.println(a-b);
  }
	public static void main(String[] args) {                                      
		
  Calculator c= new Calculator();
  c.add(5, 6);
  c.mul(5.0, 8.0);
  c.sub(9, 4);

	}

}
