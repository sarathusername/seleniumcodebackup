package com.lanchbrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iphone {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement x=driver.findElement(By.xpath("//button[text()='✕']"));
	    x.click();
	    WebElement s=driver.findElement(By.xpath("//div[text()='Fashion']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(s).perform();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    File target=new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\screenshot\\fb1.png");
	    FileUtils.copyFile(source,target);
	}    

}
