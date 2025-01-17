package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagAttributeEnabled {
	
	@Test(enabled=true)
	public void m1() {
		Reporter.log("====add====");
	}

	@Test(enabled=false)
	public void m2() {
		Reporter.log("====sub====");
	}

}
