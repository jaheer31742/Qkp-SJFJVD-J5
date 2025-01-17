package dropdownconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FecthAllSelectedOptions_text {

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
		// Thread.sleep(5000);

		// select the option-using value
		selectObj.selectByValue("cnd");
		// Thread.sleep(5000);

		// select the option-using visible text
		selectObj.selectByVisibleText("AUSTRALIA");
		// Thread.sleep(5000);

		// fetch all the selected options text
		List<WebElement> allOptions = selectObj.getAllSelectedOptions();

		// count the options
		int count = allOptions.size();
		System.out.println(count);
		
		//print the selected options
		for(int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		
		
		
		//close the browser
		driver.quit();

	}

}





////configure the browser
//		WebDriverManager.edgedriver().setup();
//		// step 1:launch the browser
//		WebDriver driver = new EdgeDriver();
//
//		// navigate to url
//		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
//
//		// identify the web dropdown
//		WebElement dropdown1 = driver.findElement(By.name("country1"));
//		WebElement dropdown2 = driver.findElement(By.name("country2"));
//
//		// create an object for select class
//		Select selectObj = new Select(dropdown2);
//
//		// validate the dropdown
//		boolean result = selectObj.isMultiple();
//
//		// test log
//		if (result) {
//			System.out.println("Dropdown verified:it is multiple select dropdown");
//		} else {
//			System.out.println("Dropdown verified:it is single select dropdown");
//		}
//
//		Thread.sleep(5000);
//
//		// select the option-using index
//		selectObj.selectByIndex(0);
//		// Thread.sleep(5000);
//
//		// select the option-using value
//		selectObj.selectByValue("cnd");
//		// Thread.sleep(5000);
//
//		// select the option-using visible text
//		selectObj.selectByVisibleText("AUSTRALIA");
//		// Thread.sleep(5000);
//
//		// fetch all the selected options text
//		List<WebElement> allOptions = selectObj.getAllSelectedOptions();
//
//		// count the options
//		int count = allOptions.size();
//		System.out.println(count);
//
//		// print the selected options
//		for (int i = 0; i < count; i++) {
//			String text = allOptions.get(i).getText();
//			System.out.println(text);
//		}
//		
//		//fetch the first selected options
//		String firstSelected = selectObj.getFirstSelectedOption().getText();
//		System.out.println(firstSelected);
//
//		// close the browser
//		driver.quit();

