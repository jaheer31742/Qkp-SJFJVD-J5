package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActionOnSuggestionTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// identify the raido1 web elements
		WebElement radioElement = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		radioElement.sendKeys("India");
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		

	}
	
	

}
