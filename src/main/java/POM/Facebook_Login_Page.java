package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page {
	
	//Declaration
	//Address of email text field
	@FindBy(id = "email")
	private WebElement emailTf;
	
	//address of password textfield
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	//initialization
	public Facebook_Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void emailTextField(String name) {
		emailTf.sendKeys(name);
	}
	
	public void passwordTextField(String name) {
		passwordTf.sendKeys(name);
	}
	
	public void loginButton() {
		loginBtn.click();
	}

}
