//Question-4

package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Gobi\\\\eclipse-workspace\\\\Selenium Day3\\\\drive\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.toolsqa.com/automation-practise-form/");
	
	WebElement tool = driver.findElement(By.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-34232'])[1]"));
	
	tool.click();
	
	WebElement name = driver.findElement(By.xpath("(//input[@name='your-name'])[1]"));
	name.sendKeys("sachiv");
	
	WebElement email = driver.findElement(By.xpath("(//input[@name='your-email'])[1]"));
	email.sendKeys("gobi.muthuk@gmail.com");
	
	WebElement mobile = driver.findElement(By.xpath("(//input[@name='your-mobile'])[1]"));
	mobile.sendKeys("9500419655");
	
	WebElement message = driver.findElement(By.xpath("(//textarea[@name='your-message'])[1]"));
	message.sendKeys("welcome to selenium class");
	
	WebElement capcha = driver.findElement(By.xpath("(//input[@name='captcha-170'])[1]"));
	capcha.sendKeys("HQNX");
	
	WebElement button = driver.findElement(By.className("wpcf7-form-control wpcf7-submit"));
	button.click();
	
	
	
	
	
	
	
	
	
	
	
}







}
