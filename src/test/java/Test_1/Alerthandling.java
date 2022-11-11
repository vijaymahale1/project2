package Test_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
	    driver.manage().window().maximize();
	    
	    
	WebElement name=  driver.findElement(By.xpath("//input[@type='text']"));
	
	name.sendKeys("vijaymahale");
	
	
	WebElement sub=driver.findElement(By.xpath("//input[@type='submit']"));
	
	sub.click();
	    
	    
	Alert alt=	driver.switchTo().alert();
	
	String p=alt.getText();
	
	System.out.println(p);
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
    

	}

}
