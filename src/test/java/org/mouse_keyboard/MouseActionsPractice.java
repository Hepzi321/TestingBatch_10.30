package org.mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPractice {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions act = new Actions(driver);
		act.contextClick(gmail).perform();
		
		
		
		
	}

}
