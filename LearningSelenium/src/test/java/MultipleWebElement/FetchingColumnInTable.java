package MultipleWebElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingColumnInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// max the browser
		driver.manage().window().maximize();

		// enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// identify the web table
		List<WebElement> tables = driver.findElements(
				By.xpath("//div[@class='tableFixHead']/child::table/child::tbody/child::tr/child::td[3]"));

		// find the length
		int length = tables.size();
		System.out.println("Number of city : " + length);

		/*
		 * // // identify the user column choice web element // WebElement element =
		 * driver // .findElement(By.xpath(
		 * "//div[@class='tableFixHead']/child::table/child::thead/child::tr/child::th[3]"
		 * )); // String columnText = element.getText(); //
		 * System.out.println(columnText);
		 */

		// looping statement
		Iterator<WebElement> itr = tables.iterator();
		while (itr.hasNext()) {
			String text = itr.next().getText();
			System.out.println(text);
		}

		// close the browser
		driver.quit();

	}

}
