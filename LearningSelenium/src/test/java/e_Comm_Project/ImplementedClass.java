package e_Comm_Project;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ImplementedClass extends FoundationClass {

	@Test
	public void addproduct_1() {

		// identify the shop now button web element
		driver.findElement(By.xpath("//h1[text()='Clothes That Get YOU Noticed']/following-sibling::a/child::button"))
				.click();

		// identify the first product into cart
		driver.findElement(By.xpath(
				"//h1[text()='Exclusive Prime Deals']/following-sibling::ul/child::li/child::a/child::h1[text()='Hair Dryer']"))
				.click();

		// identify the add button web element
		driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();

		// back to the product page
		driver.navigate().back();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("1st Product add to card", true);
	}

	@Test
	public void addproduct_2() {
		// identify the shop now button web element
		driver.findElement(By.xpath("//h1[text()='Clothes That Get YOU Noticed']/following-sibling::a/child::button"))
				.click();

		// identify the first product into cart
		driver.findElement(By.xpath(
				"//h1[text()='Exclusive Prime Deals']/following-sibling::ul/child::li/child::a/child::h1[text()='Minifigures']"))
				.click();

		// identify the add button web element
		driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();

		// back to the product page
		driver.navigate().back();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("2st Product add to card", true);

	}

	@Test
	public void addproduct_3() {
		// identify the shop now button web element
		driver.findElement(By.xpath("//h1[text()='Clothes That Get YOU Noticed']/following-sibling::a/child::button"))
				.click();

		// identify the first product into cart
		driver.findElement(By.xpath(
				"//h1[text()='Exclusive Prime Deals']/following-sibling::ul/child::li/child::a/child::h1[text()='Lightweight Tripod']"))
				.click();

		// identify the add button web element
		driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();

		// back to the product page
		driver.navigate().back();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("3st Product add to card", true);

	}
}
