package webElementScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate the url
		driver.get("https://rahulnxttrends.ccbp.tech/");
		
		//max the browser
		driver.manage().window().maximize();
		
		//steps to take screen shot
		//step1:perform type casting from web dive type to take screen shot type
		TakesScreenshot tsObj =(TakesScreenshot) driver;
		
		//step2:call the method screen shot 
		//step3:store the capture screen shot in temp path
		File screenShot = tsObj.getScreenshotAs(OutputType.FILE);

		//step4:create the permanent  path
		File destination = new File("./TakeScreenShot/image-4.png");
	
		//copy the temp path to the permanent path
		FileHandler.copy(screenShot, destination);
		
		//close the bowser
		driver.quit();
		
	
	}

}
