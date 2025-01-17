package ListenerConcept;


import static org.testng.Assert.fail;

import  org.testng.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(ListenerConcept.ImplementTestScript.class)
public class TestScript extends BaseTest {
	
	@Test
	public void m1() {
		
		Assert.fail();
		
	}

}
