package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationForIsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		// configure the browser
		WebDriver driver = new EdgeDriver();

		// launch the browser
		driver.get("https://www.facebook.com/");

		// identify the create ne button web element
		WebElement createNewButton = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		// perform action
		createNewButton.click();
		Thread.sleep(1000);

		// validate the url
		String expectedUrl = "https://www.facebook.com/r.php";
		String acutalUrl = driver.getCurrentUrl();
		System.out.println(acutalUrl);
		if (expectedUrl.equals(acutalUrl)
				) {
			System.out.println("The current url is : matchs");
		} else {
			System.out.println("The current url is not : matchs");
		}
		Thread.sleep(1000);

		// identify the first name web element
		WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
		element.click();
		element.sendKeys("jaheer");
		Thread.sleep(1000);

		// identify the surname name web element
		element=driver.findElement(By.xpath("//input[@name='lastname']"));
		element.click();
		element.sendKeys("shaik");
		Thread.sleep(1000);

		// identify the male button web element
		WebElement maleButton = driver.findElement(By.xpath("//label[contains(text(),'Male')]/child::input"));
		// perform the action
		maleButton.click();
		Thread.sleep(1000);

		// validation for the maleButton
		boolean display = maleButton.isDisplayed();
		boolean enabled = maleButton.isEnabled();

		if (display) {
			System.out.println("male button: is displayed");
		} else {
			System.out.println("male button: is not displayed");
		}

		if (enabled) {
			System.out.println("male button : is enabled");
		} else {
			System.out.println("male button : is not enabled");
		}

		boolean result = maleButton.isSelected();
		if (result) {
			System.out.println("The button is selected");
		} else {
			System.out.println("The button is not selected");
		}
		Thread.sleep(1000);

		// identify the mobile web element
		element=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		element.click();
		element.sendKeys("1253");
		Thread.sleep(1000);

		// identify the paassword web element
		element=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		element.click();
		element.sendKeys("1253");
		Thread.sleep(1000);

		// submit the sign up button
		element=driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
		element.click();
		Thread.sleep(1000);

		driver.quit();

	}

}
