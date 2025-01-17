package SynchronizationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAppQsipdersImplictWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");

		// apply implict wait
		
		//Thread.sleep(5000);

		// identify the web element
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Open')]"));
		element.click();

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement elements = driver.findElement(By.xpath("//button[@type='submit']"));		
		elements.click();

		// execution log
		System.out.println("execution done");
		Thread.sleep(5000);

		// close the browser
		driver.quit();

	}

}
