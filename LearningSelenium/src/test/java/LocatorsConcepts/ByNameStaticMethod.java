package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByNameStaticMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the web manager
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");

		// locate the name web elements
		WebElement element = driver.findElement(By.name("name"));
		Thread.sleep(1000);

		// clear the text in the name web element
		element.clear();

		// enter the inputs in the name web elements
		element.sendKeys("jaheer");
		Thread.sleep(1000);

		// locate the email web elements and enter the inputs
		driver.findElement(By.name("email")).sendKeys("jaheer@gmail.com");
		Thread.sleep(1000);

		// locate the password web elements and enter inputs
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(1000);

		// locate the mobile web elements and enter inputs
		driver.findElement(By.name("mobile")).sendKeys("9553205434");
		Thread.sleep(1000);

		// locate the dob web elements and enter inputs
		driver.findElement(By.name("dob")).sendKeys("31-10-24"," 12:30");
		Thread.sleep(1000);

		// locate the gender web elements and click
		driver.findElement(By.id("female")).click();
		Thread.sleep(1000);

		// locate the places web elements and click
		driver.findElement(By.id("goa")).click();
		driver.findElement(By.id("manali")).click();
		Thread.sleep(1000);
		

		// locate the feedback web elements
		driver.findElement(By.id("feedback")).sendKeys("shaik jaheer basha");
		Thread.sleep(1000);
		
		//close the browser
		driver.close();
	}

}
