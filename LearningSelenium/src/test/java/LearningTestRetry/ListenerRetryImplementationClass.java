package LearningTestRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenerRetryImplementationClass extends BaseClass implements IRetryAnalyzer{
	
	int count=1;

	@Override
	public boolean retry(ITestResult result) {
		
		int retryUntil=5;
		
		
		boolean flag=false;
		
		if (count<retryUntil) {
			
			count++;
			flag=true;
			
		}		
		return flag;
	}
	
	
	
	

}
