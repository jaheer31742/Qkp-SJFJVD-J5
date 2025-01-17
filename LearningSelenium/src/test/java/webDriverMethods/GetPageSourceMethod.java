package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure the webdriver
			WebDriverManager.edgedriver().setup();
			
			//	launch the browser		
			WebDriver driver=new EdgeDriver();
			
			//navigate the url
		
			driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
			
			
			//fetch the page source
			String s=driver.getPageSource();
			System.out.println(s);
			
			//fetch the title		
			System.out.println("the title is:"+driver.getTitle());
			
			Thread.sleep(5000);
			
			driver.close();
	}

}
