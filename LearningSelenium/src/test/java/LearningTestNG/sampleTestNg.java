package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sampleTestNg {
	
	@BeforeClass
	public void BC() {
		Reporter.log("before class",true);
	}
	
	@BeforeMethod
	public void BM() {
		Reporter.log("BEFORE METHOD",true);
	}
	
	
	@Test
	public void demo() {
		Reporter.log("hi",true);
	}
	
	@AfterMethod
	public void AM() {
		Reporter.log("after method",true);
	}
	
	@AfterClass
	public void AC() {
		Reporter.log("after class",true);
	}
	
	

}
