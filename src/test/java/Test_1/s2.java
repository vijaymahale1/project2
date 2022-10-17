package Test_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s2 {

	public static void main(String[] args) throws Exception {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	
		WebElement vijay=driver.findElement(By.xpath("//input[@name='q']"));
		vijay.sendKeys("vijay");
		
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		System.out.println(list.size());
		
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println(list.get(i).getText());
		
	}
	
	
		
		
		System.out.println(list.get(3).getText());
		
		list.get(3).click();

		

		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
		}
		
		System.out.println(list.get(6).getText());
		
		list.get(6).click();
		
		
		WebElement click=driver.findElement(By.xpath("(//ul[@class='G43f7e']/li)[7]"));
		
		click.click();
		
		
		

		
	}

}
