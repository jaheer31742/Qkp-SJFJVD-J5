package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate to url
		driver.get("https://www.selenium.dev/");
		
		//fetch the parent id
		String text = driver.getWindowHandle();
		
		//print on console
		
		System.out.println(text);
		
		//close the browser
		driver.quit();
	}

}
