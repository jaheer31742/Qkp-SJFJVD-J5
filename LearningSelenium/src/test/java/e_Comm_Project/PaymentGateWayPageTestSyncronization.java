package e_Comm_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentGateWayPageTestSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// implict wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://qapaygate.ccbp.tech/");

		// identify the card number web element
		driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("1234567899876543");

		// identify the expiry date web element
		driver.findElement(By.xpath("//input[@id='expiryDate']")).sendKeys("12/24");

		// identify the cvv web element
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("517");

		// click on the pay now button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebDriverWait explictWait = new WebDriverWait(driver, 5);

		explictWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='otp']")));

		// enter the otp
		driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("123456");

		// click on submit button
		driver.findElement(By.tagName("button")).click();
		explictWait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Payment Successful']")));

		// print the success message
		String text = driver.findElement(By.xpath("//h1[text()='Payment Successful']")).getText();
		System.out.println(text);
		
		//close the browser
		driver.quit();
	}

}
