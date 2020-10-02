package oopsconceptsweek3;
//multiple inheritance concept example
public class DesktopMultipIeInherit implements Hardware,Software {
	
	public void desktopModel() {
		System.out.println("desktop model is Lenova");
	}

	public static void main(String[] args) {
		
		/* scope restriction
		Hardware h=new DesktopMultipIeInherit();
		h.hardwareResources();
		//here h object refer to menthods in hardware interface & implements the execution in desktopmultipleinherit class
		
		Software s=new DesktopMultipIeInherit();
		s.softwareResources(); */
		
		//if u want executes all methods then create object for this class
		
		DesktopMultipIeInherit d=new DesktopMultipIeInherit();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	
	}

	
	public void softwareResources() {
		System.out.println("antivirus softwore");
	}
	

	public void hardwareResources() {
		System.out.println("CPU");
	}

}
