package LearningTestNG;

import java.lang.annotation.Repeatable;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlagAttributeDataProvider {
	
	@DataProvider
	public Object[][] details() {
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="jaheer";
		obj[0][1]="Testing";
		
		obj[1][0]="karishma";
		obj[1][1]="Development";
		
		return obj;
		
	}
	
	@Test(dataProvider = "details")
		public void employee(String name,String dept) {
		
		
		Reporter.log("Name is:"+name,true);
		Reporter.log("Dept is:"+dept,true);
		System.out.println("--------------");	
		}
}


