package org.adactin.stepDefinition;

import org.adactin.runner.Runner_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {
	
public static WebDriver driver = Runner_Class.driver;  

@Given("^user Launch The Adactin App$")
public void user_Launch_The_Adactin_App() throws Throwable {
	driver.get("https://adactinhotelapp.com/index.php");
}

@When("^user Enter The Username In The Username Box$")
public void user_Enter_The_Username_In_The_Username_Box() throws Throwable {
	driver.findElement(By.id("username")).sendKeys("NitheesGopii");
}

@When("^user Enter The Password In The Password Box$")
public void user_Enter_The_Password_In_The_Password_Box() throws Throwable {
	driver.findElement(By.id("password")).sendKeys("Bgopi@1711");
}

@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	driver.findElement(By.id("login")).click();
}

}
