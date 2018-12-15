package com.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.Pages.MainPage;
import com.Utilities.TestNGListener;

@Listeners(TestNGListener.class)
public class MainPageTest extends BaseClass {
	
	public static MainPage mainpage;

	public MainPageTest() throws IOException {
		super();
		
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void StartTest() throws IOException {
		
		start();
		
		mainpage = new MainPage();
		
		
	}
	
	@Test(enabled = false)
	public void BrokenLinksVerifyTestPage() throws MalformedURLException, IOException {
		
		mainpage.BrokenListTestVerify();
	}
	
	@Test(enabled = false)
	public void EmailTestVerify() throws InterruptedException, IOException {
		mainpage.EmailVerify();
	}
	
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	
	

}
