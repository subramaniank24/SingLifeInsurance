package org.insta;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class cls {
	public static void main(String[] args) throws AWTException, IOException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Acer\\Desktop\\Eclipse\\org.insta\\target\\driver\\msedgedriver.exe" );	
	WebDriver driver = new EdgeDriver();
	//String st = "https://demo.guru99.com/test/drag_drop.html";
	String s = "https://www.instagram.com/?hl=en";
	driver.navigate().to(s);
	driver.manage().window().maximize();
	
//	WebElement drag = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
//	WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
//	
//	WebElement drag1 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[4]"));
//	WebElement drop1 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
//	
//	WebElement drag2 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
//	WebElement drop2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[3]"));
//	
//	WebElement drag3 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
//	WebElement drop3 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
	
	
	
	//a.dragAndDrop(drag, drop).build().perform();
	
	//Actions c = new Actions(driver);
	//c.dragAndDrop(drag1, drop1).build().perform();
	
	//Actions d = new Actions(driver);
	//d.dragAndDrop(drag2, drop2).build().perform();
	
	//Actions e = new Actions(driver);
	//e.dragAndDrop(drag3, drop3).build().perform();
	
//	TakesScreenshot ts = (TakesScreenshot)driver;
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\Acer\\Desktop\\Eclipse\\org.insta\\target\\subash.png");
//	FileUtils.copyFile(src, des);
	
WebElement user = driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]"));
    Actions a = new Actions(driver);
	a.sendKeys(user, "Subash").build().perform();
	a.doubleClick(user).build().perform();
	a.contextClick(user).build().perform(); 
	Robot b = new Robot();
	b.keyPress(KeyEvent.VK_DOWN);
	b.keyRelease(KeyEvent.VK_DOWN);
	
	b.keyPress(KeyEvent.VK_DOWN);
	b.keyRelease(KeyEvent.VK_DOWN);
	b.keyPress(KeyEvent.VK_ENTER);
	b.keyRelease(KeyEvent.VK_ENTER);
	b.keyPress(KeyEvent.VK_TAB);
	b.keyRelease(KeyEvent.VK_TAB);
	
	b.keyPress(KeyEvent.VK_CONTROL);
	b.keyPress(KeyEvent.VK_V);
	
	b.keyRelease(KeyEvent.VK_CONTROL);
	b.keyRelease(KeyEvent.VK_V);
	}

}
