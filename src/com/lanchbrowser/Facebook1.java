package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) {
		String inpuser="SARATH";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));
		uname.sendKeys(inpuser);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("12345");
		String gText=uname.getAttribute("value");
		System.out.println("GIVEN TEXT IS "+inpuser);
		System.out.println("GET TEXT IS "+gText);
		boolean result=gText.equals(inpuser);
		if(result==true) {
			System.out.println("PASS");
	}
		else {
			System.out.println("FAIL");
		}
	}}
