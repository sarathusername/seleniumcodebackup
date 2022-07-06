package com.script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		WebElement ok=driver.findElement(By.xpath("//p[text()='You pressed Ok']"));
		String okout=ok.getText();
		System.out.println("Expected ok Text is 'You pressed Ok'");
		System.out.println("Output text is "+okout);
		boolean bok=okout.contains("Ok");
		if(bok==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		al.dismiss();
		Thread.sleep(3000);
		WebElement cancel=driver.findElement(By.xpath("//p[text()='You Pressed Cancel']"));
		String cancelout=ok.getText();
		boolean bcancel=cancelout.contains("Cancel");
		System.out.println("Expected Cancel Text is 'You Pressed Cancel'");
		System.out.println("Output text is "+cancelout);
		if(bcancel==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		al.sendKeys("SARATH");
		al.accept();
		WebElement demotext=driver.findElement(By.id("demo1"));
		String demoout=demotext.getText();
		System.out.println("Expected Text is 'Hello SARATH How are you today'");
		System.out.println("Output text is "+demoout);
		boolean dout=demoout.contains("SARATH");
		if(dout==true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}}}
