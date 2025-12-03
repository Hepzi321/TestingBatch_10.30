package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesHandling {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	//switch to frame
//	driver.switchTo().frame(0);
	
//	driver.switchTo().frame("singleframe");
	
	WebElement sigFrame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(sigFrame);
	
	//element finding
	WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
	textBox.sendKeys("Selenium");
}
}
