//fetch all the hyperlink text on the webpage
//and print the text on console

package MultipleWebElement;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingRowInTable {

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
		List<WebElement> tables = driver.findElements(By.xpath("//table[@name='courses']/child::tbody/child::tr"));

		int length = tables.size();
		System.out.println("number of rows: "+length);
		

//		WebElement element = driver.findElement(By.xpath("//table[@name='courses']/child::tbody/child::tr[2]"));
//		String text = element.getText();
//		System.out.println(text);
		//WebElement element = driver.findElement(By.xpath("//table[@name='courses']/child::tbody/child::tr[1]"));

		Iterator<WebElement> itr = tables.iterator(); 

		// user choice
		int a = 9, count = 1;
		System.out.println("user choice row : "+a);
		
		while (itr.hasNext()) {
			String text = itr.next().getText();
			if (count == a) {
				System.out.println(text);
				break;
			}
			count++;
		}

		// close the browser
		driver.quit();

	}

}
