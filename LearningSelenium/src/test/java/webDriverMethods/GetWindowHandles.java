package webDriverMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to url
		driver.get("https://www.selenium.dev/");

		// fetch the parent id
		Set<String> text = driver.getWindowHandles();
		
	 for (Iterator iterator = text.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
		
	}

		// print on console
		System.out.println(text);

		// close the browser
		driver.quit();

	}

}
