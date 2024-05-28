package org.pom;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class  {
	
	

	public  WebDriver driver;
	
	@FindBy(id="email")
	private WebElement userElement;
	
	public Pom_class(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getUserElement() {
		return userElement;
	}

	
	

}
