package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(3000);
		WebElement prosearch=driver.findElement(By.name("keyword"));
		prosearch.sendKeys("Hero pen");
		WebElement Csearch=driver.findElement(By.xpath("//button[contains(@onclick,'submitSearchForm')]"));
		Csearch.click();
		WebElement Psearch=driver.findElement(By.xpath("//img[contains(@class,'product')]"));
		Psearch.click();
	}

}
