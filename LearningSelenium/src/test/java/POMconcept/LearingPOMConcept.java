package POMconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearingPOMConcept {

	@Test
	public void m1() {

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		
		//navigate to the url
		driver.get("https://www.google.com/");
		

		// declaration
		WebElement searchBox;

		// intilization
		searchBox = driver.findElement(By.name("q"));

		// utilization
		searchBox.sendKeys("selenium");

		searchBox.clear();

		// page reload
		driver.navigate().refresh();

		// intilization
		searchBox = driver.findElement(By.name("q"));

		// utilization
		searchBox.sendKeys("java");

	

	}

}
