package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://www.zomato.com/");

		// max the browser
		driver.manage().window().maximize();

		// identify the search web element
		WebElement element = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));

		// validate the web element
		boolean result1 = element.isDisplayed();
		boolean result2 = element.isEnabled();

		if (result1 && result2) {
			System.out.println("result1 - web element: is diplayed");
			System.out.println("result2 - web element: is enabled");
		} else {
			System.out.println("result1 - web element: is not diplayed");
			System.out.println("result2 - web element: is not enabled");
		}

		// perform enter action
		element.sendKeys("chicken briyani");
		Thread.sleep(3000);

		// perform clear action
		element.clear();
		Thread.sleep(3000);

		// perform enter action
		element.sendKeys("mutton briyani");
		Thread.sleep(3000);

		// perform clear action
		element.clear();
		Thread.sleep(3000);

		// perform enter action
		element.sendKeys("panner briyani");
		Thread.sleep(3000);

		// perform clear action
		element.clear();
		Thread.sleep(3000);
		
		//close the browser
		
		driver.quit();

	}

}
