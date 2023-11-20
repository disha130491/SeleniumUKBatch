package TestCases;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import GenericLibrary.BaseTest;

	public class TC03_EmptyCart extends BaseTest {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demowebshop.tricentis.com");

	        WebElement cartLink = driver.findElement(By.cssSelector("a.ico-cart"));
	        cartLink.click();

	        WebElement emptyCartMessage = driver.findElement(By.cssSelector("div.no-data"));
	        String actualMessage = emptyCartMessage.getText();
	        String expectedMessage = "Shopping Cart is empty!";

	        if (actualMessage.equals(expectedMessage)) {
	            System.out.println("Empty Cart Test Case Passed!");
	        } else {
	            System.out.println("Empty Cart Test Case Failed. Actual message: " + actualMessage);
	        }

	        driver.quit();
	    }
	}