package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure the bowser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser		
		WebDriver driver=new EdgeDriver();
		
		//customize the browser
		driver.manage().window().setSize(new Dimension(1000,1000));		
		driver.manage().window().setPosition(new Point(200,200));
		
		
		//enter the url
		driver.get("https://www.maccosmetics.in/products/13854/products/makeup/lips/lipstick t");
		Thread.sleep(2000);
		
		
		//identify the webelement
		//addtobagbutton=driver.findElement(By.xpath(");
		
//		//validate the element
//		boolean result1=addtobagbutton.isDisplayed();		
//		boolean result1=addtobagbutton.isEnabled();
//		
//		
//		//provide validate Message for test log
//		if(result1) {
//			System.out.println("Element Verified: it is displayed");
//		}else {
//			System.out.println("Element Verified: it is not displayed");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//provide validate Message for test log
				if(result2) {
					System.out.println("Element Verified: it is enabled");
				}else {
					System.out.println("Element Verified: it is not enabled");
				}
				
		

	}

}
