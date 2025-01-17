package ActionConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionConcepts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://www.google.com/");

		// keyboard actions steps
		// step1: create a object for the action
		 Robot roboObj = new Robot();
		Thread.sleep(2000);
		
		
		
		//call the shift method
		//roboObj.keyPress(KeyEvent.VK_SHIFT);
		
//		//call nonstatic actions
//		roboObj.keyPress(KeyEvent.VK_J);
//		roboObj.keyRelease(KeyEvent.VK_J);
//		
//		roboObj.keyPress(KeyEvent.VK_A);
//		roboObj.keyRelease(KeyEvent.VK_A);
//		
//		roboObj.keyPress(KeyEvent.VK_H);
//		roboObj.keyRelease(KeyEvent.VK_H);
//		
//		roboObj.keyPress(KeyEvent.VK_E);
//		roboObj.keyRelease(KeyEvent.VK_E);
//		
//		roboObj.keyPress(KeyEvent.VK_E);
//		roboObj.keyRelease(KeyEvent.VK_E);
//		
//		roboObj.keyPress(KeyEvent.VK_R);		
//		roboObj.keyRelease(KeyEvent.VK_R);
//		
//		//roboObj.keyRelease(KeyEvent.VK_SHIFT);
		
		//create action class
		Actions actionObj = new Actions(driver);
		
		//actionObj.sendKeys("jaheer",Keys.ENTER).perform();
		
		actionObj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		

	}

}
