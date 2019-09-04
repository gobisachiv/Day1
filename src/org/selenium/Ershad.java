package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ershad {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get ("https://www.Bewakoof.com/");
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("n.ershad146@gmail.com");

	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("9003685624");
	}	

}
