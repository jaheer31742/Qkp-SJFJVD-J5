package POMconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//declaration
	
	@FindBy(id ="user-name")
	private WebElement userTextfield ;
	
	@FindBy(id ="password")
	private WebElement passwordTextField;
	
	@FindBy(id ="login-button")
	private WebElement LoginButton;
	
	//intilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//utilization
	
	public WebElement getUserTextfield() {
		return userTextfield;
	}
		
	
	

}
