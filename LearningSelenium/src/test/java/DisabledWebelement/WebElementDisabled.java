package DisabledWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate the url
		driver.get("https://demoapp.skillrary.com/");
		
		//identify the web element
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//validate the web element
		boolean result = element.isEnabled();
		
		if(result) {
			System.out.println("the web element is: enabled");
		}
		else {
			System.out.println("the web element is: not enabled");
		}
		
		//perform type casting 
		JavascriptExecutor jsObj=(JavascriptExecutor)driver;
		
		//call the method to execute the jscode
		jsObj.executeScript("arguments[0].value='Learning selenium'", element);
		
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();		

	}

}
