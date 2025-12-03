package org.demo;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstAutomation {

	public static void main(String[] args) {
		int mind = 0;
		for(int i = 1; i<=10; i++)
		{
			mind = i+mind;	
			System.out.println(mind);
		}
		
		System.out.println(mind);
	}
}