package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement x=driver.findElement(By.xpath("(//button[contains(@class,'_2K')])[1]"));
		x.click();
		WebElement psearch=driver.findElement(By.name("q"));
		psearch.sendKeys("Mac book");
		WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(3000);
		WebElement P1=driver.findElement(By.xpath("(//div[contains(text(),'APPLE')])[1]"));
		P1.click();
	}

}
