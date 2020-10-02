package oopsconceptsweek3;

//single inheritance & method overriding concept example
public class AxisBank extends BankInfo{
	
	//method overriding
	public void deposit(long acctno,String acctholdername,int rate)
	{
		this.acctno=acctno;
		this.acctholdername=acctholdername;
		this.rate=rate;
		System.out.println("deposit account number of child class:"+acctno);
		System.out.println("deposit account holder name of child class:"+acctholdername);
		System.out.println("deposit account interest rate of child class:"+rate);
	}

	public static void main(String[] args) {
		
		AxisBank childbank=new AxisBank();
		
		childbank.deposit(4578962351l, "Caroline", 5);
		childbank.fixed(2348965712l, "bonney bennett", 6);
		childbank.savings(5632789423l, "John", 4);
		
		// to print values of parent class deposit method
		/*
		 * BankInfo parentbank=new BankInfo();
		 * parentbank.deposit(5454646168,"Nivetha",3);
		 * 
		 */
		
		
	}

}
