package e_Comm_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import SynchronizationConcept.ExplictWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncronizationExplictWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://qarecipepage.ccbp.tech/");

		// apply fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// perform the action
		// identify the web element
		driver.findElement(By.xpath("//ul[@id='categoryList']/child::li[text()='Main Courses']")).click();
	
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='recipeList']/child::ul/child::li"));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		for(WebElement obj:elements) {
			String text = obj.getText();
			System.out.println(text);
			
		}
		System.out.println("=================");

		// identify the web element
		driver.findElement(By.xpath("//div[@id='recipeList']/child::ul/child::li[text()='Chicken Parmesan']")).click();
		List<WebElement> elementsWait = driver.findElements(By.xpath("//ol/child::li"));
		wait.until(ExpectedConditions.visibilityOfAllElements(elementsWait));

		//print the tile of the recipes
		System.out.println(driver.getTitle());
		System.out.println("=================");
		//print the ingredients
		List<WebElement> collectElement = driver.findElements(By.xpath("//div[@id='recipe']/child::ul/child::li"));
		for(WebElement obj:collectElement) {
			String text = obj.getText();
			System.out.println(text);
			
		}

		//close the browser
		driver.quit();
		
		
	}

}
