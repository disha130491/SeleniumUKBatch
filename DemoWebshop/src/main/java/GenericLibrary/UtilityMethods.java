package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethods {
	
	private static final FluentWait<WebDriver> Wait = null;
	public String getDataProperties(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestData.proprties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);return value;
	}
	public String getDataFromExcel(String sheetName, int rownum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Book3.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		String value=sh.getRow(rownum).getCell(cellNum).toString();return value;
	}
	public static int getRandomNumber()
	{
		Random r = new Random();
		return r.nextInt(1000);
	}
	public void waitUntilInvisibilityOfElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wair = new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void takeScreenshot(WebDriver driver,String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/"+name+".png");
		try {
			FileHandler.copy(src, trg);
		}catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
