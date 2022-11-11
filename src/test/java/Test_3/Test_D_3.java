package Test_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {

	
	@Test
	
	public void m3() {
		
		 SoftAssert soft=new SoftAssert();
		 
		 System.out.println("Email id");
		 System.out.println("password");
		 System.out.println("login");
		 
	     String Expected="Facebook login";
		
		 String Actual ="Facebook login";
		 
		 soft.assertNotEquals(Actual, Expected);
		 
		 System.out.println("Test done");
		 
		 soft.assertAll();
		 
		
		
		 
		 
		 
		 
		 
	}
}
