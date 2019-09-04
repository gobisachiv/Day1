package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Day3-Question1:

public class Question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\Selenium Day3\\drive\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement contact = driver.findElement(By.xpath("(//a[@href='contact.php'])[1]"));
	contact.click();
	
	WebElement name = driver.findElement(By.className("form-control"));
	name.sendKeys("gobi");
	
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("abc@gmail.com");
	
		WebElement phoneno = driver.findElement(By.name("phone"));
	phoneno.sendKeys("1234567899");
	
	WebElement course = driver.findElement(By.name("courses"));
	course.sendKeys("JAVA/J2EE");
	
	WebElement branch = driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
	branch.sendKeys("OMR");
	
	WebElement time = driver.findElement(By.name("time"));
	time.sendKeys("immediately");
	
	WebElement message = driver.findElement(By.xpath("(//textarea[@class='form-control input-message'])"));
	message.sendKeys("welcometo selenium");
	
	WebElement submit = driver.findElement(By.id("submit"));
	submit.click();
	
	
	
	
	
	
}




}
