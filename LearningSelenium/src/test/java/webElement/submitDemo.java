package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class submitDemo {

    public static void main(String[] args) throws InterruptedException {
        // Configure the browser
        WebDriverManager.edgedriver().setup();

        // Launch the browser
        WebDriver driver = new EdgeDriver();
        
        // Navigate to the registration page
        driver.get("https://demowebshop.tricentis.com/register");
        
        // Locate the "Male" radio button
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Gender:')]/../div/child::input[@id='gender-female']"));
        
        // Click on the radio button
        element.click();
        
        // Wait for 5 seconds to observe the action
        Thread.sleep(5000);
        
        // Check if the radio button is selected
        System.out.println("Is 'Male' radio button selected? " + element.isSelected());
        
        // Close the browser
        driver.close();
    }
}
