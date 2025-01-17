package e_Comm_Project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectionOfProductAndRemoveProduct extends BaseClass {

	@Test
	public void addProduct() {

		// identify the shop element
		driver.findElement(By.cssSelector(".shop-now-button")).click();

		// identify the product
		driver.findElement(By.xpath("//h1[text()='Minifigures']")).click();

		// add the product to card
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}

	@Test
	public void removeProduct() {

		// identify the cart element
		driver.findElement(By.xpath("//a[text()='Cart']")).click();

		// identify the remove product
		driver.findElement(By.xpath("(//*[name()='svg' ])[3]")).click();

	
	}

}
