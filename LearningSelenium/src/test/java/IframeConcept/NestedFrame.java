package IframeConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Configure the Browser
		WebDriverManager.edgedriver().setup();

		// Step1:- Launch the Web Browser
		WebDriver driver = new EdgeDriver();

		// Step2:- Maximize the Web Browser
		driver.manage().window().maximize();

		
		// Step3:- Navigate to the Application via URL
		driver.get("https://demo.automationtesting.in/Frames.html");

		// Step4:- Click on the "iframe with in a iframe" Button
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// Step5:- Switch the Control from the MainPage to the frame
		driver.switchTo().frame(1).switchTo().frame(0);

		Thread.sleep(3000);
		// Step6:- Enter the Data inside the Frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jaheer");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rangareddy");

//		// Step7:- Switch back the Control from the Inner Frame to the Immediate Parent
//		// Frame
//		driver.switchTo().parentFrame();
//
//		// Step8:- Fetch the Text and Print it on the Console
//		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
//		System.out.println(text);
//
//		// Step9:- Switch back to the driver control to the Main page
//		driver.switchTo().defaultContent();
//
//		// Step10:- Fetch the Text from the Main Page and print it on the Console
//		System.out.println(driver.findElement(By.xpath("//h1[text()='Automation Demo Site']")).getText());
//
//		// Step11:- Close the Web Browser
//		driver.close();

	}

}
