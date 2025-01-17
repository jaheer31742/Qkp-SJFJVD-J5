package basicSelenium;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class userOptions {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user option");
		System.out.println("1: launch chrome \n2: launch edge \n3: launch firefox");
		switch(sc.nextInt()) {
		case 1:WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.bing.com/search?q=wha&qs=n&form=QBRE&sp=-1&ghc=1&lq=0&pq=wha&sc=12-3&sk=&cvid=0DD4A6BC267B4B80A8113434DAD0250A&ghsh=0&ghacc=0&ghpl=");
			driver.close();
			System.out.println("executed completed");
			break;
		case 2:WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get("https://www.bing.com/search?q=facebook+login&qs=AS&pq=fa&sk=HS1SS2LC1&sc=12-2&cvid=52E8A544BF9E461B806069EE3B2B6DEF&FORM=QBRE&sp=5&ghc=1&lq=0");
				driver.close();
				System.out.println("executed completed");
				break;
		case 3:WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get("https://www.bing.com/search?q=instagram+web+login&qs=MQT&pq=inst+login&sk=MQT1AS1&sc=12-10&cvid=70C71504F05C48168FDBE3E6EEA21694&FORM=QBRE&sp=3&lq=0");
				driver.close();
				System.out.println("executed completed");
				break;
		}
		

	}

}
