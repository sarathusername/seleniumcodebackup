package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggynew {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//a[text()='Sign up']"));
		signin.click();
		WebElement nument=driver.findElement(By.id("mobile"));
		nument.sendKeys("9789245494");
		WebElement nameent=driver.findElement(By.id("name"));
		nameent.sendKeys("SARATH");
		WebElement emailent=driver.findElement(By.id("email"));
		emailent.sendKeys("sarath@gmail.com");
		WebElement passent=driver.findElement(By.id("password"));
		passent.sendKeys("12345");
		WebElement con=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		con.click();
	}
}
