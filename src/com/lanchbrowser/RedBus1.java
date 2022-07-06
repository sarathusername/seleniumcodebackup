package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//div[contains(@class,'fr signin')]"));
		signin.click();
		WebElement dropin=driver.findElement(By.id("hc"));
		dropin.click();
		WebElement nument=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		nument.sendKeys("97892456494");
	}

}
