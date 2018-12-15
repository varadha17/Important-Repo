package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Pages.EmailInboxPage;
import com.Pages.EmailPage;
import com.Pages.MainPage;

public class EmailInboxPageTest extends BaseClass {

	public static MainPage mainpage;
	public static EmailPage emailpage;
	public static EmailInboxPage inbox; 
	
	public EmailInboxPageTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	public void StartUpTest() throws IOException, InterruptedException {
		
        start();
		
		mainpage = new MainPage();
		
		emailpage = mainpage.EmailVerify();
		
		inbox = emailpage.LoginVerify();
		
	}
	
	
	@Test
	
	public void InboxTitileVerify() {
		
		inbox.InboxGetName();
		
		
	}
	
	
	@AfterMethod
	
	public void ClosetheBrowser() {
		
		driver.quit();
		
	}
	
	
	
	
	

}
