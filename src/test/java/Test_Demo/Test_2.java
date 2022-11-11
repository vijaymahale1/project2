package Test_Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 {

	
	@BeforeSuite
	
	public void Test_BF() {
		
		System.out.println("BS");
	}
	
	@BeforeTest
	
	public void Test_BT() {
		
		
	}
	
	@BeforeClass
	
	public void Test_BC() {
		
		System.out.println("BC");
	}
	
	@BeforeMethod
	public void Test_BM() {
		
		System.out.println("BM");
	}
	
	@Test
	
	public void Test_001() {
		
		
		System.out.println("Welcome");
		
		}
        @Test
	
	public void Test_002() {
		
		
		System.out.println("vijay");
		
		}
	@AfterMethod
	
	public void AM() {
		
		System.out.println("AM");
	}
	
	@AfterClass
	
	public void AC() {
		
		System.out.println("AC");
	}
	
	@AfterTest
	
	public void AT() {
		
		System.out.println("AT");
	}
	@AfterSuite
	
	public void AS() {
		
		System.out.println("AS");
	}
}
