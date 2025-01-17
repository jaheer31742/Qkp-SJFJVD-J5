package e_Comm_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the web diver manager
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// enter the url
		driver.get("https://rahulnxttrendz.ccbp.tech/login");
		Thread.sleep(1500);

		// validate the title of the web browser
		String expectedResult = "React App";
		String acceptedResult = driver.getTitle();

		if (expectedResult .equals(acceptedResult) ) {
			System.out.println("expectedResult --- acceptedResult are :true");
		} else {
			System.out.println("expectedResult --- acceptedResult are :true");
		}

		// identify the username web element
		WebElement elements = driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		Thread.sleep(1500);

		// enter the user name input details
		elements.click();
		elements.clear();
		elements.sendKeys("rahul");
		Thread.sleep(1500);

		// identify the password web element
		elements = driver.findElement(
				By.xpath("//input[contains(@id,'user')]/parent ::div/following-sibling::div[1]/child::input"));
		Thread.sleep(1500);

		// enter the password inputs
		elements.click();
		elements.sendKeys("rahul@2021");
		Thread.sleep(1500);

		// click on login
		elements = driver.findElement(By.xpath(
				"//input[contains(@id,'user')]/parent ::div/following-sibling::button[contains(text(),'Login')]"));
		elements.click();
		Thread.sleep(2000);

		// get the url:
		System.out.println(driver.getCurrentUrl());

		// validate the url
		String expectedUrl = "https://rahulnxttrendz.ccbp.tech/";
		String acctualUrl = driver.getCurrentUrl();
		System.out.println(expectedUrl);

		if (expectedUrl .equals(acctualUrl)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// fetch the data from the main heading from home page

		String elementText = driver.findElement(By.xpath("//h1[contains(text(),'Clothes')]")).getText();

		System.out.println(elementText);
		Thread.sleep(1500);

		// click the shop now button
		elements = driver.findElement(By.xpath("//button[contains(text(),'Shop')]"));
		elements.click();
		Thread.sleep(1500);
		
		//validate the url for the products
		System.out.println(driver.getCurrentUrl());
		String expecetedUrlForProduct="https://rahulnxttrendz.ccbp.tech/products";
		String acctualUrlForProduct=driver.getCurrentUrl();
		
		if(expecetedUrlForProduct.equals(acctualUrlForProduct)) {
			System.out.println("pass");
		}else {
			
			System.out.println("fails");
		}
		
		Thread.sleep(1500);
		
		//identify the product web element
		elements=driver.findElement(By.xpath("//h1[contains(text(),'Hair')]/../../following-sibling::li[1]/child::a/child::h1[@class='title']"));
		System.out.println(elements.getText());
		elements.click();
		Thread.sleep(2000);
		
		//add to card
		elements=driver.findElement(By.xpath("//button[contains(text(),'ADD')]"));
		elements.click();
		Thread.sleep(2000);
		
		
		//logout
		elements=driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
		elements.click();
		Thread.sleep(2000);
		
		
		// close the browser
		driver.close();

	}

}
