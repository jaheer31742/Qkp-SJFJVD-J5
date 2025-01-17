package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TraversingApproach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure the web driver manager
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver =new EdgeDriver();
		
		//launch the browser
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
		//max the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//identify the static element
		WebElement element = driver.findElement(By.xpath("//label[text()='Name:']/../../../tr[9]/td[2]//textarea[@id='feedback']"));
		element.sendKeys("sk jaheer basha");
		Thread.sleep(2000);
		
		driver.close();
	}

}
