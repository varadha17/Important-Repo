package com.Pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class EmailPage extends BaseClass {

	public EmailPage() throws IOException {
		super();
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="identifierId")
	WebElement UserName;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement NextButton;
	
	@FindBy(name="password")
	WebElement Password;
	
	

	
	
	public EmailInboxPage LoginVerify() throws IOException, InterruptedException {
		
		UserName.sendKeys("abinash.varadharajan@gmail.com");
		NextButton.click();
		
		Thread.sleep(3000);
		
		Password.sendKeys("badriabi");
		NextButton.click();
		  
		Thread.sleep(3000);
		
		return new EmailInboxPage();
	}
	

}
