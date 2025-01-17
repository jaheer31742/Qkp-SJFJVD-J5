package ListenerConcept;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementTestScript extends BaseTest implements ITestListener {

	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getName();
		
		 String timeStamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)BaseTest.staticDriver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./TakeScreenShot/"+methodName+timeStamp+".png");
		
		try {
			FileHandler.copy(file, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("take screen shot");
	}

	

}
