package Test_1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testxl {

	public static void main(String[] args) throws Exception {
		
		
String path="C:\\Users\\uSER\\eclipse-workspace\\Project_New\\dataxl\\New Microsoft Excel Worksheet.xlsx";

    FileInputStream sf=new FileInputStream(path);
    XSSFWorkbook wb=new  XSSFWorkbook(sf);
    
    String data1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(data1);
    
    
   

	}

}
