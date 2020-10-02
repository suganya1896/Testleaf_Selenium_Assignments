package oopsconceptsweek3;

public class Calculator {

	
	public void add(int x,int y)
	{
		int c= x+y;
	System.out.println("add1 method:"+c);
	
		
	}
	public void add(int x,int y,int z)
	{
		int c= x+y+z;
	System.out.println("add2 method:"+c);
		
	}
	public void multiply(int x,int y) {
		int mul=x*y;
		System.out.println("multiply method1:"+mul);
		
	}
	
	public void multiply(int x,double y) {
		double mul=x*y;
		System.out.println("multiply method2:"+mul);
		
	}
	
	public void subtract(int x,int y)
	{
		int sub=x-y;
		System.out.println("subtract method1:"+sub);
	}
	public void subtract(double x,double y)
	{
		double sub=x-y;
		System.out.println("subtract method2:"+sub);
	}
    public void divide(int x,int y)
    {
    	int div=x/y;
    	System.out.println("div method1:"+div);
    }
    
    public void divide(int x,double y)
    {
    	double div=x/y;
    	System.out.println("div method2:"+div);
    }
    
    public static void main(String[] args) {
		
    	Calculator calci=new Calculator();
    	calci.add(6, 5);
    	calci.add(8, 2, 5);
    	calci.subtract(5.0, 3.0);
    	calci.subtract(15, 5);
    	calci.multiply(5, 5.5);
    	calci.multiply(6, 5);
    	calci.divide(20,10.0);
    	calci.divide(6, 6);
	}
}

