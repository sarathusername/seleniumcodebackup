package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp1 {
	public static void main(String[] args) {
		String i="SARATH";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement Uname=driver.findElement(By.id("username"));
		Uname.sendKeys(i);
		WebElement Pword=driver.findElement(By.id("password"));
		Pword.sendKeys("12345");
		String j=Uname.getAttribute("value");
		System.out.println("INPUT "+i);
		System.out.println("GET "+j);
		Boolean o=j.equals(i);
		if(o==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		}

}
