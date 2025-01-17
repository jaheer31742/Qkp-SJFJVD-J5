package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformActionOnSubmitButton {

	public static void main(String[] args) throws InterruptedException {

		// step 1:configure the browser
		WebDriverManager.edgedriver().setup();

		// step 2:launch the browser
		WebDriver driver = new EdgeDriver();

		// step 3:enter the url
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);

		// step 4:validate the title
		String exceptedTitle = "Demo Web Shop. Login";
		System.out.println(exceptedTitle);
		String acutalTitle = driver.getTitle();
		System.out.println(acutalTitle);

		if (exceptedTitle.equals(acutalTitle)) {
			System.out.println("The title of the page is :matched");
		} else {
			System.out.println("The title of the page is :not matched");
		}

		// step 5:get the current url
		System.out.println(driver.getCurrentUrl());

		// step 6:identify the register web element
		WebElement registerTestLink = driver
				.findElement(By.xpath("//a[contains(text(),'Log')]/parent::li/preceding-sibling::li/child::a"));

		// step 7:perform the click action
		registerTestLink.click();

		// step 8:get the current url
		System.out.println(driver.getCurrentUrl());

		// step 9:validate the title
		String exceptedTitleDemo = "Demo Web Shop. Register";
		System.out.println(exceptedTitleDemo);
		String acutalTitleDemo = driver.getTitle();
		System.out.println(acutalTitleDemo);

		if (exceptedTitleDemo.equals(acutalTitleDemo)) {
			System.out.println("The title of the page is :matched");
		} else {
			System.out.println("The title of the page is :not matched");
		}

		// step 10:identify the gender web element
		registerTestLink = driver
				.findElement(By.xpath("//label[contains(text(),'Gender:')]/../div/child::input[@id='gender-male']"));
		
		
		// step 11:validate the radio button
		boolean maleRadioButtonDisplayed = registerTestLink.isDisplayed();
		boolean maleRadioButtonEnabled = registerTestLink.isEnabled();

		if (maleRadioButtonDisplayed && maleRadioButtonEnabled) {
			System.out.println("Male Radio is:displayed");
			System.out.println("Male Radio is:enabled");
		} else {
			System.out.println("Male Radio is:not displayed");
			System.out.println("Male Radio is:not enabled");
		}

		// step 12:perform the click action
		registerTestLink.click();
		Thread.sleep(5000);
		
		// step 13:validate weather the radio is selected or not
		boolean maleRadioButtonSelected = registerTestLink.isSelected();
		System.out.println(maleRadioButtonSelected);
		if (maleRadioButtonSelected) {
			System.out.println("Male Radio is already:selected");
		} else {
			System.out.println("Male Radio is:not selected");
		}

		// step 14:identify the first name web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Your')]/../following::div/child::div[@class='inputs'][2]/child::input[@name='FirstName']"));
		
		// perform the enter inputs action
		registerTestLink.sendKeys("jaheer");
		Thread.sleep(2000);
		
		// step 15:identify the last name web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Your')]/../following::div/child::div[@class='inputs'][2]/child::input[@name='FirstName']/../following-sibling::div[1]/child::input"));
		// perform the enter inputs action
		registerTestLink.sendKeys("basha");
		Thread.sleep(2000);
		
		// step 16:identify the email web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Your')]/../following::div/child::div[@class='inputs'][2]/child::input[@name='FirstName']/../following-sibling::div[1]/child::input/parent::div/following-sibling::div/child::input"));
		// perform the enter inputs action
		registerTestLink.sendKeys("jaheer316@gmail.com");
		Thread.sleep(2000);
		
		// step 17:identify the password web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Password')]/parent::div/../child::div[2]/child::div[1]/child::input"));
		// perform the enter inputs action
		registerTestLink.sendKeys("123456789");
		Thread.sleep(2000);
		
		// step 18:identify the confirm password web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Password')]/parent::div/../child::div[2]/child::div[2]/child::input"));
		// perform the enter inputs action
		registerTestLink.sendKeys("123456789");
		Thread.sleep(2000);
		
		//step 19:identify the register button web element
		registerTestLink = driver.findElement(By.xpath(
				"//strong[contains(text(),'Password')]/parent::div/../following-sibling::div/child::input[@type='submit']"));
		// perform the enter inputs action
		registerTestLink.submit();
		Thread.sleep(2000);
		
		//step 20:close the browser
		driver.quit();
	}

}
