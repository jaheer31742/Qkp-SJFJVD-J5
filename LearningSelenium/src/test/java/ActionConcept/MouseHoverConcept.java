package ActionConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// lanuch the browse
		WebDriver driver = new EdgeDriver();

		// wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// navigate to the url
		driver.get("https://demo.automationtesting.in/Frames.html");

		// create the obj
		Actions actionObj = new Actions(driver);

		// mouse hover actions

		// steps1:identify the web element
		actionObj.moveToElement(driver.findElement(By.linkText("Interactions"))).perform();
		Thread.sleep(3000);

		// steps2:perform mouse hover
		actionObj.moveToElement(driver.findElement(By.partialLinkText("Drag"))).perform();
		Thread.sleep(3000);

		// step3:move to static
		actionObj.moveToElement(driver.findElement((By.partialLinkText("Static")))).perform();
		actionObj.click(driver.findElement(By.partialLinkText("Static"))).perform();
		Thread.sleep(3000);

		// perform drag and drop
		WebElement src = driver.findElement(By.xpath("(//img[@src='original.png'])[2]"));

		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));

		// perfrom action
		actionObj.dragAndDrop(src, target).perform();

		WebElement src1 = driver.findElement(By.xpath("//img[@src='logo.png']"));

//		WebElement target1 = driver.findElement(By.xpath("//div[@id='droparea']"));
//
//		// perfrom action
//		actionObj.dragAndDrop(src1, target1).perform();
		actionObj.dragAndDrop(src1, target).perform();

	}

}
