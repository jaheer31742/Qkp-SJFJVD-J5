package ProductTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver staticDriver;

	@BeforeSuite
	public void suit() {
		System.out.println("configure data base connect");
	}

	@BeforeTest
	public void test() {
		System.out.println("connection test runner connection");
	}

	@BeforeMethod
	public void LoginBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();

	}

	@AfterMethod
	public void logout() {
		WebElement breadCrum = driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
		breadCrum.click();

		WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("terminate test runner method");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("terminate db connection");
	}

}
