package oopsconceptsweek3;
//single inheritance & method overriding concept example
public class BankInfo {
	
	  long acctno;
	  String acctholdername;
	  int rate;

	public void savings(long acctno,String acctholdername,int rate)
	{
		this.acctno=acctno;
		this.acctholdername=acctholdername;
		this.rate=rate;
		System.out.println("savings  account number of parent class:"+acctno);

		System.out.println("savings  account holfer name of parent class:"+acctholdername);

		System.out.println("savings  interest of parent class:"+rate);
		
		
	}
	
	public void deposit(long acctno,String acctholdername,int rate)
	{
		this.acctno=acctno;
		this.acctholdername=acctholdername;
		this.rate=rate;
		
	}
	public void fixed(long acctno,String acctholdername,int rate)
	{
		this.acctno=acctno;
		this.acctholdername=acctholdername;
		this.rate=rate;
		
		System.out.println("fixed deposit account number of parent class:"+acctno);

		System.out.println("fixed deposit account holfer name of parent class:"+acctholdername);

		System.out.println("fixed deposit interest of parent class:"+rate);
	}

}
