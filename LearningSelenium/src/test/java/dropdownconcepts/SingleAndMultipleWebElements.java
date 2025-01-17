package dropdownconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleAndMultipleWebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.edgedriver().setup();
		// step 1:launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");

		// identify the web dropdown
		WebElement dropdown1 = driver.findElement(By.name("country1"));
		WebElement dropdown2 = driver.findElement(By.name("country2"));

		// create an object for select class
		Select selectObj = new Select(dropdown2);

		// validate the dropdown
		boolean result = selectObj.isMultiple();

		// test log
		if (result) {
			System.out.println("Dropdown verified:it is multiple select dropdown");
		} else {
			System.out.println("Dropdown verified:it is single select dropdown");
		}

		Thread.sleep(5000);

		// select the option-using index
		selectObj.selectByIndex(0);
		//Thread.sleep(5000);

		// select the option-using value
		selectObj.selectByValue("cnd");
		//Thread.sleep(5000);

		// select the option-using visible text
		selectObj.selectByVisibleText("AUSTRALIA");
		//Thread.sleep(5000);
		
		//deselect the options
		//selectObj.deselectAll();
		//Thread.sleep(5000);

		// fetch the dropdown text
		List<WebElement> allOptions = selectObj.getOptions();

		// count the options
		int count = allOptions.size();

		// print the options
		for (WebElement obj : allOptions) {
			String text = obj.getText();
			System.out.println(text);
		}
		
		System.out.println("============");
		//alternative method
		WebElement allOption_alternative = selectObj.getWrappedElement();
		String text_alternative = allOption_alternative.getText();	
		
		
		System.out.println(text_alternative);
		
		
		//
		

		// execution log
		System.out.println("execution completed");

		// close the browser
		driver.quit();
	}

}
