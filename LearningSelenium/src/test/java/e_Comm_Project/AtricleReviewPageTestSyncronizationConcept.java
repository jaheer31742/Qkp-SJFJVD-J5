package e_Comm_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AtricleReviewPageTestSyncronizationConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//navigate to the ul
		driver.get("https://qaarticlervw.ccbp.tech/article/");
		
		//print the title
		System.out.println(driver.getTitle());
		
		//click on the write review button
		driver.findElement(By.tagName("button")).click();
		WebElement element = driver.findElement(By.tagName("button"));
		
		WebDriverWait explictWait = new WebDriverWait(driver,5);
		explictWait.until(ExpectedConditions.visibilityOf(element));
		
		//validate the url
		String expectedUrl="https://qaarticlervw.ccbp.tech/review";
		String acutalUrl=driver.getCurrentUrl();
		if(expectedUrl.endsWith(acutalUrl)) {
			System.out.println("Navigated to Review page");
		}
		else {
			System.out.println("Not Navigated to Review page");
		}
		
		
		//enter the text review field
		driver.findElement(By.xpath("//textarea[@id='reviewTextArea']")).sendKeys("Clear and thoughtful explanation of React's versioning approach.");;
		driver.findElement(By.tagName("button")).click();
		
		//wait for 5 second
		//Thread.sleep(5000);
		explictWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='review-btn']")));
		
		//validate the current url
		String expectedCurrentUrl="https://qaarticlervw.ccbp.tech/article";
		String acutalCyrrentUrl=driver.getCurrentUrl();
		System.out.println(acutalCyrrentUrl);
		
		if(expectedCurrentUrl.equals(acutalCyrrentUrl)) {
			System.out.println("Navigated to Article page");
		}
		else {
			System.out.println("Not Navigated to Article page");
		}
		
		//close the browser
		driver.quit();
		
	}

}
