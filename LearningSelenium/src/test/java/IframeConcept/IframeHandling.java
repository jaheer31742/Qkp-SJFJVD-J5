
package IframeConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//wait statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//navigate to the url		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		//switch the control from main page to frame using index
//		driver.switchTo().frame(1);
//		
		//switch the control from main page to frame using id value
		driver.switchTo().frame("courses-iframe");
		
//		//switch the contro; from main page to frame using web element
//		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));		
		
		//identify the web element
		driver.findElement(By.xpath("(//a[@class='theme-btn'])[1]")).click();

	}

}
