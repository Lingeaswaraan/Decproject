package com.Dec_Mini_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner_class extends Base {
	public static void main(String[] args) throws InterruptedException, IOException {
		browser("chrome");
	driver.manage().window().maximize();
	driver.navigate().to("http://automationpractice.com/index.php");
	Actions b = new Actions(driver);
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	b.click(sign).build().perform();
	WebElement email = driver.findElement(By.id("email"));
 email.	sendKeys("lingeshwaraan@gmail.com");

	driver.findElement(By.id("passwd")).sendKeys("12345");
	driver.findElement(By.id("SubmitLogin")).click();
	driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@itemprop='image']")).click();
	WebElement frame = driver.findElement(By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=1&controller=product&content_only=1']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//button[@class='exclusive']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	WebElement procceed = driver.findElement(By.xpath("(//a[@rel='nofollow'])[6]"));
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(procceed));
	b.moveToElement(procceed).build().perform();
	b.click(procceed).build().perform();
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	WebElement check = driver.findElement(By.id("cgv"));
	b.click(check).build().perform();
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='cheque']")).click();
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(5000);
	TakesScreenshot d = (TakesScreenshot) driver ;
	File from = d.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\acer\\eclipse-workspace\\Dec_Mini_project\\Screenshots\\photos.png");
	FileUtils.copyFile(from, to);





	
	
	
	
	
	
	
	
	
	}

}
