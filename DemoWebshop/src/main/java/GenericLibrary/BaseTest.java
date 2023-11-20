package GenericLibrary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected ChromeDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@BeforeMethod
public void performLogin()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("Testerdisha@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Disha@13");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@AfterMethod
public void performLogout()
{
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}

