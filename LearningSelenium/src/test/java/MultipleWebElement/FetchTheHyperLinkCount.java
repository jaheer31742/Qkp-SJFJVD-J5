package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchTheHyperLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// max the browser
		driver.manage().window().maximize();

		// enter the url
		driver.get("https://www.zomato.com/");
		
		//identify the all hyper link 
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		
		int count = allLink.size();
		System.out.println(count);

		for(int i=0;i<count;i++) {
			String text = allLink.get(i).getText();
			System.out.println(i+1+">"+text);
		}
	}

}
