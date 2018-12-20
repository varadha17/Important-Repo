package com.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Pages.EmailPage;
import com.Pages.MainPage;
import com.Utilities.TestNGListener;

@Listeners(TestNGListener.class)
public class EmailPageTest extends BaseClass {

	public EmailPageTest() throws IOException {
		super();
		
	}
	
	public static MainPage mainpage;
	public static EmailPage emailpage;
	
	
	@BeforeMethod
	public void LoginVerifyTest() throws IOException, InterruptedException {
		
		start();
		
		mainpage = new MainPage();
		
		emailpage = mainpage.EmailVerify();
		
		
	}
	
	@Test(enabled = true)
	public void LoginVerifyTestPage() throws IOException, InterruptedException {
		
		emailpage.LoginVerify();
		
		
	}
	
	@AfterMethod
	public void ClosetheBrowser() {
		
		driver.quit();
	}
	

}
