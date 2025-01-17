package ListenerConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public static WebDriver staticDriver;
	
	
	@BeforeMethod
	public void m2()
	{
		
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		
		staticDriver=driver;		
		
	}
	
	@AfterMethod
	public void m3() {
		driver.close();
	}
	
	
	

}
