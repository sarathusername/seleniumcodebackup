package com.lanchbrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvbank {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.xpath("//input[@id='Button2']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\screenshot\\sbi.png");
		FileUtils.copyFile(source,target);
	}

}
