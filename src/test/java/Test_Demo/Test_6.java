package Test_Demo;

import org.testng.annotations.Test;

public class Test_6 {

	@Test(groups="Sanity")
	
	public void test_001() {
		
		System.out.println("Test A");
	}
     @Test(groups="Critical Regression")
	
	public void test_002() {
		
		System.out.println("Test B");
	}
     
     
     @Test(groups="Regression")
 	
 	public void test_003() {
 		
 		System.out.println("Test C");
 	}
}

