package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAcc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement fstname=driver.findElement(By.name("firstName"));
		fstname.sendKeys("SARATH");
		WebElement lstname=driver.findElement(By.name("lastName"));
		lstname.sendKeys("KUMAR");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("sarath");
		WebElement Pwd=driver.findElement(By.name("Passwd"));
		Pwd.sendKeys("12345");
		WebElement Cpwd=driver.findElement(By.name("ConfirmPasswd"));
		Cpwd.sendKeys("12345");
		WebElement Cbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		Cbox.click();
		WebElement submit=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		submit.click();
	}

}
