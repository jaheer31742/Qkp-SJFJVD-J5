package LearningTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.Test;

public class GoupExecution extends BaseClass {

	@Test(groups = {"FT","RT"})
	public void addFirstProduct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// identify the web element
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		org.testng.Reporter.log("1stTest cases", true);
	}

	@Test(groups = {"IT","RT"})
	public void removeProduct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// identify the web element
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@id='remove']")).click();
		org.testng.Reporter.log("2nd Test cases", true);

	}

}
