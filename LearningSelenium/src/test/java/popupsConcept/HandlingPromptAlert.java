package popupsConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPromptAlert {

    public static void main(String[] args) throws InterruptedException {
        // Configure the browser
        WebDriverManager.edgedriver().setup();

        // Launch the browser
        WebDriver driver = new EdgeDriver();

        try {
            // Navigate to the URL
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // Identify the web element
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            // Explicit wait for the alert
            WebDriverWait explictWait = new WebDriverWait(driver, 20);
            explictWait.until(ExpectedConditions.alertIsPresent());

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Fetch and print the alert text
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);

            // Enter text into the prompt
            alert.sendKeys("jaheer");
            Thread.sleep(5000);

            // Accept the alert
            alert.accept();

            // Verify result on the page
            String resultText = driver.findElement(By.id("result")).getText();
            System.out.println("Result Text: " + resultText);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

