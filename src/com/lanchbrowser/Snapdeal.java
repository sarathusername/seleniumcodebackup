package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("userName"));
	    username.sendKeys("Sarath");
	    WebElement btn=driver.findElement(By.id("checkUser"));
	    btn.click();
	}
}
