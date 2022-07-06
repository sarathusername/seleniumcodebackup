package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("CHENNAI");
		WebElement destination=driver.findElement(By.id("dest"));
		destination.sendKeys("SIVAGANGA");
		WebElement searchbtn=driver.findElement(By.id("search_btn"));
		searchbtn.click();
		
	}
	
	

}
