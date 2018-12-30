package com.dailogbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DailogBox {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[@class='fileUpload btn hmscrollHideno']")).click();
		
		WebElement target = driver.switchTo().activeElement();
		
		ClickOn(driver,target,20);
		
		driver.findElement(By.id("name")).sendKeys("dfg");
		
		driver.findElement(By.id("mob_no")).sendKeys("9940067532");
		
		driver.findElement(By.name("wordresume")).sendKeys("C:\\Users\\name\\Desktop\\badri akash.doc");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
		
	}
	
}
