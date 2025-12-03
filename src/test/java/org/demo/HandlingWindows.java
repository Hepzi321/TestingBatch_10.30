package org.demo;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			WebElement textBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
			textBox.sendKeys("Selenium");
			textBox.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			List<WebElement> options = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
	
			for(WebElement opt : options)
			{
				opt.click();
			}
			
			String Parentid = driver.getWindowHandle();
			System.out.println(Parentid);
			
			Set<String> allWindowId = driver.getWindowHandles();
			for(String id : allWindowId)
			{
				System.out.println(id);
			}
	}
	
	

}
