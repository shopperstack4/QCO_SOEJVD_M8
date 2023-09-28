package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

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
				driver.get("https://www.amazon.in/");
				//driver.get("https://www.facebook.com/");
				//downcasting statemet
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				File dest = new File("./Screenshots/amazon.png");
				//File dest = new File("./Screenshots/facebook.png");
				
				FileUtils.copyFile(src, dest);
				driver.close();

	}

}
