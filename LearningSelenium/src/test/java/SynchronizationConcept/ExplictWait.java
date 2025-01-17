package SynchronizationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate the url
		driver.get("https://www.shoppersstack.com/");
		
		//explict wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='loginBtn']")));
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		//close the browser
		//driver.quit();
		
		System.out.println("done");

	}

}
