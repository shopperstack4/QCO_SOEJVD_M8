package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	//Declaration
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement courseEle;
	
	@FindBy(xpath="//a[text()='Python']")
	private WebElement pythonEle;
	
	//Intialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getCourseEle() {
		return courseEle;
	}
	
	public void pythonElement() {
		pythonEle.click();
	}
}
