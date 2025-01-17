package e_Comm_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// configure the web Driver Manager
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		// launch the browser
		driver.get("https://rahulnxttrends.ccbp.tech/");

		// max the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// get the title
		System.out.println(driver.getTitle());

		// identify the name web element
		WebElement element = driver.findElement(By.xpath("//input[@name='name']"));
		element.click();
		element.sendKeys("jaheer");
		Thread.sleep(2000);
		
		// identify the email web element
		element = driver.findElement(By.xpath("//input[@name='email']"));
		element.click();
		element.sendKeys("jaheer317@gmail.com");
		Thread.sleep(2000);
		
		// identify the password web element
		element = driver.findElement(By.xpath("//input[@name='password']"));
		element.click();
		element.sendKeys("123456789");
		Thread.sleep(2000);
		
		// choose the gender
		element = driver.findElement(By.xpath("//input[@id='male']"));
		element.click();
		boolean maleButton = element.isDisplayed();
		if(maleButton) {
			System.out.println("male radiobutton is : displayed");
		}else {
			System.out.println("male radiobutton is not : displayed");
		}
		
		
		boolean radioButtonIsEnabled = element.isEnabled();
		if(radioButtonIsEnabled) {
			System.out.println("male radiobutton is : enabled");
		}else {
			System.out.println("male radiobutton is not : enabled");
		}
		
		boolean radioButtonIsSelected = element.isSelected();
		if(radioButtonIsSelected) {
			System.out.println("male radiobutton is : selected");
		}else {
			System.out.println("male radiobutton is not: selected");
		}
		
		
		// choose the country
		element = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select countrySelect = new Select(element);
		countrySelect.selectByVisibleText("USA");
		Thread.sleep(2000);
		
		// click the check box button in the terms and conditions
		element = driver.findElement(By.xpath("//input[@id='terms']"));
		element.click();
		Thread.sleep(2000);

		// submit the registration
		element = driver.findElement(By.xpath("//button[@id='submitBtn']"));
		element.submit();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
