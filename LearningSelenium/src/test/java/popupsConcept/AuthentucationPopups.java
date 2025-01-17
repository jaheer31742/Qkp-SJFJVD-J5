package popupsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthentucationPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// configure the browser
		WebDriverManager.chromedriver().setup();

		// launch the browser
		WebDriver driver = new ChromeDriver();
		
		//handle the authentication popups
		String username="admin";
		String password="admin";
		String url="https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";		

		// navigate to the url
		driver.get(url);

	}

}


