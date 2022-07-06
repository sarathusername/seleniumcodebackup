package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		WebElement x=driver.findElement(By.xpath("(//button[contains(@class,'_2K')])[1]"));
		x.click();
		WebElement hmapp=driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(hmapp).perform();
		WebElement v=driver.findElement(By.xpath("//a[text()='Bath linen']"));
		v.click();
		Thread.sleep(3000);
		WebElement w=driver.findElement(By.xpath("(//a[contains(@title,'Cotton')])[1]"));
		String p=w.getText();
		System.out.println(p);
	}

}