package AssertionConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void task() {
		String expcondition = "BAKI";
		String actcondition = "BAKI";
//			
//			if(expcondition==actcondition) {
//				Reporter.log("Testpass",true);
//			}else {
//				Reporter.log("Test fail",true);
//			}
		//
		Assert.assertEquals(expcondition, actcondition);
		Assert.assertNotEquals(expcondition, actcondition);
		Assert.assertTrue(true);
		Assert.fail();

	}

}
