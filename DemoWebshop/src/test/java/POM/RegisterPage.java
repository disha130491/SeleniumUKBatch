package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
 private WebDriver driver;
 
 
 public RegisterPage(WebDriver driver) {
     this.driver = driver;
 }
 @FindBy(id="firstname")
 public void enterFirstName(String firstName) {
     driver.findElement(By.id("firstName")).sendKeys(firstName);
 }

 public void enterLastName(String lastName) {
     driver.findElement(By.id("lastName")).sendKeys(lastName);
 }

 public void enterEmail(String email) {
     driver.findElement(By.id("email")).sendKeys(email);
 }

 public void enterPassword(String password) {
     driver.findElement(By.id("password")).sendKeys(password);
 }

 public void clickRegisterButton() {
     driver.findElement(By.id("registerButton")).click();
 }

 
}

