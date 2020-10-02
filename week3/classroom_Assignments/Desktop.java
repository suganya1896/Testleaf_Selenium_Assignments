package oopsconceptsweek3;

//single inheritance concept example
public class Desktop extends Computer {

	String size="small";
	
	public void desktopSize()
	{
		System.out.println("Desktop is:"+size);
	}
	
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		
		desk.computerModel();
		desk.desktopSize();
		
	}

	

}
