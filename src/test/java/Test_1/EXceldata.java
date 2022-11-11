package Test_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EXceldata {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
  
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		
		
		String path="C:\\Users\\uSER\\eclipse-workspace\\Project_New\\dataxl\\New Microsoft Excel Worksheet.xlsx";
		
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook ts=new XSSFWorkbook(fis);
		
		String text=ts.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
		
		name.sendKeys(text);
		
		
	}
	

}
