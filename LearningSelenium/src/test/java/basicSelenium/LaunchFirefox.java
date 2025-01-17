package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bing.com/search?q=what&cvid=35fcf89703fd492aae21bcbeb12a1376&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEEUYOzIGCAQQLhhAMgYIBRAAGEAyBggGEEUYPDIGCAcQRRg9MgYICBBFGD3SAQg0NDYwajBqN6gCCLACAQ&FORM=ANSPA1&PC=U531");
		driver.close();
		System.out.println("executed done");
	}

}
