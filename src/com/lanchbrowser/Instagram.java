package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement uname=driver.findElement(By.name("username"));
	uname.sendKeys("sarath");
	WebElement password=driver.findElement(By.name("password"));
	uname.sendKeys("12345");
	}
}
