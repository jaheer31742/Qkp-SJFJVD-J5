package ScrollTheWebPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollThePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate to the url
		
		driver.get("https://demoapp.skillrary.com/");
		
		//step to scroll
		
		//step1:type casting for the js executor
		JavascriptExecutor jsObj=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		//scroll the web page
		jsObj.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		jsObj.executeScript("window.scrollTo(0,500)");
		
		//jsObj.executeScript("window.scrollBy(500,200)");
		
		Thread.sleep(5000);
		
		//close the browser
		driver.quit();

	}

}
