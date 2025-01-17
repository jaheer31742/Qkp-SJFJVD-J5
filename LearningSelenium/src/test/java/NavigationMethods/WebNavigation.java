package NavigationMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebNavigation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//configure the webdriver manager
		
		WebDriverManager.edgedriver().setup();		
		//step1: launch the browser
		WebDriver driver=new EdgeDriver();
		
		//step2.1:navigate the appliation
		driver.get("https://www.bing.com/search?pglt=43&q=whatsapp+web&cvid=6c718b86ec6b47249195ee0b23db9d50&gs_lcrp=EgRlZGdlKgcIABAAGPkHMgcIABAAGPkHMgYIARBFGDkyBggCEEUYOzIGCAMQRRg7MgYIBBAuGEAyBggFEAAYQDIGCAYQLhhAMgYIBxBFGDwyBggIEEUYPdIBBzY5OWowajGoAgiwAgE&FORM=ANSPA1&PC=U531");
		Thread.sleep(5000);
		
		//step2.2:navigate to the application
		driver.navigate().to("https://www.bing.com/search?q=pista+house&qs=LS&pq=pista&sc=10-5&cvid=28A5A3EF1FD24877B6997B94E99D0A09&FORM=QBRE&sp=1&ghc=1&lq=0");
		Thread.sleep(5000);
		
		//step2.3: navigate to the application
		driver.navigate().to(new URL("https://www.bing.com/search?q=shah+ghouse&qs=SS&pq=sha&sc=10-3&cvid=D6EC6B08FF21455CB9AE4B1CA5EBCD7D&FORM=QBRE&sp=1&ghc=1&lq=0"));
		Thread.sleep(5000);
		
		//step3:perform backward navigation
		driver.navigate().back();
		Thread.sleep(5000);
		
		//step4:perform backward navigation
		driver.navigate().back();
		Thread.sleep(5000);
		
		//step 5:perform forward navigation
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//step 6:perform forward navigation
				driver.navigate().forward();
				Thread.sleep(5000);
				
				
		//step 7:perform refresh navigation
				driver.navigate().refresh();
				Thread.sleep(5000);
				
				
				driver.close();
		
		

	}

}
