package Test_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project1 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		
		String currenturl=driver.getCurrentUrl();
		
		System.out.println(currenturl);
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
	

	}

}
