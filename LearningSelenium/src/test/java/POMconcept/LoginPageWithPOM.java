package POMconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWithPOM {

	@Test
	public void verifyTheUser() {

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to the url
		driver.get("https://www.saucedemo.com/");
		
		//reload the page 
		driver.navigate().refresh();
		
		//create the object fo the loginpage
		LoginPage loginpage=new LoginPage(driver);
		
		//call the get methods
		loginpage.getUserTextfield().sendKeys("standard_user");

	}

}
