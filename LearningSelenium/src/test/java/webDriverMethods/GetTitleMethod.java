package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//confrigure the browser		
		WebDriverManager.edgedriver().setup();
				
		//Launch the browser		
		WebDriver driver=new EdgeDriver();
		
		//enter url
		driver.get("file:///C:/Users/Jaheer/Downloads/Compressed/webpage.html");
		
		//Fetch the  tit"le of webpage
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
				
				
	}

}
