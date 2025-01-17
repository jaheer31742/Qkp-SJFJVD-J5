package PurchaseProduct;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();

		//
		TakesScreenshot ts = (TakesScreenshot)BaseClass.staticDriver;

		// create a temp file
		File src = ts.getScreenshotAs(OutputType.FILE);

		// create the perm file
		File dest = new File("./TakeScreenShot/" + methodName + ".png");

		// F
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
