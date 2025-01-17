package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPropertiesForWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// configure the browser
		WebDriverManager.edgedriver().setup();

		// launch the browser
		WebDriver driver = new EdgeDriver();

		// max the browser
		driver.manage().window().maximize();

		// enter the url
		driver.get("https://rahulnxttrends.ccbp.tech/");

		// identify the name web element
		WebElement element = driver.findElement(By.xpath("//label[text()='Name']"));

		// get the text properties
		String text = element.getText();
		System.out.println("Text of the web element is: " + text);

		// get the attribute properties
		String attribute = element.getAttribute("for");
		System.out.println("Attribute for value is: " + attribute);

		// get the css value properties
		String cssValue = element.getCssValue("font-family");
		System.out.println("CssValue is: " + cssValue);

		// get the tag name properties
		String tagName = element.getTagName();
		System.out.println("Tagname is: " + tagName);

		// get the size of the web element
		Dimension size = element.getSize();
		System.out.println(size);

		// get the location of the web element
		Point location = element.getLocation();
		System.out.println(location);

		System.out.println("=============================");

		// identify the email web element
		element = driver.findElement(By.xpath("//label[text()='Email']"));

		// get the text properties
		String text1 = element.getText();
		System.out.println("Text of the web element is: " + text1);

		// get the attribute properties
		String attribute1 = element.getAttribute("for");
		System.out.println("Attribute for value is: " + attribute1);

		// get the css value properties
		String cssValue1 = element.getCssValue("font-family");
		System.out.println("CssValue is: " + cssValue1);

		// get the tag name properties
		String tagName1 = element.getTagName();
		System.out.println("Tagname is: " + tagName1);

		// get the size of the web element
		Dimension size1 = element.getSize();
		System.out.println(size1);

		// get the location of the web element
		Point location1 = element.getLocation();
		System.out.println(location1);
		System.out.println("=============================");

		// identify the passwod web element
		element = driver.findElement(By.xpath("//label[text()='Password']"));

		// get the text properties
		String text2 = element.getText();
		System.out.println("Text of the web element is: " + text2);

		// get the attribute properties
		String attribute2 = element.getAttribute("for");
		System.out.println("Attribute for value is: " + attribute2);

		// get the css value properties
		String cssValue2 = element.getCssValue("font-family");
		System.out.println("CssValue is: " + cssValue2);

		// get the tag name properties
		String tagName2 = element.getTagName();
		System.out.println("Tagname is: " + tagName2);

		// get the size of the web element
		Dimension size2 = element.getSize();
		System.out.println(size2);

		// get the location of the web element
		Point location2 = element.getLocation();
		System.out.println(location2);
		
		System.out.println("=============================");

		// identify the dropdown web element
		element = driver.findElement(By.xpath("//select[@id='country']"));
		Select countrySelect = new Select(element);
		countrySelect.selectByVisibleText("USA");

		// get the text properties
		String text3 = element.getText();
		System.out.println("Text of the web element is: " + text3);

		// get the attribute properties
		String attribute3 = element.getAttribute("for");
		System.out.println("Attribute for value is: " + attribute3);

		// get the css value properties
		String cssValue3 = element.getCssValue("font-family");
		System.out.println("CssValue is: " + cssValue3);

		// get the tag name properties
		String tagName3 = element.getTagName();
		System.out.println("Tagname is: " + tagName3);

		// get the size of the web element
		Dimension size3 = element.getSize();
		System.out.println(size3);

		// get the location of the web element
		Point location3 = element.getLocation();
		System.out.println(location3);
		
		System.out.println("=============================");

		// identify the term and condition text web element
		element = driver.findElement(By.xpath("//label[text()='I agree to the Terms & Conditions']"));
		
		// get the text properties
		String text4 = element.getText();
		System.out.println("Text of the web element is: " + text4);

		// get the attribute properties
		String attribute4 = element.getAttribute("for");
		System.out.println("Attribute for value is: " + attribute4);

		// get the css value properties
		String cssValue4 = element.getCssValue("font-family");
		System.out.println("CssValue is: " + cssValue4);

		// get the tag name properties
		String tagName4 = element.getTagName();
		System.out.println("Tagname is: " + tagName4);

		// get the size of the web element
		Dimension size4 = element.getSize();
		System.out.println(size4);

		// get the location of the web element
		Point location4 = element.getLocation();
		System.out.println(location4);

		// close the browser
		driver.quit();

	}

}
