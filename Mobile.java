package javabasics1;

public class Mobile {
	
	String mobColor="red";
	long mobNumber=122132323l;
	double mobWeight =55.5;
	boolean isrefurbished=false;
	//int a=2568977;
	public void makeCall() {
		// TODO Auto-generated method stub
System.out.println("call made");
	}

	public void sendMessage() {
		// TODO Auto-generated method stub
System.out.println("message send");
	}
	
	public void takePhoto() {
		// TODO Auto-generated method stub
System.out.println("photo has taken");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile a=new Mobile();
a.makeCall();
a.sendMessage();
a.takePhoto();

System.out.println(a.mobColor);
System.out.println(a.mobNumber);
System.out.println(a.mobWeight);
System.out.println(a.isrefurbished);
//System.out.println(a.a);
	}
	
	

}
