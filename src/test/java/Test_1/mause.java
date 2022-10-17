package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mause {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement driver1= driver.findElement(By.xpath("//input[@name='email']"));
		
		
		Actions s1=new Actions(driver);
		
		s1.keyDown(driver1,Keys.SHIFT).sendKeys("vijay").keyUp(Keys.SHIFT).build().perform();
		
		s1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		s1.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement driver2= driver.findElement(By.xpath("//input[@name='pass']"));
		driver2.click();
		
		s1.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement driver3= driver.findElement(By.xpath("//button[@name='login']"));
		driver3.sendKeys(Keys.ENTER);
	
	}


}
