package org.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/org/adactin/feature/Adactin.feature"
,glue = "org.adactin.stepDefinition")

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass    // execute before all the methods will execute
	public static void launch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@AfterClass    // execute after all the methods will done
	public static void close() {
//		driver.close();
		
	}
	
	
}
