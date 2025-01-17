package e_Comm_Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoMateTheApplicationByJavaConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1: configure the web Driver Manager
		WebDriverManager.edgedriver().setup();

		// step 2:launch the browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulnxttrends.ccbp.tech/");

		// max the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// step 3: create a collection or list
		List<String> l = new ArrayList();
		l.add("Jaheer");
		l.add("karishma");
		l.add("taj");
		l.add("shaik");
		l.add("basha");
		// System.out.println(l);

		Iterator<String> itr = l.iterator();
		//step 4:identify the name web element
		WebElement element = driver.findElement(By.xpath("//input[@name='name']"));
		
		// step :iterator the list in the name web element
		while (itr.hasNext()) {
			String result=itr.next();
			System.out.println(result);
			element.clear();
			element.sendKeys(result);
			Thread.sleep(2000);
		}
		
		//close the browser
		driver.quit();

//		for( String s:l) {
//			System.out.println(s);
//		}

	

	}

}
