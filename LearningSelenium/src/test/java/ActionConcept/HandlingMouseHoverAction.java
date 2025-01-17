package ActionConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//navigate to the url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//Mouse actions steps
		//step1: create a object for the action
		Actions actionObj = new Actions(driver);
		Thread.sleep(2000);
		
		//step2:
		WebElement src = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='box103']"));
		actionObj.dragAndDrop(src, target).perform();

	}

}
