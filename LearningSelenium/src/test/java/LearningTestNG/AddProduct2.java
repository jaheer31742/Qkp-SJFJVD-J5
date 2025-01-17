package LearningTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddProduct2 extends BaseClass {

	@Test
	public void addFirstProduct() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// identify the web element
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
	}

	@Test
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

	}

}
