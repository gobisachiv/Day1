package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Gobi\\\\eclipse-workspace\\\\Selenium Day3\\\\drive\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html/");
		
		WebElement cts  = driver.findElement(By.xpath("(//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0'])"));
		cts.click();
		
		
		
	}
}
