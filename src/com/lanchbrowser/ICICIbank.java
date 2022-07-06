package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIbank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.name("DUMMY1"));
		uname.sendKeys("ICICI");
		
	}

}
