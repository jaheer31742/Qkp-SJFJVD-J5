package SynchronizationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();


		// navigate the url
		driver.get("https://www.shoppersstack.com/");
		
		// implict wait
		Options optionObj = driver.manage();
		Timeouts timeObj = optionObj.timeouts();
		timeObj.implicitlyWait(20, TimeUnit.SECONDS);

		// identify the web element
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		// execution log
		System.out.println("execution done");

	}

}
