package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		WebElement name=driver.findElement(By.className("bginput"));
		name.sendKeys("SARATH");
		WebElement pword=driver.findElement(By.xpath("//input[@type='password']"));
		pword.sendKeys("1234");
		WebElement cbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		cbox.click();
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}

}
