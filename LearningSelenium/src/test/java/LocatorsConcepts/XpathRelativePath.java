package LocatorsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRelativePath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// step 1:configure the webdriver
				WebDriverManager.edgedriver().setup();

				// step 2:create the object
				WebDriver driver = new EdgeDriver();

				// step 3:launch the browser
				driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
				Thread.sleep(1000);

				// step 4:max the browser
				driver.manage().window().maximize();
				Thread.sleep(1000);

				// step 5:identify the name web element
				WebElement element = driver.findElement(By.xpath("//input[@value='Tillu Radhika']"));
				Thread.sleep(1000);

				// step 6:clear the text in the name text field
				element.clear();

				// step 6:enter the inputs
				element.sendKeys("jaheer");
				Thread.sleep(1000);

				// step 7:identify the email web element
				element=driver.findElement(By.xpath("//input[contains(@type,'email')]"));
				Thread.sleep(1000);

				// step 8:enter the inputs
				element.sendKeys("jaheer@gmail.com");
				Thread.sleep(1000);

				// step 9:identify the password web element
				element=driver.findElement(By.xpath("//input[@id='password']"));
				Thread.sleep(1000);

				// step 10:enter the inputs
				element.sendKeys("1234");
				Thread.sleep(1000);

				// step 11:identify the mobile no web element
				element=driver.findElement(By.xpath("//input[contains(@type,'tel')]"));
				Thread.sleep(1000);

				// step 12:enter the inputs
				element.sendKeys("123456789");
				Thread.sleep(1000);

				// step 13:identify the dob web element
				element=driver.findElement(By.xpath("//input[@type='datetime-local']"));
				Thread.sleep(1000);

				// step 14:enter the inputs
				element.sendKeys("03-November-2024,7:45");
				Thread.sleep(1000);

				// step 15:identify the gender web element
				element=driver.findElement(By.xpath("//label[text()='Female']"));
				Thread.sleep(1000);

				// step 16:enter the inputs
				element.click();
				Thread.sleep(1000);

				// step 17:identify the place web element to uncheck
				element=driver.findElement(By.xpath("//label[contains(text(),'GOA')]"));
				Thread.sleep(1000);

				// step 18:uncheck the check box
				element.click();

				// step 19:identify the place web element
				element=driver.findElement(By.xpath("//label[contains(text(),'Manali')]"));
				Thread.sleep(1000);

				// step 20:click on the inputs
				element.click();
				Thread.sleep(1000);

				// step 21:identify the country web element
				element=driver.findElement(By.xpath("//option[text()='AUSTRALIA']"));
				Thread.sleep(1000);

				// step 22:click on the inputs
				element.click();
				Thread.sleep(1000);

				// step 23:identify the feedback web element
				element=driver.findElement(By.xpath("//textarea[contains(@id,'feedback')]"));
				Thread.sleep(1000);

				// step 24:enter the inputs
				element.sendKeys("sk jaheer basha");
				Thread.sleep(1000);

				/*step 25:identify the upload file web element
				driver.findElement(By.xpath("html/body/form/fieldset/table/tbody/tr[10]/td[2]/input"));
				Thread.sleep(1000);

				// step 26:click on the inputs
				element.click();
				Thread.sleep(1000);*/
				
				//step 25:identify the contact us web element
				element=driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
				Thread.sleep(1000);

				// step 26:click on the inputs
				element.click();
				Thread.sleep(1000);
				
				

				// step 27:close the browser

				driver.close();


	}

}
