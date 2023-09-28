package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Robot {

	public static void main(String[] args) throws Throwable {
		// driver management statement
		WebDriverManager.edgedriver().setup();
		// upcasting statement
		WebDriver driver = new EdgeDriver();
		// maximizing the window
		driver.manage().window().maximize();
		
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// use of get method
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwgZCoBhBnEiwAz35RwldRrypXvwNt_75IOio82dem0llOb1rFYcbBBCwAZlnT_FtXj-bBQxoChDcQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		// create an object for robot class
		Robot r = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\saoji\\Downloads\\Locators (1).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
