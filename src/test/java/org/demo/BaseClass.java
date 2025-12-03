package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	   
	public static WebDriver browserSetUp(String browser)
	{
		WebDriver driver = null;
		
		switch(browser)
		{
		case "chrome":
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		break;
		
		case "edge":
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		break;
		 
		case "firefox":
			
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		break;
		
		default:
		{
			System.out.println("Provide the valid browser");
		}
		}
		return driver;
	}

	
		
	}
