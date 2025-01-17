package popupsConcept;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		//configure the browser
		WebDriverManager.edgedriver().setup();
		
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//navigate to the url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
		//identify the web element
		WebElement chooseFile = driver.findElement(By.name("photo"));
		
		//create the file
		File filepath = new File("./Data/resume.txt");
		
		//take the absolute path
		String file = filepath.getAbsolutePath();

		//pass the file or data
		chooseFile.sendKeys(file);	

	}

}
