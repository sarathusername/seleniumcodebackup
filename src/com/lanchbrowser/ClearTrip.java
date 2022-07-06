package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement inp1=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		inp1.sendKeys("CHENNAI EGMORE");
		WebElement inp2=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		inp2.sendKeys("SIVAGANGA");
		WebElement fcoach=driver.findElement(By.xpath("//option[@value='1A']"));
		fcoach.click();
		WebElement inp4=driver.findElement(By.xpath("//input[@title='Journey date']"));
		inp4.sendKeys("16/08/2022");
		WebElement adult=driver.findElement(By.xpath("(//option[@value='2'])[1]"));
		adult.click();
		WebElement child=driver.findElement(By.xpath("(//option[@value='3'])[2]"));
		child.click();
		WebElement smen=driver.findElement(By.xpath("(//option[@value='3'])[3]"));
		smen.click();
		WebElement swomen=driver.findElement(By.xpath("(//option[@value='3'])[4]"));
		swomen.click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

}
