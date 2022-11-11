package Test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class2 {
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeClass
	
	public void Test_1(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
		
       else if(BrowserName.equalsIgnoreCase("Edge")) {
			
			WebDriverManager.edgedriver().setup();
		
		    driver=new EdgeDriver();
		    
	}
		
		   driver.get("https://www.facebook.com/login/");
		
		   driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public void Test_2() {
		
		driver.close();
	}
	

}
