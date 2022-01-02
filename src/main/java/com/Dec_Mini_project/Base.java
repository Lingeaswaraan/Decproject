package com.Dec_Mini_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static Alert alert;
public static String handle;
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

	public static void actions(String type, WebElement element) {
		Actions b = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			b.click(element).build().perform();

		} else if (type.equalsIgnoreCase("movetoelement")) {
			b.moveToElement(element).build().perform();

		}
	}

	public static void screenshot(String name) throws IOException {
	TakesScreenshot	c = (TakesScreenshot) driver;
		File form = c.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\acer\\Downloads\\Decproject-master (1)\\Decproject-master\\Screenshots\\"+name);
		FileUtils.copyFile(form, to);
	}
	public static void sleep(int seconds) throws InterruptedException {
Thread.sleep(seconds);
	}
public static void close() {
driver.close();
}
public static void quit() {
driver.quit();
}
public static void navigate(String type , String url) {
if (type.equalsIgnoreCase("to")) {
	driver.navigate().to(url);

}
else if (type.equalsIgnoreCase("forward")) {
	driver.navigate().forward();
}
else if (type.equalsIgnoreCase("back")) {
	driver.navigate().back();
}
else if (type.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();
}
}
public static void alertmethods(String type,String value) {
if (type.equalsIgnoreCase("switchto")) {
	 alert = driver.switchTo().alert();
}
else if (type.equalsIgnoreCase("accept")) {
	driver.switchTo().alert().accept();
}
else if (type.equalsIgnoreCase("dismiss")) {
	driver.switchTo().alert().dismiss();
}
else if (type.equalsIgnoreCase("input")) {
driver.switchTo().alert().sendKeys(value);
}
else if (type.equalsIgnoreCase("gettext")) {
	String text = driver.switchTo().alert().getText();
System.out.println(text);
}

}
public static void frames(String type, String value, WebElement element ) {
if (type.equalsIgnoreCase("index")) {
	int index = Integer.parseInt(value);
	driver.switchTo().frame(index);
}
else if (type.equalsIgnoreCase("id")) {
	driver.switchTo().frame(value);
}
else if (type.equalsIgnoreCase("webelement")) {
	driver.switchTo().frame(element);
}
else if (type.equalsIgnoreCase("parentframe")) {
	driver.switchTo().parentFrame();
}
else if (type.equalsIgnoreCase("default")) {
	driver.switchTo().defaultContent();
}
}
public static void windowhandling(String type) {
if (type.equalsIgnoreCase("windowhandle")) {
	String handle = driver.getWindowHandle();
System.out.println(handle);
String title = driver.switchTo().window(handle).getTitle();
System.out.println(title);
}
else if (type.equalsIgnoreCase("windowhandles")) {
	Set<String> handles = driver.getWindowHandles();
for (String string : handles) {
		System.out.println(string);
}
}
}
public static void dropdown(String by , String value , WebElement element) {
Select s = new Select(element);
if (by.equalsIgnoreCase("index")) {
	int index = Integer.parseInt(value);
s.selectByIndex(index);
}
else if (by.equalsIgnoreCase("value")) {
	s.selectByValue(value);
}
else if (by.equalsIgnoreCase("text")) {
	s.selectByVisibleText(value);
}
else if (by.equalsIgnoreCase("deselectindex")) {
	int index = Integer.parseInt(value);
s.deselectByIndex(index);
}
else if (by.equalsIgnoreCase("deselectvalue")) {
	s.deselectByValue(value);
}
else if (by.equalsIgnoreCase("deselecttext")) {
	s.deselectByVisibleText(value);
}
else if (by.equalsIgnoreCase("deselectall")) {
	s.deselectAll();
}
else if (by.equalsIgnoreCase("ismultiple")) {
	boolean multiple = s.isMultiple();
System.out.println("is drop down is multiple or not"+multiple);
}
else if (by.equalsIgnoreCase("getoptions")) {
	List<WebElement> options = s.getOptions();
	for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
	}
	}




}


public static void attribute(WebElement element) {
String attribute = element.getAttribute("value");
System.out.println(attribute);
}
public static void enabled(WebElement element) {
boolean enabled = element.isEnabled();
System.out.println("element enabled or not "+enabled);
}
public static void displayed(WebElement element) {
boolean displayed = element.isDisplayed();
System.out.println("element displayed or not"+displayed);

}
public static void selected(WebElement element) {
boolean selected = element.isSelected();
System.out.println("element selected or not "+selected);
}

public static void frameout() {
	
driver.switchTo().defaultContent();	
	
}
public static void clear(WebElement element) {
element.clear();
}

public static String dataread(String pathname ,int sheet, int row , int cell) throws IOException {
	File f = new File(pathname);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(sheet);
	Row row2 = sheetAt.getRow(row);
	Cell cell2 = row2.getCell(cell);
	CellType cellType = cell2.getCellType();
	if (cellType.equals(CellType.STRING)) {
		 value = cell2.getStringCellValue();
		 
	}
	else if (cellType.equals(CellType.NUMERIC)) {
	double numeric =	cell2.getNumericCellValue();
value =	String.valueOf(numeric);
	}
		return value;
	}
	
	
	
}


















