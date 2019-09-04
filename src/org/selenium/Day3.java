package org.selenium;

//Question-2

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\Selenium Day3\\drive\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("gobisachiv");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		pass.sendKeys("1234");
		
		WebElement login = driver.findElement(By.xpath("//label[@id='loginbutton']"));
		login.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
