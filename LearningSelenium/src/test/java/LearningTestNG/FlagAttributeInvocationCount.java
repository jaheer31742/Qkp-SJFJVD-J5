package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagAttributeInvocationCount {
	
	@Test(invocationCount = 10)
	public void orange() {
		Reporter.log("orange",true);
	}

}
