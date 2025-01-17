package PurchaseProduct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticDriver;

	@Parameters("browser")
	@BeforeClass
	public void configure(String browser) {

		// configure the browser and launch the browser
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			staticDriver = driver;
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			staticDriver = driver;
			break;

		}

	}

	@Parameters("url")

	@BeforeMethod
	public void login(String URL) throws IOException {

		// add the implict wait statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// navigate to the url
		driver.get(URL);

		// convert the physical file to java understandable file
		FileInputStream fis = new FileInputStream("./Data/LoginInputs.properties");

		// create an object for properties class
		Properties prObj = new Properties();

		// add the load to the properties object
		prObj.load(fis);

		// fetch the properties value
		String userName = prObj.getProperty("username");

		String passWord = prObj.getProperty("password");

		// identify the userName WEB Element
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);

		// identify the password web element
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);

		// identify the login button web element
		driver.findElement(By.xpath("//input[@name='login-button']")).click();

	}
	
	@AfterMethod
	public void terminate() {
		driver.quit();
	}

}
