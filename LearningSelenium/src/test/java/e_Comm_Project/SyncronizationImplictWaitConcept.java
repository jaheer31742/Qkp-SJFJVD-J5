package e_Comm_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncronizationImplictWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate to the url
		driver.get("https://qanewsltrpls.ccbp.tech/");
		
		//add implict wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//identify the name web element
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John Doe");
		
		//enter the input details in the web element
		
		
		//click on the continue button
		driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
		
		//identify the phone number web element
		driver.findElement(By.xpath("//input[@id='phonenum']")).sendKeys("9876543210");
		
		//enter the input details in the web elements
		
		//click on the continue button
		driver.findElement(By.xpath("(//button[text()='Continue'])[2]")).click();
		
		//identify the email web element
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("john@gmail.com");
		
		//enter the input details in the web element
		
		//click on the continue button
		driver.findElement(By.xpath("(//button[text()='Continue'])[3]")).click();
		
		//click on the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//print the success message
		WebElement element = driver.findElement(By.xpath("//p[text()='Subscribed successfully']"));
		String text = element.getText();
		System.out.println(text);
		
		//close the browser
		driver.quit();
		
		

	}

}
