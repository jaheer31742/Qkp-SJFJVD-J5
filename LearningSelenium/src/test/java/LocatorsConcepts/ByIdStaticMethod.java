package LocatorsConcepts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByIdStaticMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the web drive manager
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// fetch the url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");

		Thread.sleep(2000);

		// locate the name web elements
		WebElement element = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		// click the web elements
		element.click();

		// clear the web elements
		element.clear();

		// enter the inputs
		element.sendKeys("jaheer");
		Thread.sleep(2000);

		// locate the email web elements
		WebElement element1 = driver.findElement(By.id("email"));
		Thread.sleep(2000);

		// click the web elements
		element1.click();

		// enter the inputs
		element1.sendKeys("jaheer@gmail.com");
		Thread.sleep(2000);

		// locate the mobile web elements
		WebElement element2 = driver.findElement(By.id("mobile"));
		Thread.sleep(2000);

		// click the web elements
		element2.click();

		// enter the inputs
		element2.sendKeys("9553205434");
		Thread.sleep(2000);

		// locate the password web elements
		WebElement element3 = driver.findElement(By.id("password"));
		Thread.sleep(2000);

		// click the web elements
		element3.click();

		// enter the inputs
		element3.sendKeys("12345");
		Thread.sleep(2000);

		// locate the dob web elements
		WebElement element4 = driver.findElement(By.name("dob"));
		Thread.sleep(2000);

		// click the web elements
		element4.click();

		// enter the inputs
		element4.sendKeys("30-10-2024 12:30 AM");
		Thread.sleep(2000);

		// locate the gender web elements
		WebElement element5 = driver.findElement(By.id("female"));
		Thread.sleep(2000);

		// click the web elements
		element5.click();

		Thread.sleep(2000);

		// close the browser
		driver.close();

	}

}
