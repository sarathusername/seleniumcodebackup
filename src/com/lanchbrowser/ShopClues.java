package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement psearch=driver.findElement(By.id("autocomplete"));
		psearch.sendKeys("carrom board");
		WebElement search=driver.findElement(By.xpath("//a[contains(@class,'srch')]"));
		search.click();
		WebElement pro1=driver.findElement(By.xpath("(//h2[contains(text(),'Original')])[1]"));
		pro1.click();
		}
}
