package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {
		
		//configure the browser
		WebDriverManager.chromedriver().setup();
		
		//step 1:launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/search?q=what&cvid=35fcf89703fd492aae21bcbeb12a1376&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEEUYOzIGCAQQLhhAMgYIBRAAGEAyBggGEEUYPDIGCAcQRRg9MgYICBBFGD3SAQg0NDYwajBqN6gCCLACAQ&FORM=ANSPA1&PC=U531");
		driver.close();
		System.out.println("executed done");
	}

}
