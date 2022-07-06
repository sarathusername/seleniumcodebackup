package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotelapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("SARATH");
		WebElement pword=driver.findElement(By.id("password"));
		pword.sendKeys("12435");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
	}

}
