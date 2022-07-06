package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		signin.click();
		WebElement reg=driver.findElement(By.xpath("(//span[text()='Register'])[1]"));
		reg.click();
		Thread.sleep(3000);
		WebElement uName=driver.findElement(By.xpath("(//input[contains(@type,'text')])[7]"));
		uName.sendKeys("9789245494");
		WebElement submit=driver.findElement(By.id("checkUser"));
		submit.click();
	}

}
