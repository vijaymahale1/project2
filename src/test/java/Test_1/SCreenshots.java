package Test_1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SCreenshots {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement driver1= driver.findElement(By.xpath("//input[@name='email']"));
	
		WebElement driver2= driver.findElement(By.xpath("//input[@name='pass']"));
		
		
		WebElement driver3= driver.findElement(By.xpath("//button[@name='login']"));
		
		driver1.sendKeys("vijay@ghhh.gamil.com");
		
		driver2.sendKeys("fcgvhvhmbm1255");
		
		driver3.click();
		
		
		String path1="C:\\Users\\uSER\\eclipse-workspace\\Project_New\\screen";
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		File dist=new File(path1+"\\test12.png");
		
		
		FileUtils.copyFile(src, dist);

	}

}
