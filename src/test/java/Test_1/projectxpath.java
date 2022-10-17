package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectxpath {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement btn= driver.findElement(By.xpath("(//a[contains(@id,'u_0_0_')])"));
		btn.click(); 
		
		Thread.sleep(2000);
		
		WebElement text_email=driver.findElement(By.xpath("//input[@name='firstname']"));
		 text_email.sendKeys("vijay");
		 
		// WebElement text_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		// text_pass.sendKeys("1555455add@12");
		 
	//	WebElement btn= driver.findElement(By.xpath("//button[@name='login']"));
		//btn.click();
		
		//WebElement btn= driver.findElement(By.xpath("//button[@name='login']"));
		//btn.click(); 
		
		//WebElement btn1=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	//	btn1.click();
		
	}

}
