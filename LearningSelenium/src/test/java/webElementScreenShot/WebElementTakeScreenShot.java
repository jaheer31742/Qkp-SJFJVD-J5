package webElementScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to the url
		driver.get("https://www.selenium.dev/");

		// steps to take the screen shot
		// step1:identify the web element
		WebElement element = driver.findElement(By.xpath("(//*[name()='svg'])[2]"));

		// step 2:call the screen shot method and capture the screen shot

		// step3:Store in the temp path
		File from = element.getScreenshotAs(OutputType.FILE);

		// create the permanent path
		File to = new File("./TakeScreenShot/image-2.PNG");

		// copy the temp file to permanent file		
		FileHandler.copy(from, to);
		
		// close the browser
		driver.quit();

	}

}
