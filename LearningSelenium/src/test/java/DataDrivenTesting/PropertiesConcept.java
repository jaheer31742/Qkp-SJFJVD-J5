package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesConcept {
	
	@Test
	public void FetchProperty() throws IOException {
		
		//Steps to fetch the data from the external resource --property file
		
		//step 1.convert the physical file into java understandable
		FileInputStream fis = new FileInputStream("./Data/CommonData.properties");
		
		
		//step 2.create an object for the properties class
		Properties propertyObj = new Properties();
		
		//step 3.call the non static method---to load the property
		
		propertyObj.load(fis);
		
		//step 4.call the non static method--to fetch the property value--by passing propertykey/name
		
		String text = propertyObj.getProperty("password");
		System.out.println(text);
	}

}
