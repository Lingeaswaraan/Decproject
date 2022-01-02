package com.facebookbase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Facebook_Base {
	public static WebDriver driver;
	public static String value;
public static WebDriver browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\firefox.exe");
			driver = new FirefoxDriver();
		}
	driver.manage().window().maximize();
		return driver;
	}
public static void url(String url) {
		driver.get(url);
	}
public static void click(WebElement element) {
		element.click();
	}
public static void input(WebElement element, String text) {
		element.sendKeys(text);
	}
public static void enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("element enabled = " + enabled);
	}
public static void displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("element displayed =" + displayed);
}
public static String datadriven(int row , int column) throws IOException {
  File f = new File("C:\\Users\\acer\\Desktop\\testcases.xlsx");
  FileInputStream fis = new FileInputStream(f);
  Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetat = wb.getSheet("Facebook Test Case");
	Row row1 = sheetat.getRow(row);
	Cell cell = row1.getCell(column);
	CellType type = cell.getCellType();
	if(type.equals(CellType.STRING)) {
		value = cell.getStringCellValue();
		
	}
	else if(type.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		value = String.valueOf(numericCellValue);
		}
	else if(type.equals(CellType.BLANK)) {
		
	}
	return value;
	}
public static void deletecookies() {
driver.manage().deleteAllCookies();
}
public static void implicitwait(int seconds) {
driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
}
public static  String gettitle() {
return driver.getTitle();
}
public static  void actions(WebElement element) {
Actions ac = new Actions(driver);
ac.moveToElement(element).click().perform();
}
public static void explicitwait(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));
	
	
}

public static  String getext(WebElement element) {
      return element.getText(); 
}




}
