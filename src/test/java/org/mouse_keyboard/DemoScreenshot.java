package org.mouse_keyboard;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreenshot {
	public static WebDriver driver = null;
	
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tks = (TakesScreenshot)driver; //we are downcasting to the driver
		
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/facebook" +System.currentTimeMillis()+ ".png");	
		Files.copy(temp, dest);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Oranium");
		captureScreenshot(driver);
		driver.findElement(By.id("pass")).sendKeys("12345");
		captureScreenshot(driver);
	
		
	}
	

}
