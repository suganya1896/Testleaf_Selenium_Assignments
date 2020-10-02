package oopsconceptsweek3;
//single inheritance concept example
public class Computer {
	
	String[] model= {"Lenova","Inspiron","Dell"};
	
	public void computerModel()
	{
		for(int i=0;i<=model.length-1;i++)
		{
			System.out.println("Computer Model:"+model[i]);
		}
	}

}
