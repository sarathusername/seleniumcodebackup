package com.lanchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement d5=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dbamount=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		WebElement cramount=driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		WebElement bank=driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
		WebElement dbacc=driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement sales=driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
		WebElement cracc=driver.findElement(By.xpath("//ol[@id='loan']"));
		
		Actions e=new Actions(driver);
		e.dragAndDrop(d5,dbamount).perform();
		e.dragAndDrop(d5,cramount).perform();
		e.dragAndDrop(bank,dbacc).perform();
		e.dragAndDrop(sales,cracc).perform();
		WebElement Pbutton=driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String s="Perfect!";
		String out=Pbutton.getText();
		System.out.println("EXPECTED TEXT:Perfect!");
		System.out.println("GET TEXT:"+out);
		boolean result=s.equals(out);
		if(result=true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
}
