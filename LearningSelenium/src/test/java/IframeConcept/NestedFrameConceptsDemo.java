package IframeConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameConceptsDemo {

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

	}

}
