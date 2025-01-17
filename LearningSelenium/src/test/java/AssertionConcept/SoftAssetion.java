package AssertionConcept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetion {

	@Test
	public void task() {
		String exp = "solo";
		String act = "leveling";

		SoftAssert softobj = new SoftAssert();

		softobj.assertEquals(exp, act);
		System.out.println("hurrey");
		softobj.assertNotEquals(exp, act);
		System.out.println("huppa");
		softobj.assertAll();
		System.out.println("close");

	}

}
