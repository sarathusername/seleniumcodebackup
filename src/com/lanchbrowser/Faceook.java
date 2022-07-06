package com.lanchbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Faceook {
	public static void main(String[] args) throws AWTException {
		String s="sarath";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        WebElement email=driver.findElement(By.name("email"));
		email.sendKeys(s);
		Actions mouse=new Actions(driver);
		mouse.doubleClick(email).contextClick(email).build().perform();
		
		Robot key=new Robot();
		for(int i=0;i<7;i++) {
		key.keyPress(KeyEvent.VK_DOWN);
		key.keyRelease(KeyEvent.VK_DOWN);
	}
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		key.keyPress(KeyEvent.VK_TAB);
		key.keyRelease(KeyEvent.VK_TAB);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement pass=driver.findElement(By.id("pass"));
		String output=pass.getAttribute("value");
		
		System.out.println("INPUT STRING IS "+s);
		System.out.println("OUTPUT STRING IS "+output);
		boolean b=s.equals(output);
		if(b==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
}

