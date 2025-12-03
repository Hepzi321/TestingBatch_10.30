package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		
//		WebElement sigDropDn = driver.findElement(By.id("fruits"));
//		
//		Select s = new Select(sigDropDn);
//		s.selectByVisibleText("Orange");

		WebElement multidpd = driver.findElement(By.id("superheros"));
		Select sl = new Select(multidpd);
		sl.selectByIndex(1);
		sl.selectByIndex(3);
		sl.selectByVisibleText("Black Panther");
		sl.selectByValue("ca");
		
		sl.deselectByVisibleText("Black Panther");
		List<WebElement> alloptions = sl.getOptions();   //[chy ufut yfuif tufut]
		
		for(WebElement opt :alloptions)
		{
			System.out.println(opt.getText());
		}
		
		List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
        for(WebElement sopt:allSelectedOptions)
        {
        	System.out.println("selected option : " +sopt.getText());
        }
        
        WebElement firstSelectedOption = sl.getFirstSelectedOption();
        System.out.println("selected first : " +firstSelectedOption.getText());
}
}
