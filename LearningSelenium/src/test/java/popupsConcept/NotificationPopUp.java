package popupsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//customize the browser setting
		ChromeOptions optionsObj = new ChromeOptions();
		optionsObj.addArguments("--disable-notifications");
		
		//launch the browser
		WebDriver driver= new ChromeDriver(optionsObj);
		
		//navigate to the url
		driver.get("https://www.easemytrip.com/");

	}

}
