package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mymyntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement nument=driver.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]"));
		nument.sendKeys("9789245494");
		WebElement submit=driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		submit.click();
		Thread.sleep(30000);
		WebElement submit1=driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		submit1.click();
	}

}
