package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;

public class TC01_Registration extends BaseTest{

	@Test
	public void registerTestCase() {
		
		
		driver.findElement(By.partialLinkText("Regis")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Test13");
		driver.findElement(By.name("LastName")).sendKeys("Trivedi");
		driver.findElement(By.name("Email")).sendKeys("Testerdisha@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Disha@13");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Disha@13");
		driver.findElement(By.name("register-button")).click();
		String expText=driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		if(expText.equals("Your registration completed"))
		{
			System.out.println("Register Test Case Pass");
	
		}
		else
			System.out.println("Register Test Case Fail");
	}

}
