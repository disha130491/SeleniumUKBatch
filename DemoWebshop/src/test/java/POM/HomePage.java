package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	   @FindBy(linkText = "Register")
		private WebElement registerLink;
	   
		@FindBy(linkText = "Log in")
		private WebElement loginLink;
		
		@FindBy(xpath = "//span[text()= 'Shopping cart']")
		private WebElement ShoppingCartLink;
		
		@FindBy(xpath="//span[text()='Wishlist']")
		private WebElement WishListLink;
		
		@FindBy()
		private WebElement DigitalDownloadsLink;

		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public WebElement getRegisterLink() {
			return registerLink;
		}

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getShoppingCartLink() {
			return ShoppingCartLink;
		}

		public WebElement getWishListLink() {
			return WishListLink;
		}

		public WebElement getDigitalDownloadsLink() {
			return DigitalDownloadsLink;
		}
}
		
		
		

