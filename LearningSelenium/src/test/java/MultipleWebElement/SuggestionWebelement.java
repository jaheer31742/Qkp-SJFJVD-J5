package MultipleWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Configure the browser
		WebDriverManager.edgedriver().setup();

		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// Customize the browser
		driver.manage().window().maximize();

		// Navigate to the browser
		driver.get("https://www.google.com/");

		// Find the Hyderabad image button
		WebElement Searchbox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Thread.sleep(5000);

		// Enter the data on this
		Searchbox.click();
		Searchbox.sendKeys("selenium");
		Thread.sleep(5000);
		// Find the Hyderabad image button
		List<WebElement> textofdropdown = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li/div/div[2]"));	

		int count = textofdropdown.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = textofdropdown.get(i).getText();
			System.out.println(i +1+ "> " + text);
		}	

		driver.close();

	}

}
