package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPropertiesConcept {
	public static void main(String[] args) {
		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();
		System.out.println("execution starts");
		
		//max the browser
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		// identify the web element
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Selenium')]"));

		// get the text
		String text = element.getText();
		System.out.println("Text is:" + text);

		// get the attribute value
		String attributValue = element.getAttribute("class");
		System.out.println("Attribute value is:" + attributValue);

		// get the cssValue
		String cssValue = element.getCssValue("font-size");
		System.out.println("Css value is " + cssValue);

		// get the tag name
		String tagname = element.getTagName();
		System.out.println("Tagname is:" + tagname);

		// get the size
		Dimension size = element.getSize();
		System.out.println("Size of the element:" + size);
		System.out.println("Size of the element:" + size.height);
		// get the location
		Point location = element.getLocation();
		System.out.println("Location is :" + location);
		System.out.println("Location is :" + location.getX());
		System.out.println("Location is :" + location.getY());

		
		Rectangle rectangle = element.getRect();
		int height = rectangle.getHeight();
		
		

		// execution done
		System.out.println("execution done");
		driver.quit();

	}

}
