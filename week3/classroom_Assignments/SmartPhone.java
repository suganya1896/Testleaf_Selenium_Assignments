package oopsconceptsweek3;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp()
	{
		System.out.println("whatsApp");
	}
	//method overriding ie takevideo method in this class overrides method in android class
	public void takeVideo()
	{
		System.out.println("video has taken in smart phone");
	}

	public static void main(String[] args) {
		
		SmartPhone s=new SmartPhone();
		s.sendMSG();
		s.makeCall();
		s.connectWhatsApp();
		s.saveContact();
		s.takeVideo();
	}

}
