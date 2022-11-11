package Test_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_001 extends  base_class {

	
	@Test(priority=3)
	
	public void test_001_A() {
		
		System.out.println("Test 1");
	}
	
	@Test(priority=1,enabled=false)
	
	public void test_002_B() {
		
		
		System.out.println("Test 2");
	}
	
	@Test(priority=2,invocationCount=4)
	
	public void test_003_C() {
		
		System.out.println("Test3");
		
		Assert.assertTrue(false);
	}
}

