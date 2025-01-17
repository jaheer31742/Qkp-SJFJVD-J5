package e_Comm_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncronizationWorkShopEnrollmentPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the borwser
		WebDriver driver = new EdgeDriver();

		// add implict wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://qaworkshopenrl.ccbp.tech/");

		
		//identify the web element and enter the input details
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("George");
		
		// click on the continue button
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		// enter text in the email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("george@gmail.com");
				
		// click on continue button
		driver.findElement(By.xpath("//button[@id='continueEmail']")).click();
		
		
		//validate the web element
		boolean result1 = driver.findElement(By.xpath("//input[@id='react']")).isDisplayed();
		boolean result2 = driver.findElement(By.xpath("//input[@id='react']")).isEnabled();
		boolean result3 = driver.findElement(By.xpath("//input[@id='react']")).isSelected();
		
		if(result1&&result2) {
			System.out.println("the radio button is:dispalyed");
			System.out.println("the radio button is:enabled");
			
		}else {
			System.out.println("the radio button is:not dispalyed");
			System.out.println("the radio button is:not enabled");
		}
		
		if(result3) {
			System.out.println("the radio button is:selected");
		}else {
			System.out.println("the radio button is:not selected");
		}
		
		// select React radio button
		driver.findElement(By.xpath("//input[@id='react']")).click();
		
		// select 11AM to 12pm dropdown option
		WebElement elements = driver.findElement(By.xpath("//select[@id='slot']"));
		
		Select selectOption = new Select(elements);
		selectOption.selectByValue("eleven");			

		// click on enroll button
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		// print message
		String text = driver.findElement(By.xpath("//p[text()='Subscribed successfully']")).getText();
		System.out.println(text);
		
		
		// close the browser
		driver.quit();

	}

}
