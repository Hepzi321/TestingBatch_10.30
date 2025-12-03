package org.demo;

import java.io.IOException;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyPageWithLink {
	
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println(alltags.size());
		
		for(WebElement tag : alltags)
		{
			@Nullable
			String link = tag.getDomAttribute("href");
			BaseLinkCheck.brokenLinkCheck(link);
		}
	}

}
