package dropdownconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchOnlySelectedOption_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// navigate to the browser
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
		selectObj.selectByIndex(4);
		// Thread.sleep(5000);

		// select the option-using value
		selectObj.selectByValue("cnd");
		// Thread.sleep(5000);

		// select the option-using visible text
		selectObj.selectByVisibleText("AUSTRALIA");
		// Thread.sleep(5000);
		
		List<WebElement> allSelectedOptions = selectObj.getAllSelectedOptions();
		
		int count=allSelectedOptions.size();
		System.out.println(count);
		
		int result1=0;
		for(WebElement obj:allSelectedOptions) {
			String selectedtext = allSelectedOptions.get(result1).getText();
			System.out.println(selectedtext);
			result1++;
		}
		
		System.out.println("========");
		//first selected options
		String selectFirst = selectObj.getFirstSelectedOption().getText();
		System.out.println(selectFirst);
		
		//close the browser
		driver.quit();

	}

}
