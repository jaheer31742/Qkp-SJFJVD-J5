package popupsConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childWindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();
		// step 1:launch the browser
		WebDriver driver = new EdgeDriver();

		//implict wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// navigate to url
		driver.get("https://www.shoppersstack.com/");
		
		//identify the web element
		driver.findElement(By.xpath("//a[@id='men']")).click();
		
		//validate the url
		String expectedUrl="https://www.shoppersstack.com/men";
		String actualUrl=driver.getCurrentUrl();
		
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("enter the correct page");
		}else {
			System.out.println("enter the wrong page");
		}
		
		//identify the web element
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/452/542/xif0q/kurta/g/w/d/xxl-ko-637purple-jompers-original-imafz2qk85uzxq5x-bb.jpeg?q=50']")).click();

		//execution log
		System.out.println("execution done");
	}

}
