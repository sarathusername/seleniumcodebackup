package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		Thread.sleep(3000);
		WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions actprime=new Actions(driver);
		actprime.moveToElement(prime).perform();
		WebElement fstdel=driver.findElement(By.xpath("//div[contains(text(),'FREE fast')]"));
		fstdel.click();
	}
	

}
