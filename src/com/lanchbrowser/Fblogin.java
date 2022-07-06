package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginid=driver.findElement(By.name("email"));
		loginid.sendKeys("sarath");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("123221");
		WebElement loginbut=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbut.click();
	}
}
