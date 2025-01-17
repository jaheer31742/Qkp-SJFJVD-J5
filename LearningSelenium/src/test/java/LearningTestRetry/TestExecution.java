package LearningTestRetry;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass {
	
	@Test(retryAnalyzer = LearningTestRetry.ListenerRetryImplementationClass.class)
	public void m1()  {
		
		Reporter.log("m1 method executed",true);
		Assert.fail();
	}
	

}
