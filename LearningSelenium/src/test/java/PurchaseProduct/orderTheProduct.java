package PurchaseProduct;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(PurchaseProduct.ListenerClass.class)
public class orderTheProduct extends BaseClass {



	@Test
	public void order() throws EncryptedDocumentException, IOException, InterruptedException {

		// create an object for the PomForOrderProduct class
		PomForOrderProduct pfop = new PomForOrderProduct(driver);

		// call the methods

		// select the sixth product
		pfop.getChooseSixthProduct().click();
		Thread.sleep(3000);
		
		// click on the add to cart button
		pfop.getAddToCart().click();
		Thread.sleep(3000);

		// click on the cart icon
		pfop.getCartIcon().click();
		Thread.sleep(3000);

		// click on the check out button
		pfop.getCheckOut().click();
		Thread.sleep(3000);

		// enter the details in the first name
		pfop.getFirstName().sendKeys("jaheer");
		Thread.sleep(3000);
		
		//enter the details in the last name
		pfop.getLastName().sendKeys("basha");
		Thread.sleep(3000);
		
		//enter the details in the pin code
		pfop.getPinCode().sendKeys("522124");
		Thread.sleep(3000);
		
		//click on the continue button
		pfop.getContinueButton().click();
		Thread.sleep(3000);
		
		//click on the finish button
		pfop.getFinishButton().click();
		Thread.sleep(3000);
		
		//click on the open menu
		pfop.getOpenMenu().click();
		Thread.sleep(3000);
		
		//click on the logout
		pfop.getLogout().click();
		
		
		

	}
}
