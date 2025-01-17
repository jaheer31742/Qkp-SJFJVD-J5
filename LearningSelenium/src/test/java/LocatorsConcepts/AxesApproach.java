package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxesApproach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure the web driver manager
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
		//max the browser
		driver.manage().window().maximize();
		
		//identify the web element
		WebElement element = driver.findElement(By.xpath("//input[contains(@id,'name')]/parent::td/parent::tr/parent::tbody//child::tr[11]/child::td[2]/child::a"));

		element.click();
		Thread.sleep(20000);
		
		
		driver.close();
		
		
	}

}
