package com.script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("motorolo");
		WebElement bsearch=driver.findElement(By.xpath("//input[@type='submit']"));
		bsearch.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\screenshot\\amazon.png");
		FileUtils.copyFile(source,target);
	}
	

}
