package SynchronizationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopperStackImplictWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to the url
		driver.get("https://www.shoppersstack.com/");

		// apply implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(5000);

		// identify the web element
		WebElement element = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		element.click();

		element = driver.findElement(By.xpath("//input[@id='Email']"));
		element.sendKeys("jaheer@gmail.com");
		
		element=driver.findElement(By.xpath("//input[@id='Password']"));
		element.sendKeys("123456");
		
		
		element=driver.findElement(By.xpath("//span[text()='Login']"));
		element.click();
		

		// execution log
		System.out.println("execution done");
		Thread.sleep(5000);

		// close the browser
		driver.quit();

	}

}
