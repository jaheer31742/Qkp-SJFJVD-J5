package basicSelenium;

import org.openqa.selenium.WebDriver;
import java.util.Scanner;

public class LaunchBrowserByMethods {
	public static WebDriver drive=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		LaunchBrowser(sc.next());
		System.out.println("execution done");
		}
	public static void LaunchBrowser(String s) {
		
	}

}
