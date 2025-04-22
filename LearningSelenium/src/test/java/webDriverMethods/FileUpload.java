package webDriverMethods;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=42");
		
		driver.findElement(By.xpath("//button[@id='button-upload222']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Jaheer\\Desktop\\fileUpload.exe");
		
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.alertIsPresent()); 
        		

        Thread.sleep(10000);
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//Thread.sleep(2000);
		alert.accept();
		System.out.println("execution done");
		
}
}
