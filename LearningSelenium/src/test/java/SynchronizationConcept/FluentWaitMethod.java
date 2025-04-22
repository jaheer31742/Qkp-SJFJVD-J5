package SynchronizationConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// naavigate to the application
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
		// Identify the webElement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		// provide the fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		WebElement header = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement e = driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
				if (e.isDisplayed())
					return e;
				else
					return null;
			}
		});
		System.out.println(header.getText());
		driver.close();
	}

}
