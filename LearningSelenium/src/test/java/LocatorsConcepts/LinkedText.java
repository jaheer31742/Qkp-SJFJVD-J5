package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure the web driver manager
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open the url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
		//identify the linktext webelement
		WebElement element = driver.findElement(By.linkText("Contact Us"));
		
		element.click();
		Thread.sleep(1000);
		
		driver.close();
		
		

	}

}
