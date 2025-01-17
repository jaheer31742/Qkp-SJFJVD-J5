package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
		WebElement elements = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]"));
		elements.click();
		elements.sendKeys("jaheer317");		
		Thread.sleep(1000);
		
		elements=driver.findElement(By.name("password"));
		elements.click();
		elements.sendKeys("123456");
		
		
		elements=driver.findElement(By.xpath("//div[contains(text(),'Log')]"));
		elements.click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}