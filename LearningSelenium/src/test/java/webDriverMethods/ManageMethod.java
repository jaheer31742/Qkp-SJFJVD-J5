package webDriverMethods;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		Thread.sleep(5000);
		
		Dimension size=new Dimension(500,500);
		
		
		driver.manage().window().setSize(size);
		Thread.sleep(5000);
		
		Point position=new Point(200,200);
		driver.manage().window().setPosition(position);
		
		
		//driver.manage().window().minimize();//with help of return value of method ,
		//we will call another method this process we will call it is as method chaining
		
		/*Options optionObj=driver.manage();
		
		Window windowsObj=optionObj.window();
		
		windowsObj.maximize();
		
		windowsObj.fullscreen();*/
		
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
