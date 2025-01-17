package e_Comm_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the web driver manager
		// System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		WebDriverManager.edgedriver().setup();

		// create a object for browser
		WebDriver driver = new EdgeDriver();

		// launch the url
		driver.get("https://rahulnxttrendz.ccbp.tech/login");

		Thread.sleep(2000);
		
		//maximize the window
		driver.manage().window().maximize();

		// locate the user name web elements
		WebElement element = driver.findElement(By.id("username"));

		// click the web element
		element.click();

		// clear the web element text
		element.clear();

		// enter the user name inputs
		element.sendKeys("rahul");
		Thread.sleep(2000);

		// locate the password web elements
		element = driver.findElement(By.id("password"));

		// click the web element
		element.click();

		// clear the web element text
		element.clear();

		// enter the user name inputs
		element.sendKeys("rahul@2021");
		Thread.sleep(2000);

		// click the web element
		element.submit();
		
		
		//click on the product module
		//element=driver.findElement(By.linkText("/products"));
		//element.click();
		
		Thread.sleep(2000);
		
		//click on logout
		element=driver.findElement(By.tagName("button"));
		element.submit();
		Thread.sleep(2000);
		
		//close the browser		
		driver.close();

	}

}
