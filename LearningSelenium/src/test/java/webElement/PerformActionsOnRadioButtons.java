package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActionsOnRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// identify the raido1 web elements
		WebElement radioElement = driver.findElement(By.xpath("//input[@value='radio1']"));

		// validate the web element
		boolean result1 = radioElement.isDisplayed();
		boolean result2 = radioElement.isEnabled();
		
		if (result1 && result2) {
			System.out.println("result1 : is diplayed");
			System.out.println("result2 : is enabled");
		} else {
			System.out.println("result1 : is not diplayed");
			System.out.println("result2 : is not enabled");
		}

		// perform the action
		radioElement.click();
		Thread.sleep(2000);
		boolean result3 = radioElement.isSelected();
		if (result3) {
			System.out.println("result3 : is selected");
		} else {
			System.out.println("result3 : is not selected");
		}

		// identify the raido2 web elements
		radioElement = driver.findElement(By.xpath("//input[@value='radio2']"));

		// validate the web element
		boolean result4 = radioElement.isDisplayed();
		boolean result5 = radioElement.isEnabled();
		
		if (result4 && result5) {
			System.out.println("result4 : is diplayed");
			System.out.println("result5 : is enabled");
		} else {
			System.out.println("result4 : is not diplayed");
			System.out.println("result5 : is not enabled");
		}

		// perform the action
		radioElement.click();
		Thread.sleep(2000);
		boolean result6 = radioElement.isSelected();
		if (result6) {
			System.out.println("result6 : is selected");
		} else {
			System.out.println("result6 : is not selected");
		}

		// identify the raido3 web elements
		radioElement = driver.findElement(By.xpath("//input[@value='radio3']"));

		// validate the web element
		boolean result7 = radioElement.isDisplayed();
		boolean result8 = radioElement.isEnabled();
		//boolean result9 = radioElement.isSelected();
		if (result7 && result8) {
			System.out.println("result7 : is diplayed");
			System.out.println("result8 : is enabled");
		} else {
			System.out.println("result7 : is not diplayed");
			System.out.println("result8 : is not enabled");
		}

		boolean result9 = radioElement.isSelected();
		if (result9) {
			System.out.println("result9 : is selected");
		} else {
			System.out.println("result9 : is not selected");
		}
		
		// perform the action
		radioElement.click();
		Thread.sleep(2000);
		//close the browser
		driver.quit();
		
		
	}

}
