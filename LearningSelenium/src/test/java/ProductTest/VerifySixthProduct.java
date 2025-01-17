package ProductTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifySixthProduct extends BaseClass {

	@Test
	public void addSixthproduct() throws InterruptedException {
		// add to cart
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']")).click();
		Thread.sleep(2000);
		// click on cart
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Thread.sleep(2000);
		// checkout
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
		// first name
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("prasanna");
		Thread.sleep(2000);
		// last name
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("mallula");
		Thread.sleep(2000);
		// zip code
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500075");
		Thread.sleep(2000);

		// continue
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		// finish
		driver.findElement(By.xpath("//button[@name='finish']")).click();
		Thread.sleep(2000);
		// back to home
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();

	}

}
