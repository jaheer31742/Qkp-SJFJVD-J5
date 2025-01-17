package LearningTestRetry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver staticDriver;
	
	
	@BeforeMethod
	public void configure() {
		
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		staticDriver=driver;		
	}
	
	
	

}
