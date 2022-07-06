package com.lanchbrowser;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	  driver.findElement(By.className("goahead")).click();
	  WebElement login=driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	  login.sendKeys("SARATH");
	  WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])[4]"));
	  pass.sendKeys("12345");
	  driver.findElement(By.xpath("(//input[@type='Submit'])[1]")).click();
	  
	  
	  /*Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Alert al=driver.switchTo().alert();
	  String s=al.getText();
	  System.out.println(s);
	  al.accept();*/
	}

}
