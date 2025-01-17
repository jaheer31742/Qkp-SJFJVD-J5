package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath_Relative1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the web driver manager
		WebDriverManager.edgedriver().setup();

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// max the browser
		driver.manage().window().maximize();

		// navigate to the application via URL
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");

		String expectedTitle = "Learning Selenium";
		String actualTitle = driver.getTitle();

		// verify the webpage
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Title verified -pass");
		} else {
			System.out.println("Title verified -fail");
		}
		// identify the name text element
		WebElement element = driver.findElement(By.xpath("//input[@value='Tillu Radhika']"));
		element.clear();
		Thread.sleep(1000);

		// perform action on the elements
		element.sendKeys("jaheer");
		Thread.sleep(1000);

		// identify the name text element
		element = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		Thread.sleep(1000);

		// enter the inputs
		element.sendKeys("jaheer@gmail.com");
		Thread.sleep(1000);

		// identify the password web element
		element = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(1000);

		// enter the inputs
		element.sendKeys("1234");
		Thread.sleep(1000);

		// identify the mobile no web element
		element = driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
		Thread.sleep(1000);

		// enter the inputs
		element.sendKeys("123456789");
		Thread.sleep(1000);

		// identify the dob web element
		element = driver.findElement(By.xpath("//input[@type='datetime-local']"));
		Thread.sleep(1000);

		// enter the inputs
		element.sendKeys("03-November-2024,7:45");
		Thread.sleep(1000);

		// identify the gender web element
		element = driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(1000);

		// enter the inputs
		element.click();
		Thread.sleep(1000);

		// identify the place web element to uncheck
		element = driver.findElement(By.xpath("//label[contains(text(),'GOA')]"));
		Thread.sleep(1000);

		// uncheck the check box
		element.click();

		// identify the place web element
		element = driver.findElement(By.xpath("//label[contains(text(),'Manali')]"));
		Thread.sleep(1000);

		// click on the inputs
		element.click();
		Thread.sleep(1000);

		// identify the country web element
		element = driver.findElement(By.xpath("//option[text()='AUSTRALIA']"));
		Thread.sleep(1000);

		// click on the inputs
		element.click();
		Thread.sleep(1000);

		// identify the feedback web element
		element = driver.findElement(By.xpath("//textarea[contains(@id,'feedback')]"));
		Thread.sleep(1000);

		// enter the inputs
		element.sendKeys("sk jaheer basha");
		Thread.sleep(1000);

		/*
		 * step 25:identify the upload file web element driver.findElement(By.xpath(
		 * "html/body/form/fieldset/table/tbody/tr[10]/td[2]/input"));
		 * Thread.sleep(1000);
		 * 
		 * // step 26:click on the inputs element.click(); Thread.sleep(1000);
		 */

		// identify the contact us web element
		element = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
		Thread.sleep(1000);

		// click on the inputs
		element.click();
		Thread.sleep(1000);

		driver.close();

	}

}
