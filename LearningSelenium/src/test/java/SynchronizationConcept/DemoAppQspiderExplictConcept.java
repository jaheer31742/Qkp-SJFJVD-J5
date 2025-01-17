package SynchronizationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAppQspiderExplictConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to the url
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");

		// wait statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// identify the web element
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'With Element')])[1]"));
		element.click();

		// identify the web element
		element = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		element.sendKeys("20");
		Thread.sleep(2000);

		// identify the web element
		element = driver.findElement(By.xpath("//button[text()='Start']"));
		element.click();
		
		// wait statement
		WebDriverWait explictWait = new WebDriverWait(driver, 20);
		explictWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//select)[2]")));

		element = driver.findElement(By.xpath("(//select)[2]"));
		element.click();
		Thread.sleep(5000);

	}

}
