package com.Expilicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	
	public static void Explicitwait(WebDriver driver, WebElement element, int timeout, String value ) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
	}
	
	public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sel chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement firstname =driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));

		Explicitwait(driver,firstname, 10, "tom");
		Explicitwait(driver,lastname, 5, "pom");
	}

}
