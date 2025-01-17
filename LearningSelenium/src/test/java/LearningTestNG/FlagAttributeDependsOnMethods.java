package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagAttributeDependsOnMethods {
	
	@Test
	public void parent() {
		Reporter.log("-----parent-----");
	}
	
	
	@Test(dependsOnMethods = "parent")
	public void child() {
		Reporter.log("-----child-----");
	}

}
