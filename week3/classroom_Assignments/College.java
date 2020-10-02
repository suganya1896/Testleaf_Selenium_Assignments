package oopsconceptsweek3;

public class College extends University{

	public static void main(String[] args) {
		
		University u=new College();
		u.pg();
		u.ug();
		
	}

		void ug() {
		System.out.println("UG");
	}

}
