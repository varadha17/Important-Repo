package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;
import com.Utilities.BrokenLinks;
import com.Utilities.HighlightFailedElements;

public class MainPage extends BaseClass {

	public MainPage() throws IOException {
		super();
		
	}
	
	
	public void BrokenListTestVerify() throws MalformedURLException, IOException {
		
		BrokenLinks.BrokenLinksTest();
		
	}
	
	
	public EmailPage EmailVerify() throws InterruptedException, IOException {
		
		WebElement linktest = driver.findElement(By.linkText("Gmail"));
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", linktest, driver);
		
		HighlightFailedElements.drawBorder(linktest, driver);
		
		Thread.sleep(10000);
		
		linktest.click(); 
		
		return new EmailPage();
	}
	
	
	

}


