package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericLibrary.BaseTest;

public class TC02_AddtoCart extends BaseTest {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		if(driver.getTitle().equals("Demo Web Shop. Login"))
		{
			System.out.println("Login Page Displayed");
			
		}
		else
			System.out.println("Login Page not Displayed");
		
		driver.findElement(By.id("Email")).sendKeys("Testerdisha@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Disha@13");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
