package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Writing_Excel {

	
	public static void main(String[] args) throws Throwable {
		//Create an object for physical file
		FileInputStream fis = new FileInputStream(".//src\\test\\resources\\Test Data.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		WebDriverManager.edgedriver().setup();
		//Upcasting statement
		WebDriver driver = new EdgeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//use of get method
		driver.get(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		//write data into excel sheet
		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
		FileOutputStream fos = new FileOutputStream(".//src\\test\\resources\\Test Data.xlsx.xlsx");
		wb.write(fos);

	}

}
