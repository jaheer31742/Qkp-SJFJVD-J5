package e_Comm_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FoundationClass {

	public WebDriver driver;
	
	@Parameters("browser")

	@BeforeClass
	public void browserSetup(String browsername) {

		// configure the browser
		switch(browsername) {
		case "chrome":WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "edge":WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		
		}

		// waiting statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// navigate to url
		driver.get("https://rahulnxttrendz.ccbp.tech/login");

		Reporter.log("Browser Setup done", true);

	}

	@BeforeMethod
	public void login() {

		// identify the user name web element
		driver.findElement(By.xpath("//div[@class='input-container'][1]/child::input")).sendKeys("rahul");

		// identify the password web element
		driver.findElement(By.xpath("//div[@class='input-container'][2]/child::input")).sendKeys("rahul@2021");

		// identify the login button web element
		driver.findElement(By.xpath("//button[@class='login-button']")).submit();

		Reporter.log("user login done", true);

	}

	@AfterMethod
	public void logout() {

		// identify the logout button web element
		driver.findElement(By.xpath("//button[@class='logout-desktop-btn']")).click();
		Reporter.log("logout done", true);

	}

	@AfterClass
	public void browserTermination() {
		driver.quit();
		Reporter.log("Browser quit done", true);

	}

}
