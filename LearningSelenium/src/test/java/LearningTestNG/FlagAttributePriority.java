package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagAttributePriority {
	
	@Test(priority = -2)
	public void m1() {
		System.out.println("Orange");
		Reporter.log("Orange");
	}
	
	@Test(priority = 0)
	public void m2() {
		System.out.println("apple");
		Reporter.log("apple");
	}
	
	@Test()
	public void m3() {
		System.out.println("banana");
		Reporter.log("banana");
	}
	

}
