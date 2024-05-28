package com.reusable_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {	
	public static WebDriver driver;	
	public static WebDriver browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		return driver;
	}
	public static void geturl(String url) {
		driver.get(url);		
	}
	public static void max() {
		driver.manage().window().maximize();		
	}
	public static void wait(WebElement element) {
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	public static void sendvalues(WebElement element , String value ) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();		
	}
	public static String getelementtext(WebElement element) {		
		String text = element.getText();
		return text;		
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
