package webDriverMethods;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandleOnShopperStack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// navigate to url
		driver.get("https://www.shoppersstack.com/products_page/17");

		Thread.sleep(3000);

		// identify the web element and click
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='InfoOutlinedIcon' ]")).click();

		Thread.sleep(5000);

		// fetch the parent id
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		// fetch all the child windows id and print
		Set<String> allChildId = driver.getWindowHandles();
		System.out.println(allChildId);
		Thread.sleep(5000);
		String url = "https://www.amazon.in/";
		

//		// close amazon window
//		for (String obj : allChildId) {
//			String text = driver.switchTo().window(obj).getCurrentUrl();
//			System.out.println(text);
//			Thread.sleep(10000);
//			if (text.equals(url)) {
//				driver.close();
//			}
//		}

//		// close all the window without using quit method
//		for (String obj : allChildId) {
//			driver.switchTo().window(obj);
//			Thread.sleep(5000);
//			driver.close();
//		}
		
		
		// close all the child window
//		int i=0;
//		for (String obj : allChildId) {			 
//			//Thread.sleep(5000);			
//			if(i>0) {
//				driver.switchTo().window(obj).close();
//			}
//			i++;
//			
//		}
		
		// close all the child window
//		int i=0;
//		for (String obj : allChildId) {			 
//			//Thread.sleep(5000);			
//			if(i==0) {
//				driver.switchTo().window(obj).close();
//			}
//			i++;
//			
//		}

//		//close the browser
//		driver.quit();
	}

}
