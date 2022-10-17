package Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectid {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement textemail=driver.findElement(By.id("email"));
		
		textemail.sendKeys("vijaylmahale778@gmail.com");
		
		WebElement pss=driver.findElement(By.id("pass"));
		
		pss.sendKeys("Vijay@14555");
		
		
		WebElement btn=driver.findElement(By.name("login"));
		btn.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	

	}

}
