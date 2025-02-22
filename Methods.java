package week03;

public class Methods {

	
	//method------------------------------------------------------------------------------
	
	public static String createFullName(String x, String y) {    //method signature
		return  x + " " + y;
		
	}
	
	//main code---------------------------------------------------------------------------
	
	public static void main(String[] args) {

		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
	}

	

}
