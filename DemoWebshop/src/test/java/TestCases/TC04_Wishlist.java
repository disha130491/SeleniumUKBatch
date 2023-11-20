package TestCases;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import GenericLibrary.BaseTest;

	public class TC04_Wishlist extends BaseTest{

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demowebshop.tricentis.com/");

	        WebElement productLink = driver.findElement(By.linkText("Build your own computer"));

	        productLink.click();

	        WebElement addToWishlistButton = driver.findElement(By.id("add-to-wishlist-button-19"));
	        addToWishlistButton.click();

	        WebElement successMessage = driver.findElement(By.className("bar-notification"));
	        String messageText = successMessage.getText();

	        if (messageText.contains("The product has been added to your wishlist")) {
	        	
	            System.out.println("Wishlist test passed!");
	        } else {
	            System.out.println("Wishlist test failed!");
	        }

	        driver.quit();
	    }
	}