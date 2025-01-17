package PurchaseProduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForOrderProduct extends BaseClass  {
	
	//find the web elements
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement chooseSixthProduct; 
	
	@FindBy(xpath = "//button[contains(text(),'cart')]")
	private WebElement addToCart ;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement checkOut;
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement pinCode;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//button[text()='Finish']")
	private WebElement finishButton;
	
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement openMenu;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	//create the constructor
	public PomForOrderProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	


	public WebElement getOpenMenu() {
		return openMenu;
	}





	public WebElement getLogout() {
		return logout;
	}





	public WebElement getChooseSixthProduct() {
		return chooseSixthProduct;
	}


	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getCartIcon() {
		return cartIcon;
	}


	public WebElement getCheckOut() {
		return checkOut;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getPinCode() {
		return pinCode;
	}


	public WebElement getContinueButton() {
		return continueButton;
	}


	public WebElement getFinishButton() {
		return finishButton;
	}







}
