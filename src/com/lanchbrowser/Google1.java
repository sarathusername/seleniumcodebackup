package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google1 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        WebElement input=driver.findElement(By.name("q"));
        input.sendKeys("Greens velmurugan");
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.name("btnK"));
        search.click();
        Thread.sleep(3000);
        WebElement search1=driver.findElement(By.xpath("//h3[contains(@class,'LC20lb')]"));
        search1.click();
      
}}
