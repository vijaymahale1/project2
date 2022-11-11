package Test_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {

	

	 WebDriver driver;
     @BeforeMethod
 
 public void Setup() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  
	  driver.manage().window().maximize();
 }
 
     @AfterMethod
     
     public void suitdown() {
	  
	  driver.close(); 
	 
  }
 
 
}
