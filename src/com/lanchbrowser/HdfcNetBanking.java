package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcNetBanking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.className("form-control text-muted"));
		login.sendKeys("sarath");
		WebElement cbtn=driver.findElement(By.className("btn btn-primary login-btn"));
		cbtn.click();	
	}

}
