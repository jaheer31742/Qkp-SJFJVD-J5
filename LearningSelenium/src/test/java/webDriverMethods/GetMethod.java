package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//confrigure the browser		
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser		
		WebDriver driver=new ChromeDriver();
		
		//Naviagte to the application via url
		driver.get("https://www.bing.com/search?q=whatsapp+web&gs_lcrp=EgRlZGdlKgcIARBFGMIDMgcIABBFGMIDMgcIARBFGMIDMgcIAhBFGMIDMgcIAxBFGMIDMgcIBBBFGMIDMgcIBRBFGMIDMgcIBhBFGMIDMgcIBxBFGMID0gELNTE1MjIyMmowajGoAgiwAgE&FORM=ANSPA1&PC=U531");
		
		

	}

}
