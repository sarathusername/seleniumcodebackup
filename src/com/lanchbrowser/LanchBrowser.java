package com.lanchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String ourUrl="https://www.facebook.com/login/";
		driver.get(ourUrl);
		System.out.println("OUR URL- "+ourUrl);
		driver.manage().window().maximize();
		String ctitle=driver.getTitle();
		System.out.println(ctitle);
		String cUrl=driver.getCurrentUrl();
		System.out.println("CURRENT URL- "+cUrl);
		driver.quit();
		boolean output=ourUrl.equals(cUrl);
		System.out.println(output);
	}	
	}
