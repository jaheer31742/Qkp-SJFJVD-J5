package HandlingNewWindowsAnTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNewWindows {

	// int count = 0;
	@Test
	public void newWindow() {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://saucedemo.com");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://saucedemo.com");

		driver.quit();

	}

}
