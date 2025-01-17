package e_Comm_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {
	public WebDriver driver;
	
	@Test
	public void youtube() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/");
		String expectedUrl="https://www.youtube.com/";
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl,"URLs do not match");
		
		driver.close();
		
	}

}
