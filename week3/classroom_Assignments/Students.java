package oopsconceptsweek3;

//method overloading concept example
public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student id of method1:"+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student name of method2:"+name);
		System.out.println("Student id of menthod2:"+id);
	}
	
	public void getStudentInfo(String email,long phoneno)
	{
		System.out.println("student email id of method3:"+email);
		System.out.println("student phoneno of method3:"+phoneno);
	}

	public static void main(String[] args) {
		
		
		Students s=new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(002, "Damon salvatore");
		s.getStudentInfo("abc@gmail.com", 2356789894l);
		

	}

}
