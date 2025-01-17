package LearningTestNG;

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

import com.github.dockerjava.core.NameParser.ReposTag;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	public void browserSetup(String browsername,String url) {

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
		
		//navigate to the url
		driver.get(url);
	}
	
	@Parameters({"userName","passWord"})
	@BeforeMethod
	public void login(String userName,String passWord) {
		Reporter.log("login",true);
		
		//enter the username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
		
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
		
		//login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		// click on logout button
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}
	
	
	@AfterClass
	public void browserTermination() {
		Reporter.log("browser termination",true);
		driver.quit();
		
	}
	

}
