package ActionConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldAndReleaseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		// Mouse actions steps
		// step1: create a object for the action
		Actions actionObj = new Actions(driver);
		Thread.sleep(2000);

		// step2:identify the src web element 
		WebElement src1 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement src2 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement src4 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement src5 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement src6 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement src7 = driver.findElement(By.xpath("//div[@id='box7']"));
		
		//step3:identify the target web element
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement target5 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement target6 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement target7 = driver.findElement(By.xpath("//div[@id='box107']"));
		
		//perform actions
		actionObj.clickAndHold(src1).perform();
		actionObj.release(target1).perform();
		
		actionObj.clickAndHold(src2).perform();
		actionObj.release(target2).perform();
		
		actionObj.clickAndHold(src3).perform();
		actionObj.release(target3).perform();
		
		actionObj.clickAndHold(src4).perform();
		actionObj.release(target4).perform();
		
		actionObj.clickAndHold(src5).perform();
		actionObj.release(target5).perform();
		
		actionObj.clickAndHold(src6).perform();
		actionObj.release(target6).perform();
		
		actionObj.clickAndHold(src7).perform();
		actionObj.release(target7).perform();
		
		
		
		//==========================================
//		
//		List<WebElement> distinaion = driver.findElements(By.xpath("//div[@id='dropContent']/child::div "));
//		
//		List<WebElement> distinaion = driver.findElements(By.xpath("//div[@id='countries'] /child::div"));

	}

}
