package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		WebElement cbut=driver.findElement(By.xpath("//button[@type='submit']"));
		cbut.click();
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("Chennai Egmore");
		WebElement to=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("Sivaganga");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		
	}

}
