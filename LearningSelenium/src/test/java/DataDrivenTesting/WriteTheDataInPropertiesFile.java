package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteTheDataInPropertiesFile {	

	@Test
	public void FetchProperty() throws IOException {
		
		//Steps to write the data from the external resource --property file
		
		//step 1.convert the physical file into java understandable
		FileInputStream fis = new FileInputStream("./Data/CommonData.properties");		
		
		//step 2.create an object for the properties class
		Properties propertyObj = new Properties();
		
		//step 3.call the non static method---to load the property
		
		propertyObj.load(fis);
		
		//step 4.call the non static method--to write the property value--by passing propertykey/name
		propertyObj.put("browsername", "chrome");
		
		//step 5.convert the  to property file
		FileOutputStream fos = new FileOutputStream("./Data/CommonData.properties");
		
		//step 6.save
		propertyObj.store(fos, "upload latest file");

}
}
