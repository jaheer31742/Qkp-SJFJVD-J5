package HandlingNewWindowsAnTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNewTab {

	@Test
	public void newTab() {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://saucedemo.com");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://saucedemo.com");

		driver.quit();

	}

}
