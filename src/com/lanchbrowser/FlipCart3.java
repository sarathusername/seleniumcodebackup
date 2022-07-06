package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart3 {
	public static void main(String[] args) throws InterruptedException {
		String i="SARATH";
		String j="12345";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement x=driver.findElement(By.xpath("(//button[contains(@class,'_2K')])[1]"));
		x.click();
		WebElement login=driver.findElement(By.xpath("//a[contains(@class,'_1_')]"));
		login.click();
		WebElement Uname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Uname.sendKeys(i);
		WebElement Pword=driver.findElement(By.xpath("//input[@type='password']"));
		Pword.sendKeys(j);
		String getU=Uname.getAttribute("value");
		String getP=Pword.getAttribute("value");
		System.out.println("GIVEN USER NAME IS "+i);
		System.out.println("ENTERED USER NAME IS "+getU);
		boolean o=i.equals(getU);
		if(o==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		System.out.println("GIVEN PASSWORD IS "+j);
		System.out.println("ENTERED USER NAME IS "+getP);
		boolean q=j.equals(getP);
		if(q==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}}}
